// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.v1beta1.outputs;

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
public final class CSINode {
    private final @Nullable String apiVersion;
    private final @Nullable String kind;
    private final @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata;
    private final io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeSpec spec;

    @OutputCustomType.Constructor({"apiVersion","kind","metadata","spec"})
    private CSINode(
        @Nullable String apiVersion,
        @Nullable String kind,
        @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata,
        io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeSpec spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec);
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
    public io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeSpec getSpec() {
        return this.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata;
        private io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeSpec spec;

        public Builder() {
    	      // Empty
        }

        public Builder(CSINode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
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

        public Builder setSpec(io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeSpec spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public CSINode build() {
            return new CSINode(apiVersion, kind, metadata, spec);
        }
    }
}
