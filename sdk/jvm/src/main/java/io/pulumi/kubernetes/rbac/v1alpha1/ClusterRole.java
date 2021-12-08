// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.v1alpha1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.rbac.v1alpha1.inputs.*;

@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRole")
public class ClusterRole extends io.pulumi.kubernetes.KubernetesResource {
    @OutputExport(name="aggregationRule", type=io.pulumi.kubernetes.rbac.v1alpha1.outputs.AggregationRule.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.rbac.v1alpha1.outputs.AggregationRule> aggregationRule;

    public Output</* @Nullable */ io.pulumi.kubernetes.rbac.v1alpha1.outputs.AggregationRule> getAggregationRule() {
        return this.aggregationRule;
    }
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
    @OutputExport(name="rules", type=List.class, parameters={io.pulumi.kubernetes.rbac.v1alpha1.outputs.PolicyRule.class})
    private Output</* @Nullable */ List<io.pulumi.kubernetes.rbac.v1alpha1.outputs.PolicyRule>> rules;

    public Output</* @Nullable */ List<io.pulumi.kubernetes.rbac.v1alpha1.outputs.PolicyRule>> getRules() {
        return this.rules;
    }

    public ClusterRole(String name, @Nullable ClusterRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRole", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ClusterRole(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRole", name, null, makeResourceOptions(options, id));
    }

    private static ClusterRoleArgs makeArgs(@Nullable ClusterRoleArgs args) {
        var builder = args == null ? ClusterRoleArgs.builder() : ClusterRoleArgs.builder(args);
        return builder
            .setApiVersion("rbac.authorization.k8s.io/v1alpha1")
            .setKind("ClusterRole")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:rbac.authorization.k8s.io/v1:ClusterRole").build()),
                Input.of(Alias.builder().setType("kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRole").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ClusterRole get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRole(name, id, options);
    }
}
