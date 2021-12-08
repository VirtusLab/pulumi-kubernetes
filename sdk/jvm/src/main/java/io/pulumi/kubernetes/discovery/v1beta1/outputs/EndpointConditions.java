// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.v1beta1.outputs;

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
public final class EndpointConditions {
    private final @Nullable Boolean ready;
    private final @Nullable Boolean serving;
    private final @Nullable Boolean terminating;

    @OutputCustomType.Constructor({"ready","serving","terminating"})
    private EndpointConditions(
        @Nullable Boolean ready,
        @Nullable Boolean serving,
        @Nullable Boolean terminating) {
        this.ready = ready;
        this.serving = serving;
        this.terminating = terminating;
    }

    public Optional<Boolean> getReady() {
        return Optional.ofNullable(this.ready);
    }
    public Optional<Boolean> getServing() {
        return Optional.ofNullable(this.serving);
    }
    public Optional<Boolean> getTerminating() {
        return Optional.ofNullable(this.terminating);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConditions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ready;
        private @Nullable Boolean serving;
        private @Nullable Boolean terminating;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ready = defaults.ready;
    	      this.serving = defaults.serving;
    	      this.terminating = defaults.terminating;
        }

        public Builder setReady(@Nullable Boolean ready) {
            this.ready = ready;
            return this;
        }

        public Builder setServing(@Nullable Boolean serving) {
            this.serving = serving;
            return this;
        }

        public Builder setTerminating(@Nullable Boolean terminating) {
            this.terminating = terminating;
            return this;
        }

        public EndpointConditions build() {
            return new EndpointConditions(ready, serving, terminating);
        }
    }
}
