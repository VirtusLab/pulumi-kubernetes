// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1beta2.outputs;

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
public final class ReplicaSetSpec {
    private final @Nullable Integer minReadySeconds;
    private final @Nullable Integer replicas;
    private final io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector;
    private final @Nullable io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template;

    @OutputCustomType.Constructor({"minReadySeconds","replicas","selector","template"})
    private ReplicaSetSpec(
        @Nullable Integer minReadySeconds,
        @Nullable Integer replicas,
        io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector,
        @Nullable io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template) {
        this.minReadySeconds = minReadySeconds;
        this.replicas = replicas;
        this.selector = Objects.requireNonNull(selector);
        this.template = template;
    }

    public Optional<Integer> getMinReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    public Optional<Integer> getReplicas() {
        return Optional.ofNullable(this.replicas);
    }
    public io.pulumi.kubernetes.meta.v1.outputs.LabelSelector getSelector() {
        return this.selector;
    }
    public Optional<io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec> getTemplate() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Integer replicas;
        private io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector;
        private @Nullable io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.replicas = defaults.replicas;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
        }

        public Builder setMinReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder setReplicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setSelector(io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setTemplate(@Nullable io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template) {
            this.template = template;
            return this;
        }

        public ReplicaSetSpec build() {
            return new ReplicaSetSpec(minReadySeconds, replicas, selector, template);
        }
    }
}
