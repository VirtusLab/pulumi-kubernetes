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


public final class StorageOSVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageOSVolumeSourceArgs Empty = new StorageOSVolumeSourceArgs();

    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    @InputImport(name="secretRef")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs> secretRef;

    public Input<io.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    @InputImport(name="volumeName")
    private final @Nullable Input<String> volumeName;

    public Input<String> getVolumeName() {
        return this.volumeName == null ? Input.empty() : this.volumeName;
    }

    @InputImport(name="volumeNamespace")
    private final @Nullable Input<String> volumeNamespace;

    public Input<String> getVolumeNamespace() {
        return this.volumeNamespace == null ? Input.empty() : this.volumeNamespace;
    }

    public StorageOSVolumeSourceArgs(
        @Nullable Input<String> fsType,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs> secretRef,
        @Nullable Input<String> volumeName,
        @Nullable Input<String> volumeNamespace) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeName = volumeName;
        this.volumeNamespace = volumeNamespace;
    }

    private StorageOSVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.readOnly = Input.empty();
        this.secretRef = Input.empty();
        this.volumeName = Input.empty();
        this.volumeNamespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageOSVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs> secretRef;
        private @Nullable Input<String> volumeName;
        private @Nullable Input<String> volumeNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageOSVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeName = defaults.volumeName;
    	      this.volumeNamespace = defaults.volumeNamespace;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
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

        public Builder setSecretRef(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setSecretRef(@Nullable io.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public Builder setVolumeName(@Nullable Input<String> volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = Input.ofNullable(volumeName);
            return this;
        }

        public Builder setVolumeNamespace(@Nullable Input<String> volumeNamespace) {
            this.volumeNamespace = volumeNamespace;
            return this;
        }

        public Builder setVolumeNamespace(@Nullable String volumeNamespace) {
            this.volumeNamespace = Input.ofNullable(volumeNamespace);
            return this;
        }

        public StorageOSVolumeSourceArgs build() {
            return new StorageOSVolumeSourceArgs(fsType, readOnly, secretRef, volumeName, volumeNamespace);
        }
    }
}
