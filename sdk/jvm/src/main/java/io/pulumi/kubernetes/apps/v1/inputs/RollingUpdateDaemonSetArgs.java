// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1.inputs;

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

    @InputImport(name="maxSurge")
    private final @Nullable Input<Either<Integer,String>> maxSurge;

    public Input<Either<Integer,String>> getMaxSurge() {
        return this.maxSurge == null ? Input.empty() : this.maxSurge;
    }

    @InputImport(name="maxUnavailable")
    private final @Nullable Input<Either<Integer,String>> maxUnavailable;

    public Input<Either<Integer,String>> getMaxUnavailable() {
        return this.maxUnavailable == null ? Input.empty() : this.maxUnavailable;
    }

    public RollingUpdateDaemonSetArgs(
        @Nullable Input<Either<Integer,String>> maxSurge,
        @Nullable Input<Either<Integer,String>> maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    private RollingUpdateDaemonSetArgs() {
        this.maxSurge = Input.empty();
        this.maxUnavailable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateDaemonSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<Integer,String>> maxSurge;
        private @Nullable Input<Either<Integer,String>> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateDaemonSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder setMaxSurge(@Nullable Input<Either<Integer,String>> maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        public Builder setMaxSurge(@Nullable Either<Integer,String> maxSurge) {
            this.maxSurge = Input.ofNullable(maxSurge);
            return this;
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
            return new RollingUpdateDaemonSetArgs(maxSurge, maxUnavailable);
        }
    }
}
