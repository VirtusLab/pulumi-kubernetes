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


public final class CinderPersistentVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CinderPersistentVolumeSourceArgs Empty = new CinderPersistentVolumeSourceArgs();

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
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> secretRef;

    public Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    @InputImport(name="volumeID", required=true)
    private final Input<String> volumeID;

    public Input<String> getVolumeID() {
        return this.volumeID;
    }

    public CinderPersistentVolumeSourceArgs(
        @Nullable Input<String> fsType,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> secretRef,
        Input<String> volumeID) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeID = Objects.requireNonNull(volumeID, "expected parameter 'volumeID' to be non-null");
    }

    private CinderPersistentVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.readOnly = Input.empty();
        this.secretRef = Input.empty();
        this.volumeID = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CinderPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> secretRef;
        private Input<String> volumeID;

        public Builder() {
    	      // Empty
        }

        public Builder(CinderPersistentVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeID = defaults.volumeID;
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

        public Builder setSecretRef(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setSecretRef(@Nullable io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public Builder setVolumeID(Input<String> volumeID) {
            this.volumeID = Objects.requireNonNull(volumeID);
            return this;
        }

        public Builder setVolumeID(String volumeID) {
            this.volumeID = Input.of(Objects.requireNonNull(volumeID));
            return this;
        }

        public CinderPersistentVolumeSourceArgs build() {
            return new CinderPersistentVolumeSourceArgs(fsType, readOnly, secretRef, volumeID);
        }
    }
}
