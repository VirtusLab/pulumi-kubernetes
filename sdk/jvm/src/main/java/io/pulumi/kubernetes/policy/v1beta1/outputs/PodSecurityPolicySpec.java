// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy.v1beta1.outputs;

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
public final class PodSecurityPolicySpec {
    private final @Nullable Boolean allowPrivilegeEscalation;
    private final @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedCSIDriver> allowedCSIDrivers;
    private final @Nullable List<String> allowedCapabilities;
    private final @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedFlexVolume> allowedFlexVolumes;
    private final @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedHostPath> allowedHostPaths;
    private final @Nullable List<String> allowedProcMountTypes;
    private final @Nullable List<String> allowedUnsafeSysctls;
    private final @Nullable List<String> defaultAddCapabilities;
    private final @Nullable Boolean defaultAllowPrivilegeEscalation;
    private final @Nullable List<String> forbiddenSysctls;
    private final io.pulumi.kubernetes.policy.v1beta1.outputs.FSGroupStrategyOptions fsGroup;
    private final @Nullable Boolean hostIPC;
    private final @Nullable Boolean hostNetwork;
    private final @Nullable Boolean hostPID;
    private final @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.HostPortRange> hostPorts;
    private final @Nullable Boolean privileged;
    private final @Nullable Boolean readOnlyRootFilesystem;
    private final @Nullable List<String> requiredDropCapabilities;
    private final @Nullable io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsGroupStrategyOptions runAsGroup;
    private final io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsUserStrategyOptions runAsUser;
    private final @Nullable io.pulumi.kubernetes.policy.v1beta1.outputs.RuntimeClassStrategyOptions runtimeClass;
    private final io.pulumi.kubernetes.policy.v1beta1.outputs.SELinuxStrategyOptions seLinux;
    private final io.pulumi.kubernetes.policy.v1beta1.outputs.SupplementalGroupsStrategyOptions supplementalGroups;
    private final @Nullable List<String> volumes;

    @OutputCustomType.Constructor({"allowPrivilegeEscalation","allowedCSIDrivers","allowedCapabilities","allowedFlexVolumes","allowedHostPaths","allowedProcMountTypes","allowedUnsafeSysctls","defaultAddCapabilities","defaultAllowPrivilegeEscalation","forbiddenSysctls","fsGroup","hostIPC","hostNetwork","hostPID","hostPorts","privileged","readOnlyRootFilesystem","requiredDropCapabilities","runAsGroup","runAsUser","runtimeClass","seLinux","supplementalGroups","volumes"})
    private PodSecurityPolicySpec(
        @Nullable Boolean allowPrivilegeEscalation,
        @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedCSIDriver> allowedCSIDrivers,
        @Nullable List<String> allowedCapabilities,
        @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedFlexVolume> allowedFlexVolumes,
        @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedHostPath> allowedHostPaths,
        @Nullable List<String> allowedProcMountTypes,
        @Nullable List<String> allowedUnsafeSysctls,
        @Nullable List<String> defaultAddCapabilities,
        @Nullable Boolean defaultAllowPrivilegeEscalation,
        @Nullable List<String> forbiddenSysctls,
        io.pulumi.kubernetes.policy.v1beta1.outputs.FSGroupStrategyOptions fsGroup,
        @Nullable Boolean hostIPC,
        @Nullable Boolean hostNetwork,
        @Nullable Boolean hostPID,
        @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.HostPortRange> hostPorts,
        @Nullable Boolean privileged,
        @Nullable Boolean readOnlyRootFilesystem,
        @Nullable List<String> requiredDropCapabilities,
        @Nullable io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsGroupStrategyOptions runAsGroup,
        io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsUserStrategyOptions runAsUser,
        @Nullable io.pulumi.kubernetes.policy.v1beta1.outputs.RuntimeClassStrategyOptions runtimeClass,
        io.pulumi.kubernetes.policy.v1beta1.outputs.SELinuxStrategyOptions seLinux,
        io.pulumi.kubernetes.policy.v1beta1.outputs.SupplementalGroupsStrategyOptions supplementalGroups,
        @Nullable List<String> volumes) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.allowedCSIDrivers = allowedCSIDrivers;
        this.allowedCapabilities = allowedCapabilities;
        this.allowedFlexVolumes = allowedFlexVolumes;
        this.allowedHostPaths = allowedHostPaths;
        this.allowedProcMountTypes = allowedProcMountTypes;
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        this.defaultAddCapabilities = defaultAddCapabilities;
        this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
        this.forbiddenSysctls = forbiddenSysctls;
        this.fsGroup = Objects.requireNonNull(fsGroup);
        this.hostIPC = hostIPC;
        this.hostNetwork = hostNetwork;
        this.hostPID = hostPID;
        this.hostPorts = hostPorts;
        this.privileged = privileged;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.requiredDropCapabilities = requiredDropCapabilities;
        this.runAsGroup = runAsGroup;
        this.runAsUser = Objects.requireNonNull(runAsUser);
        this.runtimeClass = runtimeClass;
        this.seLinux = Objects.requireNonNull(seLinux);
        this.supplementalGroups = Objects.requireNonNull(supplementalGroups);
        this.volumes = volumes;
    }

    public Optional<Boolean> getAllowPrivilegeEscalation() {
        return Optional.ofNullable(this.allowPrivilegeEscalation);
    }
    public List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedCSIDriver> getAllowedCSIDrivers() {
        return this.allowedCSIDrivers == null ? List.of() : this.allowedCSIDrivers;
    }
    public List<String> getAllowedCapabilities() {
        return this.allowedCapabilities == null ? List.of() : this.allowedCapabilities;
    }
    public List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedFlexVolume> getAllowedFlexVolumes() {
        return this.allowedFlexVolumes == null ? List.of() : this.allowedFlexVolumes;
    }
    public List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedHostPath> getAllowedHostPaths() {
        return this.allowedHostPaths == null ? List.of() : this.allowedHostPaths;
    }
    public List<String> getAllowedProcMountTypes() {
        return this.allowedProcMountTypes == null ? List.of() : this.allowedProcMountTypes;
    }
    public List<String> getAllowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls == null ? List.of() : this.allowedUnsafeSysctls;
    }
    public List<String> getDefaultAddCapabilities() {
        return this.defaultAddCapabilities == null ? List.of() : this.defaultAddCapabilities;
    }
    public Optional<Boolean> getDefaultAllowPrivilegeEscalation() {
        return Optional.ofNullable(this.defaultAllowPrivilegeEscalation);
    }
    public List<String> getForbiddenSysctls() {
        return this.forbiddenSysctls == null ? List.of() : this.forbiddenSysctls;
    }
    public io.pulumi.kubernetes.policy.v1beta1.outputs.FSGroupStrategyOptions getFsGroup() {
        return this.fsGroup;
    }
    public Optional<Boolean> getHostIPC() {
        return Optional.ofNullable(this.hostIPC);
    }
    public Optional<Boolean> getHostNetwork() {
        return Optional.ofNullable(this.hostNetwork);
    }
    public Optional<Boolean> getHostPID() {
        return Optional.ofNullable(this.hostPID);
    }
    public List<io.pulumi.kubernetes.policy.v1beta1.outputs.HostPortRange> getHostPorts() {
        return this.hostPorts == null ? List.of() : this.hostPorts;
    }
    public Optional<Boolean> getPrivileged() {
        return Optional.ofNullable(this.privileged);
    }
    public Optional<Boolean> getReadOnlyRootFilesystem() {
        return Optional.ofNullable(this.readOnlyRootFilesystem);
    }
    public List<String> getRequiredDropCapabilities() {
        return this.requiredDropCapabilities == null ? List.of() : this.requiredDropCapabilities;
    }
    public Optional<io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsGroupStrategyOptions> getRunAsGroup() {
        return Optional.ofNullable(this.runAsGroup);
    }
    public io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsUserStrategyOptions getRunAsUser() {
        return this.runAsUser;
    }
    public Optional<io.pulumi.kubernetes.policy.v1beta1.outputs.RuntimeClassStrategyOptions> getRuntimeClass() {
        return Optional.ofNullable(this.runtimeClass);
    }
    public io.pulumi.kubernetes.policy.v1beta1.outputs.SELinuxStrategyOptions getSeLinux() {
        return this.seLinux;
    }
    public io.pulumi.kubernetes.policy.v1beta1.outputs.SupplementalGroupsStrategyOptions getSupplementalGroups() {
        return this.supplementalGroups;
    }
    public List<String> getVolumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityPolicySpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowPrivilegeEscalation;
        private @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedCSIDriver> allowedCSIDrivers;
        private @Nullable List<String> allowedCapabilities;
        private @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedFlexVolume> allowedFlexVolumes;
        private @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedHostPath> allowedHostPaths;
        private @Nullable List<String> allowedProcMountTypes;
        private @Nullable List<String> allowedUnsafeSysctls;
        private @Nullable List<String> defaultAddCapabilities;
        private @Nullable Boolean defaultAllowPrivilegeEscalation;
        private @Nullable List<String> forbiddenSysctls;
        private io.pulumi.kubernetes.policy.v1beta1.outputs.FSGroupStrategyOptions fsGroup;
        private @Nullable Boolean hostIPC;
        private @Nullable Boolean hostNetwork;
        private @Nullable Boolean hostPID;
        private @Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.HostPortRange> hostPorts;
        private @Nullable Boolean privileged;
        private @Nullable Boolean readOnlyRootFilesystem;
        private @Nullable List<String> requiredDropCapabilities;
        private @Nullable io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsGroupStrategyOptions runAsGroup;
        private io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsUserStrategyOptions runAsUser;
        private @Nullable io.pulumi.kubernetes.policy.v1beta1.outputs.RuntimeClassStrategyOptions runtimeClass;
        private io.pulumi.kubernetes.policy.v1beta1.outputs.SELinuxStrategyOptions seLinux;
        private io.pulumi.kubernetes.policy.v1beta1.outputs.SupplementalGroupsStrategyOptions supplementalGroups;
        private @Nullable List<String> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSecurityPolicySpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPrivilegeEscalation = defaults.allowPrivilegeEscalation;
    	      this.allowedCSIDrivers = defaults.allowedCSIDrivers;
    	      this.allowedCapabilities = defaults.allowedCapabilities;
    	      this.allowedFlexVolumes = defaults.allowedFlexVolumes;
    	      this.allowedHostPaths = defaults.allowedHostPaths;
    	      this.allowedProcMountTypes = defaults.allowedProcMountTypes;
    	      this.allowedUnsafeSysctls = defaults.allowedUnsafeSysctls;
    	      this.defaultAddCapabilities = defaults.defaultAddCapabilities;
    	      this.defaultAllowPrivilegeEscalation = defaults.defaultAllowPrivilegeEscalation;
    	      this.forbiddenSysctls = defaults.forbiddenSysctls;
    	      this.fsGroup = defaults.fsGroup;
    	      this.hostIPC = defaults.hostIPC;
    	      this.hostNetwork = defaults.hostNetwork;
    	      this.hostPID = defaults.hostPID;
    	      this.hostPorts = defaults.hostPorts;
    	      this.privileged = defaults.privileged;
    	      this.readOnlyRootFilesystem = defaults.readOnlyRootFilesystem;
    	      this.requiredDropCapabilities = defaults.requiredDropCapabilities;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsUser = defaults.runAsUser;
    	      this.runtimeClass = defaults.runtimeClass;
    	      this.seLinux = defaults.seLinux;
    	      this.supplementalGroups = defaults.supplementalGroups;
    	      this.volumes = defaults.volumes;
        }

        public Builder setAllowPrivilegeEscalation(@Nullable Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        public Builder setAllowedCSIDrivers(@Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedCSIDriver> allowedCSIDrivers) {
            this.allowedCSIDrivers = allowedCSIDrivers;
            return this;
        }

        public Builder setAllowedCapabilities(@Nullable List<String> allowedCapabilities) {
            this.allowedCapabilities = allowedCapabilities;
            return this;
        }

        public Builder setAllowedFlexVolumes(@Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedFlexVolume> allowedFlexVolumes) {
            this.allowedFlexVolumes = allowedFlexVolumes;
            return this;
        }

        public Builder setAllowedHostPaths(@Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.AllowedHostPath> allowedHostPaths) {
            this.allowedHostPaths = allowedHostPaths;
            return this;
        }

        public Builder setAllowedProcMountTypes(@Nullable List<String> allowedProcMountTypes) {
            this.allowedProcMountTypes = allowedProcMountTypes;
            return this;
        }

        public Builder setAllowedUnsafeSysctls(@Nullable List<String> allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }

        public Builder setDefaultAddCapabilities(@Nullable List<String> defaultAddCapabilities) {
            this.defaultAddCapabilities = defaultAddCapabilities;
            return this;
        }

        public Builder setDefaultAllowPrivilegeEscalation(@Nullable Boolean defaultAllowPrivilegeEscalation) {
            this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
            return this;
        }

        public Builder setForbiddenSysctls(@Nullable List<String> forbiddenSysctls) {
            this.forbiddenSysctls = forbiddenSysctls;
            return this;
        }

        public Builder setFsGroup(io.pulumi.kubernetes.policy.v1beta1.outputs.FSGroupStrategyOptions fsGroup) {
            this.fsGroup = Objects.requireNonNull(fsGroup);
            return this;
        }

        public Builder setHostIPC(@Nullable Boolean hostIPC) {
            this.hostIPC = hostIPC;
            return this;
        }

        public Builder setHostNetwork(@Nullable Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        public Builder setHostPID(@Nullable Boolean hostPID) {
            this.hostPID = hostPID;
            return this;
        }

        public Builder setHostPorts(@Nullable List<io.pulumi.kubernetes.policy.v1beta1.outputs.HostPortRange> hostPorts) {
            this.hostPorts = hostPorts;
            return this;
        }

        public Builder setPrivileged(@Nullable Boolean privileged) {
            this.privileged = privileged;
            return this;
        }

        public Builder setReadOnlyRootFilesystem(@Nullable Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        public Builder setRequiredDropCapabilities(@Nullable List<String> requiredDropCapabilities) {
            this.requiredDropCapabilities = requiredDropCapabilities;
            return this;
        }

        public Builder setRunAsGroup(@Nullable io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsGroupStrategyOptions runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        public Builder setRunAsUser(io.pulumi.kubernetes.policy.v1beta1.outputs.RunAsUserStrategyOptions runAsUser) {
            this.runAsUser = Objects.requireNonNull(runAsUser);
            return this;
        }

        public Builder setRuntimeClass(@Nullable io.pulumi.kubernetes.policy.v1beta1.outputs.RuntimeClassStrategyOptions runtimeClass) {
            this.runtimeClass = runtimeClass;
            return this;
        }

        public Builder setSeLinux(io.pulumi.kubernetes.policy.v1beta1.outputs.SELinuxStrategyOptions seLinux) {
            this.seLinux = Objects.requireNonNull(seLinux);
            return this;
        }

        public Builder setSupplementalGroups(io.pulumi.kubernetes.policy.v1beta1.outputs.SupplementalGroupsStrategyOptions supplementalGroups) {
            this.supplementalGroups = Objects.requireNonNull(supplementalGroups);
            return this;
        }

        public Builder setVolumes(@Nullable List<String> volumes) {
            this.volumes = volumes;
            return this;
        }

        public PodSecurityPolicySpec build() {
            return new PodSecurityPolicySpec(allowPrivilegeEscalation, allowedCSIDrivers, allowedCapabilities, allowedFlexVolumes, allowedHostPaths, allowedProcMountTypes, allowedUnsafeSysctls, defaultAddCapabilities, defaultAllowPrivilegeEscalation, forbiddenSysctls, fsGroup, hostIPC, hostNetwork, hostPID, hostPorts, privileged, readOnlyRootFilesystem, requiredDropCapabilities, runAsGroup, runAsUser, runtimeClass, seLinux, supplementalGroups, volumes);
        }
    }
}
