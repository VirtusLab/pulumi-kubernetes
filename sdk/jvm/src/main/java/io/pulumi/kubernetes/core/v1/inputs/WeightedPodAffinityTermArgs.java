// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class WeightedPodAffinityTermArgs extends io.pulumi.resources.ResourceArgs {

    public static final WeightedPodAffinityTermArgs Empty = new WeightedPodAffinityTermArgs();

    @InputImport(name="podAffinityTerm", required=true)
    private final Input<io.pulumi.kubernetes.core.v1.inputs.PodAffinityTermArgs> podAffinityTerm;

    public Input<io.pulumi.kubernetes.core.v1.inputs.PodAffinityTermArgs> getPodAffinityTerm() {
        return this.podAffinityTerm;
    }

    @InputImport(name="weight", required=true)
    private final Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight;
    }

    public WeightedPodAffinityTermArgs(
        Input<io.pulumi.kubernetes.core.v1.inputs.PodAffinityTermArgs> podAffinityTerm,
        Input<Integer> weight) {
        this.podAffinityTerm = Objects.requireNonNull(podAffinityTerm, "expected parameter 'podAffinityTerm' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private WeightedPodAffinityTermArgs() {
        this.podAffinityTerm = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeightedPodAffinityTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<io.pulumi.kubernetes.core.v1.inputs.PodAffinityTermArgs> podAffinityTerm;
        private Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(WeightedPodAffinityTermArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podAffinityTerm = defaults.podAffinityTerm;
    	      this.weight = defaults.weight;
        }

        public Builder setPodAffinityTerm(Input<io.pulumi.kubernetes.core.v1.inputs.PodAffinityTermArgs> podAffinityTerm) {
            this.podAffinityTerm = Objects.requireNonNull(podAffinityTerm);
            return this;
        }

        public Builder setPodAffinityTerm(io.pulumi.kubernetes.core.v1.inputs.PodAffinityTermArgs podAffinityTerm) {
            this.podAffinityTerm = Input.of(Objects.requireNonNull(podAffinityTerm));
            return this;
        }

        public Builder setWeight(Input<Integer> weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Input.of(Objects.requireNonNull(weight));
            return this;
        }

        public WeightedPodAffinityTermArgs build() {
            return new WeightedPodAffinityTermArgs(podAffinityTerm, weight);
        }
    }
}
