// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class CustomResourceValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceValidationArgs Empty = new CustomResourceValidationArgs();

    @InputImport(name="openAPIV3Schema")
    private final @Nullable Input<io.pulumi.kubernetes.apiextensions.v1beta1.inputs.JSONSchemaPropsArgs> openAPIV3Schema;

    public Input<io.pulumi.kubernetes.apiextensions.v1beta1.inputs.JSONSchemaPropsArgs> getOpenAPIV3Schema() {
        return this.openAPIV3Schema == null ? Input.empty() : this.openAPIV3Schema;
    }

    public CustomResourceValidationArgs(@Nullable Input<io.pulumi.kubernetes.apiextensions.v1beta1.inputs.JSONSchemaPropsArgs> openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
    }

    private CustomResourceValidationArgs() {
        this.openAPIV3Schema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.apiextensions.v1beta1.inputs.JSONSchemaPropsArgs> openAPIV3Schema;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.openAPIV3Schema = defaults.openAPIV3Schema;
        }

        public Builder setOpenAPIV3Schema(@Nullable Input<io.pulumi.kubernetes.apiextensions.v1beta1.inputs.JSONSchemaPropsArgs> openAPIV3Schema) {
            this.openAPIV3Schema = openAPIV3Schema;
            return this;
        }

        public Builder setOpenAPIV3Schema(@Nullable io.pulumi.kubernetes.apiextensions.v1beta1.inputs.JSONSchemaPropsArgs openAPIV3Schema) {
            this.openAPIV3Schema = Input.ofNullable(openAPIV3Schema);
            return this;
        }

        public CustomResourceValidationArgs build() {
            return new CustomResourceValidationArgs(openAPIV3Schema);
        }
    }
}
