// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
type PersistentVolume struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
	Spec PersistentVolumeSpecPtrOutput `pulumi:"spec"`
	// Status represents the current information/status for the persistent volume. Populated by the system. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
	Status PersistentVolumeStatusPtrOutput `pulumi:"status"`
}

// NewPersistentVolume registers a new resource with the given unique name, arguments, and options.
func NewPersistentVolume(ctx *pulumi.Context,
	name string, args *PersistentVolumeArgs, opts ...pulumi.ResourceOption) (*PersistentVolume, error) {
	if args == nil {
		args = &PersistentVolumeArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("v1")
	args.Kind = pulumi.StringPtr("PersistentVolume")
	var resource PersistentVolume
	err := ctx.RegisterResource("kubernetes:core/v1:PersistentVolume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPersistentVolume gets an existing PersistentVolume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPersistentVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PersistentVolumeState, opts ...pulumi.ResourceOption) (*PersistentVolume, error) {
	var resource PersistentVolume
	err := ctx.ReadResource("kubernetes:core/v1:PersistentVolume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PersistentVolume resources.
type persistentVolumeState struct {
}

type PersistentVolumeState struct {
}

func (PersistentVolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*persistentVolumeState)(nil)).Elem()
}

type persistentVolumeArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
	Spec *PersistentVolumeSpec `pulumi:"spec"`
}

// The set of arguments for constructing a PersistentVolume resource.
type PersistentVolumeArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput
	// Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
	Spec PersistentVolumeSpecPtrInput
}

func (PersistentVolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*persistentVolumeArgs)(nil)).Elem()
}

type PersistentVolumeInput interface {
	pulumi.Input

	ToPersistentVolumeOutput() PersistentVolumeOutput
	ToPersistentVolumeOutputWithContext(ctx context.Context) PersistentVolumeOutput
}

func (*PersistentVolume) ElementType() reflect.Type {
	return reflect.TypeOf((**PersistentVolume)(nil)).Elem()
}

func (i *PersistentVolume) ToPersistentVolumeOutput() PersistentVolumeOutput {
	return i.ToPersistentVolumeOutputWithContext(context.Background())
}

func (i *PersistentVolume) ToPersistentVolumeOutputWithContext(ctx context.Context) PersistentVolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PersistentVolumeOutput)
}

// PersistentVolumeArrayInput is an input type that accepts PersistentVolumeArray and PersistentVolumeArrayOutput values.
// You can construct a concrete instance of `PersistentVolumeArrayInput` via:
//
//          PersistentVolumeArray{ PersistentVolumeArgs{...} }
type PersistentVolumeArrayInput interface {
	pulumi.Input

	ToPersistentVolumeArrayOutput() PersistentVolumeArrayOutput
	ToPersistentVolumeArrayOutputWithContext(context.Context) PersistentVolumeArrayOutput
}

type PersistentVolumeArray []PersistentVolumeInput

func (PersistentVolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PersistentVolume)(nil)).Elem()
}

func (i PersistentVolumeArray) ToPersistentVolumeArrayOutput() PersistentVolumeArrayOutput {
	return i.ToPersistentVolumeArrayOutputWithContext(context.Background())
}

func (i PersistentVolumeArray) ToPersistentVolumeArrayOutputWithContext(ctx context.Context) PersistentVolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PersistentVolumeArrayOutput)
}

// PersistentVolumeMapInput is an input type that accepts PersistentVolumeMap and PersistentVolumeMapOutput values.
// You can construct a concrete instance of `PersistentVolumeMapInput` via:
//
//          PersistentVolumeMap{ "key": PersistentVolumeArgs{...} }
type PersistentVolumeMapInput interface {
	pulumi.Input

	ToPersistentVolumeMapOutput() PersistentVolumeMapOutput
	ToPersistentVolumeMapOutputWithContext(context.Context) PersistentVolumeMapOutput
}

type PersistentVolumeMap map[string]PersistentVolumeInput

func (PersistentVolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PersistentVolume)(nil)).Elem()
}

func (i PersistentVolumeMap) ToPersistentVolumeMapOutput() PersistentVolumeMapOutput {
	return i.ToPersistentVolumeMapOutputWithContext(context.Background())
}

func (i PersistentVolumeMap) ToPersistentVolumeMapOutputWithContext(ctx context.Context) PersistentVolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PersistentVolumeMapOutput)
}

type PersistentVolumeOutput struct{ *pulumi.OutputState }

func (PersistentVolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PersistentVolume)(nil)).Elem()
}

func (o PersistentVolumeOutput) ToPersistentVolumeOutput() PersistentVolumeOutput {
	return o
}

func (o PersistentVolumeOutput) ToPersistentVolumeOutputWithContext(ctx context.Context) PersistentVolumeOutput {
	return o
}

type PersistentVolumeArrayOutput struct{ *pulumi.OutputState }

func (PersistentVolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PersistentVolume)(nil)).Elem()
}

func (o PersistentVolumeArrayOutput) ToPersistentVolumeArrayOutput() PersistentVolumeArrayOutput {
	return o
}

func (o PersistentVolumeArrayOutput) ToPersistentVolumeArrayOutputWithContext(ctx context.Context) PersistentVolumeArrayOutput {
	return o
}

func (o PersistentVolumeArrayOutput) Index(i pulumi.IntInput) PersistentVolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PersistentVolume {
		return vs[0].([]*PersistentVolume)[vs[1].(int)]
	}).(PersistentVolumeOutput)
}

type PersistentVolumeMapOutput struct{ *pulumi.OutputState }

func (PersistentVolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PersistentVolume)(nil)).Elem()
}

func (o PersistentVolumeMapOutput) ToPersistentVolumeMapOutput() PersistentVolumeMapOutput {
	return o
}

func (o PersistentVolumeMapOutput) ToPersistentVolumeMapOutputWithContext(ctx context.Context) PersistentVolumeMapOutput {
	return o
}

func (o PersistentVolumeMapOutput) MapIndex(k pulumi.StringInput) PersistentVolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PersistentVolume {
		return vs[0].(map[string]*PersistentVolume)[vs[1].(string)]
	}).(PersistentVolumeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PersistentVolumeInput)(nil)).Elem(), &PersistentVolume{})
	pulumi.RegisterInputType(reflect.TypeOf((*PersistentVolumeArrayInput)(nil)).Elem(), PersistentVolumeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PersistentVolumeMapInput)(nil)).Elem(), PersistentVolumeMap{})
	pulumi.RegisterOutputType(PersistentVolumeOutput{})
	pulumi.RegisterOutputType(PersistentVolumeArrayOutput{})
	pulumi.RegisterOutputType(PersistentVolumeMapOutput{})
}
