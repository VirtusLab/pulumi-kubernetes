// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// FlowSchemaList is a list of FlowSchema objects.
type FlowSchemaList struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// `items` is a list of FlowSchemas.
	Items FlowSchemaTypeArrayOutput `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// `metadata` is the standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaPtrOutput `pulumi:"metadata"`
}

// NewFlowSchemaList registers a new resource with the given unique name, arguments, and options.
func NewFlowSchemaList(ctx *pulumi.Context,
	name string, args *FlowSchemaListArgs, opts ...pulumi.ResourceOption) (*FlowSchemaList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Items == nil {
		return nil, errors.New("invalid value for required argument 'Items'")
	}
	args.ApiVersion = pulumi.StringPtr("flowcontrol.apiserver.k8s.io/v1beta1")
	args.Kind = pulumi.StringPtr("FlowSchemaList")
	var resource FlowSchemaList
	err := ctx.RegisterResource("kubernetes:flowcontrol.apiserver.k8s.io/v1beta1:FlowSchemaList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFlowSchemaList gets an existing FlowSchemaList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFlowSchemaList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FlowSchemaListState, opts ...pulumi.ResourceOption) (*FlowSchemaList, error) {
	var resource FlowSchemaList
	err := ctx.ReadResource("kubernetes:flowcontrol.apiserver.k8s.io/v1beta1:FlowSchemaList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FlowSchemaList resources.
type flowSchemaListState struct {
}

type FlowSchemaListState struct {
}

func (FlowSchemaListState) ElementType() reflect.Type {
	return reflect.TypeOf((*flowSchemaListState)(nil)).Elem()
}

type flowSchemaListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// `items` is a list of FlowSchemas.
	Items []FlowSchemaType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// `metadata` is the standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

// The set of arguments for constructing a FlowSchemaList resource.
type FlowSchemaListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// `items` is a list of FlowSchemas.
	Items FlowSchemaTypeArrayInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// `metadata` is the standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ListMetaPtrInput
}

func (FlowSchemaListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*flowSchemaListArgs)(nil)).Elem()
}

type FlowSchemaListInput interface {
	pulumi.Input

	ToFlowSchemaListOutput() FlowSchemaListOutput
	ToFlowSchemaListOutputWithContext(ctx context.Context) FlowSchemaListOutput
}

func (*FlowSchemaList) ElementType() reflect.Type {
	return reflect.TypeOf((**FlowSchemaList)(nil)).Elem()
}

func (i *FlowSchemaList) ToFlowSchemaListOutput() FlowSchemaListOutput {
	return i.ToFlowSchemaListOutputWithContext(context.Background())
}

func (i *FlowSchemaList) ToFlowSchemaListOutputWithContext(ctx context.Context) FlowSchemaListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowSchemaListOutput)
}

// FlowSchemaListArrayInput is an input type that accepts FlowSchemaListArray and FlowSchemaListArrayOutput values.
// You can construct a concrete instance of `FlowSchemaListArrayInput` via:
//
//          FlowSchemaListArray{ FlowSchemaListArgs{...} }
type FlowSchemaListArrayInput interface {
	pulumi.Input

	ToFlowSchemaListArrayOutput() FlowSchemaListArrayOutput
	ToFlowSchemaListArrayOutputWithContext(context.Context) FlowSchemaListArrayOutput
}

type FlowSchemaListArray []FlowSchemaListInput

func (FlowSchemaListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlowSchemaList)(nil)).Elem()
}

func (i FlowSchemaListArray) ToFlowSchemaListArrayOutput() FlowSchemaListArrayOutput {
	return i.ToFlowSchemaListArrayOutputWithContext(context.Background())
}

func (i FlowSchemaListArray) ToFlowSchemaListArrayOutputWithContext(ctx context.Context) FlowSchemaListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowSchemaListArrayOutput)
}

// FlowSchemaListMapInput is an input type that accepts FlowSchemaListMap and FlowSchemaListMapOutput values.
// You can construct a concrete instance of `FlowSchemaListMapInput` via:
//
//          FlowSchemaListMap{ "key": FlowSchemaListArgs{...} }
type FlowSchemaListMapInput interface {
	pulumi.Input

	ToFlowSchemaListMapOutput() FlowSchemaListMapOutput
	ToFlowSchemaListMapOutputWithContext(context.Context) FlowSchemaListMapOutput
}

type FlowSchemaListMap map[string]FlowSchemaListInput

func (FlowSchemaListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlowSchemaList)(nil)).Elem()
}

func (i FlowSchemaListMap) ToFlowSchemaListMapOutput() FlowSchemaListMapOutput {
	return i.ToFlowSchemaListMapOutputWithContext(context.Background())
}

func (i FlowSchemaListMap) ToFlowSchemaListMapOutputWithContext(ctx context.Context) FlowSchemaListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowSchemaListMapOutput)
}

type FlowSchemaListOutput struct{ *pulumi.OutputState }

func (FlowSchemaListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FlowSchemaList)(nil)).Elem()
}

func (o FlowSchemaListOutput) ToFlowSchemaListOutput() FlowSchemaListOutput {
	return o
}

func (o FlowSchemaListOutput) ToFlowSchemaListOutputWithContext(ctx context.Context) FlowSchemaListOutput {
	return o
}

type FlowSchemaListArrayOutput struct{ *pulumi.OutputState }

func (FlowSchemaListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlowSchemaList)(nil)).Elem()
}

func (o FlowSchemaListArrayOutput) ToFlowSchemaListArrayOutput() FlowSchemaListArrayOutput {
	return o
}

func (o FlowSchemaListArrayOutput) ToFlowSchemaListArrayOutputWithContext(ctx context.Context) FlowSchemaListArrayOutput {
	return o
}

func (o FlowSchemaListArrayOutput) Index(i pulumi.IntInput) FlowSchemaListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FlowSchemaList {
		return vs[0].([]*FlowSchemaList)[vs[1].(int)]
	}).(FlowSchemaListOutput)
}

type FlowSchemaListMapOutput struct{ *pulumi.OutputState }

func (FlowSchemaListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlowSchemaList)(nil)).Elem()
}

func (o FlowSchemaListMapOutput) ToFlowSchemaListMapOutput() FlowSchemaListMapOutput {
	return o
}

func (o FlowSchemaListMapOutput) ToFlowSchemaListMapOutputWithContext(ctx context.Context) FlowSchemaListMapOutput {
	return o
}

func (o FlowSchemaListMapOutput) MapIndex(k pulumi.StringInput) FlowSchemaListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FlowSchemaList {
		return vs[0].(map[string]*FlowSchemaList)[vs[1].(string)]
	}).(FlowSchemaListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FlowSchemaListInput)(nil)).Elem(), &FlowSchemaList{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlowSchemaListArrayInput)(nil)).Elem(), FlowSchemaListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlowSchemaListMapInput)(nil)).Elem(), FlowSchemaListMap{})
	pulumi.RegisterOutputType(FlowSchemaListOutput{})
	pulumi.RegisterOutputType(FlowSchemaListArrayOutput{})
	pulumi.RegisterOutputType(FlowSchemaListMapOutput{})
}
