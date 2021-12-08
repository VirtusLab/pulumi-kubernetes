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


public final class NetworkPolicyPeerArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPeerArgs Empty = new NetworkPolicyPeerArgs();

    @InputImport(name="ipBlock")
    private final @Nullable Input<io.pulumi.kubernetes.networking.v1.inputs.IPBlockArgs> ipBlock;

    public Input<io.pulumi.kubernetes.networking.v1.inputs.IPBlockArgs> getIpBlock() {
        return this.ipBlock == null ? Input.empty() : this.ipBlock;
    }

    @InputImport(name="namespaceSelector")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> namespaceSelector;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> getNamespaceSelector() {
        return this.namespaceSelector == null ? Input.empty() : this.namespaceSelector;
    }

    @InputImport(name="podSelector")
    private final @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> podSelector;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> getPodSelector() {
        return this.podSelector == null ? Input.empty() : this.podSelector;
    }

    public NetworkPolicyPeerArgs(
        @Nullable Input<io.pulumi.kubernetes.networking.v1.inputs.IPBlockArgs> ipBlock,
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> namespaceSelector,
        @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> podSelector) {
        this.ipBlock = ipBlock;
        this.namespaceSelector = namespaceSelector;
        this.podSelector = podSelector;
    }

    private NetworkPolicyPeerArgs() {
        this.ipBlock = Input.empty();
        this.namespaceSelector = Input.empty();
        this.podSelector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.networking.v1.inputs.IPBlockArgs> ipBlock;
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> namespaceSelector;
        private @Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> podSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPeerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlock = defaults.ipBlock;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.podSelector = defaults.podSelector;
        }

        public Builder setIpBlock(@Nullable Input<io.pulumi.kubernetes.networking.v1.inputs.IPBlockArgs> ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }

        public Builder setIpBlock(@Nullable io.pulumi.kubernetes.networking.v1.inputs.IPBlockArgs ipBlock) {
            this.ipBlock = Input.ofNullable(ipBlock);
            return this;
        }

        public Builder setNamespaceSelector(@Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder setNamespaceSelector(@Nullable io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs namespaceSelector) {
            this.namespaceSelector = Input.ofNullable(namespaceSelector);
            return this;
        }

        public Builder setPodSelector(@Nullable Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> podSelector) {
            this.podSelector = podSelector;
            return this;
        }

        public Builder setPodSelector(@Nullable io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs podSelector) {
            this.podSelector = Input.ofNullable(podSelector);
            return this;
        }

        public NetworkPolicyPeerArgs build() {
            return new NetworkPolicyPeerArgs(ipBlock, namespaceSelector, podSelector);
        }
    }
}
