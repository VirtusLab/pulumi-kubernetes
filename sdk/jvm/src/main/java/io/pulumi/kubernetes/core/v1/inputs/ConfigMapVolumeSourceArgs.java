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


public final class ConfigMapVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigMapVolumeSourceArgs Empty = new ConfigMapVolumeSourceArgs();

    @InputImport(name="defaultMode")
    private final @Nullable Input<Integer> defaultMode;

    public Input<Integer> getDefaultMode() {
        return this.defaultMode == null ? Input.empty() : this.defaultMode;
    }

    @InputImport(name="items")
    private final @Nullable Input<List<io.pulumi.kubernetes.core.v1.inputs.KeyToPathArgs>> items;

    public Input<List<io.pulumi.kubernetes.core.v1.inputs.KeyToPathArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="optional")
    private final @Nullable Input<Boolean> optional;

    public Input<Boolean> getOptional() {
        return this.optional == null ? Input.empty() : this.optional;
    }

    public ConfigMapVolumeSourceArgs(
        @Nullable Input<Integer> defaultMode,
        @Nullable Input<List<io.pulumi.kubernetes.core.v1.inputs.KeyToPathArgs>> items,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> optional) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    private ConfigMapVolumeSourceArgs() {
        this.defaultMode = Input.empty();
        this.items = Input.empty();
        this.name = Input.empty();
        this.optional = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> defaultMode;
        private @Nullable Input<List<io.pulumi.kubernetes.core.v1.inputs.KeyToPathArgs>> items;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setDefaultMode(@Nullable Input<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder setDefaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Input.ofNullable(defaultMode);
            return this;
        }

        public Builder setItems(@Nullable Input<List<io.pulumi.kubernetes.core.v1.inputs.KeyToPathArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<io.pulumi.kubernetes.core.v1.inputs.KeyToPathArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOptional(@Nullable Input<Boolean> optional) {
            this.optional = optional;
            return this;
        }

        public Builder setOptional(@Nullable Boolean optional) {
            this.optional = Input.ofNullable(optional);
            return this;
        }

        public ConfigMapVolumeSourceArgs build() {
            return new ConfigMapVolumeSourceArgs(defaultMode, items, name, optional);
        }
    }
}
