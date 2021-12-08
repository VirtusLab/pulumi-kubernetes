// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.v1beta1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.admissionregistration.v1beta1.inputs.*;

@ResourceType(type="kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingWebhookConfiguration")
public class ValidatingWebhookConfiguration extends io.pulumi.kubernetes.KubernetesResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta> metadata;

    public Output</* @Nullable */ io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="webhooks", type=List.class, parameters={io.pulumi.kubernetes.admissionregistration.v1beta1.outputs.ValidatingWebhook.class})
    private Output</* @Nullable */ List<io.pulumi.kubernetes.admissionregistration.v1beta1.outputs.ValidatingWebhook>> webhooks;

    public Output</* @Nullable */ List<io.pulumi.kubernetes.admissionregistration.v1beta1.outputs.ValidatingWebhook>> getWebhooks() {
        return this.webhooks;
    }

    public ValidatingWebhookConfiguration(String name, @Nullable ValidatingWebhookConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingWebhookConfiguration", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ValidatingWebhookConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingWebhookConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static ValidatingWebhookConfigurationArgs makeArgs(@Nullable ValidatingWebhookConfigurationArgs args) {
        var builder = args == null ? ValidatingWebhookConfigurationArgs.builder() : ValidatingWebhookConfigurationArgs.builder(args);
        return builder
            .setApiVersion("admissionregistration.k8s.io/v1beta1")
            .setKind("ValidatingWebhookConfiguration")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:admissionregistration.k8s.io/v1:ValidatingWebhookConfiguration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ValidatingWebhookConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ValidatingWebhookConfiguration(name, id, options);
    }
}
