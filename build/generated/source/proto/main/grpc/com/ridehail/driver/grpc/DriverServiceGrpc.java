package com.ridehail.driver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: driver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DriverServiceGrpc {

  private DriverServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ridehail.driver.v1.DriverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ridehail.driver.grpc.GetDriverRequest,
      com.ridehail.driver.grpc.Driver> getGetDriverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDriver",
      requestType = com.ridehail.driver.grpc.GetDriverRequest.class,
      responseType = com.ridehail.driver.grpc.Driver.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ridehail.driver.grpc.GetDriverRequest,
      com.ridehail.driver.grpc.Driver> getGetDriverMethod() {
    io.grpc.MethodDescriptor<com.ridehail.driver.grpc.GetDriverRequest, com.ridehail.driver.grpc.Driver> getGetDriverMethod;
    if ((getGetDriverMethod = DriverServiceGrpc.getGetDriverMethod) == null) {
      synchronized (DriverServiceGrpc.class) {
        if ((getGetDriverMethod = DriverServiceGrpc.getGetDriverMethod) == null) {
          DriverServiceGrpc.getGetDriverMethod = getGetDriverMethod =
              io.grpc.MethodDescriptor.<com.ridehail.driver.grpc.GetDriverRequest, com.ridehail.driver.grpc.Driver>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDriver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.driver.grpc.GetDriverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.driver.grpc.Driver.getDefaultInstance()))
              .setSchemaDescriptor(new DriverServiceMethodDescriptorSupplier("GetDriver"))
              .build();
        }
      }
    }
    return getGetDriverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ridehail.driver.grpc.UpdateAvailabilityRequest,
      com.ridehail.driver.grpc.UpdateAvailabilityResponse> getUpdateAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAvailability",
      requestType = com.ridehail.driver.grpc.UpdateAvailabilityRequest.class,
      responseType = com.ridehail.driver.grpc.UpdateAvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ridehail.driver.grpc.UpdateAvailabilityRequest,
      com.ridehail.driver.grpc.UpdateAvailabilityResponse> getUpdateAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.ridehail.driver.grpc.UpdateAvailabilityRequest, com.ridehail.driver.grpc.UpdateAvailabilityResponse> getUpdateAvailabilityMethod;
    if ((getUpdateAvailabilityMethod = DriverServiceGrpc.getUpdateAvailabilityMethod) == null) {
      synchronized (DriverServiceGrpc.class) {
        if ((getUpdateAvailabilityMethod = DriverServiceGrpc.getUpdateAvailabilityMethod) == null) {
          DriverServiceGrpc.getUpdateAvailabilityMethod = getUpdateAvailabilityMethod =
              io.grpc.MethodDescriptor.<com.ridehail.driver.grpc.UpdateAvailabilityRequest, com.ridehail.driver.grpc.UpdateAvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.driver.grpc.UpdateAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.driver.grpc.UpdateAvailabilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriverServiceMethodDescriptorSupplier("UpdateAvailability"))
              .build();
        }
      }
    }
    return getUpdateAvailabilityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DriverServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverServiceStub>() {
        @java.lang.Override
        public DriverServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverServiceStub(channel, callOptions);
        }
      };
    return DriverServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DriverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverServiceBlockingStub>() {
        @java.lang.Override
        public DriverServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverServiceBlockingStub(channel, callOptions);
        }
      };
    return DriverServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DriverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverServiceFutureStub>() {
        @java.lang.Override
        public DriverServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverServiceFutureStub(channel, callOptions);
        }
      };
    return DriverServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getDriver(com.ridehail.driver.grpc.GetDriverRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.driver.grpc.Driver> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDriverMethod(), responseObserver);
    }

    /**
     */
    default void updateAvailability(com.ridehail.driver.grpc.UpdateAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.driver.grpc.UpdateAvailabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAvailabilityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DriverService.
   */
  public static abstract class DriverServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DriverServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DriverService.
   */
  public static final class DriverServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DriverServiceStub> {
    private DriverServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDriver(com.ridehail.driver.grpc.GetDriverRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.driver.grpc.Driver> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDriverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAvailability(com.ridehail.driver.grpc.UpdateAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.driver.grpc.UpdateAvailabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DriverService.
   */
  public static final class DriverServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DriverServiceBlockingStub> {
    private DriverServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ridehail.driver.grpc.Driver getDriver(com.ridehail.driver.grpc.GetDriverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDriverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ridehail.driver.grpc.UpdateAvailabilityResponse updateAvailability(com.ridehail.driver.grpc.UpdateAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAvailabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DriverService.
   */
  public static final class DriverServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DriverServiceFutureStub> {
    private DriverServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ridehail.driver.grpc.Driver> getDriver(
        com.ridehail.driver.grpc.GetDriverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDriverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ridehail.driver.grpc.UpdateAvailabilityResponse> updateAvailability(
        com.ridehail.driver.grpc.UpdateAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAvailabilityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DRIVER = 0;
  private static final int METHODID_UPDATE_AVAILABILITY = 1;

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
        case METHODID_GET_DRIVER:
          serviceImpl.getDriver((com.ridehail.driver.grpc.GetDriverRequest) request,
              (io.grpc.stub.StreamObserver<com.ridehail.driver.grpc.Driver>) responseObserver);
          break;
        case METHODID_UPDATE_AVAILABILITY:
          serviceImpl.updateAvailability((com.ridehail.driver.grpc.UpdateAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.ridehail.driver.grpc.UpdateAvailabilityResponse>) responseObserver);
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
          getGetDriverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ridehail.driver.grpc.GetDriverRequest,
              com.ridehail.driver.grpc.Driver>(
                service, METHODID_GET_DRIVER)))
        .addMethod(
          getUpdateAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ridehail.driver.grpc.UpdateAvailabilityRequest,
              com.ridehail.driver.grpc.UpdateAvailabilityResponse>(
                service, METHODID_UPDATE_AVAILABILITY)))
        .build();
  }

  private static abstract class DriverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DriverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ridehail.driver.grpc.DriverOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DriverService");
    }
  }

  private static final class DriverServiceFileDescriptorSupplier
      extends DriverServiceBaseDescriptorSupplier {
    DriverServiceFileDescriptorSupplier() {}
  }

  private static final class DriverServiceMethodDescriptorSupplier
      extends DriverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DriverServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DriverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DriverServiceFileDescriptorSupplier())
              .addMethod(getGetDriverMethod())
              .addMethod(getUpdateAvailabilityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
