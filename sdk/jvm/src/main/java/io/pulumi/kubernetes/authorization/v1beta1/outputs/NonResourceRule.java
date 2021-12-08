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
public final class NonResourceRule {
    private final @Nullable List<String> nonResourceURLs;
    private final List<String> verbs;

    @OutputCustomType.Constructor({"nonResourceURLs","verbs"})
    private NonResourceRule(
        @Nullable List<String> nonResourceURLs,
        List<String> verbs) {
        this.nonResourceURLs = nonResourceURLs;
        this.verbs = Objects.requireNonNull(verbs);
    }

    public List<String> getNonResourceURLs() {
        return this.nonResourceURLs == null ? List.of() : this.nonResourceURLs;
    }
    public List<String> getVerbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourceRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> nonResourceURLs;
        private List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(NonResourceRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.verbs = defaults.verbs;
        }

        public Builder setNonResourceURLs(@Nullable List<String> nonResourceURLs) {
            this.nonResourceURLs = nonResourceURLs;
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public NonResourceRule build() {
            return new NonResourceRule(nonResourceURLs, verbs);
        }
    }
}
