// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.v1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.authorization.v1.inputs.*;

@ResourceType(type="kubernetes:authorization.k8s.io/v1:SubjectAccessReview")
public class SubjectAccessReview extends io.pulumi.kubernetes.KubernetesResource {
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
    @OutputExport(name="spec", type=io.pulumi.kubernetes.authorization.v1.outputs.SubjectAccessReviewSpec.class, parameters={})
    private Output<io.pulumi.kubernetes.authorization.v1.outputs.SubjectAccessReviewSpec> spec;

    public Output<io.pulumi.kubernetes.authorization.v1.outputs.SubjectAccessReviewSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=io.pulumi.kubernetes.authorization.v1.outputs.SubjectAccessReviewStatus.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.authorization.v1.outputs.SubjectAccessReviewStatus> status;

    public Output</* @Nullable */ io.pulumi.kubernetes.authorization.v1.outputs.SubjectAccessReviewStatus> getStatus() {
        return this.status;
    }

    public SubjectAccessReview(String name, SubjectAccessReviewArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:SubjectAccessReview", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private SubjectAccessReview(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:SubjectAccessReview", name, null, makeResourceOptions(options, id));
    }

    private static SubjectAccessReviewArgs makeArgs(SubjectAccessReviewArgs args) {
        var builder = args == null ? SubjectAccessReviewArgs.builder() : SubjectAccessReviewArgs.builder(args);
        return builder
            .setApiVersion("authorization.k8s.io/v1")
            .setKind("SubjectAccessReview")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:authorization.k8s.io/v1beta1:SubjectAccessReview").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SubjectAccessReview get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubjectAccessReview(name, id, options);
    }
}
