// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.auditregistration.v1alpha1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    @InputImport(name="level", required=true)
    private final Input<String> level;

    public Input<String> getLevel() {
        return this.level;
    }

    @InputImport(name="stages")
    private final @Nullable Input<List<String>> stages;

    public Input<List<String>> getStages() {
        return this.stages == null ? Input.empty() : this.stages;
    }

    public PolicyArgs(
        Input<String> level,
        @Nullable Input<List<String>> stages) {
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.stages = stages;
    }

    private PolicyArgs() {
        this.level = Input.empty();
        this.stages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> level;
        private @Nullable Input<List<String>> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.stages = defaults.stages;
        }

        public Builder setLevel(Input<String> level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder setLevel(String level) {
            this.level = Input.of(Objects.requireNonNull(level));
            return this;
        }

        public Builder setStages(@Nullable Input<List<String>> stages) {
            this.stages = stages;
            return this;
        }

        public Builder setStages(@Nullable List<String> stages) {
            this.stages = Input.ofNullable(stages);
            return this;
        }

        public PolicyArgs build() {
            return new PolicyArgs(level, stages);
        }
    }
}
