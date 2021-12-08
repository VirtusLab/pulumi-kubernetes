// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.outputs;

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
public final class ReplicationControllerStatus {
    private final @Nullable Integer availableReplicas;
    private final @Nullable List<io.pulumi.kubernetes.core.v1.outputs.ReplicationControllerCondition> conditions;
    private final @Nullable Integer fullyLabeledReplicas;
    private final @Nullable Integer observedGeneration;
    private final @Nullable Integer readyReplicas;
    private final Integer replicas;

    @OutputCustomType.Constructor({"availableReplicas","conditions","fullyLabeledReplicas","observedGeneration","readyReplicas","replicas"})
    private ReplicationControllerStatus(
        @Nullable Integer availableReplicas,
        @Nullable List<io.pulumi.kubernetes.core.v1.outputs.ReplicationControllerCondition> conditions,
        @Nullable Integer fullyLabeledReplicas,
        @Nullable Integer observedGeneration,
        @Nullable Integer readyReplicas,
        Integer replicas) {
        this.availableReplicas = availableReplicas;
        this.conditions = conditions;
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = Objects.requireNonNull(replicas);
    }

    public Optional<Integer> getAvailableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }
    public List<io.pulumi.kubernetes.core.v1.outputs.ReplicationControllerCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    public Optional<Integer> getFullyLabeledReplicas() {
        return Optional.ofNullable(this.fullyLabeledReplicas);
    }
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    public Optional<Integer> getReadyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationControllerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availableReplicas;
        private @Nullable List<io.pulumi.kubernetes.core.v1.outputs.ReplicationControllerCondition> conditions;
        private @Nullable Integer fullyLabeledReplicas;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private Integer replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationControllerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.conditions = defaults.conditions;
    	      this.fullyLabeledReplicas = defaults.fullyLabeledReplicas;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
        }

        public Builder setAvailableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }

        public Builder setConditions(@Nullable List<io.pulumi.kubernetes.core.v1.outputs.ReplicationControllerCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setFullyLabeledReplicas(@Nullable Integer fullyLabeledReplicas) {
            this.fullyLabeledReplicas = fullyLabeledReplicas;
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

        public Builder setReplicas(Integer replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }

        public ReplicationControllerStatus build() {
            return new ReplicationControllerStatus(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
        }
    }
}
