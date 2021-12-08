// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.v1beta1.outputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;

@OutputCustomType
public final class APIService {
    private final @Nullable String apiVersion;
    private final @Nullable String kind;
    private final @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata;
    private final @Nullable io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceSpec spec;
    private final @Nullable io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceStatus status;

    @OutputCustomType.Constructor({"apiVersion","kind","metadata","spec","status"})
    private APIService(
        @Nullable String apiVersion,
        @Nullable String kind,
        @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata,
        @Nullable io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceSpec spec,
        @Nullable io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceSpec> getSpec() {
        return Optional.ofNullable(this.spec);
    }
    public Optional<io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata;
        private @Nullable io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceSpec spec;
        private @Nullable io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(APIService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSpec(@Nullable io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceSpec spec) {
            this.spec = spec;
            return this;
        }

        public Builder setStatus(@Nullable io.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceStatus status) {
            this.status = status;
            return this;
        }

        public APIService build() {
            return new APIService(apiVersion, kind, metadata, spec, status);
        }
    }
}
