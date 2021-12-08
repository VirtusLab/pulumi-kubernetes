// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy.v1beta1.outputs;

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
public final class AllowedFlexVolume {
    private final String driver;

    @OutputCustomType.Constructor({"driver"})
    private AllowedFlexVolume(String driver) {
        this.driver = Objects.requireNonNull(driver);
    }

    public String getDriver() {
        return this.driver;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedFlexVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String driver;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedFlexVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
        }

        public Builder setDriver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }

        public AllowedFlexVolume build() {
            return new AllowedFlexVolume(driver);
        }
    }
}
