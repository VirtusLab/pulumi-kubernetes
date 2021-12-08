// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps.v1beta1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apps.v1beta1.inputs.*;

@Deprecated /* apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
@ResourceType(type="kubernetes:apps/v1beta1:StatefulSet")
public class StatefulSet extends io.pulumi.kubernetes.KubernetesResource {
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
    @OutputExport(name="spec", type=io.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetSpec.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetSpec> spec;

    public Output</* @Nullable */ io.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=io.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetStatus.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetStatus> status;

    public Output</* @Nullable */ io.pulumi.kubernetes.apps.v1beta1.outputs.StatefulSetStatus> getStatus() {
        return this.status;
    }

    public StatefulSet(String name, @Nullable StatefulSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta1:StatefulSet", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private StatefulSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta1:StatefulSet", name, null, makeResourceOptions(options, id));
    }

    private static StatefulSetArgs makeArgs(@Nullable StatefulSetArgs args) {
        var builder = args == null ? StatefulSetArgs.builder() : StatefulSetArgs.builder(args);
        return builder
            .setApiVersion("apps/v1beta1")
            .setKind("StatefulSet")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:apps/v1:StatefulSet").build()),
                Input.of(Alias.builder().setType("kubernetes:apps/v1beta2:StatefulSet").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static StatefulSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StatefulSet(name, id, options);
    }
}
