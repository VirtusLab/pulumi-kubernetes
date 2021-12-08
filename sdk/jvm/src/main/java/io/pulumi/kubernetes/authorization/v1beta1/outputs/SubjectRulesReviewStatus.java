// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.v1beta1.outputs;

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
public final class SubjectRulesReviewStatus {
    private final @Nullable String evaluationError;
    private final Boolean incomplete;
    private final List<io.pulumi.kubernetes.authorization.v1beta1.outputs.NonResourceRule> nonResourceRules;
    private final List<io.pulumi.kubernetes.authorization.v1beta1.outputs.ResourceRule> resourceRules;

    @OutputCustomType.Constructor({"evaluationError","incomplete","nonResourceRules","resourceRules"})
    private SubjectRulesReviewStatus(
        @Nullable String evaluationError,
        Boolean incomplete,
        List<io.pulumi.kubernetes.authorization.v1beta1.outputs.NonResourceRule> nonResourceRules,
        List<io.pulumi.kubernetes.authorization.v1beta1.outputs.ResourceRule> resourceRules) {
        this.evaluationError = evaluationError;
        this.incomplete = Objects.requireNonNull(incomplete);
        this.nonResourceRules = Objects.requireNonNull(nonResourceRules);
        this.resourceRules = Objects.requireNonNull(resourceRules);
    }

    public Optional<String> getEvaluationError() {
        return Optional.ofNullable(this.evaluationError);
    }
    public Boolean getIncomplete() {
        return this.incomplete;
    }
    public List<io.pulumi.kubernetes.authorization.v1beta1.outputs.NonResourceRule> getNonResourceRules() {
        return this.nonResourceRules;
    }
    public List<io.pulumi.kubernetes.authorization.v1beta1.outputs.ResourceRule> getResourceRules() {
        return this.resourceRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectRulesReviewStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String evaluationError;
        private Boolean incomplete;
        private List<io.pulumi.kubernetes.authorization.v1beta1.outputs.NonResourceRule> nonResourceRules;
        private List<io.pulumi.kubernetes.authorization.v1beta1.outputs.ResourceRule> resourceRules;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectRulesReviewStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationError = defaults.evaluationError;
    	      this.incomplete = defaults.incomplete;
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
        }

        public Builder setEvaluationError(@Nullable String evaluationError) {
            this.evaluationError = evaluationError;
            return this;
        }

        public Builder setIncomplete(Boolean incomplete) {
            this.incomplete = Objects.requireNonNull(incomplete);
            return this;
        }

        public Builder setNonResourceRules(List<io.pulumi.kubernetes.authorization.v1beta1.outputs.NonResourceRule> nonResourceRules) {
            this.nonResourceRules = Objects.requireNonNull(nonResourceRules);
            return this;
        }

        public Builder setResourceRules(List<io.pulumi.kubernetes.authorization.v1beta1.outputs.ResourceRule> resourceRules) {
            this.resourceRules = Objects.requireNonNull(resourceRules);
            return this;
        }

        public SubjectRulesReviewStatus build() {
            return new SubjectRulesReviewStatus(evaluationError, incomplete, nonResourceRules, resourceRules);
        }
    }
}
