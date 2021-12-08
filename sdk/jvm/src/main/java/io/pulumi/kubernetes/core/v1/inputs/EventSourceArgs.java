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


public final class EventSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceArgs Empty = new EventSourceArgs();

    @InputImport(name="component")
    private final @Nullable Input<String> component;

    public Input<String> getComponent() {
        return this.component == null ? Input.empty() : this.component;
    }

    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    public EventSourceArgs(
        @Nullable Input<String> component,
        @Nullable Input<String> host) {
        this.component = component;
        this.host = host;
    }

    private EventSourceArgs() {
        this.component = Input.empty();
        this.host = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> component;
        private @Nullable Input<String> host;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.component = defaults.component;
    	      this.host = defaults.host;
        }

        public Builder setComponent(@Nullable Input<String> component) {
            this.component = component;
            return this;
        }

        public Builder setComponent(@Nullable String component) {
            this.component = Input.ofNullable(component);
            return this;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public EventSourceArgs build() {
            return new EventSourceArgs(component, host);
        }
    }
}
