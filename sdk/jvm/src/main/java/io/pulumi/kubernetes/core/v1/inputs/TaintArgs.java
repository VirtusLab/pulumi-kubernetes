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


public final class TaintArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaintArgs Empty = new TaintArgs();

    @InputImport(name="effect", required=true)
    private final Input<String> effect;

    public Input<String> getEffect() {
        return this.effect;
    }

    @InputImport(name="key", required=true)
    private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="timeAdded")
    private final @Nullable Input<String> timeAdded;

    public Input<String> getTimeAdded() {
        return this.timeAdded == null ? Input.empty() : this.timeAdded;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public TaintArgs(
        Input<String> effect,
        Input<String> key,
        @Nullable Input<String> timeAdded,
        @Nullable Input<String> value) {
        this.effect = Objects.requireNonNull(effect, "expected parameter 'effect' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.timeAdded = timeAdded;
        this.value = value;
    }

    private TaintArgs() {
        this.effect = Input.empty();
        this.key = Input.empty();
        this.timeAdded = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> effect;
        private Input<String> key;
        private @Nullable Input<String> timeAdded;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.timeAdded = defaults.timeAdded;
    	      this.value = defaults.value;
        }

        public Builder setEffect(Input<String> effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }

        public Builder setEffect(String effect) {
            this.effect = Input.of(Objects.requireNonNull(effect));
            return this;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setTimeAdded(@Nullable Input<String> timeAdded) {
            this.timeAdded = timeAdded;
            return this;
        }

        public Builder setTimeAdded(@Nullable String timeAdded) {
            this.timeAdded = Input.ofNullable(timeAdded);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public TaintArgs build() {
            return new TaintArgs(effect, key, timeAdded, value);
        }
    }
}
