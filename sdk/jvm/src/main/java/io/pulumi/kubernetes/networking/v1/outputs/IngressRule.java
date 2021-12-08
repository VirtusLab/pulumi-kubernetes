// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.v1.outputs;

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
public final class IngressRule {
    private final @Nullable String host;
    private final @Nullable io.pulumi.kubernetes.networking.v1.outputs.HTTPIngressRuleValue http;

    @OutputCustomType.Constructor({"host","http"})
    private IngressRule(
        @Nullable String host,
        @Nullable io.pulumi.kubernetes.networking.v1.outputs.HTTPIngressRuleValue http) {
        this.host = host;
        this.http = http;
    }

    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    public Optional<io.pulumi.kubernetes.networking.v1.outputs.HTTPIngressRuleValue> getHttp() {
        return Optional.ofNullable(this.http);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable io.pulumi.kubernetes.networking.v1.outputs.HTTPIngressRuleValue http;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.http = defaults.http;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setHttp(@Nullable io.pulumi.kubernetes.networking.v1.outputs.HTTPIngressRuleValue http) {
            this.http = http;
            return this;
        }

        public IngressRule build() {
            return new IngressRule(host, http);
        }
    }
}
