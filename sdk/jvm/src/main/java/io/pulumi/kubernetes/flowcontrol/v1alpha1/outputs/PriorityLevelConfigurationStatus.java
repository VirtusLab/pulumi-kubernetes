// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.v1alpha1.outputs;

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
public final class PriorityLevelConfigurationStatus {
    private final @Nullable List<io.pulumi.kubernetes.flowcontrol.v1alpha1.outputs.PriorityLevelConfigurationCondition> conditions;

    @OutputCustomType.Constructor({"conditions"})
    private PriorityLevelConfigurationStatus(@Nullable List<io.pulumi.kubernetes.flowcontrol.v1alpha1.outputs.PriorityLevelConfigurationCondition> conditions) {
        this.conditions = conditions;
    }

    public List<io.pulumi.kubernetes.flowcontrol.v1alpha1.outputs.PriorityLevelConfigurationCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<io.pulumi.kubernetes.flowcontrol.v1alpha1.outputs.PriorityLevelConfigurationCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder setConditions(@Nullable List<io.pulumi.kubernetes.flowcontrol.v1alpha1.outputs.PriorityLevelConfigurationCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public PriorityLevelConfigurationStatus build() {
            return new PriorityLevelConfigurationStatus(conditions);
        }
    }
}
