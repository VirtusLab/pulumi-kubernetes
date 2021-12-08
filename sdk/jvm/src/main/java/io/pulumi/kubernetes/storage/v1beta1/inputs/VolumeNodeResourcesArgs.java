// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class VolumeNodeResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeNodeResourcesArgs Empty = new VolumeNodeResourcesArgs();

    @InputImport(name="count")
    private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    public VolumeNodeResourcesArgs(@Nullable Input<Integer> count) {
        this.count = count;
    }

    private VolumeNodeResourcesArgs() {
        this.count = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeNodeResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeNodeResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public VolumeNodeResourcesArgs build() {
            return new VolumeNodeResourcesArgs(count);
        }
    }
}
