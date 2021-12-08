// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.coordination.v1.outputs;

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
public final class LeaseSpec {
    private final @Nullable String acquireTime;
    private final @Nullable String holderIdentity;
    private final @Nullable Integer leaseDurationSeconds;
    private final @Nullable Integer leaseTransitions;
    private final @Nullable String renewTime;

    @OutputCustomType.Constructor({"acquireTime","holderIdentity","leaseDurationSeconds","leaseTransitions","renewTime"})
    private LeaseSpec(
        @Nullable String acquireTime,
        @Nullable String holderIdentity,
        @Nullable Integer leaseDurationSeconds,
        @Nullable Integer leaseTransitions,
        @Nullable String renewTime) {
        this.acquireTime = acquireTime;
        this.holderIdentity = holderIdentity;
        this.leaseDurationSeconds = leaseDurationSeconds;
        this.leaseTransitions = leaseTransitions;
        this.renewTime = renewTime;
    }

    public Optional<String> getAcquireTime() {
        return Optional.ofNullable(this.acquireTime);
    }
    public Optional<String> getHolderIdentity() {
        return Optional.ofNullable(this.holderIdentity);
    }
    public Optional<Integer> getLeaseDurationSeconds() {
        return Optional.ofNullable(this.leaseDurationSeconds);
    }
    public Optional<Integer> getLeaseTransitions() {
        return Optional.ofNullable(this.leaseTransitions);
    }
    public Optional<String> getRenewTime() {
        return Optional.ofNullable(this.renewTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LeaseSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acquireTime;
        private @Nullable String holderIdentity;
        private @Nullable Integer leaseDurationSeconds;
        private @Nullable Integer leaseTransitions;
        private @Nullable String renewTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LeaseSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acquireTime = defaults.acquireTime;
    	      this.holderIdentity = defaults.holderIdentity;
    	      this.leaseDurationSeconds = defaults.leaseDurationSeconds;
    	      this.leaseTransitions = defaults.leaseTransitions;
    	      this.renewTime = defaults.renewTime;
        }

        public Builder setAcquireTime(@Nullable String acquireTime) {
            this.acquireTime = acquireTime;
            return this;
        }

        public Builder setHolderIdentity(@Nullable String holderIdentity) {
            this.holderIdentity = holderIdentity;
            return this;
        }

        public Builder setLeaseDurationSeconds(@Nullable Integer leaseDurationSeconds) {
            this.leaseDurationSeconds = leaseDurationSeconds;
            return this;
        }

        public Builder setLeaseTransitions(@Nullable Integer leaseTransitions) {
            this.leaseTransitions = leaseTransitions;
            return this;
        }

        public Builder setRenewTime(@Nullable String renewTime) {
            this.renewTime = renewTime;
            return this;
        }

        public LeaseSpec build() {
            return new LeaseSpec(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, renewTime);
        }
    }
}
