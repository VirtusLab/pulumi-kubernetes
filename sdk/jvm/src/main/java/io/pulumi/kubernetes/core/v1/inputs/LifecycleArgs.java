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


public final class LifecycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecycleArgs Empty = new LifecycleArgs();

    @InputImport(name="postStart")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> postStart;

    public Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> getPostStart() {
        return this.postStart == null ? Input.empty() : this.postStart;
    }

    @InputImport(name="preStop")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> preStop;

    public Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> getPreStop() {
        return this.preStop == null ? Input.empty() : this.preStop;
    }

    public LifecycleArgs(
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> postStart,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> preStop) {
        this.postStart = postStart;
        this.preStop = preStop;
    }

    private LifecycleArgs() {
        this.postStart = Input.empty();
        this.preStop = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> postStart;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> preStop;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postStart = defaults.postStart;
    	      this.preStop = defaults.preStop;
        }

        public Builder setPostStart(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> postStart) {
            this.postStart = postStart;
            return this;
        }

        public Builder setPostStart(@Nullable io.pulumi.kubernetes.core.v1.inputs.HandlerArgs postStart) {
            this.postStart = Input.ofNullable(postStart);
            return this;
        }

        public Builder setPreStop(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.HandlerArgs> preStop) {
            this.preStop = preStop;
            return this;
        }

        public Builder setPreStop(@Nullable io.pulumi.kubernetes.core.v1.inputs.HandlerArgs preStop) {
            this.preStop = Input.ofNullable(preStop);
            return this;
        }

        public LifecycleArgs build() {
            return new LifecycleArgs(postStart, preStop);
        }
    }
}
