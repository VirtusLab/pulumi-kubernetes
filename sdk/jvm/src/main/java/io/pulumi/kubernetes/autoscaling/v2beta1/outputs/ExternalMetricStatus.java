// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling.v2beta1.outputs;

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
public final class ExternalMetricStatus {
    private final @Nullable String currentAverageValue;
    private final String currentValue;
    private final String metricName;
    private final @Nullable io.pulumi.kubernetes.meta.v1.outputs.LabelSelector metricSelector;

    @OutputCustomType.Constructor({"currentAverageValue","currentValue","metricName","metricSelector"})
    private ExternalMetricStatus(
        @Nullable String currentAverageValue,
        String currentValue,
        String metricName,
        @Nullable io.pulumi.kubernetes.meta.v1.outputs.LabelSelector metricSelector) {
        this.currentAverageValue = currentAverageValue;
        this.currentValue = Objects.requireNonNull(currentValue);
        this.metricName = Objects.requireNonNull(metricName);
        this.metricSelector = metricSelector;
    }

    public Optional<String> getCurrentAverageValue() {
        return Optional.ofNullable(this.currentAverageValue);
    }
    public String getCurrentValue() {
        return this.currentValue;
    }
    public String getMetricName() {
        return this.metricName;
    }
    public Optional<io.pulumi.kubernetes.meta.v1.outputs.LabelSelector> getMetricSelector() {
        return Optional.ofNullable(this.metricSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String currentAverageValue;
        private String currentValue;
        private String metricName;
        private @Nullable io.pulumi.kubernetes.meta.v1.outputs.LabelSelector metricSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.currentValue = defaults.currentValue;
    	      this.metricName = defaults.metricName;
    	      this.metricSelector = defaults.metricSelector;
        }

        public Builder setCurrentAverageValue(@Nullable String currentAverageValue) {
            this.currentAverageValue = currentAverageValue;
            return this;
        }

        public Builder setCurrentValue(String currentValue) {
            this.currentValue = Objects.requireNonNull(currentValue);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricSelector(@Nullable io.pulumi.kubernetes.meta.v1.outputs.LabelSelector metricSelector) {
            this.metricSelector = metricSelector;
            return this;
        }

        public ExternalMetricStatus build() {
            return new ExternalMetricStatus(currentAverageValue, currentValue, metricName, metricSelector);
        }
    }
}
