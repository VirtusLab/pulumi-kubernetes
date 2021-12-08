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
public final class IngressTLS {
    private final @Nullable List<String> hosts;
    private final @Nullable String secretName;

    @OutputCustomType.Constructor({"hosts","secretName"})
    private IngressTLS(
        @Nullable List<String> hosts,
        @Nullable String secretName) {
        this.hosts = hosts;
        this.secretName = secretName;
    }

    public List<String> getHosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }
    public Optional<String> getSecretName() {
        return Optional.ofNullable(this.secretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressTLS defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> hosts;
        private @Nullable String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressTLS defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.secretName = defaults.secretName;
        }

        public Builder setHosts(@Nullable List<String> hosts) {
            this.hosts = hosts;
            return this;
        }

        public Builder setSecretName(@Nullable String secretName) {
            this.secretName = secretName;
            return this;
        }

        public IngressTLS build() {
            return new IngressTLS(hosts, secretName);
        }
    }
}
