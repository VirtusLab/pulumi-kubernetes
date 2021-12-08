// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.v1beta1.outputs;

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
public final class WebhookClientConfig {
    private final @Nullable String caBundle;
    private final @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.ServiceReference service;
    private final @Nullable String url;

    @OutputCustomType.Constructor({"caBundle","service","url"})
    private WebhookClientConfig(
        @Nullable String caBundle,
        @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.ServiceReference service,
        @Nullable String url) {
        this.caBundle = caBundle;
        this.service = service;
        this.url = url;
    }

    public Optional<String> getCaBundle() {
        return Optional.ofNullable(this.caBundle);
    }
    public Optional<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.ServiceReference> getService() {
        return Optional.ofNullable(this.service);
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookClientConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caBundle;
        private @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.ServiceReference service;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookClientConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caBundle = defaults.caBundle;
    	      this.service = defaults.service;
    	      this.url = defaults.url;
        }

        public Builder setCaBundle(@Nullable String caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        public Builder setService(@Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.ServiceReference service) {
            this.service = service;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public WebhookClientConfig build() {
            return new WebhookClientConfig(caBundle, service, url);
        }
    }
}
