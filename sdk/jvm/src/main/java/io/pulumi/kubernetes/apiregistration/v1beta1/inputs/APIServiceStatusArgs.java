// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class APIServiceStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final APIServiceStatusArgs Empty = new APIServiceStatusArgs();

    @InputImport(name="conditions")
    private final @Nullable Input<List<io.pulumi.kubernetes.apiregistration.v1beta1.inputs.APIServiceConditionArgs>> conditions;

    public Input<List<io.pulumi.kubernetes.apiregistration.v1beta1.inputs.APIServiceConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    public APIServiceStatusArgs(@Nullable Input<List<io.pulumi.kubernetes.apiregistration.v1beta1.inputs.APIServiceConditionArgs>> conditions) {
        this.conditions = conditions;
    }

    private APIServiceStatusArgs() {
        this.conditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<io.pulumi.kubernetes.apiregistration.v1beta1.inputs.APIServiceConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServiceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder setConditions(@Nullable Input<List<io.pulumi.kubernetes.apiregistration.v1beta1.inputs.APIServiceConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<io.pulumi.kubernetes.apiregistration.v1beta1.inputs.APIServiceConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public APIServiceStatusArgs build() {
            return new APIServiceStatusArgs(conditions);
        }
    }
}
