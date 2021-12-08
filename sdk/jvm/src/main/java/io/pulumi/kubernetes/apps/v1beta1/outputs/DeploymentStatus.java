// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1beta1.outputs;

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
public final class DeploymentStatus {
    private final @Nullable Integer availableReplicas;
    private final @Nullable Integer collisionCount;
    private final @Nullable List<io.pulumi.kubernetes.apps.v1beta1.outputs.DeploymentCondition> conditions;
    private final @Nullable Integer observedGeneration;
    private final @Nullable Integer readyReplicas;
    private final @Nullable Integer replicas;
    private final @Nullable Integer unavailableReplicas;
    private final @Nullable Integer updatedReplicas;

    @OutputCustomType.Constructor({"availableReplicas","collisionCount","conditions","observedGeneration","readyReplicas","replicas","unavailableReplicas","updatedReplicas"})
    private DeploymentStatus(
        @Nullable Integer availableReplicas,
        @Nullable Integer collisionCount,
        @Nullable List<io.pulumi.kubernetes.apps.v1beta1.outputs.DeploymentCondition> conditions,
        @Nullable Integer observedGeneration,
        @Nullable Integer readyReplicas,
        @Nullable Integer replicas,
        @Nullable Integer unavailableReplicas,
        @Nullable Integer updatedReplicas) {
        this.availableReplicas = availableReplicas;
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = replicas;
        this.unavailableReplicas = unavailableReplicas;
        this.updatedReplicas = updatedReplicas;
    }

    public Optional<Integer> getAvailableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }
    public Optional<Integer> getCollisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }
    public List<io.pulumi.kubernetes.apps.v1beta1.outputs.DeploymentCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    public Optional<Integer> getReadyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    public Optional<Integer> getReplicas() {
        return Optional.ofNullable(this.replicas);
    }
    public Optional<Integer> getUnavailableReplicas() {
        return Optional.ofNullable(this.unavailableReplicas);
    }
    public Optional<Integer> getUpdatedReplicas() {
        return Optional.ofNullable(this.updatedReplicas);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availableReplicas;
        private @Nullable Integer collisionCount;
        private @Nullable List<io.pulumi.kubernetes.apps.v1beta1.outputs.DeploymentCondition> conditions;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private @Nullable Integer replicas;
        private @Nullable Integer unavailableReplicas;
        private @Nullable Integer updatedReplicas;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
    	      this.unavailableReplicas = defaults.unavailableReplicas;
    	      this.updatedReplicas = defaults.updatedReplicas;
        }

        public Builder setAvailableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }

        public Builder setCollisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }

        public Builder setConditions(@Nullable List<io.pulumi.kubernetes.apps.v1beta1.outputs.DeploymentCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setReadyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }

        public Builder setReplicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setUnavailableReplicas(@Nullable Integer unavailableReplicas) {
            this.unavailableReplicas = unavailableReplicas;
            return this;
        }

        public Builder setUpdatedReplicas(@Nullable Integer updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }

        public DeploymentStatus build() {
            return new DeploymentStatus(availableReplicas, collisionCount, conditions, observedGeneration, readyReplicas, replicas, unavailableReplicas, updatedReplicas);
        }
    }
}
