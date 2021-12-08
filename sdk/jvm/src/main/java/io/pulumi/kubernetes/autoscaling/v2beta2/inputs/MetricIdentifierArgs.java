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


public final class MetricIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricIdentifierArgs Empty = new MetricIdentifierArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="selector")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    public MetricIdentifierArgs(
        Input<String> name,
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.selector = selector;
    }

    private MetricIdentifierArgs() {
        this.name = Input.empty();
        this.selector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> selector;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.selector = defaults.selector;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
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

        public MetricIdentifierArgs build() {
            return new MetricIdentifierArgs(name, selector);
        }
    }
}
