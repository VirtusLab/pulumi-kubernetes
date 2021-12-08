// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling.v2beta1.outputs;

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
public final class MetricSpec {
    private final @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ContainerResourceMetricSource containerResource;
    private final @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ExternalMetricSource external;
    private final @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ObjectMetricSource object;
    private final @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.PodsMetricSource pods;
    private final @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ResourceMetricSource resource;
    private final String type;

    @OutputCustomType.Constructor({"containerResource","external","object","pods","resource","type"})
    private MetricSpec(
        @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ContainerResourceMetricSource containerResource,
        @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ExternalMetricSource external,
        @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ObjectMetricSource object,
        @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.PodsMetricSource pods,
        @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ResourceMetricSource resource,
        String type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ContainerResourceMetricSource> getContainerResource() {
        return Optional.ofNullable(this.containerResource);
    }
    public Optional<io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ExternalMetricSource> getExternal() {
        return Optional.ofNullable(this.external);
    }
    public Optional<io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ObjectMetricSource> getObject() {
        return Optional.ofNullable(this.object);
    }
    public Optional<io.pulumi.kubernetes.autoscaling.v2beta1.outputs.PodsMetricSource> getPods() {
        return Optional.ofNullable(this.pods);
    }
    public Optional<io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ResourceMetricSource> getResource() {
        return Optional.ofNullable(this.resource);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ContainerResourceMetricSource containerResource;
        private @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ExternalMetricSource external;
        private @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ObjectMetricSource object;
        private @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.PodsMetricSource pods;
        private @Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ResourceMetricSource resource;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder setContainerResource(@Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ContainerResourceMetricSource containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        public Builder setExternal(@Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ExternalMetricSource external) {
            this.external = external;
            return this;
        }

        public Builder setObject(@Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ObjectMetricSource object) {
            this.object = object;
            return this;
        }

        public Builder setPods(@Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.PodsMetricSource pods) {
            this.pods = pods;
            return this;
        }

        public Builder setResource(@Nullable io.pulumi.kubernetes.autoscaling.v2beta1.outputs.ResourceMetricSource resource) {
            this.resource = resource;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public MetricSpec build() {
            return new MetricSpec(containerResource, external, object, pods, resource, type);
        }
    }
}
