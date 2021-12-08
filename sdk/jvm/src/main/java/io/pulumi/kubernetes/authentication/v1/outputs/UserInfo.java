// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.v1.outputs;

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
public final class UserInfo {
    private final @Nullable Map<String,List<String>> extra;
    private final @Nullable List<String> groups;
    private final @Nullable String uid;
    private final @Nullable String username;

    @OutputCustomType.Constructor({"extra","groups","uid","username"})
    private UserInfo(
        @Nullable Map<String,List<String>> extra,
        @Nullable List<String> groups,
        @Nullable String uid,
        @Nullable String username) {
        this.extra = extra;
        this.groups = groups;
        this.uid = uid;
        this.username = username;
    }

    public Map<String,List<String>> getExtra() {
        return this.extra == null ? Map.of() : this.extra;
    }
    public List<String> getGroups() {
        return this.groups == null ? List.of() : this.groups;
    }
    public Optional<String> getUid() {
        return Optional.ofNullable(this.uid);
    }
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,List<String>> extra;
        private @Nullable List<String> groups;
        private @Nullable String uid;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.uid = defaults.uid;
    	      this.username = defaults.username;
        }

        public Builder setExtra(@Nullable Map<String,List<String>> extra) {
            this.extra = extra;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public UserInfo build() {
            return new UserInfo(extra, groups, uid, username);
        }
    }
}
