// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.v1beta1;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.events.v1beta1.inputs.*;

@ResourceType(type="kubernetes:events.k8s.io/v1beta1:Event")
public class Event extends io.pulumi.kubernetes.KubernetesResource {
    @OutputExport(name="action", type=String.class, parameters={})
    private Output</* @Nullable */ String> action;

    public Output</* @Nullable */ String> getAction() {
        return this.action;
    }
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="deprecatedCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deprecatedCount;

    public Output</* @Nullable */ Integer> getDeprecatedCount() {
        return this.deprecatedCount;
    }
    @OutputExport(name="deprecatedFirstTimestamp", type=String.class, parameters={})
    private Output</* @Nullable */ String> deprecatedFirstTimestamp;

    public Output</* @Nullable */ String> getDeprecatedFirstTimestamp() {
        return this.deprecatedFirstTimestamp;
    }
    @OutputExport(name="deprecatedLastTimestamp", type=String.class, parameters={})
    private Output</* @Nullable */ String> deprecatedLastTimestamp;

    public Output</* @Nullable */ String> getDeprecatedLastTimestamp() {
        return this.deprecatedLastTimestamp;
    }
    @OutputExport(name="deprecatedSource", type=io.pulumi.kubernetes.core.v1.outputs.EventSource.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.core.v1.outputs.EventSource> deprecatedSource;

    public Output</* @Nullable */ io.pulumi.kubernetes.core.v1.outputs.EventSource> getDeprecatedSource() {
        return this.deprecatedSource;
    }
    @OutputExport(name="eventTime", type=String.class, parameters={})
    private Output<String> eventTime;

    public Output<String> getEventTime() {
        return this.eventTime;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta> metadata;

    public Output</* @Nullable */ io.pulumi.kubernetes.meta.v1.outputs.ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="note", type=String.class, parameters={})
    private Output</* @Nullable */ String> note;

    public Output</* @Nullable */ String> getNote() {
        return this.note;
    }
    @OutputExport(name="reason", type=String.class, parameters={})
    private Output</* @Nullable */ String> reason;

    public Output</* @Nullable */ String> getReason() {
        return this.reason;
    }
    @OutputExport(name="regarding", type=io.pulumi.kubernetes.core.v1.outputs.ObjectReference.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.core.v1.outputs.ObjectReference> regarding;

    public Output</* @Nullable */ io.pulumi.kubernetes.core.v1.outputs.ObjectReference> getRegarding() {
        return this.regarding;
    }
    @OutputExport(name="related", type=io.pulumi.kubernetes.core.v1.outputs.ObjectReference.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.core.v1.outputs.ObjectReference> related;

    public Output</* @Nullable */ io.pulumi.kubernetes.core.v1.outputs.ObjectReference> getRelated() {
        return this.related;
    }
    @OutputExport(name="reportingController", type=String.class, parameters={})
    private Output</* @Nullable */ String> reportingController;

    public Output</* @Nullable */ String> getReportingController() {
        return this.reportingController;
    }
    @OutputExport(name="reportingInstance", type=String.class, parameters={})
    private Output</* @Nullable */ String> reportingInstance;

    public Output</* @Nullable */ String> getReportingInstance() {
        return this.reportingInstance;
    }
    @OutputExport(name="series", type=io.pulumi.kubernetes.events.v1beta1.outputs.EventSeries.class, parameters={})
    private Output</* @Nullable */ io.pulumi.kubernetes.events.v1beta1.outputs.EventSeries> series;

    public Output</* @Nullable */ io.pulumi.kubernetes.events.v1beta1.outputs.EventSeries> getSeries() {
        return this.series;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    public Event(String name, EventArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:events.k8s.io/v1beta1:Event", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private Event(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:events.k8s.io/v1beta1:Event", name, null, makeResourceOptions(options, id));
    }

    private static EventArgs makeArgs(EventArgs args) {
        var builder = args == null ? EventArgs.builder() : EventArgs.builder(args);
        return builder
            .setApiVersion("events.k8s.io/v1beta1")
            .setKind("Event")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:core/v1:Event").build()),
                Input.of(Alias.builder().setType("kubernetes:events.k8s.io/v1:Event").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Event get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Event(name, id, options);
    }
}
