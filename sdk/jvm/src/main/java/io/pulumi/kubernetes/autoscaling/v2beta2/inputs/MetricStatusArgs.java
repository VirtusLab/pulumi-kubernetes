// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling.v2beta2.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class MetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStatusArgs Empty = new MetricStatusArgs();

    @InputImport(name="containerResource")
    private final @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ContainerResourceMetricStatusArgs> containerResource;

    public Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ContainerResourceMetricStatusArgs> getContainerResource() {
        return this.containerResource == null ? Input.empty() : this.containerResource;
    }

    @InputImport(name="external")
    private final @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ExternalMetricStatusArgs> external;

    public Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ExternalMetricStatusArgs> getExternal() {
        return this.external == null ? Input.empty() : this.external;
    }

    @InputImport(name="object")
    private final @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ObjectMetricStatusArgs> object;

    public Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ObjectMetricStatusArgs> getObject() {
        return this.object == null ? Input.empty() : this.object;
    }

    @InputImport(name="pods")
    private final @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.PodsMetricStatusArgs> pods;

    public Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.PodsMetricStatusArgs> getPods() {
        return this.pods == null ? Input.empty() : this.pods;
    }

    @InputImport(name="resource")
    private final @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ResourceMetricStatusArgs> resource;

    public Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ResourceMetricStatusArgs> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public MetricStatusArgs(
        @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ContainerResourceMetricStatusArgs> containerResource,
        @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ExternalMetricStatusArgs> external,
        @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ObjectMetricStatusArgs> object,
        @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.PodsMetricStatusArgs> pods,
        @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ResourceMetricStatusArgs> resource,
        Input<String> type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MetricStatusArgs() {
        this.containerResource = Input.empty();
        this.external = Input.empty();
        this.object = Input.empty();
        this.pods = Input.empty();
        this.resource = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ContainerResourceMetricStatusArgs> containerResource;
        private @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ExternalMetricStatusArgs> external;
        private @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ObjectMetricStatusArgs> object;
        private @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.PodsMetricStatusArgs> pods;
        private @Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ResourceMetricStatusArgs> resource;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder setContainerResource(@Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ContainerResourceMetricStatusArgs> containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        public Builder setContainerResource(@Nullable io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ContainerResourceMetricStatusArgs containerResource) {
            this.containerResource = Input.ofNullable(containerResource);
            return this;
        }

        public Builder setExternal(@Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ExternalMetricStatusArgs> external) {
            this.external = external;
            return this;
        }

        public Builder setExternal(@Nullable io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ExternalMetricStatusArgs external) {
            this.external = Input.ofNullable(external);
            return this;
        }

        public Builder setObject(@Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ObjectMetricStatusArgs> object) {
            this.object = object;
            return this;
        }

        public Builder setObject(@Nullable io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ObjectMetricStatusArgs object) {
            this.object = Input.ofNullable(object);
            return this;
        }

        public Builder setPods(@Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.PodsMetricStatusArgs> pods) {
            this.pods = pods;
            return this;
        }

        public Builder setPods(@Nullable io.pulumi.kubernetes.autoscaling.v2beta2.inputs.PodsMetricStatusArgs pods) {
            this.pods = Input.ofNullable(pods);
            return this;
        }

        public Builder setResource(@Nullable Input<io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ResourceMetricStatusArgs> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable io.pulumi.kubernetes.autoscaling.v2beta2.inputs.ResourceMetricStatusArgs resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public MetricStatusArgs build() {
            return new MetricStatusArgs(containerResource, external, object, pods, resource, type);
        }
    }
}
