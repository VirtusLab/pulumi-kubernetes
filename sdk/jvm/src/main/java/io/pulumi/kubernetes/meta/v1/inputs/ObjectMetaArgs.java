// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class ObjectMetaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectMetaArgs Empty = new ObjectMetaArgs();

    @InputImport(name="annotations")
    private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="clusterName")
    private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    @InputImport(name="creationTimestamp")
    private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    @InputImport(name="deletionGracePeriodSeconds")
    private final @Nullable Input<Integer> deletionGracePeriodSeconds;

    public Input<Integer> getDeletionGracePeriodSeconds() {
        return this.deletionGracePeriodSeconds == null ? Input.empty() : this.deletionGracePeriodSeconds;
    }

    @InputImport(name="deletionTimestamp")
    private final @Nullable Input<String> deletionTimestamp;

    public Input<String> getDeletionTimestamp() {
        return this.deletionTimestamp == null ? Input.empty() : this.deletionTimestamp;
    }

    @InputImport(name="finalizers")
    private final @Nullable Input<List<String>> finalizers;

    public Input<List<String>> getFinalizers() {
        return this.finalizers == null ? Input.empty() : this.finalizers;
    }

    @InputImport(name="generateName")
    private final @Nullable Input<String> generateName;

    public Input<String> getGenerateName() {
        return this.generateName == null ? Input.empty() : this.generateName;
    }

    @InputImport(name="generation")
    private final @Nullable Input<Integer> generation;

    public Input<Integer> getGeneration() {
        return this.generation == null ? Input.empty() : this.generation;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="managedFields")
    private final @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.ManagedFieldsEntryArgs>> managedFields;

    public Input<List<io.pulumi.kubernetes.meta.v1.inputs.ManagedFieldsEntryArgs>> getManagedFields() {
        return this.managedFields == null ? Input.empty() : this.managedFields;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    @InputImport(name="ownerReferences")
    private final @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.OwnerReferenceArgs>> ownerReferences;

    public Input<List<io.pulumi.kubernetes.meta.v1.inputs.OwnerReferenceArgs>> getOwnerReferences() {
        return this.ownerReferences == null ? Input.empty() : this.ownerReferences;
    }

    @InputImport(name="resourceVersion")
    private final @Nullable Input<String> resourceVersion;

    public Input<String> getResourceVersion() {
        return this.resourceVersion == null ? Input.empty() : this.resourceVersion;
    }

    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    @InputImport(name="uid")
    private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public ObjectMetaArgs(
        @Nullable Input<Map<String,String>> annotations,
        @Nullable Input<String> clusterName,
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<Integer> deletionGracePeriodSeconds,
        @Nullable Input<String> deletionTimestamp,
        @Nullable Input<List<String>> finalizers,
        @Nullable Input<String> generateName,
        @Nullable Input<Integer> generation,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.ManagedFieldsEntryArgs>> managedFields,
        @Nullable Input<String> name,
        @Nullable Input<String> namespace,
        @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.OwnerReferenceArgs>> ownerReferences,
        @Nullable Input<String> resourceVersion,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> uid) {
        this.annotations = annotations;
        this.clusterName = clusterName;
        this.creationTimestamp = creationTimestamp;
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
        this.deletionTimestamp = deletionTimestamp;
        this.finalizers = finalizers;
        this.generateName = generateName;
        this.generation = generation;
        this.labels = labels;
        this.managedFields = managedFields;
        this.name = name;
        this.namespace = namespace;
        this.ownerReferences = ownerReferences;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    private ObjectMetaArgs() {
        this.annotations = Input.empty();
        this.clusterName = Input.empty();
        this.creationTimestamp = Input.empty();
        this.deletionGracePeriodSeconds = Input.empty();
        this.deletionTimestamp = Input.empty();
        this.finalizers = Input.empty();
        this.generateName = Input.empty();
        this.generation = Input.empty();
        this.labels = Input.empty();
        this.managedFields = Input.empty();
        this.name = Input.empty();
        this.namespace = Input.empty();
        this.ownerReferences = Input.empty();
        this.resourceVersion = Input.empty();
        this.selfLink = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<Integer> deletionGracePeriodSeconds;
        private @Nullable Input<String> deletionTimestamp;
        private @Nullable Input<List<String>> finalizers;
        private @Nullable Input<String> generateName;
        private @Nullable Input<Integer> generation;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.ManagedFieldsEntryArgs>> managedFields;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespace;
        private @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.OwnerReferenceArgs>> ownerReferences;
        private @Nullable Input<String> resourceVersion;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterName = defaults.clusterName;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.deletionGracePeriodSeconds = defaults.deletionGracePeriodSeconds;
    	      this.deletionTimestamp = defaults.deletionTimestamp;
    	      this.finalizers = defaults.finalizers;
    	      this.generateName = defaults.generateName;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.managedFields = defaults.managedFields;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.ownerReferences = defaults.ownerReferences;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        public Builder setAnnotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDeletionGracePeriodSeconds(@Nullable Input<Integer> deletionGracePeriodSeconds) {
            this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
            return this;
        }

        public Builder setDeletionGracePeriodSeconds(@Nullable Integer deletionGracePeriodSeconds) {
            this.deletionGracePeriodSeconds = Input.ofNullable(deletionGracePeriodSeconds);
            return this;
        }

        public Builder setDeletionTimestamp(@Nullable Input<String> deletionTimestamp) {
            this.deletionTimestamp = deletionTimestamp;
            return this;
        }

        public Builder setDeletionTimestamp(@Nullable String deletionTimestamp) {
            this.deletionTimestamp = Input.ofNullable(deletionTimestamp);
            return this;
        }

        public Builder setFinalizers(@Nullable Input<List<String>> finalizers) {
            this.finalizers = finalizers;
            return this;
        }

        public Builder setFinalizers(@Nullable List<String> finalizers) {
            this.finalizers = Input.ofNullable(finalizers);
            return this;
        }

        public Builder setGenerateName(@Nullable Input<String> generateName) {
            this.generateName = generateName;
            return this;
        }

        public Builder setGenerateName(@Nullable String generateName) {
            this.generateName = Input.ofNullable(generateName);
            return this;
        }

        public Builder setGeneration(@Nullable Input<Integer> generation) {
            this.generation = generation;
            return this;
        }

        public Builder setGeneration(@Nullable Integer generation) {
            this.generation = Input.ofNullable(generation);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setManagedFields(@Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.ManagedFieldsEntryArgs>> managedFields) {
            this.managedFields = managedFields;
            return this;
        }

        public Builder setManagedFields(@Nullable List<io.pulumi.kubernetes.meta.v1.inputs.ManagedFieldsEntryArgs> managedFields) {
            this.managedFields = Input.ofNullable(managedFields);
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

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder setOwnerReferences(@Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.OwnerReferenceArgs>> ownerReferences) {
            this.ownerReferences = ownerReferences;
            return this;
        }

        public Builder setOwnerReferences(@Nullable List<io.pulumi.kubernetes.meta.v1.inputs.OwnerReferenceArgs> ownerReferences) {
            this.ownerReferences = Input.ofNullable(ownerReferences);
            return this;
        }

        public Builder setResourceVersion(@Nullable Input<String> resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        public Builder setResourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = Input.ofNullable(resourceVersion);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setUid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }

        public ObjectMetaArgs build() {
            return new ObjectMetaArgs(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, managedFields, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
        }
    }
}
