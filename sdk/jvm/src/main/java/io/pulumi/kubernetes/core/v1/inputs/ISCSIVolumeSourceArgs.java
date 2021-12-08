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


public final class ISCSIVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ISCSIVolumeSourceArgs Empty = new ISCSIVolumeSourceArgs();

    @InputImport(name="chapAuthDiscovery")
    private final @Nullable Input<Boolean> chapAuthDiscovery;

    public Input<Boolean> getChapAuthDiscovery() {
        return this.chapAuthDiscovery == null ? Input.empty() : this.chapAuthDiscovery;
    }

    @InputImport(name="chapAuthSession")
    private final @Nullable Input<Boolean> chapAuthSession;

    public Input<Boolean> getChapAuthSession() {
        return this.chapAuthSession == null ? Input.empty() : this.chapAuthSession;
    }

    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    @InputImport(name="initiatorName")
    private final @Nullable Input<String> initiatorName;

    public Input<String> getInitiatorName() {
        return this.initiatorName == null ? Input.empty() : this.initiatorName;
    }

    @InputImport(name="iqn", required=true)
    private final Input<String> iqn;

    public Input<String> getIqn() {
        return this.iqn;
    }

    @InputImport(name="iscsiInterface")
    private final @Nullable Input<String> iscsiInterface;

    public Input<String> getIscsiInterface() {
        return this.iscsiInterface == null ? Input.empty() : this.iscsiInterface;
    }

    @InputImport(name="lun", required=true)
    private final Input<Integer> lun;

    public Input<Integer> getLun() {
        return this.lun;
    }

    @InputImport(name="portals")
    private final @Nullable Input<List<String>> portals;

    public Input<List<String>> getPortals() {
        return this.portals == null ? Input.empty() : this.portals;
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

    @InputImport(name="targetPortal", required=true)
    private final Input<String> targetPortal;

    public Input<String> getTargetPortal() {
        return this.targetPortal;
    }

    public ISCSIVolumeSourceArgs(
        @Nullable Input<Boolean> chapAuthDiscovery,
        @Nullable Input<Boolean> chapAuthSession,
        @Nullable Input<String> fsType,
        @Nullable Input<String> initiatorName,
        Input<String> iqn,
        @Nullable Input<String> iscsiInterface,
        Input<Integer> lun,
        @Nullable Input<List<String>> portals,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs> secretRef,
        Input<String> targetPortal) {
        this.chapAuthDiscovery = chapAuthDiscovery;
        this.chapAuthSession = chapAuthSession;
        this.fsType = fsType;
        this.initiatorName = initiatorName;
        this.iqn = Objects.requireNonNull(iqn, "expected parameter 'iqn' to be non-null");
        this.iscsiInterface = iscsiInterface;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.portals = portals;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.targetPortal = Objects.requireNonNull(targetPortal, "expected parameter 'targetPortal' to be non-null");
    }

    private ISCSIVolumeSourceArgs() {
        this.chapAuthDiscovery = Input.empty();
        this.chapAuthSession = Input.empty();
        this.fsType = Input.empty();
        this.initiatorName = Input.empty();
        this.iqn = Input.empty();
        this.iscsiInterface = Input.empty();
        this.lun = Input.empty();
        this.portals = Input.empty();
        this.readOnly = Input.empty();
        this.secretRef = Input.empty();
        this.targetPortal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ISCSIVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> chapAuthDiscovery;
        private @Nullable Input<Boolean> chapAuthSession;
        private @Nullable Input<String> fsType;
        private @Nullable Input<String> initiatorName;
        private Input<String> iqn;
        private @Nullable Input<String> iscsiInterface;
        private Input<Integer> lun;
        private @Nullable Input<List<String>> portals;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs> secretRef;
        private Input<String> targetPortal;

        public Builder() {
    	      // Empty
        }

        public Builder(ISCSIVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chapAuthDiscovery = defaults.chapAuthDiscovery;
    	      this.chapAuthSession = defaults.chapAuthSession;
    	      this.fsType = defaults.fsType;
    	      this.initiatorName = defaults.initiatorName;
    	      this.iqn = defaults.iqn;
    	      this.iscsiInterface = defaults.iscsiInterface;
    	      this.lun = defaults.lun;
    	      this.portals = defaults.portals;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.targetPortal = defaults.targetPortal;
        }

        public Builder setChapAuthDiscovery(@Nullable Input<Boolean> chapAuthDiscovery) {
            this.chapAuthDiscovery = chapAuthDiscovery;
            return this;
        }

        public Builder setChapAuthDiscovery(@Nullable Boolean chapAuthDiscovery) {
            this.chapAuthDiscovery = Input.ofNullable(chapAuthDiscovery);
            return this;
        }

        public Builder setChapAuthSession(@Nullable Input<Boolean> chapAuthSession) {
            this.chapAuthSession = chapAuthSession;
            return this;
        }

        public Builder setChapAuthSession(@Nullable Boolean chapAuthSession) {
            this.chapAuthSession = Input.ofNullable(chapAuthSession);
            return this;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setInitiatorName(@Nullable Input<String> initiatorName) {
            this.initiatorName = initiatorName;
            return this;
        }

        public Builder setInitiatorName(@Nullable String initiatorName) {
            this.initiatorName = Input.ofNullable(initiatorName);
            return this;
        }

        public Builder setIqn(Input<String> iqn) {
            this.iqn = Objects.requireNonNull(iqn);
            return this;
        }

        public Builder setIqn(String iqn) {
            this.iqn = Input.of(Objects.requireNonNull(iqn));
            return this;
        }

        public Builder setIscsiInterface(@Nullable Input<String> iscsiInterface) {
            this.iscsiInterface = iscsiInterface;
            return this;
        }

        public Builder setIscsiInterface(@Nullable String iscsiInterface) {
            this.iscsiInterface = Input.ofNullable(iscsiInterface);
            return this;
        }

        public Builder setLun(Input<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Input.of(Objects.requireNonNull(lun));
            return this;
        }

        public Builder setPortals(@Nullable Input<List<String>> portals) {
            this.portals = portals;
            return this;
        }

        public Builder setPortals(@Nullable List<String> portals) {
            this.portals = Input.ofNullable(portals);
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

        public Builder setTargetPortal(Input<String> targetPortal) {
            this.targetPortal = Objects.requireNonNull(targetPortal);
            return this;
        }

        public Builder setTargetPortal(String targetPortal) {
            this.targetPortal = Input.of(Objects.requireNonNull(targetPortal));
            return this;
        }

        public ISCSIVolumeSourceArgs build() {
            return new ISCSIVolumeSourceArgs(chapAuthDiscovery, chapAuthSession, fsType, initiatorName, iqn, iscsiInterface, lun, portals, readOnly, secretRef, targetPortal);
        }
    }
}
