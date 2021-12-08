PROJECT_NAME := Pulumi Kubernetes Resource Provider

PACK             := kubernetes
PACKDIR          := sdk
PROJECT          := github.com/pulumi/pulumi-kubernetes
NODE_MODULE_NAME := @pulumi/kubernetes
NUGET_PKG_NAME   := Pulumi.Kubernetes

PROVIDER        := pulumi-resource-${PACK}
CODEGEN         := pulumi-gen-${PACK}
VERSION         ?= $(shell pulumictl get version)
PROVIDER_PATH   := provider/v3
VERSION_PATH     := ${PROVIDER_PATH}/pkg/version.Version

KUBE_VERSION    ?= v1.21.0
SWAGGER_URL     ?= https://github.com/kubernetes/kubernetes/raw/${KUBE_VERSION}/api/openapi-spec/swagger.json
OPENAPI_DIR     := provider/pkg/gen/openapi-specs
OPENAPI_FILE    := ${OPENAPI_DIR}/swagger-${KUBE_VERSION}.json
SCHEMA_FILE     := provider/cmd/pulumi-resource-kubernetes/schema.json
GOPATH			:= $(shell go env GOPATH)

WORKING_DIR     := $(shell pwd)
TESTPARALLELISM := 4

openapi_file::
	@mkdir -p $(OPENAPI_DIR)
	test -f $(OPENAPI_FILE) || curl -s -L $(SWAGGER_URL) > $(OPENAPI_FILE)

ensure::
	cd provider && go mod tidy
	cd sdk && go mod tidy
	cd tests && go mod tidy

k8sgen::
	(cd provider && go build -a -o $(WORKING_DIR)/bin/${CODEGEN} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/$(CODEGEN))

schema:: k8sgen
	@echo "Generating Pulumi schema..."
	$(WORKING_DIR)/bin/${CODEGEN} schema $(OPENAPI_FILE) $(CURDIR)
	@echo "Finished generating schema."

k8sprovider::
	$(WORKING_DIR)/bin/${CODEGEN} kinds $(SCHEMA_FILE) $(CURDIR)
	(cd provider && VERSION=${VERSION} go generate cmd/${PROVIDER}/main.go)
	(cd provider && go build -a -o $(WORKING_DIR)/bin/${PROVIDER} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" $(PROJECT)/${PROVIDER_PATH}/cmd/$(PROVIDER))

k8sprovider_debug::
	(cd provider && go build -a -o $(WORKING_DIR)/bin/${PROVIDER} -gcflags="all=-N -l" -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" $(PROJECT)/${PROVIDER_PATH}/cmd/$(PROVIDER))

test_provider::
	cd provider/pkg && go test -short -v -count=1 -cover -timeout 2h -parallel ${TESTPARALLELISM} ./...

dotnet_sdk:: DOTNET_VERSION := $(shell pulumictl get version --language dotnet)
dotnet_sdk::
	$(WORKING_DIR)/bin/$(CODEGEN) -version=${DOTNET_VERSION} dotnet $(SCHEMA_FILE) $(CURDIR)
	rm -rf sdk/dotnet/bin/Debug
	cd ${PACKDIR}/dotnet/&& \
		echo "${DOTNET_VERSION}" > version.txt && \
		dotnet build /p:Version=${DOTNET_VERSION}

go_sdk::
	$(WORKING_DIR)/bin/$(CODEGEN) -version=${VERSION} go $(SCHEMA_FILE) $(CURDIR)

jvm_sdk::
	$(WORKING_DIR)/bin/$(CODEGEN) -version=${VERSION} jvm $(SCHEMA_FILE) $(CURDIR)
	cd $(WORKING_DIR)/sdk/jvm && \
		mkdir -p src/main/resources/io/pulumi/$(PACK) && \
		echo "${VERSION}" > src/main/resources/io/pulumi/$(PACK)/version.txt && \
		gradle -Pversion=${VERSION} build

nodejs_sdk:: VERSION := $(shell pulumictl get version --language javascript)
nodejs_sdk::
	$(WORKING_DIR)/bin/$(CODEGEN) -version=${VERSION} nodejs $(SCHEMA_FILE) $(CURDIR)
	cd ${PACKDIR}/nodejs/ && \
		yarn install && \
		yarn run tsc
	cp README.md LICENSE ${PACKDIR}/nodejs/package.json ${PACKDIR}/nodejs/yarn.lock ${PACKDIR}/nodejs/bin/
	sed -i.bak 's/$${VERSION}/$(VERSION)/g' ${PACKDIR}/nodejs/bin/package.json

python_sdk:: PYPI_VERSION := $(shell pulumictl get version --language python)
python_sdk::
	# Delete only files and folders that are generated.
	rm -r sdk/python/pulumi_kubernetes/*/ sdk/python/pulumi_kubernetes/__init__.py
	$(WORKING_DIR)/bin/$(CODEGEN) -version=${VERSION} python $(SCHEMA_FILE) $(CURDIR)
	cp README.md ${PACKDIR}/python/
	cd ${PACKDIR}/python/ && \
		python3 setup.py clean --all 2>/dev/null && \
		rm -rf ./bin/ ../python.bin/ && cp -R . ../python.bin && mv ../python.bin ./bin && \
		sed -i.bak -e "s/\$${VERSION}/$(PYPI_VERSION)/g" -e "s/\$${PLUGIN_VERSION}/$(VERSION)/g" ./bin/setup.py && \
		rm ./bin/setup.py.bak && \
		cd ./bin && python3 setup.py build sdist

.PHONY: build
build:: k8sgen openapi_file schema k8sprovider dotnet_sdk go_sdk nodejs_sdk python_sdk

# Required for the codegen action that runs in pulumi/pulumi
only_build:: build

lint::
	for DIR in "provider" "sdk" "tests" ; do \
		pushd $$DIR && golangci-lint run -c ../.golangci.yml --timeout 10m && popd ; \
	done

install:: install_nodejs_sdk install_dotnet_sdk install_jvm_sdk
	cp $(WORKING_DIR)/bin/${PROVIDER} ${GOPATH}/bin

manual_provider_install::
	pulumi plugin install resource $(PACK) v$(VERSION) --server "$(PROJECT)/releases/download"

install_local::
	mkdir -p $(HOME)/.pulumi/plugins/resource-$(PACK)-v$(VERSION)
	touch $(HOME)/.pulumi/plugins/resource-$(PACK)-v$(VERSION).lock
	cp -v $(WORKING_DIR)/bin/pulumi-resource-$(PACK) $(HOME)/.pulumi/plugins/resource-$(PACK)-v$(VERSION)/${PROVIDER}
	pulumi plugin ls | grep $(PACK)

cleanup_local::
	pulumi plugin rm resource $(PACK) $(VERSION) --yes

GO_TEST_FAST := go test -short -v -count=1 -cover -timeout 2h -parallel ${TESTPARALLELISM}
GO_TEST 	 := go test -v -count=1 -cover -timeout 2h -parallel ${TESTPARALLELISM}

test_fast::
# TODO: re-enable this test once https://github.com/pulumi/pulumi/issues/4954 is fixed.
#	./sdk/nodejs/node_modules/mocha/bin/mocha ./sdk/nodejs/bin/tests
	cd provider/pkg && $(GO_TEST_FAST) ./...
	cd tests/sdk/nodejs && $(GO_TEST_FAST) ./...
	cd tests/sdk/python && $(GO_TEST_FAST) ./...
	#cd tests/sdk/jvm && $(GO_TEST_FAST) ./...
	cd tests/sdk/dotnet && $(GO_TEST_FAST) ./...
	cd tests/sdk/go && $(GO_TEST_FAST) ./...

test_all::
	cd provider/pkg && $(GO_TEST) ./...
	cd tests/sdk/nodejs && $(GO_TEST) ./...
	cd tests/sdk/python && $(GO_TEST) ./...
	#cd tests/sdk/jvm && $(GO_TEST) ./...
	cd tests/sdk/dotnet && $(GO_TEST) ./...
	cd tests/sdk/go && $(GO_TEST) ./...

generate_schema:: schema

install_dotnet_sdk::
	rm -rf $(WORKING_DIR)/nuget/$(NUGET_PKG_NAME).*.nupkg
	mkdir -p $(WORKING_DIR)/nuget
	find . -name '*.nupkg' -print -exec cp -p {} ${WORKING_DIR}/nuget \;

install_python_sdk::
	#target intentionally blank

install_go_sdk::
	#target intentionally blank

install_nodejs_sdk::
	-yarn unlink --cwd $(WORKING_DIR)/sdk/nodejs/bin
	yarn link --cwd $(WORKING_DIR)/sdk/nodejs/bin

install_jvm_sdk::
	cd $(WORKING_DIR)/sdk/jvm && gradle -Pversion=${VERSION} publishToMavenLocal

hack_local_deps::
	cd provider && go mod edit -replace github.com/pulumi/pulumi/pkg/v3=${HOME}/repos/vl/pulumi/pkg
	cd provider && go mod edit -replace github.com/pulumi/pulumi/sdk/v3=${HOME}/repos/vl/pulumi/sdk