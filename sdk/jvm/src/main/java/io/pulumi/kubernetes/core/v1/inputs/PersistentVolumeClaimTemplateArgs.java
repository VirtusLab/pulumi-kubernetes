// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class PersistentVolumeClaimTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeClaimTemplateArgs Empty = new PersistentVolumeClaimTemplateArgs();

    @InputImport(name="metadata")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="spec", required=true)
    private final Input<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimSpecArgs> spec;

    public Input<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimSpecArgs> getSpec() {
        return this.spec;
    }

    public PersistentVolumeClaimTemplateArgs(
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata,
        Input<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimSpecArgs> spec) {
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
    }

    private PersistentVolumeClaimTemplateArgs() {
        this.metadata = Input.empty();
        this.spec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeClaimTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;
        private Input<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeClaimTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder setMetadata(@Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setSpec(Input<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder setSpec(io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimSpecArgs spec) {
            this.spec = Input.of(Objects.requireNonNull(spec));
            return this;
        }

        public PersistentVolumeClaimTemplateArgs build() {
            return new PersistentVolumeClaimTemplateArgs(metadata, spec);
        }
    }
}
