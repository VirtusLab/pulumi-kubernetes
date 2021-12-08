// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta.v1.outputs;

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
public final class Condition {
    private final String lastTransitionTime;
    private final String message;
    private final @Nullable Integer observedGeneration;
    private final String reason;
    private final String status;
    private final String type;

    @OutputCustomType.Constructor({"lastTransitionTime","message","observedGeneration","reason","status","type"})
    private Condition(
        String lastTransitionTime,
        String message,
        @Nullable Integer observedGeneration,
        String reason,
        String status,
        String type) {
        this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
        this.message = Objects.requireNonNull(message);
        this.observedGeneration = observedGeneration;
        this.reason = Objects.requireNonNull(reason);
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }
    public String getMessage() {
        return this.message;
    }
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    public String getReason() {
        return this.reason;
    }
    public String getStatus() {
        return this.status;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Condition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastTransitionTime;
        private String message;
        private @Nullable Integer observedGeneration;
        private String reason;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(Condition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Condition build() {
            return new Condition(lastTransitionTime, message, observedGeneration, reason, status, type);
        }
    }
}
