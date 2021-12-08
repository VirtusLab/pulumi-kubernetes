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
public final class HorizontalPodAutoscalerSpec {
    private final @Nullable io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerBehavior behavior;
    private final Integer maxReplicas;
    private final @Nullable List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricSpec> metrics;
    private final @Nullable Integer minReplicas;
    private final io.pulumi.kubernetes.autoscaling.v2beta2.outputs.CrossVersionObjectReference scaleTargetRef;

    @OutputCustomType.Constructor({"behavior","maxReplicas","metrics","minReplicas","scaleTargetRef"})
    private HorizontalPodAutoscalerSpec(
        @Nullable io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerBehavior behavior,
        Integer maxReplicas,
        @Nullable List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricSpec> metrics,
        @Nullable Integer minReplicas,
        io.pulumi.kubernetes.autoscaling.v2beta2.outputs.CrossVersionObjectReference scaleTargetRef) {
        this.behavior = behavior;
        this.maxReplicas = Objects.requireNonNull(maxReplicas);
        this.metrics = metrics;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
    }

    public Optional<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerBehavior> getBehavior() {
        return Optional.ofNullable(this.behavior);
    }
    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }
    public List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricSpec> getMetrics() {
        return this.metrics == null ? List.of() : this.metrics;
    }
    public Optional<Integer> getMinReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    public io.pulumi.kubernetes.autoscaling.v2beta2.outputs.CrossVersionObjectReference getScaleTargetRef() {
        return this.scaleTargetRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerBehavior behavior;
        private Integer maxReplicas;
        private @Nullable List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricSpec> metrics;
        private @Nullable Integer minReplicas;
        private io.pulumi.kubernetes.autoscaling.v2beta2.outputs.CrossVersionObjectReference scaleTargetRef;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
        }

        public Builder setBehavior(@Nullable io.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerBehavior behavior) {
            this.behavior = behavior;
            return this;
        }

        public Builder setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }

        public Builder setMetrics(@Nullable List<io.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricSpec> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMinReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        public Builder setScaleTargetRef(io.pulumi.kubernetes.autoscaling.v2beta2.outputs.CrossVersionObjectReference scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }

        public HorizontalPodAutoscalerSpec build() {
            return new HorizontalPodAutoscalerSpec(behavior, maxReplicas, metrics, minReplicas, scaleTargetRef);
        }
    }
}
