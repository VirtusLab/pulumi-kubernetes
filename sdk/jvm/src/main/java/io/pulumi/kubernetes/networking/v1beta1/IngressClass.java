// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.v1beta1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.networking.v1beta1.inputs.*;

@ResourceType(type="kubernetes:networking.k8s.io/v1beta1:IngressClass")
public class IngressClass extends io.pulumi.kubernetes.KubernetesResource {
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
    @OutputExport(name="spec", type=io.pulumi.kubernetes.networking.v1beta1.outputs.IngressClassSpec.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.networking.v1beta1.outputs.IngressClassSpec> spec;

    public Output</* @Nullable */ io.pulumi.kubernetes.networking.v1beta1.outputs.IngressClassSpec> getSpec() {
        return this.spec;
    }

    public IngressClass(String name, @Nullable IngressClassArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:networking.k8s.io/v1beta1:IngressClass", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private IngressClass(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:networking.k8s.io/v1beta1:IngressClass", name, null, makeResourceOptions(options, id));
    }

    private static IngressClassArgs makeArgs(@Nullable IngressClassArgs args) {
        var builder = args == null ? IngressClassArgs.builder() : IngressClassArgs.builder(args);
        return builder
            .setApiVersion("networking.k8s.io/v1beta1")
            .setKind("IngressClass")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:networking.k8s.io/v1:IngressClass").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IngressClass get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IngressClass(name, id, options);
    }
}
