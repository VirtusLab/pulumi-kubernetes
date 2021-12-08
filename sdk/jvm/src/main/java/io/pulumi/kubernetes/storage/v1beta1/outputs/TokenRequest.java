// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.v1beta1.outputs;

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
public final class TokenRequest {
    private final String audience;
    private final @Nullable Integer expirationSeconds;

    @OutputCustomType.Constructor({"audience","expirationSeconds"})
    private TokenRequest(
        String audience,
        @Nullable Integer expirationSeconds) {
        this.audience = Objects.requireNonNull(audience);
        this.expirationSeconds = expirationSeconds;
    }

    public String getAudience() {
        return this.audience;
    }
    public Optional<Integer> getExpirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audience;
        private @Nullable Integer expirationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        public Builder setAudience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }

        public Builder setExpirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public TokenRequest build() {
            return new TokenRequest(audience, expirationSeconds);
        }
    }
}
