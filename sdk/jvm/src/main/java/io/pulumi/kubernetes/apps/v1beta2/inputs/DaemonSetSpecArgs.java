// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1beta2.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class DaemonSetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonSetSpecArgs Empty = new DaemonSetSpecArgs();

    @InputImport(name="minReadySeconds")
    private final @Nullable Input<Integer> minReadySeconds;

    public Input<Integer> getMinReadySeconds() {
        return this.minReadySeconds == null ? Input.empty() : this.minReadySeconds;
    }

    @InputImport(name="revisionHistoryLimit")
    private final @Nullable Input<Integer> revisionHistoryLimit;

    public Input<Integer> getRevisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Input.empty() : this.revisionHistoryLimit;
    }

    @InputImport(name="selector", required=true)
    private final Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> getSelector() {
        return this.selector;
    }

    @InputImport(name="template", required=true)
    private final Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> template;

    public Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    @InputImport(name="updateStrategy")
    private final @Nullable Input<io.pulumi.kubernetes.apps.v1beta2.inputs.DaemonSetUpdateStrategyArgs> updateStrategy;

    public Input<io.pulumi.kubernetes.apps.v1beta2.inputs.DaemonSetUpdateStrategyArgs> getUpdateStrategy() {
        return this.updateStrategy == null ? Input.empty() : this.updateStrategy;
    }

    public DaemonSetSpecArgs(
        @Nullable Input<Integer> minReadySeconds,
        @Nullable Input<Integer> revisionHistoryLimit,
        Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector,
        Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> template,
        @Nullable Input<io.pulumi.kubernetes.apps.v1beta2.inputs.DaemonSetUpdateStrategyArgs> updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.updateStrategy = updateStrategy;
    }

    private DaemonSetSpecArgs() {
        this.minReadySeconds = Input.empty();
        this.revisionHistoryLimit = Input.empty();
        this.selector = Input.empty();
        this.template = Input.empty();
        this.updateStrategy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minReadySeconds;
        private @Nullable Input<Integer> revisionHistoryLimit;
        private Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector;
        private Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> template;
        private @Nullable Input<io.pulumi.kubernetes.apps.v1beta2.inputs.DaemonSetUpdateStrategyArgs> updateStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        public Builder setMinReadySeconds(@Nullable Input<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder setMinReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Input.ofNullable(minReadySeconds);
            return this;
        }

        public Builder setRevisionHistoryLimit(@Nullable Input<Integer> revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder setRevisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = Input.ofNullable(revisionHistoryLimit);
            return this;
        }

        public Builder setSelector(Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setSelector(io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs selector) {
            this.selector = Input.of(Objects.requireNonNull(selector));
            return this;
        }

        public Builder setTemplate(Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTemplate(io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }

        public Builder setUpdateStrategy(@Nullable Input<io.pulumi.kubernetes.apps.v1beta2.inputs.DaemonSetUpdateStrategyArgs> updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        public Builder setUpdateStrategy(@Nullable io.pulumi.kubernetes.apps.v1beta2.inputs.DaemonSetUpdateStrategyArgs updateStrategy) {
            this.updateStrategy = Input.ofNullable(updateStrategy);
            return this;
        }

        public DaemonSetSpecArgs build() {
            return new DaemonSetSpecArgs(minReadySeconds, revisionHistoryLimit, selector, template, updateStrategy);
        }
    }
}
