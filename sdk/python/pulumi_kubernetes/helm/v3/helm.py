#  Copyright 2016-2021, Pulumi Corporation.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

# *** WARNING: this file was generated by the Pulumi Kubernetes codegen tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
from typing import Any, Callable, Optional, Sequence, Tuple, Union

import pulumi.runtime
from pulumi_kubernetes.yaml.yaml import _parse_yaml_document, _skip_await

from ... import _utilities


class Chart(pulumi.ComponentResource):
    resources: pulumi.Output[dict]
    """
    Kubernetes resources contained in this Chart.
    """
    ready: pulumi.Output[Sequence[pulumi.Output[pulumi.Resource]]]

    def __init__(self,
                 release_name: str,
                 config: Union['ChartOpts', 'LocalChartOpts'],
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Chart is a component representing a collection of resources described by an arbitrary Helm
        Chart. The Chart can be fetched from any source that is accessible to the `helm` command
        line. Values in the `values.yml` file can be overridden using `ChartOpts.values` (equivalent
        to `--set` or having multiple `values.yml` files). Objects can be transformed arbitrarily by
        supplying callbacks to `ChartOpts.transformations`.

        Chart does not use Tiller. The Chart specified is copied and expanded locally; the semantics
        are equivalent to running `helm template` and then using Pulumi to manage the resulting YAML
        manifests. Any values that would be retrieved in-cluster are assigned fake values, and
        none of Tiller's server-side validity testing is executed.

        ## Example Usage
        ### Local Chart Directory

        ```python
        from pulumi_kubernetes.helm.v3 import Chart, LocalChartOpts

        nginx_ingress = Chart(
            "nginx-ingress",
            LocalChartOpts(
                path="./nginx-ingress",
            ),
        )
        ```
        ### Remote Chart

        ```python
        from pulumi_kubernetes.helm.v3 import Chart, ChartOpts, FetchOpts

        nginx_ingress = Chart(
            "nginx-ingress",
            ChartOpts(
                chart="nginx-ingress",
                version="1.24.4",
                fetch_opts=FetchOpts(
                    repo="https://charts.helm.sh/stable",
                ),
            ),
        )
        ```
        ### Set Chart Values

        ```python
        from pulumi_kubernetes.helm.v3 import Chart, ChartOpts, FetchOpts

        nginx_ingress = Chart(
            "nginx-ingress",
            ChartOpts(
                chart="nginx-ingress",
                version="1.24.4",
                fetch_opts=FetchOpts(
                    repo="https://charts.helm.sh/stable",
                ),
                values={
                    "controller": {
                        "metrics": {
                            "enabled": True,
                        },
                    },
                },
            ),
        )
        ```
        ### Deploy Chart into Namespace

        ```python
        from pulumi_kubernetes.helm.v3 import Chart, ChartOpts, FetchOpts

        nginx_ingress = Chart(
            "nginx-ingress",
            ChartOpts(
                chart="nginx-ingress",
                version="1.24.4",
                namespace="test-namespace",
                fetch_opts=FetchOpts(
                    repo="https://charts.helm.sh/stable",
                ),
            ),
        )
        ```
        ### Chart with Transformations

        ```python
        from pulumi_kubernetes.helm.v3 import Chart, ChartOpts, FetchOpts

        # Make every service private to the cluster, i.e., turn all services into ClusterIP instead of LoadBalancer.
        def make_service_private(obj, opts):
            if obj["kind"] == "Service" and obj["apiVersion"] == "v1":
                try:
                    t = obj["spec"]["type"]
                    if t == "LoadBalancer":
                        obj["spec"]["type"] = "ClusterIP"
                except KeyError:
                    pass


        # Set a resource alias for a previous name.
        def alias(obj, opts):
            if obj["kind"] == "Deployment":
                opts.aliases = ["oldName"]


        # Omit a resource from the Chart by transforming the specified resource definition to an empty List.
        def omit_resource(obj, opts):
            if obj["kind"] == "Pod" and obj["metadata"]["name"] == "test":
                obj["apiVersion"] = "v1"
                obj["kind"] = "List"


        nginx_ingress = Chart(
            "nginx-ingress",
            ChartOpts(
                chart="nginx-ingress",
                version="1.24.4",
                fetch_opts=FetchOpts(
                    repo="https://charts.helm.sh/stable",
                ),
                transformations=[make_service_private, alias, omit_resource],
            ),
        )
        ```

        :param str release_name: Name of the Chart (e.g., nginx-ingress).
        :param Union[ChartOpts, LocalChartOpts] config: Configuration options for the Chart.
        :param Optional[pulumi.ResourceOptions] opts: A bag of options that control this
               resource's behavior.
        """
        if not release_name:
            raise TypeError('Missing release name argument')
        if not isinstance(release_name, str):
            raise TypeError('Expected release name to be a string')
        if config and not isinstance(config, ChartOpts) and not isinstance(config, LocalChartOpts):
            raise TypeError('Expected config to be a ChartOpts or LocalChartOpts instance')
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if config.resource_prefix:
            release_name = f"{config.resource_prefix}-{release_name}"

        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="kubernetes:helm.sh/v2:Chart")])

        super(Chart, self).__init__(
            "kubernetes:helm.sh/v3:Chart",
            release_name,
            __props__,
            pulumi.ResourceOptions.merge(opts, alias_opts))

        config.release_name = release_name

        all_config = pulumi.Output.from_input((config, pulumi.ResourceOptions(parent=self)))

        # Note: Unlike NodeJS, Python requires that we "pull" on our futures in order to get them scheduled for
        # execution. In order to do this, we leverage the engine's RegisterResourceOutputs to wait for the
        # resolution of all resources that this Helm chart created.
        self.resources = all_config.apply(_parse_chart)
        self.register_outputs({"resources": self.resources})
        self.ready = self.resources.apply(lambda x: list(x.values()))

    def get_resource(self,
                     group_version_kind: str,
                     name: str,
                     namespace: Optional[str] = None) -> pulumi.Output[pulumi.CustomResource]:
        """
        get_resource returns a resource defined by a built-in Kubernetes group/version/kind and
        name. For example: `get_resource("apps/v1/Deployment", "nginx")`

        :param str group_version_kind: Group/Version/Kind of the resource, e.g., `apps/v1/Deployment`
        :param str name: Name of the resource to retrieve
        :param Optional[str] namespace: Optional namespace of the resource to retrieve
        """

        # `id` will either be `${name}` or `${namespace}/${name}`.
        id = pulumi.Output.from_input(name)
        if namespace is not None:
            id = pulumi.Output.concat(namespace, '/', name)

        resource_id = id.apply(lambda x: f'{group_version_kind}:{x}')
        return resource_id.apply(lambda x: self.resources[x])


class FetchOpts:
    """
    FetchOpts is a bag of configuration options to customize the fetching of the Helm chart.
    """

    version: Optional[pulumi.Input[str]]
    """
    Specific version of a chart. If unset, the latest version is fetched.
    """

    ca_file: Optional[pulumi.Input[str]]
    """
    Verify certificates of HTTPS-enabled servers using this CA bundle.
    """

    cert_file: Optional[pulumi.Input[str]]
    """
    Identify HTTPS client using this SSL certificate file.
    """

    key_file: Optional[pulumi.Input[str]]
    """
    Identify HTTPS client using this SSL key file.
    """

    destination: Optional[pulumi.Input[str]]
    """
    Location to write the chart. If this and [tardir] are specified, tardir is appended
    to this (default ".").
    """

    keyring: Optional[pulumi.Input[str]]
    """
    Keyring containing public keys (default "/Users/alex/.gnupg/pubring.gpg").
    """

    password: Optional[pulumi.Input[str]]
    """
    Chart repository password.
    """

    repo: Optional[pulumi.Input[str]]
    """
    Chart repository url where to locate the requested chart.
    """

    untar_dir: Optional[pulumi.Input[str]]
    """
    If [untar] is specified, this flag specifies the name of the directory into which
    the chart is expanded (default ".").
    """

    username: Optional[pulumi.Input[str]]
    """
    Chart repository username.
    """

    home: Optional[pulumi.Input[str]]
    """
    Location of your Helm config. Overrides $HELM_HOME (default "/Users/alex/.helm").
    """

    devel: Optional[pulumi.Input[bool]]
    """
    Use development versions, too. Equivalent to version '>0.0.0-0'. If [version] is set,
    this is ignored.
    """

    prov: Optional[pulumi.Input[bool]]
    """
    Fetch the provenance file, but don't perform verification.
    """

    untar: Optional[pulumi.Input[bool]]
    """
    If set to false, will leave the chart as a tarball after downloading.
    """

    verify: Optional[pulumi.Input[bool]]
    """
    Verify the package against its signature.
    """

    def __init__(self,
                 version: Optional[pulumi.Input[str]] = None,
                 ca_file: Optional[pulumi.Input[str]] = None,
                 cert_file: Optional[pulumi.Input[str]] = None,
                 key_file: Optional[pulumi.Input[str]] = None,
                 destination: Optional[pulumi.Input[str]] = None,
                 keyring: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 repo: Optional[pulumi.Input[str]] = None,
                 untar_dir: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 home: Optional[pulumi.Input[str]] = None,
                 devel: Optional[pulumi.Input[bool]] = None,
                 prov: Optional[pulumi.Input[bool]] = None,
                 untar: Optional[pulumi.Input[bool]] = None,
                 verify: Optional[pulumi.Input[bool]] = None):
        """
        :param Optional[pulumi.Input[str]] version: Specific version of a chart. If unset,
               the latest version is fetched.
        :param Optional[pulumi.Input[str]] ca_file: Verify certificates of HTTPS-enabled
               servers using this CA bundle.
        :param Optional[pulumi.Input[str]] cert_file: Identify HTTPS client using this SSL
               certificate file.
        :param Optional[pulumi.Input[str]] key_file: Identify HTTPS client using this SSL
               key file.
        :param Optional[pulumi.Input[str]] destination: Location to write the chart.
               If this and [tardir] are specified, tardir is appended to this (default ".").
        :param Optional[pulumi.Input[str]] keyring: Keyring containing public keys
               (default "/Users/<user>/.gnupg/pubring.gpg").
        :param Optional[pulumi.Input[str]] password: Chart repository password.
        :param Optional[pulumi.Input[str]] repo: Chart repository url where to locate
               the requested chart.
        :param Optional[pulumi.Input[str]] untar_dir: If [untar] is specified, this flag
               specifies the name of the directory into which the chart is
               expanded (default ".").
        :param Optional[pulumi.Input[str]] username: Chart repository username.
        :param Optional[pulumi.Input[str]] home: Location of your Helm config. Overrides
               $HELM_HOME (default "/Users/<user>/.helm").
        :param Optional[pulumi.Input[bool]] devel: Use development versions, too.
               Equivalent to version '>0.0.0-0'. If [version] is set, this is ignored.
        :param Optional[pulumi.Input[bool]] prov: Fetch the provenance file, but don't
               perform verification.
        :param Optional[pulumi.Input[bool]] untar: If set to false, will leave the
               chart as a tarball after downloading.
        :param Optional[pulumi.Input[bool]] verify: Verify the package against its signature.
        """
        self.version = version
        self.ca_file = ca_file
        self.cert_file = cert_file
        self.key_file = key_file
        self.destination = destination
        self.keyring = keyring
        self.password = password
        self.repo = repo
        self.untar_dir = untar_dir
        self.username = username
        self.home = home
        self.devel = devel
        self.prov = prov
        self.untar = untar
        self.verify = verify


class BaseChartOpts:
    """
    BaseChartOpts is a bag of common configuration options for a Helm chart.
    """

    namespace: Optional[pulumi.Input[str]]
    """
    Optional namespace to install chart resources into.
    """

    values: Optional[pulumi.Inputs]
    """
    Optional overrides for chart values.
    """

    transformations: Optional[Sequence[Callable[[Any, pulumi.ResourceOptions], None]]]
    """
    Optional list of transformations to apply to resources that will be created by this chart prior to
    creation. Allows customization of the chart behaviour without directly modifying the chart itself.
    """

    resource_prefix: Optional[str]
    """
    Optional prefix for the auto-generated resource names.
    Example: A resource created with resource_prefix="foo" would produce a resource named "foo-resourceName".
    """

    api_versions: Optional[Sequence[pulumi.Input[str]]]
    """
    Optional kubernetes api versions used for Capabilities.APIVersions.
    """

    include_test_hook_resources: Optional[pulumi.Input[bool]]
    """
    By default, Helm resources with the 'test', 'test-success', and 'test-failure' hooks are not installed. Set
    this flag to true to include these resources.
    """

    skip_crd_rendering: Optional[pulumi.Input[bool]]
    """
    By default, CRDs are rendered along with Helm chart templates. Setting this to true will skip CRD rendering.
    """

    skip_await: Optional[pulumi.Input[bool]]
    """
    Skip await logic for all resources in this Chart. Resources will be marked ready as soon as they are created.
    Warning: This option should not be used if you have resources depending on Outputs from the Chart.
    """

    def __init__(self,
                 namespace: Optional[pulumi.Input[str]] = None,
                 values: Optional[pulumi.Inputs] = None,
                 transformations: Optional[Sequence[Callable[[Any, pulumi.ResourceOptions], None]]] = None,
                 resource_prefix: Optional[str] = None,
                 api_versions: Optional[Sequence[pulumi.Input[str]]] = None,
                 include_test_hook_resources: Optional[pulumi.Input[bool]] = None,
                 skip_crd_rendering: Optional[pulumi.Input[bool]] = None,
                 skip_await: Optional[pulumi.Input[bool]] = None):
        """
        :param Optional[pulumi.Input[str]] namespace: Optional namespace to install chart resources into.
        :param Optional[pulumi.Inputs] values: Optional overrides for chart values.
        :param Optional[Sequence[Callable[[Any, pulumi.ResourceOptions], None]]] transformations: Optional list
               of transformations to apply to resources that will be created by this chart prior to creation.
               Allows customization of the chart behaviour without directly modifying the chart itself.
        :param Optional[str] resource_prefix: An optional prefix for the auto-generated resource names.
               Example: A resource created with resource_prefix="foo" would produce a resource named "foo-resourceName".
        :param Optional[Sequence[pulumi.Input[str]]] api_versions: Optional kubernetes api versions used for
               Capabilities.APIVersions.
        :param Optional[pulumi.Input[bool]] include_test_hook_resources: By default, Helm resources with the 'test',
               'test-success', and 'test-failure' hooks are not installed. Set this flag to true to include these
               resources.
        :param Optional[pulumi.Input[bool]] skip_crd_rendering: By default, CRDs are rendered along with Helm chart
               templates. Setting this to true will skip CRD rendering.
        :param Optional[pulumi.Input[bool]] skip_await: Skip await logic for all resources in this Chart. Resources
               will be marked ready as soon as they are created. Warning: This option should not be used if you have
               resources depending on Outputs from the Chart.
        """
        self.namespace = namespace
        self.include_test_hook_resources = include_test_hook_resources
        self.skip_crd_rendering = skip_crd_rendering
        self.skip_await = skip_await
        self.values = values
        self.transformations = transformations
        self.resource_prefix = resource_prefix
        self.api_versions = api_versions

    def to_json(self):
        return pulumi.Output.from_input(self.__dict__).apply(
            lambda x: json.dumps(x, default=lambda o: {k: v for (k, v) in o.__dict__.items() if v is not None}))


class ChartOpts(BaseChartOpts):
    """
    ChartOpts is a bag of configuration options for a remote Helm chart.
    """

    chart: pulumi.Input[str]
    """
    The name of the chart to deploy.  If `repo` is provided, this chart name will be prefixed by the repo name.
    Example: repo: "stable", chart: "nginx-ingress" -> "stable/nginx-ingress"
    Example: chart: "stable/nginx-ingress" -> "stable/nginx-ingress"
    """

    repo: Optional[pulumi.Input[str]]
    """
    The repository name of the chart to deploy. 
    Example: "stable"
    """

    version: Optional[pulumi.Input[str]]
    """
    The version of the chart to deploy. If not provided, the latest version will be deployed.
    """

    fetch_opts: Optional[pulumi.Input[FetchOpts]]
    """
    Additional options to customize the fetching of the Helm chart.
    """

    def __init__(self,
                 chart: pulumi.Input[str],
                 namespace: Optional[pulumi.Input[str]] = None,
                 values: Optional[pulumi.Inputs] = None,
                 transformations: Optional[Sequence[Callable[[Any, pulumi.ResourceOptions], None]]] = None,
                 resource_prefix: Optional[str] = None,
                 repo: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 fetch_opts: Optional[pulumi.Input[FetchOpts]] = None,
                 api_versions: Optional[Sequence[pulumi.Input[str]]] = None,
                 include_test_hook_resources: Optional[pulumi.Input[bool]] = None,
                 skip_crd_rendering: Optional[pulumi.Input[bool]] = None,
                 skip_await: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] chart: The name of the chart to deploy.  If `repo` is provided, this chart name
               will be prefixed by the repo name.
               Example: repo: "stable", chart: "nginx-ingress" -> "stable/nginx-ingress"
               Example: chart: "stable/nginx-ingress" -> "stable/nginx-ingress"
        :param Optional[pulumi.Input[str]] namespace: Optional namespace to install chart resources into.
        :param Optional[pulumi.Inputs] values: Optional overrides for chart values.
        :param Optional[Sequence[Callable[[Any, pulumi.ResourceOptions], None]]] transformations: Optional list of
               transformations to apply to resources that will be created by this chart prior to creation.
               Allows customization of the chart behaviour without directly modifying the chart itself.
        :param Optional[str] resource_prefix: An optional prefix for the auto-generated resource names.
               Example: A resource created with resource_prefix="foo" would produce a resource named "foo-resourceName".
        :param Optional[pulumi.Input[str]] repo: The repository name of the chart to deploy.
               Example: "stable"
        :param Optional[pulumi.Input[str]] version: The version of the chart to deploy. If not provided,
               the latest version will be deployed.
        :param Optional[pulumi.Input[FetchOpts]] fetch_opts: Additional options to customize the
               fetching of the Helm chart.
        :param Optional[Sequence[pulumi.Input[str]]] api_versions: Optional kubernetes api versions used for
               Capabilities.APIVersions.
        :param Optional[pulumi.Input[bool]] include_test_hook_resources: By default, Helm resources with the 'test',
               'test-success', and 'test-failure' hooks are not installed. Set this flag to true to include these
               resources.
        :param Optional[pulumi.Input[bool]] skip_crd_rendering: By default, CRDs are rendered along with Helm chart
               templates. Setting this to true will skip CRD rendering.
        :param Optional[pulumi.Input[bool]] skip_await: Skip await logic for all resources in this Chart. Resources
               will be marked ready as soon as they are created. Warning: This option should not be used if you have
               resources depending on Outputs from the Chart.
        """
        super(ChartOpts, self).__init__(namespace, values, transformations, resource_prefix, api_versions,
                                        include_test_hook_resources, skip_crd_rendering, skip_await)
        self.chart = chart
        self.repo = repo
        self.version = version
        self.fetch_opts = fetch_opts


class LocalChartOpts(BaseChartOpts):
    """
    LocalChartOpts is a bag of configuration options for a local Helm chart.
    """

    path: pulumi.Input[str]
    """
    The path to the chart directory which contains the `Chart.yaml` file.
    """

    def __init__(self,
                 path: pulumi.Input[str],
                 namespace: Optional[pulumi.Input[str]] = None,
                 values: Optional[pulumi.Inputs] = None,
                 transformations: Optional[Sequence[Callable[[Any, pulumi.ResourceOptions], None]]] = None,
                 resource_prefix: Optional[str] = None,
                 api_versions: Optional[Sequence[pulumi.Input[str]]] = None,
                 include_test_hook_resources: Optional[pulumi.Input[bool]] = None,
                 skip_crd_rendering: Optional[pulumi.Input[bool]] = None,
                 skip_await: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] path: The path to the chart directory which contains the
               `Chart.yaml` file.
        :param Optional[pulumi.Input[str]] namespace: Optional namespace to install chart resources into.
        :param Optional[pulumi.Inputs] values: Optional overrides for chart values.
        :param Optional[Sequence[Callable[[Any, pulumi.ResourceOptions], None]]] transformations: Optional list of
               transformations to apply to resources that will be created by this chart prior to creation.
               Allows customization of the chart behaviour without directly modifying the chart itself.
        :param Optional[str] resource_prefix: An optional prefix for the auto-generated resource names.
               Example: A resource created with resource_prefix="foo" would produce a resource named "foo-resourceName".
        :param Optional[Sequence[pulumi.Input[str]]] api_versions: Optional kubernetes api versions used for
               Capabilities.APIVersions.
        :param Optional[pulumi.Input[bool]] include_test_hook_resources: By default, Helm resources with the 'test',
               'test-success', and 'test-failure' hooks are not installed. Set this flag to true to include these
               resources.
        :param Optional[pulumi.Input[bool]] skip_crd_rendering: By default, CRDs are rendered along with Helm chart
               templates. Setting this to true will skip CRD rendering.
        :param Optional[pulumi.Input[bool]] skip_await: Skip await logic for all resources in this Chart. Resources
               will be marked ready as soon as they are created. Warning: This option should not be used if you have
               resources depending on Outputs from the Chart.
        """

        super(LocalChartOpts, self).__init__(namespace, values, transformations, resource_prefix, api_versions,
                                             include_test_hook_resources, skip_crd_rendering, skip_await)
        self.path = path


def _parse_chart(all_config: Tuple[Union[ChartOpts, LocalChartOpts], pulumi.ResourceOptions]) -> pulumi.Output:
    config, opts = all_config

    json_opts = config.to_json()

    # Rather than using the default provider for the following invoke call, use the version specified
    # in package.json.
    invoke_opts = pulumi.InvokeOptions(version=_utilities.get_version())

    transformations = config.transformations if config.transformations is not None else []
    if config.skip_await:
        transformations.append(_skip_await)

    objects = json_opts.apply(lambda x: pulumi.runtime.invoke('kubernetes:helm:template',
                                                              {'jsonOpts': x}, invoke_opts).value['result'])
    return objects.apply(lambda x: _parse_yaml_document(x, opts, transformations))
