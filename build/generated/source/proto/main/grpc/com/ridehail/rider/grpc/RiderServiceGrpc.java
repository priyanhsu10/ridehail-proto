package com.ridehail.rider.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: rider.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RiderServiceGrpc {

  private RiderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ridehail.rider.v1.RiderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ridehail.rider.grpc.GetRiderRequest,
      com.ridehail.rider.grpc.Rider> getGetRiderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRider",
      requestType = com.ridehail.rider.grpc.GetRiderRequest.class,
      responseType = com.ridehail.rider.grpc.Rider.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ridehail.rider.grpc.GetRiderRequest,
      com.ridehail.rider.grpc.Rider> getGetRiderMethod() {
    io.grpc.MethodDescriptor<com.ridehail.rider.grpc.GetRiderRequest, com.ridehail.rider.grpc.Rider> getGetRiderMethod;
    if ((getGetRiderMethod = RiderServiceGrpc.getGetRiderMethod) == null) {
      synchronized (RiderServiceGrpc.class) {
        if ((getGetRiderMethod = RiderServiceGrpc.getGetRiderMethod) == null) {
          RiderServiceGrpc.getGetRiderMethod = getGetRiderMethod =
              io.grpc.MethodDescriptor.<com.ridehail.rider.grpc.GetRiderRequest, com.ridehail.rider.grpc.Rider>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.rider.grpc.GetRiderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.rider.grpc.Rider.getDefaultInstance()))
              .setSchemaDescriptor(new RiderServiceMethodDescriptorSupplier("GetRider"))
              .build();
        }
      }
    }
    return getGetRiderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ridehail.rider.grpc.ValidateRiderRequest,
      com.ridehail.rider.grpc.ValidateRiderResponse> getValidateRiderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateRider",
      requestType = com.ridehail.rider.grpc.ValidateRiderRequest.class,
      responseType = com.ridehail.rider.grpc.ValidateRiderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ridehail.rider.grpc.ValidateRiderRequest,
      com.ridehail.rider.grpc.ValidateRiderResponse> getValidateRiderMethod() {
    io.grpc.MethodDescriptor<com.ridehail.rider.grpc.ValidateRiderRequest, com.ridehail.rider.grpc.ValidateRiderResponse> getValidateRiderMethod;
    if ((getValidateRiderMethod = RiderServiceGrpc.getValidateRiderMethod) == null) {
      synchronized (RiderServiceGrpc.class) {
        if ((getValidateRiderMethod = RiderServiceGrpc.getValidateRiderMethod) == null) {
          RiderServiceGrpc.getValidateRiderMethod = getValidateRiderMethod =
              io.grpc.MethodDescriptor.<com.ridehail.rider.grpc.ValidateRiderRequest, com.ridehail.rider.grpc.ValidateRiderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateRider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.rider.grpc.ValidateRiderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.rider.grpc.ValidateRiderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RiderServiceMethodDescriptorSupplier("ValidateRider"))
              .build();
        }
      }
    }
    return getValidateRiderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RiderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RiderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RiderServiceStub>() {
        @java.lang.Override
        public RiderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RiderServiceStub(channel, callOptions);
        }
      };
    return RiderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RiderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RiderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RiderServiceBlockingStub>() {
        @java.lang.Override
        public RiderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RiderServiceBlockingStub(channel, callOptions);
        }
      };
    return RiderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RiderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RiderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RiderServiceFutureStub>() {
        @java.lang.Override
        public RiderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RiderServiceFutureStub(channel, callOptions);
        }
      };
    return RiderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getRider(com.ridehail.rider.grpc.GetRiderRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.rider.grpc.Rider> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRiderMethod(), responseObserver);
    }

    /**
     */
    default void validateRider(com.ridehail.rider.grpc.ValidateRiderRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.rider.grpc.ValidateRiderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateRiderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RiderService.
   */
  public static abstract class RiderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RiderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RiderService.
   */
  public static final class RiderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RiderServiceStub> {
    private RiderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RiderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRider(com.ridehail.rider.grpc.GetRiderRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.rider.grpc.Rider> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRiderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateRider(com.ridehail.rider.grpc.ValidateRiderRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.rider.grpc.ValidateRiderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateRiderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RiderService.
   */
  public static final class RiderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RiderServiceBlockingStub> {
    private RiderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RiderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ridehail.rider.grpc.Rider getRider(com.ridehail.rider.grpc.GetRiderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRiderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ridehail.rider.grpc.ValidateRiderResponse validateRider(com.ridehail.rider.grpc.ValidateRiderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateRiderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RiderService.
   */
  public static final class RiderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RiderServiceFutureStub> {
    private RiderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RiderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ridehail.rider.grpc.Rider> getRider(
        com.ridehail.rider.grpc.GetRiderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRiderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ridehail.rider.grpc.ValidateRiderResponse> validateRider(
        com.ridehail.rider.grpc.ValidateRiderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateRiderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RIDER = 0;
  private static final int METHODID_VALIDATE_RIDER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RIDER:
          serviceImpl.getRider((com.ridehail.rider.grpc.GetRiderRequest) request,
              (io.grpc.stub.StreamObserver<com.ridehail.rider.grpc.Rider>) responseObserver);
          break;
        case METHODID_VALIDATE_RIDER:
          serviceImpl.validateRider((com.ridehail.rider.grpc.ValidateRiderRequest) request,
              (io.grpc.stub.StreamObserver<com.ridehail.rider.grpc.ValidateRiderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetRiderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ridehail.rider.grpc.GetRiderRequest,
              com.ridehail.rider.grpc.Rider>(
                service, METHODID_GET_RIDER)))
        .addMethod(
          getValidateRiderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ridehail.rider.grpc.ValidateRiderRequest,
              com.ridehail.rider.grpc.ValidateRiderResponse>(
                service, METHODID_VALIDATE_RIDER)))
        .build();
  }

  private static abstract class RiderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RiderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ridehail.rider.grpc.RiderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RiderService");
    }
  }

  private static final class RiderServiceFileDescriptorSupplier
      extends RiderServiceBaseDescriptorSupplier {
    RiderServiceFileDescriptorSupplier() {}
  }

  private static final class RiderServiceMethodDescriptorSupplier
      extends RiderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RiderServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RiderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RiderServiceFileDescriptorSupplier())
              .addMethod(getGetRiderMethod())
              .addMethod(getValidateRiderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
