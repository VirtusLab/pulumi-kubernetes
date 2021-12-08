// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.v1beta1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class HTTPIngressRuleValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final HTTPIngressRuleValueArgs Empty = new HTTPIngressRuleValueArgs();

    @InputImport(name="paths", required=true)
    private final Input<List<io.pulumi.kubernetes.networking.v1beta1.inputs.HTTPIngressPathArgs>> paths;

    public Input<List<io.pulumi.kubernetes.networking.v1beta1.inputs.HTTPIngressPathArgs>> getPaths() {
        return this.paths;
    }

    public HTTPIngressRuleValueArgs(Input<List<io.pulumi.kubernetes.networking.v1beta1.inputs.HTTPIngressPathArgs>> paths) {
        this.paths = Objects.requireNonNull(paths, "expected parameter 'paths' to be non-null");
    }

    private HTTPIngressRuleValueArgs() {
        this.paths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressRuleValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<io.pulumi.kubernetes.networking.v1beta1.inputs.HTTPIngressPathArgs>> paths;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPIngressRuleValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        public Builder setPaths(Input<List<io.pulumi.kubernetes.networking.v1beta1.inputs.HTTPIngressPathArgs>> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }

        public Builder setPaths(List<io.pulumi.kubernetes.networking.v1beta1.inputs.HTTPIngressPathArgs> paths) {
            this.paths = Input.of(Objects.requireNonNull(paths));
            return this;
        }

        public HTTPIngressRuleValueArgs build() {
            return new HTTPIngressRuleValueArgs(paths);
        }
    }
}
