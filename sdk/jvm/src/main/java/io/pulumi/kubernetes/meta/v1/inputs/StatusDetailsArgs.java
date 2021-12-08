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


public final class StatusDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusDetailsArgs Empty = new StatusDetailsArgs();

    @InputImport(name="causes")
    private final @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.StatusCauseArgs>> causes;

    public Input<List<io.pulumi.kubernetes.meta.v1.inputs.StatusCauseArgs>> getCauses() {
        return this.causes == null ? Input.empty() : this.causes;
    }

    @InputImport(name="group")
    private final @Nullable Input<String> group;

    public Input<String> getGroup() {
        return this.group == null ? Input.empty() : this.group;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="retryAfterSeconds")
    private final @Nullable Input<Integer> retryAfterSeconds;

    public Input<Integer> getRetryAfterSeconds() {
        return this.retryAfterSeconds == null ? Input.empty() : this.retryAfterSeconds;
    }

    @InputImport(name="uid")
    private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public StatusDetailsArgs(
        @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.StatusCauseArgs>> causes,
        @Nullable Input<String> group,
        @Nullable Input<String> kind,
        @Nullable Input<String> name,
        @Nullable Input<Integer> retryAfterSeconds,
        @Nullable Input<String> uid) {
        this.causes = causes;
        this.group = group;
        this.kind = kind;
        this.name = name;
        this.retryAfterSeconds = retryAfterSeconds;
        this.uid = uid;
    }

    private StatusDetailsArgs() {
        this.causes = Input.empty();
        this.group = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.retryAfterSeconds = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.StatusCauseArgs>> causes;
        private @Nullable Input<String> group;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> retryAfterSeconds;
        private @Nullable Input<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.causes = defaults.causes;
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.retryAfterSeconds = defaults.retryAfterSeconds;
    	      this.uid = defaults.uid;
        }

        public Builder setCauses(@Nullable Input<List<io.pulumi.kubernetes.meta.v1.inputs.StatusCauseArgs>> causes) {
            this.causes = causes;
            return this;
        }

        public Builder setCauses(@Nullable List<io.pulumi.kubernetes.meta.v1.inputs.StatusCauseArgs> causes) {
            this.causes = Input.ofNullable(causes);
            return this;
        }

        public Builder setGroup(@Nullable Input<String> group) {
            this.group = group;
            return this;
        }

        public Builder setGroup(@Nullable String group) {
            this.group = Input.ofNullable(group);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRetryAfterSeconds(@Nullable Input<Integer> retryAfterSeconds) {
            this.retryAfterSeconds = retryAfterSeconds;
            return this;
        }

        public Builder setRetryAfterSeconds(@Nullable Integer retryAfterSeconds) {
            this.retryAfterSeconds = Input.ofNullable(retryAfterSeconds);
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

        public StatusDetailsArgs build() {
            return new StatusDetailsArgs(causes, group, kind, name, retryAfterSeconds, uid);
        }
    }
}
