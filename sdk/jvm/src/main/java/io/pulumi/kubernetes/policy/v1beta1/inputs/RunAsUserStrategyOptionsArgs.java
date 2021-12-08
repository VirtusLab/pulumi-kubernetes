// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class RunAsUserStrategyOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RunAsUserStrategyOptionsArgs Empty = new RunAsUserStrategyOptionsArgs();

    @InputImport(name="ranges")
    private final @Nullable Input<List<io.pulumi.kubernetes.policy.v1beta1.inputs.IDRangeArgs>> ranges;

    public Input<List<io.pulumi.kubernetes.policy.v1beta1.inputs.IDRangeArgs>> getRanges() {
        return this.ranges == null ? Input.empty() : this.ranges;
    }

    @InputImport(name="rule", required=true)
    private final Input<String> rule;

    public Input<String> getRule() {
        return this.rule;
    }

    public RunAsUserStrategyOptionsArgs(
        @Nullable Input<List<io.pulumi.kubernetes.policy.v1beta1.inputs.IDRangeArgs>> ranges,
        Input<String> rule) {
        this.ranges = ranges;
        this.rule = Objects.requireNonNull(rule, "expected parameter 'rule' to be non-null");
    }

    private RunAsUserStrategyOptionsArgs() {
        this.ranges = Input.empty();
        this.rule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsUserStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<io.pulumi.kubernetes.policy.v1beta1.inputs.IDRangeArgs>> ranges;
        private Input<String> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(RunAsUserStrategyOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder setRanges(@Nullable Input<List<io.pulumi.kubernetes.policy.v1beta1.inputs.IDRangeArgs>> ranges) {
            this.ranges = ranges;
            return this;
        }

        public Builder setRanges(@Nullable List<io.pulumi.kubernetes.policy.v1beta1.inputs.IDRangeArgs> ranges) {
            this.ranges = Input.ofNullable(ranges);
            return this;
        }

        public Builder setRule(Input<String> rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public Builder setRule(String rule) {
            this.rule = Input.of(Objects.requireNonNull(rule));
            return this;
        }

        public RunAsUserStrategyOptionsArgs build() {
            return new RunAsUserStrategyOptionsArgs(ranges, rule);
        }
    }
}
