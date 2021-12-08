// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.v1beta1.outputs;

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
public final class IngressBackend {
    private final @Nullable io.pulumi.kubernetes.core.v1.outputs.TypedLocalObjectReference resource;
    private final String serviceName;
    private final Either<Integer,String> servicePort;

    @OutputCustomType.Constructor({"resource","serviceName","servicePort"})
    private IngressBackend(
        @Nullable io.pulumi.kubernetes.core.v1.outputs.TypedLocalObjectReference resource,
        String serviceName,
        Either<Integer,String> servicePort) {
        this.resource = resource;
        this.serviceName = Objects.requireNonNull(serviceName);
        this.servicePort = Objects.requireNonNull(servicePort);
    }

    public Optional<io.pulumi.kubernetes.core.v1.outputs.TypedLocalObjectReference> getResource() {
        return Optional.ofNullable(this.resource);
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public Either<Integer,String> getServicePort() {
        return this.servicePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable io.pulumi.kubernetes.core.v1.outputs.TypedLocalObjectReference resource;
        private String serviceName;
        private Either<Integer,String> servicePort;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.serviceName = defaults.serviceName;
    	      this.servicePort = defaults.servicePort;
        }

        public Builder setResource(@Nullable io.pulumi.kubernetes.core.v1.outputs.TypedLocalObjectReference resource) {
            this.resource = resource;
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServicePort(Either<Integer,String> servicePort) {
            this.servicePort = Objects.requireNonNull(servicePort);
            return this;
        }

        public IngressBackend build() {
            return new IngressBackend(resource, serviceName, servicePort);
        }
    }
}
