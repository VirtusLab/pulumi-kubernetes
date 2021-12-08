// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.v1beta1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.storage.v1beta1.inputs.*;

@ResourceType(type="kubernetes:storage.k8s.io/v1beta1:VolumeAttachment")
public class VolumeAttachment extends io.pulumi.kubernetes.KubernetesResource {
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
    @OutputExport(name="spec", type=io.pulumi.kubernetes.storage.v1beta1.outputs.VolumeAttachmentSpec.class, parameters={})
    private Output<io.pulumi.kubernetes.storage.v1beta1.outputs.VolumeAttachmentSpec> spec;

    public Output<io.pulumi.kubernetes.storage.v1beta1.outputs.VolumeAttachmentSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=io.pulumi.kubernetes.storage.v1beta1.outputs.VolumeAttachmentStatus.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.storage.v1beta1.outputs.VolumeAttachmentStatus> status;

    public Output</* @Nullable */ io.pulumi.kubernetes.storage.v1beta1.outputs.VolumeAttachmentStatus> getStatus() {
        return this.status;
    }

    public VolumeAttachment(String name, VolumeAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:VolumeAttachment", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private VolumeAttachment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:VolumeAttachment", name, null, makeResourceOptions(options, id));
    }

    private static VolumeAttachmentArgs makeArgs(VolumeAttachmentArgs args) {
        var builder = args == null ? VolumeAttachmentArgs.builder() : VolumeAttachmentArgs.builder(args);
        return builder
            .setApiVersion("storage.k8s.io/v1beta1")
            .setKind("VolumeAttachment")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:storage.k8s.io/v1:VolumeAttachment").build()),
                Input.of(Alias.builder().setType("kubernetes:storage.k8s.io/v1alpha1:VolumeAttachment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static VolumeAttachment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VolumeAttachment(name, id, options);
    }
}
