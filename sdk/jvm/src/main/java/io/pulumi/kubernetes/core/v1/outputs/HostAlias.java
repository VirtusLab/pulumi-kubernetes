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
public final class HostAlias {
    private final @Nullable List<String> hostnames;
    private final @Nullable String ip;

    @OutputCustomType.Constructor({"hostnames","ip"})
    private HostAlias(
        @Nullable List<String> hostnames,
        @Nullable String ip) {
        this.hostnames = hostnames;
        this.ip = ip;
    }

    public List<String> getHostnames() {
        return this.hostnames == null ? List.of() : this.hostnames;
    }
    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAlias defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> hostnames;
        private @Nullable String ip;

        public Builder() {
    	      // Empty
        }

        public Builder(HostAlias defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.ip = defaults.ip;
        }

        public Builder setHostnames(@Nullable List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public HostAlias build() {
            return new HostAlias(hostnames, ip);
        }
    }
}
