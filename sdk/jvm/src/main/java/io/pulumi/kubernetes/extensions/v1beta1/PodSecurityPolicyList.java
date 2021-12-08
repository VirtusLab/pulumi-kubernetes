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

@ResourceType(type="kubernetes:extensions/v1beta1:PodSecurityPolicyList")
public class PodSecurityPolicyList extends io.pulumi.kubernetes.KubernetesResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={io.pulumi.kubernetes.extensions.v1beta1.outputs.PodSecurityPolicy.class})
    private Output<List<io.pulumi.kubernetes.extensions.v1beta1.outputs.PodSecurityPolicy>> items;

    public Output<List<io.pulumi.kubernetes.extensions.v1beta1.outputs.PodSecurityPolicy>> getItems() {
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

    public PodSecurityPolicyList(String name, PodSecurityPolicyListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:extensions/v1beta1:PodSecurityPolicyList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PodSecurityPolicyList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:extensions/v1beta1:PodSecurityPolicyList", name, null, makeResourceOptions(options, id));
    }

    private static PodSecurityPolicyListArgs makeArgs(PodSecurityPolicyListArgs args) {
        var builder = args == null ? PodSecurityPolicyListArgs.builder() : PodSecurityPolicyListArgs.builder(args);
        return builder
            .setApiVersion("extensions/v1beta1")
            .setKind("PodSecurityPolicyList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PodSecurityPolicyList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PodSecurityPolicyList(name, id, options);
    }
}
