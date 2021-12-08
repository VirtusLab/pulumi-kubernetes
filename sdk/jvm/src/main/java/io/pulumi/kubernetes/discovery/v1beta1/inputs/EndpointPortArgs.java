// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class EndpointPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointPortArgs Empty = new EndpointPortArgs();

    @InputImport(name="appProtocol")
    private final @Nullable Input<String> appProtocol;

    public Input<String> getAppProtocol() {
        return this.appProtocol == null ? Input.empty() : this.appProtocol;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="protocol")
    private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public EndpointPortArgs(
        @Nullable Input<String> appProtocol,
        @Nullable Input<String> name,
        @Nullable Input<Integer> port,
        @Nullable Input<String> protocol) {
        this.appProtocol = appProtocol;
        this.name = name;
        this.port = port;
        this.protocol = protocol;
    }

    private EndpointPortArgs() {
        this.appProtocol = Input.empty();
        this.name = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appProtocol;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appProtocol = defaults.appProtocol;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setAppProtocol(@Nullable Input<String> appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }

        public Builder setAppProtocol(@Nullable String appProtocol) {
            this.appProtocol = Input.ofNullable(appProtocol);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public EndpointPortArgs build() {
            return new EndpointPortArgs(appProtocol, name, port, protocol);
        }
    }
}
