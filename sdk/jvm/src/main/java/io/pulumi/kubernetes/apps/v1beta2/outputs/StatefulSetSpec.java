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
public final class StatefulSetSpec {
    private final @Nullable String podManagementPolicy;
    private final @Nullable Integer replicas;
    private final @Nullable Integer revisionHistoryLimit;
    private final io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector;
    private final String serviceName;
    private final io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template;
    private final @Nullable io.pulumi.kubernetes.apps.v1beta2.outputs.StatefulSetUpdateStrategy updateStrategy;
    private final @Nullable List<io.pulumi.kubernetes.core.v1.outputs.PersistentVolumeClaim> volumeClaimTemplates;

    @OutputCustomType.Constructor({"podManagementPolicy","replicas","revisionHistoryLimit","selector","serviceName","template","updateStrategy","volumeClaimTemplates"})
    private StatefulSetSpec(
        @Nullable String podManagementPolicy,
        @Nullable Integer replicas,
        @Nullable Integer revisionHistoryLimit,
        io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector,
        String serviceName,
        io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template,
        @Nullable io.pulumi.kubernetes.apps.v1beta2.outputs.StatefulSetUpdateStrategy updateStrategy,
        @Nullable List<io.pulumi.kubernetes.core.v1.outputs.PersistentVolumeClaim> volumeClaimTemplates) {
        this.podManagementPolicy = podManagementPolicy;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector);
        this.serviceName = Objects.requireNonNull(serviceName);
        this.template = Objects.requireNonNull(template);
        this.updateStrategy = updateStrategy;
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    public Optional<String> getPodManagementPolicy() {
        return Optional.ofNullable(this.podManagementPolicy);
    }
    public Optional<Integer> getReplicas() {
        return Optional.ofNullable(this.replicas);
    }
    public Optional<Integer> getRevisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    public io.pulumi.kubernetes.meta.v1.outputs.LabelSelector getSelector() {
        return this.selector;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec getTemplate() {
        return this.template;
    }
    public Optional<io.pulumi.kubernetes.apps.v1beta2.outputs.StatefulSetUpdateStrategy> getUpdateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }
    public List<io.pulumi.kubernetes.core.v1.outputs.PersistentVolumeClaim> getVolumeClaimTemplates() {
        return this.volumeClaimTemplates == null ? List.of() : this.volumeClaimTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String podManagementPolicy;
        private @Nullable Integer replicas;
        private @Nullable Integer revisionHistoryLimit;
        private io.pulumi.kubernetes.meta.v1.outputs.LabelSelector selector;
        private String serviceName;
        private io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template;
        private @Nullable io.pulumi.kubernetes.apps.v1beta2.outputs.StatefulSetUpdateStrategy updateStrategy;
        private @Nullable List<io.pulumi.kubernetes.core.v1.outputs.PersistentVolumeClaim> volumeClaimTemplates;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetSpec defaults) {
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

        public Builder setPodManagementPolicy(@Nullable String podManagementPolicy) {
            this.podManagementPolicy = podManagementPolicy;
            return this;
        }

        public Builder setReplicas(@Nullable Integer replicas) {
            this.replicas = replicas;
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

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setTemplate(io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setUpdateStrategy(@Nullable io.pulumi.kubernetes.apps.v1beta2.outputs.StatefulSetUpdateStrategy updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        public Builder setVolumeClaimTemplates(@Nullable List<io.pulumi.kubernetes.core.v1.outputs.PersistentVolumeClaim> volumeClaimTemplates) {
            this.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }

        public StatefulSetSpec build() {
            return new StatefulSetSpec(podManagementPolicy, replicas, revisionHistoryLimit, selector, serviceName, template, updateStrategy, volumeClaimTemplates);
        }
    }
}
