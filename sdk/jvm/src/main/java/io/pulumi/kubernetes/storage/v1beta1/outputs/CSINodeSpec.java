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
public final class CSINodeSpec {
    private final List<io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeDriver> drivers;

    @OutputCustomType.Constructor({"drivers"})
    private CSINodeSpec(List<io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeDriver> drivers) {
        this.drivers = Objects.requireNonNull(drivers);
    }

    public List<io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeDriver> getDrivers() {
        return this.drivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINodeSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeDriver> drivers;

        public Builder() {
    	      // Empty
        }

        public Builder(CSINodeSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drivers = defaults.drivers;
        }

        public Builder setDrivers(List<io.pulumi.kubernetes.storage.v1beta1.outputs.CSINodeDriver> drivers) {
            this.drivers = Objects.requireNonNull(drivers);
            return this;
        }

        public CSINodeSpec build() {
            return new CSINodeSpec(drivers);
        }
    }
}
