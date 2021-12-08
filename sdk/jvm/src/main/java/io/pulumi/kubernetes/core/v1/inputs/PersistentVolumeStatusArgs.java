// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class PersistentVolumeStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeStatusArgs Empty = new PersistentVolumeStatusArgs();

    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="phase")
    private final @Nullable Input<String> phase;

    public Input<String> getPhase() {
        return this.phase == null ? Input.empty() : this.phase;
    }

    @InputImport(name="reason")
    private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public PersistentVolumeStatusArgs(
        @Nullable Input<String> message,
        @Nullable Input<String> phase,
        @Nullable Input<String> reason) {
        this.message = message;
        this.phase = phase;
        this.reason = reason;
    }

    private PersistentVolumeStatusArgs() {
        this.message = Input.empty();
        this.phase = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> message;
        private @Nullable Input<String> phase;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.phase = defaults.phase;
    	      this.reason = defaults.reason;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setPhase(@Nullable Input<String> phase) {
            this.phase = phase;
            return this;
        }

        public Builder setPhase(@Nullable String phase) {
            this.phase = Input.ofNullable(phase);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public PersistentVolumeStatusArgs build() {
            return new PersistentVolumeStatusArgs(message, phase, reason);
        }
    }
}
