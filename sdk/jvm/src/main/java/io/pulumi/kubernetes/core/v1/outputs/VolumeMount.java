// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.outputs;

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
public final class VolumeMount {
    private final String mountPath;
    private final @Nullable String mountPropagation;
    private final String name;
    private final @Nullable Boolean readOnly;
    private final @Nullable String subPath;
    private final @Nullable String subPathExpr;

    @OutputCustomType.Constructor({"mountPath","mountPropagation","name","readOnly","subPath","subPathExpr"})
    private VolumeMount(
        String mountPath,
        @Nullable String mountPropagation,
        String name,
        @Nullable Boolean readOnly,
        @Nullable String subPath,
        @Nullable String subPathExpr) {
        this.mountPath = Objects.requireNonNull(mountPath);
        this.mountPropagation = mountPropagation;
        this.name = Objects.requireNonNull(name);
        this.readOnly = readOnly;
        this.subPath = subPath;
        this.subPathExpr = subPathExpr;
    }

    public String getMountPath() {
        return this.mountPath;
    }
    public Optional<String> getMountPropagation() {
        return Optional.ofNullable(this.mountPropagation);
    }
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<String> getSubPath() {
        return Optional.ofNullable(this.subPath);
    }
    public Optional<String> getSubPathExpr() {
        return Optional.ofNullable(this.subPathExpr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private @Nullable String mountPropagation;
        private String name;
        private @Nullable Boolean readOnly;
        private @Nullable String subPath;
        private @Nullable String subPathExpr;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.mountPropagation = defaults.mountPropagation;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.subPath = defaults.subPath;
    	      this.subPathExpr = defaults.subPathExpr;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setMountPropagation(@Nullable String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSubPath(@Nullable String subPath) {
            this.subPath = subPath;
            return this;
        }

        public Builder setSubPathExpr(@Nullable String subPathExpr) {
            this.subPathExpr = subPathExpr;
            return this;
        }

        public VolumeMount build() {
            return new VolumeMount(mountPath, mountPropagation, name, readOnly, subPath, subPathExpr);
        }
    }
}
