// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.v1.outputs;

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
public final class EndpointSlice {
    private final String addressType;
    private final @Nullable String apiVersion;
    private final List<io.pulumi.kubernetes.discovery.v1.outputs.Endpoint> endpoints;
    private final @Nullable String kind;
    private final @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata;
    private final @Nullable List<io.pulumi.kubernetes.discovery.v1.outputs.EndpointPort> ports;

    @OutputCustomType.Constructor({"addressType","apiVersion","endpoints","kind","metadata","ports"})
    private EndpointSlice(
        String addressType,
        @Nullable String apiVersion,
        List<io.pulumi.kubernetes.discovery.v1.outputs.Endpoint> endpoints,
        @Nullable String kind,
        @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata,
        @Nullable List<io.pulumi.kubernetes.discovery.v1.outputs.EndpointPort> ports) {
        this.addressType = Objects.requireNonNull(addressType);
        this.apiVersion = apiVersion;
        this.endpoints = Objects.requireNonNull(endpoints);
        this.kind = kind;
        this.metadata = metadata;
        this.ports = ports;
    }

    public String getAddressType() {
        return this.addressType;
    }
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    public List<io.pulumi.kubernetes.discovery.v1.outputs.Endpoint> getEndpoints() {
        return this.endpoints;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public List<io.pulumi.kubernetes.discovery.v1.outputs.EndpointPort> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointSlice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressType;
        private @Nullable String apiVersion;
        private List<io.pulumi.kubernetes.discovery.v1.outputs.Endpoint> endpoints;
        private @Nullable String kind;
        private @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata;
        private @Nullable List<io.pulumi.kubernetes.discovery.v1.outputs.EndpointPort> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointSlice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.endpoints = defaults.endpoints;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.ports = defaults.ports;
        }

        public Builder setAddressType(String addressType) {
            this.addressType = Objects.requireNonNull(addressType);
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setEndpoints(List<io.pulumi.kubernetes.discovery.v1.outputs.Endpoint> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setPorts(@Nullable List<io.pulumi.kubernetes.discovery.v1.outputs.EndpointPort> ports) {
            this.ports = ports;
            return this;
        }

        public EndpointSlice build() {
            return new EndpointSlice(addressType, apiVersion, endpoints, kind, metadata, ports);
        }
    }
}
