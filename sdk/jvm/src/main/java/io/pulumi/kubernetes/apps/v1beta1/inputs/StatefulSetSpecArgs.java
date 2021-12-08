// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class StatefulSetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulSetSpecArgs Empty = new StatefulSetSpecArgs();

    @InputImport(name="podManagementPolicy")
    private final @Nullable Input<String> podManagementPolicy;

    public Input<String> getPodManagementPolicy() {
        return this.podManagementPolicy == null ? Input.empty() : this.podManagementPolicy;
    }

    @InputImport(name="replicas")
    private final @Nullable Input<Integer> replicas;

    public Input<Integer> getReplicas() {
        return this.replicas == null ? Input.empty() : this.replicas;
    }

    @InputImport(name="revisionHistoryLimit")
    private final @Nullable Input<Integer> revisionHistoryLimit;

    public Input<Integer> getRevisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Input.empty() : this.revisionHistoryLimit;
    }

    @InputImport(name="selector")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="template", required=true)
    private final Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> template;

    public Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    @InputImport(name="updateStrategy")
    private final @Nullable Input<io.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetUpdateStrategyArgs> updateStrategy;

    public Input<io.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetUpdateStrategyArgs> getUpdateStrategy() {
        return this.updateStrategy == null ? Input.empty() : this.updateStrategy;
    }

    @InputImport(name="volumeClaimTemplates")
    private final @Nullable Input<List<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimArgs>> volumeClaimTemplates;

    public Input<List<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimArgs>> getVolumeClaimTemplates() {
        return this.volumeClaimTemplates == null ? Input.empty() : this.volumeClaimTemplates;
    }

    public StatefulSetSpecArgs(
        @Nullable Input<String> podManagementPolicy,
        @Nullable Input<Integer> replicas,
        @Nullable Input<Integer> revisionHistoryLimit,
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector,
        Input<String> serviceName,
        Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> template,
        @Nullable Input<io.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetUpdateStrategyArgs> updateStrategy,
        @Nullable Input<List<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimArgs>> volumeClaimTemplates) {
        this.podManagementPolicy = podManagementPolicy;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.updateStrategy = updateStrategy;
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    private StatefulSetSpecArgs() {
        this.podManagementPolicy = Input.empty();
        this.replicas = Input.empty();
        this.revisionHistoryLimit = Input.empty();
        this.selector = Input.empty();
        this.serviceName = Input.empty();
        this.template = Input.empty();
        this.updateStrategy = Input.empty();
        this.volumeClaimTemplates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> podManagementPolicy;
        private @Nullable Input<Integer> replicas;
        private @Nullable Input<Integer> revisionHistoryLimit;
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector;
        private Input<String> serviceName;
        private Input<io.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecArgs> template;
        private @Nullable Input<io.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetUpdateStrategyArgs> updateStrategy;
        private @Nullable Input<List<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimArgs>> volumeClaimTemplates;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podManagementPolicy = defaults.podManagementPolicy;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.serviceName = defaults.serviceName;
    	      this.template = defaults.template;
    	      this.updateStrategy = defaults.updateStrategy;
    	      this.volumeClaimTemplates = defaults.volumeClaimTemplates;
        }

        public Builder setPodManagementPolicy(@Nullable Input<String> podManagementPolicy) {
            this.podManagementPolicy = podManagementPolicy;
            return this;
        }

        public Builder setPodManagementPolicy(@Nullable String podManagementPolicy) {
            this.podManagementPolicy = Input.ofNullable(podManagementPolicy);
            return this;
        }

        public Builder setReplicas(@Nullable Input<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setReplicas(@Nullable Integer replicas) {
            this.replicas = Input.ofNullable(replicas);
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

        public Builder setSelector(@Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
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

        public Builder setUpdateStrategy(@Nullable Input<io.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetUpdateStrategyArgs> updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        public Builder setUpdateStrategy(@Nullable io.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetUpdateStrategyArgs updateStrategy) {
            this.updateStrategy = Input.ofNullable(updateStrategy);
            return this;
        }

        public Builder setVolumeClaimTemplates(@Nullable Input<List<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimArgs>> volumeClaimTemplates) {
            this.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }

        public Builder setVolumeClaimTemplates(@Nullable List<io.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimArgs> volumeClaimTemplates) {
            this.volumeClaimTemplates = Input.ofNullable(volumeClaimTemplates);
            return this;
        }

        public StatefulSetSpecArgs build() {
            return new StatefulSetSpecArgs(podManagementPolicy, replicas, revisionHistoryLimit, selector, serviceName, template, updateStrategy, volumeClaimTemplates);
        }
    }
}
