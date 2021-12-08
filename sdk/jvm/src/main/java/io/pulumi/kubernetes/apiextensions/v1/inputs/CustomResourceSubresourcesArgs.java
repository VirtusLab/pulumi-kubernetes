// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class CustomResourceSubresourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceSubresourcesArgs Empty = new CustomResourceSubresourcesArgs();

    @InputImport(name="scale")
    private final @Nullable Input<io.pulumi.kubernetes.apiextensions.v1.inputs.CustomResourceSubresourceScaleArgs> scale;

    public Input<io.pulumi.kubernetes.apiextensions.v1.inputs.CustomResourceSubresourceScaleArgs> getScale() {
        return this.scale == null ? Input.empty() : this.scale;
    }

    @InputImport(name="status")
    private final @Nullable Input<com.google.gson.JsonElement> status;

    public Input<com.google.gson.JsonElement> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public CustomResourceSubresourcesArgs(
        @Nullable Input<io.pulumi.kubernetes.apiextensions.v1.inputs.CustomResourceSubresourceScaleArgs> scale,
        @Nullable Input<com.google.gson.JsonElement> status) {
        this.scale = scale;
        this.status = status;
    }

    private CustomResourceSubresourcesArgs() {
        this.scale = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceSubresourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.apiextensions.v1.inputs.CustomResourceSubresourceScaleArgs> scale;
        private @Nullable Input<com.google.gson.JsonElement> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceSubresourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scale = defaults.scale;
    	      this.status = defaults.status;
        }

        public Builder setScale(@Nullable Input<io.pulumi.kubernetes.apiextensions.v1.inputs.CustomResourceSubresourceScaleArgs> scale) {
            this.scale = scale;
            return this;
        }

        public Builder setScale(@Nullable io.pulumi.kubernetes.apiextensions.v1.inputs.CustomResourceSubresourceScaleArgs scale) {
            this.scale = Input.ofNullable(scale);
            return this;
        }

        public Builder setStatus(@Nullable Input<com.google.gson.JsonElement> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable com.google.gson.JsonElement status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public CustomResourceSubresourcesArgs build() {
            return new CustomResourceSubresourcesArgs(scale, status);
        }
    }
}
