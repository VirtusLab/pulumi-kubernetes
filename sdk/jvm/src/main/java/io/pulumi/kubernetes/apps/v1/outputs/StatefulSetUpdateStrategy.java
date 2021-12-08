// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1.outputs;

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
public final class StatefulSetUpdateStrategy {
    private final @Nullable io.pulumi.kubernetes.apps.v1.outputs.RollingUpdateStatefulSetStrategy rollingUpdate;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"rollingUpdate","type"})
    private StatefulSetUpdateStrategy(
        @Nullable io.pulumi.kubernetes.apps.v1.outputs.RollingUpdateStatefulSetStrategy rollingUpdate,
        @Nullable String type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    public Optional<io.pulumi.kubernetes.apps.v1.outputs.RollingUpdateStatefulSetStrategy> getRollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetUpdateStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable io.pulumi.kubernetes.apps.v1.outputs.RollingUpdateStatefulSetStrategy rollingUpdate;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetUpdateStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder setRollingUpdate(@Nullable io.pulumi.kubernetes.apps.v1.outputs.RollingUpdateStatefulSetStrategy rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public StatefulSetUpdateStrategy build() {
            return new StatefulSetUpdateStrategy(rollingUpdate, type);
        }
    }
}
