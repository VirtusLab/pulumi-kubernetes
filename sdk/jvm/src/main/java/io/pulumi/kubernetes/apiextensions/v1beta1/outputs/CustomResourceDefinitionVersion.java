// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.v1beta1.outputs;

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
public final class CustomResourceDefinitionVersion {
    private final @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> additionalPrinterColumns;
    private final @Nullable Boolean deprecated;
    private final @Nullable String deprecationWarning;
    private final String name;
    private final @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation schema;
    private final Boolean served;
    private final Boolean storage;
    private final @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources subresources;

    @OutputCustomType.Constructor({"additionalPrinterColumns","deprecated","deprecationWarning","name","schema","served","storage","subresources"})
    private CustomResourceDefinitionVersion(
        @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> additionalPrinterColumns,
        @Nullable Boolean deprecated,
        @Nullable String deprecationWarning,
        String name,
        @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation schema,
        Boolean served,
        Boolean storage,
        @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources subresources) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.deprecated = deprecated;
        this.deprecationWarning = deprecationWarning;
        this.name = Objects.requireNonNull(name);
        this.schema = schema;
        this.served = Objects.requireNonNull(served);
        this.storage = Objects.requireNonNull(storage);
        this.subresources = subresources;
    }

    public List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return this.additionalPrinterColumns == null ? List.of() : this.additionalPrinterColumns;
    }
    public Optional<Boolean> getDeprecated() {
        return Optional.ofNullable(this.deprecated);
    }
    public Optional<String> getDeprecationWarning() {
        return Optional.ofNullable(this.deprecationWarning);
    }
    public String getName() {
        return this.name;
    }
    public Optional<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    public Boolean getServed() {
        return this.served;
    }
    public Boolean getStorage() {
        return this.storage;
    }
    public Optional<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources> getSubresources() {
        return Optional.ofNullable(this.subresources);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> additionalPrinterColumns;
        private @Nullable Boolean deprecated;
        private @Nullable String deprecationWarning;
        private String name;
        private @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation schema;
        private Boolean served;
        private Boolean storage;
        private @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources subresources;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalPrinterColumns = defaults.additionalPrinterColumns;
    	      this.deprecated = defaults.deprecated;
    	      this.deprecationWarning = defaults.deprecationWarning;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
    	      this.served = defaults.served;
    	      this.storage = defaults.storage;
    	      this.subresources = defaults.subresources;
        }

        public Builder setAdditionalPrinterColumns(@Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> additionalPrinterColumns) {
            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }

        public Builder setDeprecated(@Nullable Boolean deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        public Builder setDeprecationWarning(@Nullable String deprecationWarning) {
            this.deprecationWarning = deprecationWarning;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchema(@Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation schema) {
            this.schema = schema;
            return this;
        }

        public Builder setServed(Boolean served) {
            this.served = Objects.requireNonNull(served);
            return this;
        }

        public Builder setStorage(Boolean storage) {
            this.storage = Objects.requireNonNull(storage);
            return this;
        }

        public Builder setSubresources(@Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources subresources) {
            this.subresources = subresources;
            return this;
        }

        public CustomResourceDefinitionVersion build() {
            return new CustomResourceDefinitionVersion(additionalPrinterColumns, deprecated, deprecationWarning, name, schema, served, storage, subresources);
        }
    }
}
