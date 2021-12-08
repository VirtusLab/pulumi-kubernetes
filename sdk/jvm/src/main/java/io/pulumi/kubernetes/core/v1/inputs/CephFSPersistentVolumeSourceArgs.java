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


public final class CephFSPersistentVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CephFSPersistentVolumeSourceArgs Empty = new CephFSPersistentVolumeSourceArgs();

    @InputImport(name="monitors", required=true)
    private final Input<List<String>> monitors;

    public Input<List<String>> getMonitors() {
        return this.monitors;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    @InputImport(name="secretFile")
    private final @Nullable Input<String> secretFile;

    public Input<String> getSecretFile() {
        return this.secretFile == null ? Input.empty() : this.secretFile;
    }

    @InputImport(name="secretRef")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> secretRef;

    public Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    @InputImport(name="user")
    private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public CephFSPersistentVolumeSourceArgs(
        Input<List<String>> monitors,
        @Nullable Input<String> path,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<String> secretFile,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> secretRef,
        @Nullable Input<String> user) {
        this.monitors = Objects.requireNonNull(monitors, "expected parameter 'monitors' to be non-null");
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
    }

    private CephFSPersistentVolumeSourceArgs() {
        this.monitors = Input.empty();
        this.path = Input.empty();
        this.readOnly = Input.empty();
        this.secretFile = Input.empty();
        this.secretRef = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CephFSPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> monitors;
        private @Nullable Input<String> path;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<String> secretFile;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.SecretReferenceArgs> secretRef;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(CephFSPersistentVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitors = defaults.monitors;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.secretFile = defaults.secretFile;
    	      this.secretRef = defaults.secretRef;
    	      this.user = defaults.user;
        }

        public Builder setMonitors(Input<List<String>> monitors) {
            this.monitors = Objects.requireNonNull(monitors);
            return this;
        }

        public Builder setMonitors(List<String> monitors) {
            this.monitors = Input.of(Objects.requireNonNull(monitors));
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
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

        public Builder setSecretFile(@Nullable Input<String> secretFile) {
            this.secretFile = secretFile;
            return this;
        }

        public Builder setSecretFile(@Nullable String secretFile) {
            this.secretFile = Input.ofNullable(secretFile);
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

        public Builder setUser(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }

        public CephFSPersistentVolumeSourceArgs build() {
            return new CephFSPersistentVolumeSourceArgs(monitors, path, readOnly, secretFile, secretRef, user);
        }
    }
}
