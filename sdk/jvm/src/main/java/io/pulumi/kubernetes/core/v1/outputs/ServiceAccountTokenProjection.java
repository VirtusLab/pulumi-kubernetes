// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.outputs;

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
public final class ServiceAccountTokenProjection {
    private final @Nullable String audience;
    private final @Nullable Integer expirationSeconds;
    private final String path;

    @OutputCustomType.Constructor({"audience","expirationSeconds","path"})
    private ServiceAccountTokenProjection(
        @Nullable String audience,
        @Nullable Integer expirationSeconds,
        String path) {
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
        this.path = Objects.requireNonNull(path);
    }

    public Optional<String> getAudience() {
        return Optional.ofNullable(this.audience);
    }
    public Optional<Integer> getExpirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountTokenProjection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audience;
        private @Nullable Integer expirationSeconds;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountTokenProjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.expirationSeconds = defaults.expirationSeconds;
    	      this.path = defaults.path;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder setExpirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public ServiceAccountTokenProjection build() {
            return new ServiceAccountTokenProjection(audience, expirationSeconds, path);
        }
    }
}
