// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions.v1beta1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.extensions.v1beta1.inputs.*;

@ResourceType(type="kubernetes:extensions/v1beta1:NetworkPolicy")
public class NetworkPolicy extends io.pulumi.kubernetes.KubernetesResource {
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
    @OutputExport(name="spec", type=io.pulumi.kubernetes.extensions.v1beta1.outputs.NetworkPolicySpec.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.extensions.v1beta1.outputs.NetworkPolicySpec> spec;

    public Output</* @Nullable */ io.pulumi.kubernetes.extensions.v1beta1.outputs.NetworkPolicySpec> getSpec() {
        return this.spec;
    }

    public NetworkPolicy(String name, @Nullable NetworkPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:extensions/v1beta1:NetworkPolicy", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private NetworkPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:extensions/v1beta1:NetworkPolicy", name, null, makeResourceOptions(options, id));
    }

    private static NetworkPolicyArgs makeArgs(@Nullable NetworkPolicyArgs args) {
        var builder = args == null ? NetworkPolicyArgs.builder() : NetworkPolicyArgs.builder(args);
        return builder
            .setApiVersion("extensions/v1beta1")
            .setKind("NetworkPolicy")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:networking.k8s.io/v1:NetworkPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NetworkPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkPolicy(name, id, options);
    }
}
