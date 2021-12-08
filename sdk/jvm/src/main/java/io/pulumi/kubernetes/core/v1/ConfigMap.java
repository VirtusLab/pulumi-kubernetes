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

@ResourceType(type="kubernetes:core/v1:ConfigMap")
public class ConfigMap extends io.pulumi.kubernetes.KubernetesResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="binaryData", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> binaryData;

    public Output</* @Nullable */ Map<String,String>> getBinaryData() {
        return this.binaryData;
    }
    @OutputExport(name="data", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> data;

    public Output</* @Nullable */ Map<String,String>> getData() {
        return this.data;
    }
    @OutputExport(name="immutable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> immutable;

    public Output</* @Nullable */ Boolean> getImmutable() {
        return this.immutable;
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

    public ConfigMap(String name, @Nullable ConfigMapArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ConfigMap", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ConfigMap(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ConfigMap", name, null, makeResourceOptions(options, id));
    }

    private static ConfigMapArgs makeArgs(@Nullable ConfigMapArgs args) {
        var builder = args == null ? ConfigMapArgs.builder() : ConfigMapArgs.builder(args);
        return builder
            .setApiVersion("v1")
            .setKind("ConfigMap")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ConfigMap get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigMap(name, id, options);
    }
}
