// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class WebhookClientConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookClientConfigArgs Empty = new WebhookClientConfigArgs();

    @InputImport(name="caBundle")
    private final @Nullable Input<String> caBundle;

    public Input<String> getCaBundle() {
        return this.caBundle == null ? Input.empty() : this.caBundle;
    }

    @InputImport(name="service")
    private final @Nullable Input<io.pulumi.kubernetes.apiextensions.v1.inputs.ServiceReferenceArgs> service;

    public Input<io.pulumi.kubernetes.apiextensions.v1.inputs.ServiceReferenceArgs> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public WebhookClientConfigArgs(
        @Nullable Input<String> caBundle,
        @Nullable Input<io.pulumi.kubernetes.apiextensions.v1.inputs.ServiceReferenceArgs> service,
        @Nullable Input<String> url) {
        this.caBundle = caBundle;
        this.service = service;
        this.url = url;
    }

    private WebhookClientConfigArgs() {
        this.caBundle = Input.empty();
        this.service = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookClientConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> caBundle;
        private @Nullable Input<io.pulumi.kubernetes.apiextensions.v1.inputs.ServiceReferenceArgs> service;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookClientConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caBundle = defaults.caBundle;
    	      this.service = defaults.service;
    	      this.url = defaults.url;
        }

        public Builder setCaBundle(@Nullable Input<String> caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        public Builder setCaBundle(@Nullable String caBundle) {
            this.caBundle = Input.ofNullable(caBundle);
            return this;
        }

        public Builder setService(@Nullable Input<io.pulumi.kubernetes.apiextensions.v1.inputs.ServiceReferenceArgs> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable io.pulumi.kubernetes.apiextensions.v1.inputs.ServiceReferenceArgs service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public WebhookClientConfigArgs build() {
            return new WebhookClientConfigArgs(caBundle, service, url);
        }
    }
}
