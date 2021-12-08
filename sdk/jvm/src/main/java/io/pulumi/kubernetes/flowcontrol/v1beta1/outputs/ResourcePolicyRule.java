// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.v1beta1.outputs;

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
public final class ResourcePolicyRule {
    private final List<String> apiGroups;
    private final @Nullable Boolean clusterScope;
    private final @Nullable List<String> namespaces;
    private final List<String> resources;
    private final List<String> verbs;

    @OutputCustomType.Constructor({"apiGroups","clusterScope","namespaces","resources","verbs"})
    private ResourcePolicyRule(
        List<String> apiGroups,
        @Nullable Boolean clusterScope,
        @Nullable List<String> namespaces,
        List<String> resources,
        List<String> verbs) {
        this.apiGroups = Objects.requireNonNull(apiGroups);
        this.clusterScope = clusterScope;
        this.namespaces = namespaces;
        this.resources = Objects.requireNonNull(resources);
        this.verbs = Objects.requireNonNull(verbs);
    }

    public List<String> getApiGroups() {
        return this.apiGroups;
    }
    public Optional<Boolean> getClusterScope() {
        return Optional.ofNullable(this.clusterScope);
    }
    public List<String> getNamespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    public List<String> getResources() {
        return this.resources;
    }
    public List<String> getVerbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> apiGroups;
        private @Nullable Boolean clusterScope;
        private @Nullable List<String> namespaces;
        private List<String> resources;
        private List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.clusterScope = defaults.clusterScope;
    	      this.namespaces = defaults.namespaces;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder setApiGroups(List<String> apiGroups) {
            this.apiGroups = Objects.requireNonNull(apiGroups);
            return this;
        }

        public Builder setClusterScope(@Nullable Boolean clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }

        public Builder setNamespaces(@Nullable List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        public Builder setResources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public ResourcePolicyRule build() {
            return new ResourcePolicyRule(apiGroups, clusterScope, namespaces, resources, verbs);
        }
    }
}
