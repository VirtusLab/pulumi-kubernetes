// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1beta2.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class RollingUpdateDaemonSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RollingUpdateDaemonSetArgs Empty = new RollingUpdateDaemonSetArgs();

    @InputImport(name="maxUnavailable")
    private final @Nullable Input<Either<Integer,String>> maxUnavailable;

    public Input<Either<Integer,String>> getMaxUnavailable() {
        return this.maxUnavailable == null ? Input.empty() : this.maxUnavailable;
    }

    public RollingUpdateDaemonSetArgs(@Nullable Input<Either<Integer,String>> maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    private RollingUpdateDaemonSetArgs() {
        this.maxUnavailable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateDaemonSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<Integer,String>> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateDaemonSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder setMaxUnavailable(@Nullable Input<Either<Integer,String>> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        public Builder setMaxUnavailable(@Nullable Either<Integer,String> maxUnavailable) {
            this.maxUnavailable = Input.ofNullable(maxUnavailable);
            return this;
        }

        public RollingUpdateDaemonSetArgs build() {
            return new RollingUpdateDaemonSetArgs(maxUnavailable);
        }
    }
}
