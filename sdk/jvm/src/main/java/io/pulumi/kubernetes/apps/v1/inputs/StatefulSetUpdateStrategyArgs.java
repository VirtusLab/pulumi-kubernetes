// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class StatefulSetUpdateStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulSetUpdateStrategyArgs Empty = new StatefulSetUpdateStrategyArgs();

    @InputImport(name="rollingUpdate")
    private final @Nullable Input<io.pulumi.kubernetes.apps.v1.inputs.RollingUpdateStatefulSetStrategyArgs> rollingUpdate;

    public Input<io.pulumi.kubernetes.apps.v1.inputs.RollingUpdateStatefulSetStrategyArgs> getRollingUpdate() {
        return this.rollingUpdate == null ? Input.empty() : this.rollingUpdate;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public StatefulSetUpdateStrategyArgs(
        @Nullable Input<io.pulumi.kubernetes.apps.v1.inputs.RollingUpdateStatefulSetStrategyArgs> rollingUpdate,
        @Nullable Input<String> type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    private StatefulSetUpdateStrategyArgs() {
        this.rollingUpdate = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetUpdateStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.apps.v1.inputs.RollingUpdateStatefulSetStrategyArgs> rollingUpdate;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetUpdateStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder setRollingUpdate(@Nullable Input<io.pulumi.kubernetes.apps.v1.inputs.RollingUpdateStatefulSetStrategyArgs> rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        public Builder setRollingUpdate(@Nullable io.pulumi.kubernetes.apps.v1.inputs.RollingUpdateStatefulSetStrategyArgs rollingUpdate) {
            this.rollingUpdate = Input.ofNullable(rollingUpdate);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public StatefulSetUpdateStrategyArgs build() {
            return new StatefulSetUpdateStrategyArgs(rollingUpdate, type);
        }
    }
}
