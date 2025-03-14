// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
//
// This resource waits until its status is ready before registering success
// for create/update, and populating output properties from the current state of the resource.
// The following conditions are used to determine whether the resource creation has
// succeeded or failed:
//
// 1.  Ingress object exists.
// 2.  Endpoint objects exist with matching names for each Ingress path (except when Service
//     type is ExternalName).
// 3.  Ingress entry exists for '.status.loadBalancer.ingress'.
//
// If the Ingress has not reached a Ready state after 10 minutes, it will
// time out and mark the resource update as Failed. You can override the default timeout value
// by setting the 'customTimeouts' option on the resource.
//
// Deprecated: extensions/v1beta1/Ingress is deprecated by networking.k8s.io/v1beta1/Ingress and not supported by Kubernetes v1.20+ clusters.
type Ingress struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec IngressSpecPtrOutput `pulumi:"spec"`
	// Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Status IngressStatusPtrOutput `pulumi:"status"`
}

// NewIngress registers a new resource with the given unique name, arguments, and options.
func NewIngress(ctx *pulumi.Context,
	name string, args *IngressArgs, opts ...pulumi.ResourceOption) (*Ingress, error) {
	if args == nil {
		args = &IngressArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("extensions/v1beta1")
	args.Kind = pulumi.StringPtr("Ingress")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:networking.k8s.io/v1:Ingress"),
		},
		{
			Type: pulumi.String("kubernetes:networking.k8s.io/v1beta1:Ingress"),
		},
	})
	opts = append(opts, aliases)
	var resource Ingress
	err := ctx.RegisterResource("kubernetes:extensions/v1beta1:Ingress", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIngress gets an existing Ingress resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIngress(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IngressState, opts ...pulumi.ResourceOption) (*Ingress, error) {
	var resource Ingress
	err := ctx.ReadResource("kubernetes:extensions/v1beta1:Ingress", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ingress resources.
type ingressState struct {
}

type IngressState struct {
}

func (IngressState) ElementType() reflect.Type {
	return reflect.TypeOf((*ingressState)(nil)).Elem()
}

type ingressArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *IngressSpec `pulumi:"spec"`
}

// The set of arguments for constructing a Ingress resource.
type IngressArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput
	// Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec IngressSpecPtrInput
}

func (IngressArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ingressArgs)(nil)).Elem()
}

type IngressInput interface {
	pulumi.Input

	ToIngressOutput() IngressOutput
	ToIngressOutputWithContext(ctx context.Context) IngressOutput
}

func (*Ingress) ElementType() reflect.Type {
	return reflect.TypeOf((**Ingress)(nil)).Elem()
}

func (i *Ingress) ToIngressOutput() IngressOutput {
	return i.ToIngressOutputWithContext(context.Background())
}

func (i *Ingress) ToIngressOutputWithContext(ctx context.Context) IngressOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressOutput)
}

// IngressArrayInput is an input type that accepts IngressArray and IngressArrayOutput values.
// You can construct a concrete instance of `IngressArrayInput` via:
//
//          IngressArray{ IngressArgs{...} }
type IngressArrayInput interface {
	pulumi.Input

	ToIngressArrayOutput() IngressArrayOutput
	ToIngressArrayOutputWithContext(context.Context) IngressArrayOutput
}

type IngressArray []IngressInput

func (IngressArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ingress)(nil)).Elem()
}

func (i IngressArray) ToIngressArrayOutput() IngressArrayOutput {
	return i.ToIngressArrayOutputWithContext(context.Background())
}

func (i IngressArray) ToIngressArrayOutputWithContext(ctx context.Context) IngressArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressArrayOutput)
}

// IngressMapInput is an input type that accepts IngressMap and IngressMapOutput values.
// You can construct a concrete instance of `IngressMapInput` via:
//
//          IngressMap{ "key": IngressArgs{...} }
type IngressMapInput interface {
	pulumi.Input

	ToIngressMapOutput() IngressMapOutput
	ToIngressMapOutputWithContext(context.Context) IngressMapOutput
}

type IngressMap map[string]IngressInput

func (IngressMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ingress)(nil)).Elem()
}

func (i IngressMap) ToIngressMapOutput() IngressMapOutput {
	return i.ToIngressMapOutputWithContext(context.Background())
}

func (i IngressMap) ToIngressMapOutputWithContext(ctx context.Context) IngressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IngressMapOutput)
}

type IngressOutput struct{ *pulumi.OutputState }

func (IngressOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ingress)(nil)).Elem()
}

func (o IngressOutput) ToIngressOutput() IngressOutput {
	return o
}

func (o IngressOutput) ToIngressOutputWithContext(ctx context.Context) IngressOutput {
	return o
}

type IngressArrayOutput struct{ *pulumi.OutputState }

func (IngressArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ingress)(nil)).Elem()
}

func (o IngressArrayOutput) ToIngressArrayOutput() IngressArrayOutput {
	return o
}

func (o IngressArrayOutput) ToIngressArrayOutputWithContext(ctx context.Context) IngressArrayOutput {
	return o
}

func (o IngressArrayOutput) Index(i pulumi.IntInput) IngressOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ingress {
		return vs[0].([]*Ingress)[vs[1].(int)]
	}).(IngressOutput)
}

type IngressMapOutput struct{ *pulumi.OutputState }

func (IngressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ingress)(nil)).Elem()
}

func (o IngressMapOutput) ToIngressMapOutput() IngressMapOutput {
	return o
}

func (o IngressMapOutput) ToIngressMapOutputWithContext(ctx context.Context) IngressMapOutput {
	return o
}

func (o IngressMapOutput) MapIndex(k pulumi.StringInput) IngressOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ingress {
		return vs[0].(map[string]*Ingress)[vs[1].(string)]
	}).(IngressOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IngressInput)(nil)).Elem(), &Ingress{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngressArrayInput)(nil)).Elem(), IngressArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IngressMapInput)(nil)).Elem(), IngressMap{})
	pulumi.RegisterOutputType(IngressOutput{})
	pulumi.RegisterOutputType(IngressArrayOutput{})
	pulumi.RegisterOutputType(IngressMapOutput{})
}
