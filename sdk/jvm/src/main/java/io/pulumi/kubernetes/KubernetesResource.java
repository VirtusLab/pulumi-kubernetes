package io.pulumi.kubernetes;

import io.pulumi.resources.CustomResource;
import io.pulumi.resources.CustomResourceOptions;
import io.pulumi.resources.ResourceArgs;

import javax.annotation.Nullable;

// TODO
public abstract class KubernetesResource extends CustomResource {
    protected KubernetesResource(String type, String name, @Nullable ResourceArgs args, boolean dependency) {
        super(type, name, args, dependency);
    }

    protected KubernetesResource(String type, String name, @Nullable ResourceArgs args, @Nullable CustomResourceOptions options) {
        super(type, name, args, options);
    }

    protected KubernetesResource(String type, String name, @Nullable ResourceArgs args, @Nullable CustomResourceOptions options, boolean dependency) {
        super(type, name, args, options, dependency);
    }

    // TODO
}