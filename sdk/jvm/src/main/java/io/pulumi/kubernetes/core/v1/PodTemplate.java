// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core.v1.inputs.*;

@ResourceType(type="kubernetes:core/v1:PodTemplate")
public class PodTemplate extends io.pulumi.kubernetes.KubernetesResource {
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
    @OutputExport(name="template", type=io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec> template;

    public Output</* @Nullable */ io.pulumi.kubernetes.core.v1.outputs.PodTemplateSpec> getTemplate() {
        return this.template;
    }

    public PodTemplate(String name, @Nullable PodTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:PodTemplate", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PodTemplate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:PodTemplate", name, null, makeResourceOptions(options, id));
    }

    private static PodTemplateArgs makeArgs(@Nullable PodTemplateArgs args) {
        var builder = args == null ? PodTemplateArgs.builder() : PodTemplateArgs.builder(args);
        return builder
            .setApiVersion("v1")
            .setKind("PodTemplate")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PodTemplate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PodTemplate(name, id, options);
    }
}
