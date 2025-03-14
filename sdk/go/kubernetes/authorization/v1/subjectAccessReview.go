// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// SubjectAccessReview checks whether or not a user or group can perform an action.
type SubjectAccessReview struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// Spec holds information about the request being evaluated
	Spec SubjectAccessReviewSpecOutput `pulumi:"spec"`
	// Status is filled in by the server and indicates whether the request is allowed or not
	Status SubjectAccessReviewStatusPtrOutput `pulumi:"status"`
}

// NewSubjectAccessReview registers a new resource with the given unique name, arguments, and options.
func NewSubjectAccessReview(ctx *pulumi.Context,
	name string, args *SubjectAccessReviewArgs, opts ...pulumi.ResourceOption) (*SubjectAccessReview, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Spec == nil {
		return nil, errors.New("invalid value for required argument 'Spec'")
	}
	args.ApiVersion = pulumi.StringPtr("authorization.k8s.io/v1")
	args.Kind = pulumi.StringPtr("SubjectAccessReview")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:authorization.k8s.io/v1beta1:SubjectAccessReview"),
		},
	})
	opts = append(opts, aliases)
	var resource SubjectAccessReview
	err := ctx.RegisterResource("kubernetes:authorization.k8s.io/v1:SubjectAccessReview", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubjectAccessReview gets an existing SubjectAccessReview resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubjectAccessReview(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubjectAccessReviewState, opts ...pulumi.ResourceOption) (*SubjectAccessReview, error) {
	var resource SubjectAccessReview
	err := ctx.ReadResource("kubernetes:authorization.k8s.io/v1:SubjectAccessReview", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SubjectAccessReview resources.
type subjectAccessReviewState struct {
}

type SubjectAccessReviewState struct {
}

func (SubjectAccessReviewState) ElementType() reflect.Type {
	return reflect.TypeOf((*subjectAccessReviewState)(nil)).Elem()
}

type subjectAccessReviewArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Spec holds information about the request being evaluated
	Spec SubjectAccessReviewSpec `pulumi:"spec"`
}

// The set of arguments for constructing a SubjectAccessReview resource.
type SubjectAccessReviewArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput
	// Spec holds information about the request being evaluated
	Spec SubjectAccessReviewSpecInput
}

func (SubjectAccessReviewArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subjectAccessReviewArgs)(nil)).Elem()
}

type SubjectAccessReviewInput interface {
	pulumi.Input

	ToSubjectAccessReviewOutput() SubjectAccessReviewOutput
	ToSubjectAccessReviewOutputWithContext(ctx context.Context) SubjectAccessReviewOutput
}

func (*SubjectAccessReview) ElementType() reflect.Type {
	return reflect.TypeOf((**SubjectAccessReview)(nil)).Elem()
}

func (i *SubjectAccessReview) ToSubjectAccessReviewOutput() SubjectAccessReviewOutput {
	return i.ToSubjectAccessReviewOutputWithContext(context.Background())
}

func (i *SubjectAccessReview) ToSubjectAccessReviewOutputWithContext(ctx context.Context) SubjectAccessReviewOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubjectAccessReviewOutput)
}

// SubjectAccessReviewArrayInput is an input type that accepts SubjectAccessReviewArray and SubjectAccessReviewArrayOutput values.
// You can construct a concrete instance of `SubjectAccessReviewArrayInput` via:
//
//          SubjectAccessReviewArray{ SubjectAccessReviewArgs{...} }
type SubjectAccessReviewArrayInput interface {
	pulumi.Input

	ToSubjectAccessReviewArrayOutput() SubjectAccessReviewArrayOutput
	ToSubjectAccessReviewArrayOutputWithContext(context.Context) SubjectAccessReviewArrayOutput
}

type SubjectAccessReviewArray []SubjectAccessReviewInput

func (SubjectAccessReviewArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubjectAccessReview)(nil)).Elem()
}

func (i SubjectAccessReviewArray) ToSubjectAccessReviewArrayOutput() SubjectAccessReviewArrayOutput {
	return i.ToSubjectAccessReviewArrayOutputWithContext(context.Background())
}

func (i SubjectAccessReviewArray) ToSubjectAccessReviewArrayOutputWithContext(ctx context.Context) SubjectAccessReviewArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubjectAccessReviewArrayOutput)
}

// SubjectAccessReviewMapInput is an input type that accepts SubjectAccessReviewMap and SubjectAccessReviewMapOutput values.
// You can construct a concrete instance of `SubjectAccessReviewMapInput` via:
//
//          SubjectAccessReviewMap{ "key": SubjectAccessReviewArgs{...} }
type SubjectAccessReviewMapInput interface {
	pulumi.Input

	ToSubjectAccessReviewMapOutput() SubjectAccessReviewMapOutput
	ToSubjectAccessReviewMapOutputWithContext(context.Context) SubjectAccessReviewMapOutput
}

type SubjectAccessReviewMap map[string]SubjectAccessReviewInput

func (SubjectAccessReviewMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubjectAccessReview)(nil)).Elem()
}

func (i SubjectAccessReviewMap) ToSubjectAccessReviewMapOutput() SubjectAccessReviewMapOutput {
	return i.ToSubjectAccessReviewMapOutputWithContext(context.Background())
}

func (i SubjectAccessReviewMap) ToSubjectAccessReviewMapOutputWithContext(ctx context.Context) SubjectAccessReviewMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubjectAccessReviewMapOutput)
}

type SubjectAccessReviewOutput struct{ *pulumi.OutputState }

func (SubjectAccessReviewOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SubjectAccessReview)(nil)).Elem()
}

func (o SubjectAccessReviewOutput) ToSubjectAccessReviewOutput() SubjectAccessReviewOutput {
	return o
}

func (o SubjectAccessReviewOutput) ToSubjectAccessReviewOutputWithContext(ctx context.Context) SubjectAccessReviewOutput {
	return o
}

type SubjectAccessReviewArrayOutput struct{ *pulumi.OutputState }

func (SubjectAccessReviewArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubjectAccessReview)(nil)).Elem()
}

func (o SubjectAccessReviewArrayOutput) ToSubjectAccessReviewArrayOutput() SubjectAccessReviewArrayOutput {
	return o
}

func (o SubjectAccessReviewArrayOutput) ToSubjectAccessReviewArrayOutputWithContext(ctx context.Context) SubjectAccessReviewArrayOutput {
	return o
}

func (o SubjectAccessReviewArrayOutput) Index(i pulumi.IntInput) SubjectAccessReviewOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SubjectAccessReview {
		return vs[0].([]*SubjectAccessReview)[vs[1].(int)]
	}).(SubjectAccessReviewOutput)
}

type SubjectAccessReviewMapOutput struct{ *pulumi.OutputState }

func (SubjectAccessReviewMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubjectAccessReview)(nil)).Elem()
}

func (o SubjectAccessReviewMapOutput) ToSubjectAccessReviewMapOutput() SubjectAccessReviewMapOutput {
	return o
}

func (o SubjectAccessReviewMapOutput) ToSubjectAccessReviewMapOutputWithContext(ctx context.Context) SubjectAccessReviewMapOutput {
	return o
}

func (o SubjectAccessReviewMapOutput) MapIndex(k pulumi.StringInput) SubjectAccessReviewOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SubjectAccessReview {
		return vs[0].(map[string]*SubjectAccessReview)[vs[1].(string)]
	}).(SubjectAccessReviewOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubjectAccessReviewInput)(nil)).Elem(), &SubjectAccessReview{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubjectAccessReviewArrayInput)(nil)).Elem(), SubjectAccessReviewArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubjectAccessReviewMapInput)(nil)).Elem(), SubjectAccessReviewMap{})
	pulumi.RegisterOutputType(SubjectAccessReviewOutput{})
	pulumi.RegisterOutputType(SubjectAccessReviewArrayOutput{})
	pulumi.RegisterOutputType(SubjectAccessReviewMapOutput{})
}
