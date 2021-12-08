// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class MutatingWebhookConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MutatingWebhookConfigurationArgs Empty = new MutatingWebhookConfigurationArgs();

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="webhooks")
    private final @Nullable Input<List<io.pulumi.kubernetes.admissionregistration.v1beta1.inputs.MutatingWebhookArgs>> webhooks;

    public Input<List<io.pulumi.kubernetes.admissionregistration.v1beta1.inputs.MutatingWebhookArgs>> getWebhooks() {
        return this.webhooks == null ? Input.empty() : this.webhooks;
    }

    public MutatingWebhookConfigurationArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata,
        @Nullable Input<List<io.pulumi.kubernetes.admissionregistration.v1beta1.inputs.MutatingWebhookArgs>> webhooks) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.webhooks = webhooks;
    }

    private MutatingWebhookConfigurationArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.webhooks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MutatingWebhookConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;
        private @Nullable Input<List<io.pulumi.kubernetes.admissionregistration.v1beta1.inputs.MutatingWebhookArgs>> webhooks;

        public Builder() {
    	      // Empty
        }

        public Builder(MutatingWebhookConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.webhooks = defaults.webhooks;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setWebhooks(@Nullable Input<List<io.pulumi.kubernetes.admissionregistration.v1beta1.inputs.MutatingWebhookArgs>> webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public Builder setWebhooks(@Nullable List<io.pulumi.kubernetes.admissionregistration.v1beta1.inputs.MutatingWebhookArgs> webhooks) {
            this.webhooks = Input.ofNullable(webhooks);
            return this;
        }

        public MutatingWebhookConfigurationArgs build() {
            return new MutatingWebhookConfigurationArgs(apiVersion, kind, metadata, webhooks);
        }
    }
}
