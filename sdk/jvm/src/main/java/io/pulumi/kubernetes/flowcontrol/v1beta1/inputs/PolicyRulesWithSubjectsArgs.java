// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class PolicyRulesWithSubjectsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyRulesWithSubjectsArgs Empty = new PolicyRulesWithSubjectsArgs();

    @InputImport(name="nonResourceRules")
    private final @Nullable Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.NonResourcePolicyRuleArgs>> nonResourceRules;

    public Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.NonResourcePolicyRuleArgs>> getNonResourceRules() {
        return this.nonResourceRules == null ? Input.empty() : this.nonResourceRules;
    }

    @InputImport(name="resourceRules")
    private final @Nullable Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.ResourcePolicyRuleArgs>> resourceRules;

    public Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.ResourcePolicyRuleArgs>> getResourceRules() {
        return this.resourceRules == null ? Input.empty() : this.resourceRules;
    }

    @InputImport(name="subjects", required=true)
    private final Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.SubjectArgs>> subjects;

    public Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.SubjectArgs>> getSubjects() {
        return this.subjects;
    }

    public PolicyRulesWithSubjectsArgs(
        @Nullable Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.NonResourcePolicyRuleArgs>> nonResourceRules,
        @Nullable Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.ResourcePolicyRuleArgs>> resourceRules,
        Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.SubjectArgs>> subjects) {
        this.nonResourceRules = nonResourceRules;
        this.resourceRules = resourceRules;
        this.subjects = Objects.requireNonNull(subjects, "expected parameter 'subjects' to be non-null");
    }

    private PolicyRulesWithSubjectsArgs() {
        this.nonResourceRules = Input.empty();
        this.resourceRules = Input.empty();
        this.subjects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRulesWithSubjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.NonResourcePolicyRuleArgs>> nonResourceRules;
        private @Nullable Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.ResourcePolicyRuleArgs>> resourceRules;
        private Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.SubjectArgs>> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRulesWithSubjectsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
    	      this.subjects = defaults.subjects;
        }

        public Builder setNonResourceRules(@Nullable Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.NonResourcePolicyRuleArgs>> nonResourceRules) {
            this.nonResourceRules = nonResourceRules;
            return this;
        }

        public Builder setNonResourceRules(@Nullable List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.NonResourcePolicyRuleArgs> nonResourceRules) {
            this.nonResourceRules = Input.ofNullable(nonResourceRules);
            return this;
        }

        public Builder setResourceRules(@Nullable Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.ResourcePolicyRuleArgs>> resourceRules) {
            this.resourceRules = resourceRules;
            return this;
        }

        public Builder setResourceRules(@Nullable List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.ResourcePolicyRuleArgs> resourceRules) {
            this.resourceRules = Input.ofNullable(resourceRules);
            return this;
        }

        public Builder setSubjects(Input<List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.SubjectArgs>> subjects) {
            this.subjects = Objects.requireNonNull(subjects);
            return this;
        }

        public Builder setSubjects(List<io.pulumi.kubernetes.flowcontrol.v1beta1.inputs.SubjectArgs> subjects) {
            this.subjects = Input.of(Objects.requireNonNull(subjects));
            return this;
        }

        public PolicyRulesWithSubjectsArgs build() {
            return new PolicyRulesWithSubjectsArgs(nonResourceRules, resourceRules, subjects);
        }
    }
}
