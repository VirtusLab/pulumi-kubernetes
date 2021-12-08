// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class LimitResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final LimitResponseArgs Empty = new LimitResponseArgs();

    @InputImport(name="queuing")
    private final @Nullable Input<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.QueuingConfigurationArgs> queuing;

    public Input<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.QueuingConfigurationArgs> getQueuing() {
        return this.queuing == null ? Input.empty() : this.queuing;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public LimitResponseArgs(
        @Nullable Input<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.QueuingConfigurationArgs> queuing,
        Input<String> type) {
        this.queuing = queuing;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LimitResponseArgs() {
        this.queuing = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.QueuingConfigurationArgs> queuing;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queuing = defaults.queuing;
    	      this.type = defaults.type;
        }

        public Builder setQueuing(@Nullable Input<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.QueuingConfigurationArgs> queuing) {
            this.queuing = queuing;
            return this;
        }

        public Builder setQueuing(@Nullable io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.QueuingConfigurationArgs queuing) {
            this.queuing = Input.ofNullable(queuing);
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

        public LimitResponseArgs build() {
            return new LimitResponseArgs(queuing, type);
        }
    }
}
