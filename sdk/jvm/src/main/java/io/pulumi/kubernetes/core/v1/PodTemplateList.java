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

@ResourceType(type="kubernetes:core/v1:PodTemplateList")
public class PodTemplateList extends io.pulumi.kubernetes.KubernetesResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={io.pulumi.kubernetes.core.v1.outputs.PodTemplate.class})
    private Output<List<io.pulumi.kubernetes.core.v1.outputs.PodTemplate>> items;

    public Output<List<io.pulumi.kubernetes.core.v1.outputs.PodTemplate>> getItems() {
        return this.items;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=io.pulumi.kubernetes.meta.v1.outputs.ListMeta.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.meta.v1.outputs.ListMeta> metadata;

    public Output</* @Nullable */ io.pulumi.kubernetes.meta.v1.outputs.ListMeta> getMetadata() {
        return this.metadata;
    }

    public PodTemplateList(String name, PodTemplateListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:PodTemplateList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PodTemplateList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:PodTemplateList", name, null, makeResourceOptions(options, id));
    }

    private static PodTemplateListArgs makeArgs(PodTemplateListArgs args) {
        var builder = args == null ? PodTemplateListArgs.builder() : PodTemplateListArgs.builder(args);
        return builder
            .setApiVersion("v1")
            .setKind("PodTemplateList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PodTemplateList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PodTemplateList(name, id, options);
    }
}
