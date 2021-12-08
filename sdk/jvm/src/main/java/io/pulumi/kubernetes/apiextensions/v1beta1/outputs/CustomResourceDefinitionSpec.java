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
public final class CustomResourceDefinitionSpec {
    private final @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> additionalPrinterColumns;
    private final @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceConversion conversion;
    private final String group;
    private final io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionNames names;
    private final @Nullable Boolean preserveUnknownFields;
    private final String scope;
    private final @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources subresources;
    private final @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation validation;
    private final @Nullable String version;
    private final @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionVersion> versions;

    @OutputCustomType.Constructor({"additionalPrinterColumns","conversion","group","names","preserveUnknownFields","scope","subresources","validation","version","versions"})
    private CustomResourceDefinitionSpec(
        @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> additionalPrinterColumns,
        @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceConversion conversion,
        String group,
        io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionNames names,
        @Nullable Boolean preserveUnknownFields,
        String scope,
        @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources subresources,
        @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation validation,
        @Nullable String version,
        @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionVersion> versions) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.conversion = conversion;
        this.group = Objects.requireNonNull(group);
        this.names = Objects.requireNonNull(names);
        this.preserveUnknownFields = preserveUnknownFields;
        this.scope = Objects.requireNonNull(scope);
        this.subresources = subresources;
        this.validation = validation;
        this.version = version;
        this.versions = versions;
    }

    public List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return this.additionalPrinterColumns == null ? List.of() : this.additionalPrinterColumns;
    }
    public Optional<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceConversion> getConversion() {
        return Optional.ofNullable(this.conversion);
    }
    public String getGroup() {
        return this.group;
    }
    public io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionNames getNames() {
        return this.names;
    }
    public Optional<Boolean> getPreserveUnknownFields() {
        return Optional.ofNullable(this.preserveUnknownFields);
    }
    public String getScope() {
        return this.scope;
    }
    public Optional<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources> getSubresources() {
        return Optional.ofNullable(this.subresources);
    }
    public Optional<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation> getValidation() {
        return Optional.ofNullable(this.validation);
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }
    public List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionVersion> getVersions() {
        return this.versions == null ? List.of() : this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> additionalPrinterColumns;
        private @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceConversion conversion;
        private String group;
        private io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionNames names;
        private @Nullable Boolean preserveUnknownFields;
        private String scope;
        private @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources subresources;
        private @Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation validation;
        private @Nullable String version;
        private @Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionVersion> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalPrinterColumns = defaults.additionalPrinterColumns;
    	      this.conversion = defaults.conversion;
    	      this.group = defaults.group;
    	      this.names = defaults.names;
    	      this.preserveUnknownFields = defaults.preserveUnknownFields;
    	      this.scope = defaults.scope;
    	      this.subresources = defaults.subresources;
    	      this.validation = defaults.validation;
    	      this.version = defaults.version;
    	      this.versions = defaults.versions;
        }

        public Builder setAdditionalPrinterColumns(@Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceColumnDefinition> additionalPrinterColumns) {
            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }

        public Builder setConversion(@Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceConversion conversion) {
            this.conversion = conversion;
            return this;
        }

        public Builder setGroup(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setNames(io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionNames names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setPreserveUnknownFields(@Nullable Boolean preserveUnknownFields) {
            this.preserveUnknownFields = preserveUnknownFields;
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setSubresources(@Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceSubresources subresources) {
            this.subresources = subresources;
            return this;
        }

        public Builder setValidation(@Nullable io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceValidation validation) {
            this.validation = validation;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public Builder setVersions(@Nullable List<io.pulumi.kubernetes.apiextensions.v1beta1.outputs.CustomResourceDefinitionVersion> versions) {
            this.versions = versions;
            return this;
        }

        public CustomResourceDefinitionSpec build() {
            return new CustomResourceDefinitionSpec(additionalPrinterColumns, conversion, group, names, preserveUnknownFields, scope, subresources, validation, version, versions);
        }
    }
}
