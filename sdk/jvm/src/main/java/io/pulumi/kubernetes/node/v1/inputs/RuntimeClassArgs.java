// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class RuntimeClassArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeClassArgs Empty = new RuntimeClassArgs();

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="handler", required=true)
    private final Input<String> handler;

    public Input<String> getHandler() {
        return this.handler;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="overhead")
    private final @Nullable Input<io.pulumi.kubernetes.node.v1.inputs.OverheadArgs> overhead;

    public Input<io.pulumi.kubernetes.node.v1.inputs.OverheadArgs> getOverhead() {
        return this.overhead == null ? Input.empty() : this.overhead;
    }

    @InputImport(name="scheduling")
    private final @Nullable Input<io.pulumi.kubernetes.node.v1.inputs.SchedulingArgs> scheduling;

    public Input<io.pulumi.kubernetes.node.v1.inputs.SchedulingArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    public RuntimeClassArgs(
        @Nullable Input<String> apiVersion,
        Input<String> handler,
        @Nullable Input<String> kind,
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata,
        @Nullable Input<io.pulumi.kubernetes.node.v1.inputs.OverheadArgs> overhead,
        @Nullable Input<io.pulumi.kubernetes.node.v1.inputs.SchedulingArgs> scheduling) {
        this.apiVersion = apiVersion;
        this.handler = Objects.requireNonNull(handler, "expected parameter 'handler' to be non-null");
        this.kind = kind;
        this.metadata = metadata;
        this.overhead = overhead;
        this.scheduling = scheduling;
    }

    private RuntimeClassArgs() {
        this.apiVersion = Input.empty();
        this.handler = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.overhead = Input.empty();
        this.scheduling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private Input<String> handler;
        private @Nullable Input<String> kind;
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;
        private @Nullable Input<io.pulumi.kubernetes.node.v1.inputs.OverheadArgs> overhead;
        private @Nullable Input<io.pulumi.kubernetes.node.v1.inputs.SchedulingArgs> scheduling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.handler = defaults.handler;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.overhead = defaults.overhead;
    	      this.scheduling = defaults.scheduling;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setHandler(Input<String> handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }

        public Builder setHandler(String handler) {
            this.handler = Input.of(Objects.requireNonNull(handler));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setOverhead(@Nullable Input<io.pulumi.kubernetes.node.v1.inputs.OverheadArgs> overhead) {
            this.overhead = overhead;
            return this;
        }

        public Builder setOverhead(@Nullable io.pulumi.kubernetes.node.v1.inputs.OverheadArgs overhead) {
            this.overhead = Input.ofNullable(overhead);
            return this;
        }

        public Builder setScheduling(@Nullable Input<io.pulumi.kubernetes.node.v1.inputs.SchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setScheduling(@Nullable io.pulumi.kubernetes.node.v1.inputs.SchedulingArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }

        public RuntimeClassArgs build() {
            return new RuntimeClassArgs(apiVersion, handler, kind, metadata, overhead, scheduling);
        }
    }
}
