// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch.v1.outputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;

@OutputCustomType
public final class JobTemplateSpec {
    private final @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata;
    private final @Nullable io.pulumi.kubernetes.batch.v1.outputs.JobSpec spec;

    @OutputCustomType.Constructor({"metadata","spec"})
    private JobTemplateSpec(
        @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata,
        @Nullable io.pulumi.kubernetes.batch.v1.outputs.JobSpec spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    public Optional<io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<io.pulumi.kubernetes.batch.v1.outputs.JobSpec> getSpec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata;
        private @Nullable io.pulumi.kubernetes.batch.v1.outputs.JobSpec spec;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder setMetadata(@Nullable io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSpec(@Nullable io.pulumi.kubernetes.batch.v1.outputs.JobSpec spec) {
            this.spec = spec;
            return this;
        }

        public JobTemplateSpec build() {
            return new JobTemplateSpec(metadata, spec);
        }
    }
}
