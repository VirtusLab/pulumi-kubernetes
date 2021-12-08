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


public final class IngressSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressSpecArgs Empty = new IngressSpecArgs();

    @InputImport(name="backend")
    private final @Nullable Input<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressBackendArgs> backend;

    public Input<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressBackendArgs> getBackend() {
        return this.backend == null ? Input.empty() : this.backend;
    }

    @InputImport(name="ingressClassName")
    private final @Nullable Input<String> ingressClassName;

    public Input<String> getIngressClassName() {
        return this.ingressClassName == null ? Input.empty() : this.ingressClassName;
    }

    @InputImport(name="rules")
    private final @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressRuleArgs>> rules;

    public Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    @InputImport(name="tls")
    private final @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressTLSArgs>> tls;

    public Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressTLSArgs>> getTls() {
        return this.tls == null ? Input.empty() : this.tls;
    }

    public IngressSpecArgs(
        @Nullable Input<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressBackendArgs> backend,
        @Nullable Input<String> ingressClassName,
        @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressRuleArgs>> rules,
        @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressTLSArgs>> tls) {
        this.backend = backend;
        this.ingressClassName = ingressClassName;
        this.rules = rules;
        this.tls = tls;
    }

    private IngressSpecArgs() {
        this.backend = Input.empty();
        this.ingressClassName = Input.empty();
        this.rules = Input.empty();
        this.tls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressBackendArgs> backend;
        private @Nullable Input<String> ingressClassName;
        private @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressRuleArgs>> rules;
        private @Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressTLSArgs>> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.ingressClassName = defaults.ingressClassName;
    	      this.rules = defaults.rules;
    	      this.tls = defaults.tls;
        }

        public Builder setBackend(@Nullable Input<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressBackendArgs> backend) {
            this.backend = backend;
            return this;
        }

        public Builder setBackend(@Nullable io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressBackendArgs backend) {
            this.backend = Input.ofNullable(backend);
            return this;
        }

        public Builder setIngressClassName(@Nullable Input<String> ingressClassName) {
            this.ingressClassName = ingressClassName;
            return this;
        }

        public Builder setIngressClassName(@Nullable String ingressClassName) {
            this.ingressClassName = Input.ofNullable(ingressClassName);
            return this;
        }

        public Builder setRules(@Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setTls(@Nullable Input<List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressTLSArgs>> tls) {
            this.tls = tls;
            return this;
        }

        public Builder setTls(@Nullable List<io.pulumi.kubernetes.extensions.v1beta1.inputs.IngressTLSArgs> tls) {
            this.tls = Input.ofNullable(tls);
            return this;
        }

        public IngressSpecArgs build() {
            return new IngressSpecArgs(backend, ingressClassName, rules, tls);
        }
    }
}
