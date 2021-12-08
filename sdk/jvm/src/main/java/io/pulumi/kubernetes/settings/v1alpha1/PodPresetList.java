// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.settings.v1alpha1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.settings.v1alpha1.inputs.*;

@ResourceType(type="kubernetes:settings.k8s.io/v1alpha1:PodPresetList")
public class PodPresetList extends io.pulumi.kubernetes.KubernetesResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={io.pulumi.kubernetes.settings.v1alpha1.outputs.PodPreset.class})
    private Output<List<io.pulumi.kubernetes.settings.v1alpha1.outputs.PodPreset>> items;

    public Output<List<io.pulumi.kubernetes.settings.v1alpha1.outputs.PodPreset>> getItems() {
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

    public PodPresetList(String name, PodPresetListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:settings.k8s.io/v1alpha1:PodPresetList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PodPresetList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:settings.k8s.io/v1alpha1:PodPresetList", name, null, makeResourceOptions(options, id));
    }

    private static PodPresetListArgs makeArgs(PodPresetListArgs args) {
        var builder = args == null ? PodPresetListArgs.builder() : PodPresetListArgs.builder(args);
        return builder
            .setApiVersion("settings.k8s.io/v1alpha1")
            .setKind("PodPresetList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PodPresetList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PodPresetList(name, id, options);
    }
}
