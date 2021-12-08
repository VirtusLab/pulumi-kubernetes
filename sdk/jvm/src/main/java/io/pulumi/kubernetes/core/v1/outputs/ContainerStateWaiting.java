// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.outputs;

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
public final class ContainerStateWaiting {
    private final @Nullable String message;
    private final @Nullable String reason;

    @OutputCustomType.Constructor({"message","reason"})
    private ContainerStateWaiting(
        @Nullable String message,
        @Nullable String reason) {
        this.message = message;
        this.reason = reason;
    }

    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateWaiting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateWaiting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public ContainerStateWaiting build() {
            return new ContainerStateWaiting(message, reason);
        }
    }
}
