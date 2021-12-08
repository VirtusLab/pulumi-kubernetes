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
public final class DaemonSetSpec {
    private final @Nullable Integer minReadySeconds;
    private final @Nullable Integer revisionHistoryLimit;
    private final io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector;
    private final io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template;
    private final @Nullable io.pulumi.kubernetes.apps.v1beta2.outputs.DaemonSetUpdateStrategy updateStrategy;

    @OutputCustomType.Constructor({"minReadySeconds","revisionHistoryLimit","selector","template","updateStrategy"})
    private DaemonSetSpec(
        @Nullable Integer minReadySeconds,
        @Nullable Integer revisionHistoryLimit,
        io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector,
        io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template,
        @Nullable io.pulumi.kubernetes.apps.v1beta2.outputs.DaemonSetUpdateStrategy updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector);
        this.template = Objects.requireNonNull(template);
        this.updateStrategy = updateStrategy;
    }

    public Optional<Integer> getMinReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    public Optional<Integer> getRevisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    public io.pulumi.kubernetes.meta.v1.outputs.LabelSelector getSelector() {
        return this.selector;
    }
    public io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec getTemplate() {
        return this.template;
    }
    public Optional<io.pulumi.kubernetes.apps.v1beta2.outputs.DaemonSetUpdateStrategy> getUpdateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Integer revisionHistoryLimit;
        private io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector;
        private io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template;
        private @Nullable io.pulumi.kubernetes.apps.v1beta2.outputs.DaemonSetUpdateStrategy updateStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        public Builder setMinReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder setRevisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder setSelector(io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setTemplate(io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setUpdateStrategy(@Nullable io.pulumi.kubernetes.apps.v1beta2.outputs.DaemonSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        public DaemonSetSpec build() {
            return new DaemonSetSpec(minReadySeconds, revisionHistoryLimit, selector, template, updateStrategy);
        }
    }
}
