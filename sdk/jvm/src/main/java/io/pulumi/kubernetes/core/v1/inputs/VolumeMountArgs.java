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


public final class VolumeMountArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeMountArgs Empty = new VolumeMountArgs();

    @InputImport(name="mountPath", required=true)
    private final Input<String> mountPath;

    public Input<String> getMountPath() {
        return this.mountPath;
    }

    @InputImport(name="mountPropagation")
    private final @Nullable Input<String> mountPropagation;

    public Input<String> getMountPropagation() {
        return this.mountPropagation == null ? Input.empty() : this.mountPropagation;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    @InputImport(name="subPath")
    private final @Nullable Input<String> subPath;

    public Input<String> getSubPath() {
        return this.subPath == null ? Input.empty() : this.subPath;
    }

    @InputImport(name="subPathExpr")
    private final @Nullable Input<String> subPathExpr;

    public Input<String> getSubPathExpr() {
        return this.subPathExpr == null ? Input.empty() : this.subPathExpr;
    }

    public VolumeMountArgs(
        Input<String> mountPath,
        @Nullable Input<String> mountPropagation,
        Input<String> name,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<String> subPath,
        @Nullable Input<String> subPathExpr) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.mountPropagation = mountPropagation;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = readOnly;
        this.subPath = subPath;
        this.subPathExpr = subPathExpr;
    }

    private VolumeMountArgs() {
        this.mountPath = Input.empty();
        this.mountPropagation = Input.empty();
        this.name = Input.empty();
        this.readOnly = Input.empty();
        this.subPath = Input.empty();
        this.subPathExpr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> mountPath;
        private @Nullable Input<String> mountPropagation;
        private Input<String> name;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<String> subPath;
        private @Nullable Input<String> subPathExpr;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.mountPropagation = defaults.mountPropagation;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.subPath = defaults.subPath;
    	      this.subPathExpr = defaults.subPathExpr;
        }

        public Builder setMountPath(Input<String> mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Input.of(Objects.requireNonNull(mountPath));
            return this;
        }

        public Builder setMountPropagation(@Nullable Input<String> mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }

        public Builder setMountPropagation(@Nullable String mountPropagation) {
            this.mountPropagation = Input.ofNullable(mountPropagation);
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

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setSubPath(@Nullable Input<String> subPath) {
            this.subPath = subPath;
            return this;
        }

        public Builder setSubPath(@Nullable String subPath) {
            this.subPath = Input.ofNullable(subPath);
            return this;
        }

        public Builder setSubPathExpr(@Nullable Input<String> subPathExpr) {
            this.subPathExpr = subPathExpr;
            return this;
        }

        public Builder setSubPathExpr(@Nullable String subPathExpr) {
            this.subPathExpr = Input.ofNullable(subPathExpr);
            return this;
        }

        public VolumeMountArgs build() {
            return new VolumeMountArgs(mountPath, mountPropagation, name, readOnly, subPath, subPathExpr);
        }
    }
}
