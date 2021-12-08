// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class SelfSubjectRulesReviewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelfSubjectRulesReviewSpecArgs Empty = new SelfSubjectRulesReviewSpecArgs();

    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public SelfSubjectRulesReviewSpecArgs(@Nullable Input<String> namespace) {
        this.namespace = namespace;
    }

    private SelfSubjectRulesReviewSpecArgs() {
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfSubjectRulesReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfSubjectRulesReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public SelfSubjectRulesReviewSpecArgs build() {
            return new SelfSubjectRulesReviewSpecArgs(namespace);
        }
    }
}
