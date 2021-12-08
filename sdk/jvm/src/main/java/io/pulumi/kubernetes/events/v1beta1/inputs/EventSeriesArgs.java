// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class EventSeriesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSeriesArgs Empty = new EventSeriesArgs();

    @InputImport(name="count", required=true)
    private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    @InputImport(name="lastObservedTime", required=true)
    private final Input<String> lastObservedTime;

    public Input<String> getLastObservedTime() {
        return this.lastObservedTime;
    }

    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public EventSeriesArgs(
        Input<Integer> count,
        Input<String> lastObservedTime,
        @Nullable Input<String> state) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.lastObservedTime = Objects.requireNonNull(lastObservedTime, "expected parameter 'lastObservedTime' to be non-null");
        this.state = state;
    }

    private EventSeriesArgs() {
        this.count = Input.empty();
        this.lastObservedTime = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private Input<String> lastObservedTime;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSeriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
    	      this.state = defaults.state;
        }

        public Builder setCount(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder setLastObservedTime(Input<String> lastObservedTime) {
            this.lastObservedTime = Objects.requireNonNull(lastObservedTime);
            return this;
        }

        public Builder setLastObservedTime(String lastObservedTime) {
            this.lastObservedTime = Input.of(Objects.requireNonNull(lastObservedTime));
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public EventSeriesArgs build() {
            return new EventSeriesArgs(count, lastObservedTime, state);
        }
    }
}
