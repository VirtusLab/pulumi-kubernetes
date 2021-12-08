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


public final class HostPathVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostPathVolumeSourceArgs Empty = new HostPathVolumeSourceArgs();

    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public HostPathVolumeSourceArgs(
        Input<String> path,
        @Nullable Input<String> type) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.type = type;
    }

    private HostPathVolumeSourceArgs() {
        this.path = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostPathVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> path;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(HostPathVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public HostPathVolumeSourceArgs build() {
            return new HostPathVolumeSourceArgs(path, type);
        }
    }
}
