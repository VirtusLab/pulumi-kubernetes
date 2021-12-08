// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.v1alpha1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class AggregationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AggregationRuleArgs Empty = new AggregationRuleArgs();

    @InputImport(name="clusterRoleSelectors")
    private final @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs>> clusterRoleSelectors;

    public Input<List<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs>> getClusterRoleSelectors() {
        return this.clusterRoleSelectors == null ? Input.empty() : this.clusterRoleSelectors;
    }

    public AggregationRuleArgs(@Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs>> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
    }

    private AggregationRuleArgs() {
        this.clusterRoleSelectors = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AggregationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs>> clusterRoleSelectors;

        public Builder() {
    	      // Empty
        }

        public Builder(AggregationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterRoleSelectors = defaults.clusterRoleSelectors;
        }

        public Builder setClusterRoleSelectors(@Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs>> clusterRoleSelectors) {
            this.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }

        public Builder setClusterRoleSelectors(@Nullable List<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> clusterRoleSelectors) {
            this.clusterRoleSelectors = Input.ofNullable(clusterRoleSelectors);
            return this;
        }

        public AggregationRuleArgs build() {
            return new AggregationRuleArgs(clusterRoleSelectors);
        }
    }
}
