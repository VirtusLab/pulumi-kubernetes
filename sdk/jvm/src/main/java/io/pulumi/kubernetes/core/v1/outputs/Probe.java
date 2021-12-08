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
public final class Probe {
    private final @Nullable io.pulumi.kubernetes.core.v1.outputs.ExecAction exec;
    private final @Nullable Integer failureThreshold;
    private final @Nullable io.pulumi.kubernetes.core.v1.outputs.HTTPGetAction httpGet;
    private final @Nullable Integer initialDelaySeconds;
    private final @Nullable Integer periodSeconds;
    private final @Nullable Integer successThreshold;
    private final @Nullable io.pulumi.kubernetes.core.v1.outputs.TCPSocketAction tcpSocket;
    private final @Nullable Integer terminationGracePeriodSeconds;
    private final @Nullable Integer timeoutSeconds;

    @OutputCustomType.Constructor({"exec","failureThreshold","httpGet","initialDelaySeconds","periodSeconds","successThreshold","tcpSocket","terminationGracePeriodSeconds","timeoutSeconds"})
    private Probe(
        @Nullable io.pulumi.kubernetes.core.v1.outputs.ExecAction exec,
        @Nullable Integer failureThreshold,
        @Nullable io.pulumi.kubernetes.core.v1.outputs.HTTPGetAction httpGet,
        @Nullable Integer initialDelaySeconds,
        @Nullable Integer periodSeconds,
        @Nullable Integer successThreshold,
        @Nullable io.pulumi.kubernetes.core.v1.outputs.TCPSocketAction tcpSocket,
        @Nullable Integer terminationGracePeriodSeconds,
        @Nullable Integer timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.timeoutSeconds = timeoutSeconds;
    }

    public Optional<io.pulumi.kubernetes.core.v1.outputs.ExecAction> getExec() {
        return Optional.ofNullable(this.exec);
    }
    public Optional<Integer> getFailureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    public Optional<io.pulumi.kubernetes.core.v1.outputs.HTTPGetAction> getHttpGet() {
        return Optional.ofNullable(this.httpGet);
    }
    public Optional<Integer> getInitialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    public Optional<Integer> getPeriodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    public Optional<Integer> getSuccessThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    public Optional<io.pulumi.kubernetes.core.v1.outputs.TCPSocketAction> getTcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }
    public Optional<Integer> getTerminationGracePeriodSeconds() {
        return Optional.ofNullable(this.terminationGracePeriodSeconds);
    }
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Probe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable io.pulumi.kubernetes.core.v1.outputs.ExecAction exec;
        private @Nullable Integer failureThreshold;
        private @Nullable io.pulumi.kubernetes.core.v1.outputs.HTTPGetAction httpGet;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable io.pulumi.kubernetes.core.v1.outputs.TCPSocketAction tcpSocket;
        private @Nullable Integer terminationGracePeriodSeconds;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(Probe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSocket = defaults.tcpSocket;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setExec(@Nullable io.pulumi.kubernetes.core.v1.outputs.ExecAction exec) {
            this.exec = exec;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setHttpGet(@Nullable io.pulumi.kubernetes.core.v1.outputs.HTTPGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setTcpSocket(@Nullable io.pulumi.kubernetes.core.v1.outputs.TCPSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        public Builder setTerminationGracePeriodSeconds(@Nullable Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Probe build() {
            return new Probe(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, terminationGracePeriodSeconds, timeoutSeconds);
        }
    }
}
