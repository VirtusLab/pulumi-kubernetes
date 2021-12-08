// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.v1beta1.outputs;

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
public final class LimitedPriorityLevelConfiguration {
    private final @Nullable Integer assuredConcurrencyShares;
    private final @Nullable io.pulumi.kubernetes.flowcontrol.v1beta1.outputs.LimitResponse limitResponse;

    @OutputCustomType.Constructor({"assuredConcurrencyShares","limitResponse"})
    private LimitedPriorityLevelConfiguration(
        @Nullable Integer assuredConcurrencyShares,
        @Nullable io.pulumi.kubernetes.flowcontrol.v1beta1.outputs.LimitResponse limitResponse) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        this.limitResponse = limitResponse;
    }

    public Optional<Integer> getAssuredConcurrencyShares() {
        return Optional.ofNullable(this.assuredConcurrencyShares);
    }
    public Optional<io.pulumi.kubernetes.flowcontrol.v1beta1.outputs.LimitResponse> getLimitResponse() {
        return Optional.ofNullable(this.limitResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitedPriorityLevelConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer assuredConcurrencyShares;
        private @Nullable io.pulumi.kubernetes.flowcontrol.v1beta1.outputs.LimitResponse limitResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitedPriorityLevelConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assuredConcurrencyShares = defaults.assuredConcurrencyShares;
    	      this.limitResponse = defaults.limitResponse;
        }

        public Builder setAssuredConcurrencyShares(@Nullable Integer assuredConcurrencyShares) {
            this.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
        }

        public Builder setLimitResponse(@Nullable io.pulumi.kubernetes.flowcontrol.v1beta1.outputs.LimitResponse limitResponse) {
            this.limitResponse = limitResponse;
            return this;
        }

        public LimitedPriorityLevelConfiguration build() {
            return new LimitedPriorityLevelConfiguration(assuredConcurrencyShares, limitResponse);
        }
    }
}
