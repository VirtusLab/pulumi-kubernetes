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


public final class ContainerStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerStateArgs Empty = new ContainerStateArgs();

    @InputImport(name="running")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateRunningArgs> running;

    public Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateRunningArgs> getRunning() {
        return this.running == null ? Input.empty() : this.running;
    }

    @InputImport(name="terminated")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateTerminatedArgs> terminated;

    public Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateTerminatedArgs> getTerminated() {
        return this.terminated == null ? Input.empty() : this.terminated;
    }

    @InputImport(name="waiting")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateWaitingArgs> waiting;

    public Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateWaitingArgs> getWaiting() {
        return this.waiting == null ? Input.empty() : this.waiting;
    }

    public ContainerStateArgs(
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateRunningArgs> running,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateTerminatedArgs> terminated,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateWaitingArgs> waiting) {
        this.running = running;
        this.terminated = terminated;
        this.waiting = waiting;
    }

    private ContainerStateArgs() {
        this.running = Input.empty();
        this.terminated = Input.empty();
        this.waiting = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateRunningArgs> running;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateTerminatedArgs> terminated;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateWaitingArgs> waiting;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.running = defaults.running;
    	      this.terminated = defaults.terminated;
    	      this.waiting = defaults.waiting;
        }

        public Builder setRunning(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateRunningArgs> running) {
            this.running = running;
            return this;
        }

        public Builder setRunning(@Nullable io.pulumi.kubernetes.core.v1.inputs.ContainerStateRunningArgs running) {
            this.running = Input.ofNullable(running);
            return this;
        }

        public Builder setTerminated(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateTerminatedArgs> terminated) {
            this.terminated = terminated;
            return this;
        }

        public Builder setTerminated(@Nullable io.pulumi.kubernetes.core.v1.inputs.ContainerStateTerminatedArgs terminated) {
            this.terminated = Input.ofNullable(terminated);
            return this;
        }

        public Builder setWaiting(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ContainerStateWaitingArgs> waiting) {
            this.waiting = waiting;
            return this;
        }

        public Builder setWaiting(@Nullable io.pulumi.kubernetes.core.v1.inputs.ContainerStateWaitingArgs waiting) {
            this.waiting = Input.ofNullable(waiting);
            return this;
        }

        public ContainerStateArgs build() {
            return new ContainerStateArgs(running, terminated, waiting);
        }
    }
}
