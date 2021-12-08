// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class NetworkPolicySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicySpecArgs Empty = new NetworkPolicySpecArgs();

    @InputImport(name="egress")
    private final @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyEgressRuleArgs>> egress;

    public Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyEgressRuleArgs>> getEgress() {
        return this.egress == null ? Input.empty() : this.egress;
    }

    @InputImport(name="ingress")
    private final @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyIngressRuleArgs>> ingress;

    public Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyIngressRuleArgs>> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    @InputImport(name="podSelector", required=true)
    private final Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> podSelector;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> getPodSelector() {
        return this.podSelector;
    }

    @InputImport(name="policyTypes")
    private final @Nullable Input<List<String>> policyTypes;

    public Input<List<String>> getPolicyTypes() {
        return this.policyTypes == null ? Input.empty() : this.policyTypes;
    }

    public NetworkPolicySpecArgs(
        @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyEgressRuleArgs>> egress,
        @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyIngressRuleArgs>> ingress,
        Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> podSelector,
        @Nullable Input<List<String>> policyTypes) {
        this.egress = egress;
        this.ingress = ingress;
        this.podSelector = Objects.requireNonNull(podSelector, "expected parameter 'podSelector' to be non-null");
        this.policyTypes = policyTypes;
    }

    private NetworkPolicySpecArgs() {
        this.egress = Input.empty();
        this.ingress = Input.empty();
        this.podSelector = Input.empty();
        this.policyTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyEgressRuleArgs>> egress;
        private @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyIngressRuleArgs>> ingress;
        private Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> podSelector;
        private @Nullable Input<List<String>> policyTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egress = defaults.egress;
    	      this.ingress = defaults.ingress;
    	      this.podSelector = defaults.podSelector;
    	      this.policyTypes = defaults.policyTypes;
        }

        public Builder setEgress(@Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyEgressRuleArgs>> egress) {
            this.egress = egress;
            return this;
        }

        public Builder setEgress(@Nullable List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyEgressRuleArgs> egress) {
            this.egress = Input.ofNullable(egress);
            return this;
        }

        public Builder setIngress(@Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyIngressRuleArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder setIngress(@Nullable List<io.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyIngressRuleArgs> ingress) {
            this.ingress = Input.ofNullable(ingress);
            return this;
        }

        public Builder setPodSelector(Input<io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs> podSelector) {
            this.podSelector = Objects.requireNonNull(podSelector);
            return this;
        }

        public Builder setPodSelector(io.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs podSelector) {
            this.podSelector = Input.of(Objects.requireNonNull(podSelector));
            return this;
        }

        public Builder setPolicyTypes(@Nullable Input<List<String>> policyTypes) {
            this.policyTypes = policyTypes;
            return this;
        }

        public Builder setPolicyTypes(@Nullable List<String> policyTypes) {
            this.policyTypes = Input.ofNullable(policyTypes);
            return this;
        }

        public NetworkPolicySpecArgs build() {
            return new NetworkPolicySpecArgs(egress, ingress, podSelector, policyTypes);
        }
    }
}
