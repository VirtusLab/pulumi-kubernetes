// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class ServiceBackendPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBackendPortArgs Empty = new ServiceBackendPortArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="number")
    private final @Nullable Input<Integer> number;

    public Input<Integer> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    public ServiceBackendPortArgs(
        @Nullable Input<String> name,
        @Nullable Input<Integer> number) {
        this.name = name;
        this.number = number;
    }

    private ServiceBackendPortArgs() {
        this.name = Input.empty();
        this.number = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBackendPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> number;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBackendPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.number = defaults.number;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNumber(@Nullable Input<Integer> number) {
            this.number = number;
            return this;
        }

        public Builder setNumber(@Nullable Integer number) {
            this.number = Input.ofNullable(number);
            return this;
        }

        public ServiceBackendPortArgs build() {
            return new ServiceBackendPortArgs(name, number);
        }
    }
}
