// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core.v1.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.kubernetes.Utilities;


public final class EventArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventArgs Empty = new EventArgs();

    @InputImport(name="action")
    private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="count")
    private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    @InputImport(name="eventTime")
    private final @Nullable Input<String> eventTime;

    public Input<String> getEventTime() {
        return this.eventTime == null ? Input.empty() : this.eventTime;
    }

    @InputImport(name="firstTimestamp")
    private final @Nullable Input<String> firstTimestamp;

    public Input<String> getFirstTimestamp() {
        return this.firstTimestamp == null ? Input.empty() : this.firstTimestamp;
    }

    @InputImport(name="involvedObject", required=true)
    private final Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> involvedObject;

    public Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> getInvolvedObject() {
        return this.involvedObject;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="lastTimestamp")
    private final @Nullable Input<String> lastTimestamp;

    public Input<String> getLastTimestamp() {
        return this.lastTimestamp == null ? Input.empty() : this.lastTimestamp;
    }

    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="metadata", required=true)
    private final Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;

    public Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> getMetadata() {
        return this.metadata;
    }

    @InputImport(name="reason")
    private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    @InputImport(name="related")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> related;

    public Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> getRelated() {
        return this.related == null ? Input.empty() : this.related;
    }

    @InputImport(name="reportingComponent")
    private final @Nullable Input<String> reportingComponent;

    public Input<String> getReportingComponent() {
        return this.reportingComponent == null ? Input.empty() : this.reportingComponent;
    }

    @InputImport(name="reportingInstance")
    private final @Nullable Input<String> reportingInstance;

    public Input<String> getReportingInstance() {
        return this.reportingInstance == null ? Input.empty() : this.reportingInstance;
    }

    @InputImport(name="series")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.EventSeriesArgs> series;

    public Input<io.pulumi.kubernetes.core.v1.inputs.EventSeriesArgs> getSeries() {
        return this.series == null ? Input.empty() : this.series;
    }

    @InputImport(name="source")
    private final @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.EventSourceArgs> source;

    public Input<io.pulumi.kubernetes.core.v1.inputs.EventSourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public EventArgs(
        @Nullable Input<String> action,
        @Nullable Input<String> apiVersion,
        @Nullable Input<Integer> count,
        @Nullable Input<String> eventTime,
        @Nullable Input<String> firstTimestamp,
        Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> involvedObject,
        @Nullable Input<String> kind,
        @Nullable Input<String> lastTimestamp,
        @Nullable Input<String> message,
        Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata,
        @Nullable Input<String> reason,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> related,
        @Nullable Input<String> reportingComponent,
        @Nullable Input<String> reportingInstance,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.EventSeriesArgs> series,
        @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.EventSourceArgs> source,
        @Nullable Input<String> type) {
        this.action = action;
        this.apiVersion = apiVersion;
        this.count = count;
        this.eventTime = eventTime;
        this.firstTimestamp = firstTimestamp;
        this.involvedObject = Objects.requireNonNull(involvedObject, "expected parameter 'involvedObject' to be non-null");
        this.kind = kind;
        this.lastTimestamp = lastTimestamp;
        this.message = message;
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.reason = reason;
        this.related = related;
        this.reportingComponent = reportingComponent;
        this.reportingInstance = reportingInstance;
        this.series = series;
        this.source = source;
        this.type = type;
    }

    private EventArgs() {
        this.action = Input.empty();
        this.apiVersion = Input.empty();
        this.count = Input.empty();
        this.eventTime = Input.empty();
        this.firstTimestamp = Input.empty();
        this.involvedObject = Input.empty();
        this.kind = Input.empty();
        this.lastTimestamp = Input.empty();
        this.message = Input.empty();
        this.metadata = Input.empty();
        this.reason = Input.empty();
        this.related = Input.empty();
        this.reportingComponent = Input.empty();
        this.reportingInstance = Input.empty();
        this.series = Input.empty();
        this.source = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<Integer> count;
        private @Nullable Input<String> eventTime;
        private @Nullable Input<String> firstTimestamp;
        private Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> involvedObject;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> lastTimestamp;
        private @Nullable Input<String> message;
        private Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata;
        private @Nullable Input<String> reason;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> related;
        private @Nullable Input<String> reportingComponent;
        private @Nullable Input<String> reportingInstance;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.EventSeriesArgs> series;
        private @Nullable Input<io.pulumi.kubernetes.core.v1.inputs.EventSourceArgs> source;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.apiVersion = defaults.apiVersion;
    	      this.count = defaults.count;
    	      this.eventTime = defaults.eventTime;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.involvedObject = defaults.involvedObject;
    	      this.kind = defaults.kind;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.metadata = defaults.metadata;
    	      this.reason = defaults.reason;
    	      this.related = defaults.related;
    	      this.reportingComponent = defaults.reportingComponent;
    	      this.reportingInstance = defaults.reportingInstance;
    	      this.series = defaults.series;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setEventTime(@Nullable Input<String> eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        public Builder setEventTime(@Nullable String eventTime) {
            this.eventTime = Input.ofNullable(eventTime);
            return this;
        }

        public Builder setFirstTimestamp(@Nullable Input<String> firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }

        public Builder setFirstTimestamp(@Nullable String firstTimestamp) {
            this.firstTimestamp = Input.ofNullable(firstTimestamp);
            return this;
        }

        public Builder setInvolvedObject(Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> involvedObject) {
            this.involvedObject = Objects.requireNonNull(involvedObject);
            return this;
        }

        public Builder setInvolvedObject(io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs involvedObject) {
            this.involvedObject = Input.of(Objects.requireNonNull(involvedObject));
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

        public Builder setLastTimestamp(@Nullable Input<String> lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        public Builder setLastTimestamp(@Nullable String lastTimestamp) {
            this.lastTimestamp = Input.ofNullable(lastTimestamp);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setMetadata(Input<io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMetadata(io.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs metadata) {
            this.metadata = Input.of(Objects.requireNonNull(metadata));
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public Builder setRelated(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs> related) {
            this.related = related;
            return this;
        }

        public Builder setRelated(@Nullable io.pulumi.kubernetes.core.v1.inputs.ObjectReferenceArgs related) {
            this.related = Input.ofNullable(related);
            return this;
        }

        public Builder setReportingComponent(@Nullable Input<String> reportingComponent) {
            this.reportingComponent = reportingComponent;
            return this;
        }

        public Builder setReportingComponent(@Nullable String reportingComponent) {
            this.reportingComponent = Input.ofNullable(reportingComponent);
            return this;
        }

        public Builder setReportingInstance(@Nullable Input<String> reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }

        public Builder setReportingInstance(@Nullable String reportingInstance) {
            this.reportingInstance = Input.ofNullable(reportingInstance);
            return this;
        }

        public Builder setSeries(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.EventSeriesArgs> series) {
            this.series = series;
            return this;
        }

        public Builder setSeries(@Nullable io.pulumi.kubernetes.core.v1.inputs.EventSeriesArgs series) {
            this.series = Input.ofNullable(series);
            return this;
        }

        public Builder setSource(@Nullable Input<io.pulumi.kubernetes.core.v1.inputs.EventSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable io.pulumi.kubernetes.core.v1.inputs.EventSourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public EventArgs build() {
            return new EventArgs(action, apiVersion, count, eventTime, firstTimestamp, involvedObject, kind, lastTimestamp, message, metadata, reason, related, reportingComponent, reportingInstance, series, source, type);
        }
    }
}
