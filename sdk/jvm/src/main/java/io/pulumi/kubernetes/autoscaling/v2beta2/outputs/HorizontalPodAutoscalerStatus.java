// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling.v2beta2.outputs;

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
public final class HorizontalPodAutoscalerStatus {
    private final List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerCondition> conditions;
    private final @Nullable List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricStatus> currentMetrics;
    private final Integer currentReplicas;
    private final Integer desiredReplicas;
    private final @Nullable String lastScaleTime;
    private final @Nullable Integer observedGeneration;

    @OutputCustomType.Constructor({"conditions","currentMetrics","currentReplicas","desiredReplicas","lastScaleTime","observedGeneration"})
    private HorizontalPodAutoscalerStatus(
        List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerCondition> conditions,
        @Nullable List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricStatus> currentMetrics,
        Integer currentReplicas,
        Integer desiredReplicas,
        @Nullable String lastScaleTime,
        @Nullable Integer observedGeneration) {
        this.conditions = Objects.requireNonNull(conditions);
        this.currentMetrics = currentMetrics;
        this.currentReplicas = Objects.requireNonNull(currentReplicas);
        this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    public List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerCondition> getConditions() {
        return this.conditions;
    }
    public List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricStatus> getCurrentMetrics() {
        return this.currentMetrics == null ? List.of() : this.currentMetrics;
    }
    public Integer getCurrentReplicas() {
        return this.currentReplicas;
    }
    public Integer getDesiredReplicas() {
        return this.desiredReplicas;
    }
    public Optional<String> getLastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerCondition> conditions;
        private @Nullable List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricStatus> currentMetrics;
        private Integer currentReplicas;
        private Integer desiredReplicas;
        private @Nullable String lastScaleTime;
        private @Nullable Integer observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentMetrics = defaults.currentMetrics;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder setConditions(List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setCurrentMetrics(@Nullable List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricStatus> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }

        public Builder setCurrentReplicas(Integer currentReplicas) {
            this.currentReplicas = Objects.requireNonNull(currentReplicas);
            return this;
        }

        public Builder setDesiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }

        public Builder setLastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public HorizontalPodAutoscalerStatus build() {
            return new HorizontalPodAutoscalerStatus(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
        }
    }
}
