// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class SubjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubjectArgs Empty = new SubjectArgs();

    @InputImport(name="apiGroup")
    private final @Nullable Input<String> apiGroup;

    public Input<String> getApiGroup() {
        return this.apiGroup == null ? Input.empty() : this.apiGroup;
    }

    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public SubjectArgs(
        @Nullable Input<String> apiGroup,
        Input<String> kind,
        Input<String> name,
        @Nullable Input<String> namespace) {
        this.apiGroup = apiGroup;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = namespace;
    }

    private SubjectArgs() {
        this.apiGroup = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiGroup;
        private Input<String> kind;
        private Input<String> name;
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setApiGroup(@Nullable Input<String> apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        public Builder setApiGroup(@Nullable String apiGroup) {
            this.apiGroup = Input.ofNullable(apiGroup);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public SubjectArgs build() {
            return new SubjectArgs(apiGroup, kind, name, namespace);
        }
    }
}
