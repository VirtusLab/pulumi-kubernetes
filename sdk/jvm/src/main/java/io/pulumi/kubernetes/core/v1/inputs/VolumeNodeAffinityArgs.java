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


public final class VolumeNodeAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeNodeAffinityArgs Empty = new VolumeNodeAffinityArgs();

    @InputImport(name="required")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.NodeSelectorArgs> required;

    public Input<io.pulumi.kubernetes.core.v1.inputs.NodeSelectorArgs> getRequired() {
        return this.required == null ? Input.empty() : this.required;
    }

    public VolumeNodeAffinityArgs(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.NodeSelectorArgs> required) {
        this.required = required;
    }

    private VolumeNodeAffinityArgs() {
        this.required = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.NodeSelectorArgs> required;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeNodeAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.required = defaults.required;
        }

        public Builder setRequired(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.NodeSelectorArgs> required) {
            this.required = required;
            return this;
        }

        public Builder setRequired(@Nullable io.pulumi.kubernetes.core.v1.inputs.NodeSelectorArgs required) {
            this.required = Input.ofNullable(required);
            return this;
        }

        public VolumeNodeAffinityArgs build() {
            return new VolumeNodeAffinityArgs(required);
        }
    }
}
