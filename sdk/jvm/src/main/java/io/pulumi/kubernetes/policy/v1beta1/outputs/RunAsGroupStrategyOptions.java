// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy.v1beta1.outputs;

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
public final class RunAsGroupStrategyOptions {
    private final @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.IDRange> ranges;
    private final String rule;

    @OutputCustomType.Constructor({"ranges","rule"})
    private RunAsGroupStrategyOptions(
        @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.IDRange> ranges,
        String rule) {
        this.ranges = ranges;
        this.rule = Objects.requireNonNull(rule);
    }

    public List<io.pulumi.kubernetes.policy.v1beta1.outputs.IDRange> getRanges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    public String getRule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsGroupStrategyOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.IDRange> ranges;
        private String rule;

        public Builder() {
    	      // Empty
        }

        public Builder(RunAsGroupStrategyOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder setRanges(@Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.IDRange> ranges) {
            this.ranges = ranges;
            return this;
        }

        public Builder setRule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public RunAsGroupStrategyOptions build() {
            return new RunAsGroupStrategyOptions(ranges, rule);
        }
    }
}
