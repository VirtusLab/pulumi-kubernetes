// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class NodeAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeAddressArgs Empty = new NodeAddressArgs();

    @InputImport(name="address", required=true)
    private final Input<String> address;

    public Input<String> getAddress() {
        return this.address;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public NodeAddressArgs(
        Input<String> address,
        Input<String> type) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NodeAddressArgs() {
        this.address = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> address;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.type = defaults.type;
        }

        public Builder setAddress(Input<String> address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setAddress(String address) {
            this.address = Input.of(Objects.requireNonNull(address));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public NodeAddressArgs build() {
            return new NodeAddressArgs(address, type);
        }
    }
}
