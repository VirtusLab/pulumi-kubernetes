// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.v1beta1.outputs;

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
public final class EventSeries {
    private final Integer count;
    private final String lastObservedTime;
    private final @Nullable String state;

    @OutputCustomType.Constructor({"count","lastObservedTime","state"})
    private EventSeries(
        Integer count,
        String lastObservedTime,
        @Nullable String state) {
        this.count = Objects.requireNonNull(count);
        this.lastObservedTime = Objects.requireNonNull(lastObservedTime);
        this.state = state;
    }

    public Integer getCount() {
        return this.count;
    }
    public String getLastObservedTime() {
        return this.lastObservedTime;
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeries defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String lastObservedTime;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSeries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
    	      this.state = defaults.state;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setLastObservedTime(String lastObservedTime) {
            this.lastObservedTime = Objects.requireNonNull(lastObservedTime);
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public EventSeries build() {
            return new EventSeries(count, lastObservedTime, state);
        }
    }
}
