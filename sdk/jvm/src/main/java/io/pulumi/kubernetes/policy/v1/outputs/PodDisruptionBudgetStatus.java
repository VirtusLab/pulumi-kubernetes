// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy.v1.outputs;

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
public final class PodDisruptionBudgetStatus {
    private final @Nullable List<io.pulumi.kubernetes.meta.v1.outputs.Condition> conditions;
    private final Integer currentHealthy;
    private final Integer desiredHealthy;
    private final @Nullable Map<String,String> disruptedPods;
    private final Integer disruptionsAllowed;
    private final Integer expectedPods;
    private final @Nullable Integer observedGeneration;

    @OutputCustomType.Constructor({"conditions","currentHealthy","desiredHealthy","disruptedPods","disruptionsAllowed","expectedPods","observedGeneration"})
    private PodDisruptionBudgetStatus(
        @Nullable List<io.pulumi.kubernetes.meta.v1.outputs.Condition> conditions,
        Integer currentHealthy,
        Integer desiredHealthy,
        @Nullable Map<String,String> disruptedPods,
        Integer disruptionsAllowed,
        Integer expectedPods,
        @Nullable Integer observedGeneration) {
        this.conditions = conditions;
        this.currentHealthy = Objects.requireNonNull(currentHealthy);
        this.desiredHealthy = Objects.requireNonNull(desiredHealthy);
        this.disruptedPods = disruptedPods;
        this.disruptionsAllowed = Objects.requireNonNull(disruptionsAllowed);
        this.expectedPods = Objects.requireNonNull(expectedPods);
        this.observedGeneration = observedGeneration;
    }

    public List<io.pulumi.kubernetes.meta.v1.outputs.Condition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    public Integer getCurrentHealthy() {
        return this.currentHealthy;
    }
    public Integer getDesiredHealthy() {
        return this.desiredHealthy;
    }
    public Map<String,String> getDisruptedPods() {
        return this.disruptedPods == null ? Map.of() : this.disruptedPods;
    }
    public Integer getDisruptionsAllowed() {
        return this.disruptionsAllowed;
    }
    public Integer getExpectedPods() {
        return this.expectedPods;
    }
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDisruptionBudgetStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<io.pulumi.kubernetes.meta.v1.outputs.Condition> conditions;
        private Integer currentHealthy;
        private Integer desiredHealthy;
        private @Nullable Map<String,String> disruptedPods;
        private Integer disruptionsAllowed;
        private Integer expectedPods;
        private @Nullable Integer observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDisruptionBudgetStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentHealthy = defaults.currentHealthy;
    	      this.desiredHealthy = defaults.desiredHealthy;
    	      this.disruptedPods = defaults.disruptedPods;
    	      this.disruptionsAllowed = defaults.disruptionsAllowed;
    	      this.expectedPods = defaults.expectedPods;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder setConditions(@Nullable List<io.pulumi.kubernetes.meta.v1.outputs.Condition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setCurrentHealthy(Integer currentHealthy) {
            this.currentHealthy = Objects.requireNonNull(currentHealthy);
            return this;
        }

        public Builder setDesiredHealthy(Integer desiredHealthy) {
            this.desiredHealthy = Objects.requireNonNull(desiredHealthy);
            return this;
        }

        public Builder setDisruptedPods(@Nullable Map<String,String> disruptedPods) {
            this.disruptedPods = disruptedPods;
            return this;
        }

        public Builder setDisruptionsAllowed(Integer disruptionsAllowed) {
            this.disruptionsAllowed = Objects.requireNonNull(disruptionsAllowed);
            return this;
        }

        public Builder setExpectedPods(Integer expectedPods) {
            this.expectedPods = Objects.requireNonNull(expectedPods);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public PodDisruptionBudgetStatus build() {
            return new PodDisruptionBudgetStatus(conditions, currentHealthy, desiredHealthy, disruptedPods, disruptionsAllowed, expectedPods, observedGeneration);
        }
    }
}
