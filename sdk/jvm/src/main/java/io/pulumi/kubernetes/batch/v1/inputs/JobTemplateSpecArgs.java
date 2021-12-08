// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class JobTemplateSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateSpecArgs Empty = new JobTemplateSpecArgs();

    @InputImport(name="metadata")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="spec")
    private final @Nullable Input<io.pulumi.kubernetes.batch.v1.inputs.JobSpecArgs> spec;

    public Input<io.pulumi.kubernetes.batch.v1.inputs.JobSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    public JobTemplateSpecArgs(
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata,
        @Nullable Input<io.pulumi.kubernetes.batch.v1.inputs.JobSpecArgs> spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    private JobTemplateSpecArgs() {
        this.metadata = Input.empty();
        this.spec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;
        private @Nullable Input<io.pulumi.kubernetes.batch.v1.inputs.JobSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder setMetadata(@Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setSpec(@Nullable Input<io.pulumi.kubernetes.batch.v1.inputs.JobSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable io.pulumi.kubernetes.batch.v1.inputs.JobSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public JobTemplateSpecArgs build() {
            return new JobTemplateSpecArgs(metadata, spec);
        }
    }
}
