// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.v1.outputs;

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
public final class TokenRequestSpec {
    private final List<String> audiences;
    private final @Nullable io.pulumi.kubernetes.authentication.v1.outputs.BoundObjectReference boundObjectRef;
    private final @Nullable Integer expirationSeconds;

    @OutputCustomType.Constructor({"audiences","boundObjectRef","expirationSeconds"})
    private TokenRequestSpec(
        List<String> audiences,
        @Nullable io.pulumi.kubernetes.authentication.v1.outputs.BoundObjectReference boundObjectRef,
        @Nullable Integer expirationSeconds) {
        this.audiences = Objects.requireNonNull(audiences);
        this.boundObjectRef = boundObjectRef;
        this.expirationSeconds = expirationSeconds;
    }

    public List<String> getAudiences() {
        return this.audiences;
    }
    public Optional<io.pulumi.kubernetes.authentication.v1.outputs.BoundObjectReference> getBoundObjectRef() {
        return Optional.ofNullable(this.boundObjectRef);
    }
    public Optional<Integer> getExpirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequestSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> audiences;
        private @Nullable io.pulumi.kubernetes.authentication.v1.outputs.BoundObjectReference boundObjectRef;
        private @Nullable Integer expirationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenRequestSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.boundObjectRef = defaults.boundObjectRef;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        public Builder setAudiences(List<String> audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }

        public Builder setBoundObjectRef(@Nullable io.pulumi.kubernetes.authentication.v1.outputs.BoundObjectReference boundObjectRef) {
            this.boundObjectRef = boundObjectRef;
            return this;
        }

        public Builder setExpirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public TokenRequestSpec build() {
            return new TokenRequestSpec(audiences, boundObjectRef, expirationSeconds);
        }
    }
}
