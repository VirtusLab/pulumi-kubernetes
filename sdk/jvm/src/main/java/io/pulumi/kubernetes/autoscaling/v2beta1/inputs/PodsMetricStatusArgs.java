// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling.v2beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class PodsMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodsMetricStatusArgs Empty = new PodsMetricStatusArgs();

    @InputImport(name="currentAverageValue", required=true)
    private final Input<String> currentAverageValue;

    public Input<String> getCurrentAverageValue() {
        return this.currentAverageValue;
    }

    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    @InputImport(name="selector")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    public PodsMetricStatusArgs(
        Input<String> currentAverageValue,
        Input<String> metricName,
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector) {
        this.currentAverageValue = Objects.requireNonNull(currentAverageValue, "expected parameter 'currentAverageValue' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.selector = selector;
    }

    private PodsMetricStatusArgs() {
        this.currentAverageValue = Input.empty();
        this.metricName = Input.empty();
        this.selector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> currentAverageValue;
        private Input<String> metricName;
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
        }

        public Builder setCurrentAverageValue(Input<String> currentAverageValue) {
            this.currentAverageValue = Objects.requireNonNull(currentAverageValue);
            return this;
        }

        public Builder setCurrentAverageValue(String currentAverageValue) {
            this.currentAverageValue = Input.of(Objects.requireNonNull(currentAverageValue));
            return this;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setSelector(@Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public PodsMetricStatusArgs build() {
            return new PodsMetricStatusArgs(currentAverageValue, metricName, selector);
        }
    }
}
