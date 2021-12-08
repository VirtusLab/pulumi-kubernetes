// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.v1beta1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.authorization.v1beta1.inputs.*;

@ResourceType(type="kubernetes:authorization.k8s.io/v1beta1:SelfSubjectRulesReview")
public class SelfSubjectRulesReview extends io.pulumi.kubernetes.KubernetesResource {
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
    @OutputExport(name="spec", type=io.pulumi.kubernetes.authorization.v1beta1.outputs.SelfSubjectRulesReviewSpec.class, parameters={})
    private Output<io.pulumi.kubernetes.authorization.v1beta1.outputs.SelfSubjectRulesReviewSpec> spec;

    public Output<io.pulumi.kubernetes.authorization.v1beta1.outputs.SelfSubjectRulesReviewSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=io.pulumi.kubernetes.authorization.v1beta1.outputs.SubjectRulesReviewStatus.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.authorization.v1beta1.outputs.SubjectRulesReviewStatus> status;

    public Output</* @Nullable */ io.pulumi.kubernetes.authorization.v1beta1.outputs.SubjectRulesReviewStatus> getStatus() {
        return this.status;
    }

    public SelfSubjectRulesReview(String name, SelfSubjectRulesReviewArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1beta1:SelfSubjectRulesReview", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private SelfSubjectRulesReview(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1beta1:SelfSubjectRulesReview", name, null, makeResourceOptions(options, id));
    }

    private static SelfSubjectRulesReviewArgs makeArgs(SelfSubjectRulesReviewArgs args) {
        var builder = args == null ? SelfSubjectRulesReviewArgs.builder() : SelfSubjectRulesReviewArgs.builder(args);
        return builder
            .setApiVersion("authorization.k8s.io/v1beta1")
            .setKind("SelfSubjectRulesReview")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:authorization.k8s.io/v1:SelfSubjectRulesReview").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SelfSubjectRulesReview get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SelfSubjectRulesReview(name, id, options);
    }
}
