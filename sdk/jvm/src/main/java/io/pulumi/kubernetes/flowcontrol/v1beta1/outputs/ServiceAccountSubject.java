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
public final class ServiceAccountSubject {
    private final String name;
    private final String namespace;

    @OutputCustomType.Constructor({"name","namespace"})
    private ServiceAccountSubject(
        String name,
        String namespace) {
        this.name = Objects.requireNonNull(name);
        this.namespace = Objects.requireNonNull(namespace);
    }

    public String getName() {
        return this.name;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountSubject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountSubject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public ServiceAccountSubject build() {
            return new ServiceAccountSubject(name, namespace);
        }
    }
}
