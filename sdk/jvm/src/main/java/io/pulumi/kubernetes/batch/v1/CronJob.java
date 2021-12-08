// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch.v1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.batch.v1.inputs.*;

@ResourceType(type="kubernetes:batch/v1:CronJob")
public class CronJob extends io.pulumi.kubernetes.KubernetesResource {
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
    @OutputExport(name="spec", type=io.pulumi.kubernetes.batch.v1.outputs.CronJobSpec.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.batch.v1.outputs.CronJobSpec> spec;

    public Output</* @Nullable */ io.pulumi.kubernetes.batch.v1.outputs.CronJobSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=io.pulumi.kubernetes.batch.v1.outputs.CronJobStatus.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.batch.v1.outputs.CronJobStatus> status;

    public Output</* @Nullable */ io.pulumi.kubernetes.batch.v1.outputs.CronJobStatus> getStatus() {
        return this.status;
    }

    public CronJob(String name, @Nullable CronJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:batch/v1:CronJob", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private CronJob(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:batch/v1:CronJob", name, null, makeResourceOptions(options, id));
    }

    private static CronJobArgs makeArgs(@Nullable CronJobArgs args) {
        var builder = args == null ? CronJobArgs.builder() : CronJobArgs.builder(args);
        return builder
            .setApiVersion("batch/v1")
            .setKind("CronJob")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:batch/v1beta1:CronJob").build()),
                Input.of(Alias.builder().setType("kubernetes:batch/v2alpha1:CronJob").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CronJob get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CronJob(name, id, options);
    }
}
