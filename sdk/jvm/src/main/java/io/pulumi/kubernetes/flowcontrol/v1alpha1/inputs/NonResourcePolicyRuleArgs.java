// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.v1alpha1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class NonResourcePolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonResourcePolicyRuleArgs Empty = new NonResourcePolicyRuleArgs();

    @InputImport(name="nonResourceURLs", required=true)
    private final Input<List<String>> nonResourceURLs;

    public Input<List<String>> getNonResourceURLs() {
        return this.nonResourceURLs;
    }

    @InputImport(name="verbs", required=true)
    private final Input<List<String>> verbs;

    public Input<List<String>> getVerbs() {
        return this.verbs;
    }

    public NonResourcePolicyRuleArgs(
        Input<List<String>> nonResourceURLs,
        Input<List<String>> verbs) {
        this.nonResourceURLs = Objects.requireNonNull(nonResourceURLs, "expected parameter 'nonResourceURLs' to be non-null");
        this.verbs = Objects.requireNonNull(verbs, "expected parameter 'verbs' to be non-null");
    }

    private NonResourcePolicyRuleArgs() {
        this.nonResourceURLs = Input.empty();
        this.verbs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourcePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> nonResourceURLs;
        private Input<List<String>> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(NonResourcePolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.verbs = defaults.verbs;
        }

        public Builder setNonResourceURLs(Input<List<String>> nonResourceURLs) {
            this.nonResourceURLs = Objects.requireNonNull(nonResourceURLs);
            return this;
        }

        public Builder setNonResourceURLs(List<String> nonResourceURLs) {
            this.nonResourceURLs = Input.of(Objects.requireNonNull(nonResourceURLs));
            return this;
        }

        public Builder setVerbs(Input<List<String>> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Input.of(Objects.requireNonNull(verbs));
            return this;
        }

        public NonResourcePolicyRuleArgs build() {
            return new NonResourcePolicyRuleArgs(nonResourceURLs, verbs);
        }
    }
}
