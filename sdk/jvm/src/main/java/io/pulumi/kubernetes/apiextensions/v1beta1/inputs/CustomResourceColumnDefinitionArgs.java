// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class CustomResourceColumnDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceColumnDefinitionArgs Empty = new CustomResourceColumnDefinitionArgs();

    @InputImport(name="JSONPath", required=true)
    private final Input<String> JSONPath;

    public Input<String> getJSONPath() {
        return this.JSONPath;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="format")
    private final @Nullable Input<String> format;

    public Input<String> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public CustomResourceColumnDefinitionArgs(
        Input<String> JSONPath,
        @Nullable Input<String> description,
        @Nullable Input<String> format,
        Input<String> name,
        @Nullable Input<Integer> priority,
        Input<String> type) {
        this.JSONPath = Objects.requireNonNull(JSONPath, "expected parameter 'JSONPath' to be non-null");
        this.description = description;
        this.format = format;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = priority;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CustomResourceColumnDefinitionArgs() {
        this.JSONPath = Input.empty();
        this.description = Input.empty();
        this.format = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceColumnDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> JSONPath;
        private @Nullable Input<String> description;
        private @Nullable Input<String> format;
        private Input<String> name;
        private @Nullable Input<Integer> priority;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceColumnDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.JSONPath = defaults.JSONPath;
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder setJSONPath(Input<String> JSONPath) {
            this.JSONPath = Objects.requireNonNull(JSONPath);
            return this;
        }

        public Builder setJSONPath(String JSONPath) {
            this.JSONPath = Input.of(Objects.requireNonNull(JSONPath));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFormat(@Nullable Input<String> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public CustomResourceColumnDefinitionArgs build() {
            return new CustomResourceColumnDefinitionArgs(JSONPath, description, format, name, priority, type);
        }
    }
}
