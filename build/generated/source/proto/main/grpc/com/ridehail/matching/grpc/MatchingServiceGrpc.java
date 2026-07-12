package com.ridehail.matching.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: matching.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MatchingServiceGrpc {

  private MatchingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ridehail.matching.v1.MatchingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ridehail.matching.grpc.FindDriverForTripRequest,
      com.ridehail.matching.grpc.FindDriverForTripResponse> getFindDriverForTripMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindDriverForTrip",
      requestType = com.ridehail.matching.grpc.FindDriverForTripRequest.class,
      responseType = com.ridehail.matching.grpc.FindDriverForTripResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ridehail.matching.grpc.FindDriverForTripRequest,
      com.ridehail.matching.grpc.FindDriverForTripResponse> getFindDriverForTripMethod() {
    io.grpc.MethodDescriptor<com.ridehail.matching.grpc.FindDriverForTripRequest, com.ridehail.matching.grpc.FindDriverForTripResponse> getFindDriverForTripMethod;
    if ((getFindDriverForTripMethod = MatchingServiceGrpc.getFindDriverForTripMethod) == null) {
      synchronized (MatchingServiceGrpc.class) {
        if ((getFindDriverForTripMethod = MatchingServiceGrpc.getFindDriverForTripMethod) == null) {
          MatchingServiceGrpc.getFindDriverForTripMethod = getFindDriverForTripMethod =
              io.grpc.MethodDescriptor.<com.ridehail.matching.grpc.FindDriverForTripRequest, com.ridehail.matching.grpc.FindDriverForTripResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindDriverForTrip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.matching.grpc.FindDriverForTripRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.matching.grpc.FindDriverForTripResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MatchingServiceMethodDescriptorSupplier("FindDriverForTrip"))
              .build();
        }
      }
    }
    return getFindDriverForTripMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MatchingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchingServiceStub>() {
        @java.lang.Override
        public MatchingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchingServiceStub(channel, callOptions);
        }
      };
    return MatchingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MatchingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchingServiceBlockingStub>() {
        @java.lang.Override
        public MatchingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchingServiceBlockingStub(channel, callOptions);
        }
      };
    return MatchingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MatchingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MatchingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MatchingServiceFutureStub>() {
        @java.lang.Override
        public MatchingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MatchingServiceFutureStub(channel, callOptions);
        }
      };
    return MatchingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Called synchronously by Trip Service. Internally calls LocationService.FindNearbyDrivers
     * then applies ranking (distance, rating, surge rules).
     * </pre>
     */
    default void findDriverForTrip(com.ridehail.matching.grpc.FindDriverForTripRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.matching.grpc.FindDriverForTripResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindDriverForTripMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MatchingService.
   */
  public static abstract class MatchingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MatchingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MatchingService.
   */
  public static final class MatchingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MatchingServiceStub> {
    private MatchingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MatchingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Called synchronously by Trip Service. Internally calls LocationService.FindNearbyDrivers
     * then applies ranking (distance, rating, surge rules).
     * </pre>
     */
    public void findDriverForTrip(com.ridehail.matching.grpc.FindDriverForTripRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.matching.grpc.FindDriverForTripResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindDriverForTripMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MatchingService.
   */
  public static final class MatchingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MatchingServiceBlockingStub> {
    private MatchingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MatchingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Called synchronously by Trip Service. Internally calls LocationService.FindNearbyDrivers
     * then applies ranking (distance, rating, surge rules).
     * </pre>
     */
    public com.ridehail.matching.grpc.FindDriverForTripResponse findDriverForTrip(com.ridehail.matching.grpc.FindDriverForTripRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindDriverForTripMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MatchingService.
   */
  public static final class MatchingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MatchingServiceFutureStub> {
    private MatchingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MatchingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MatchingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Called synchronously by Trip Service. Internally calls LocationService.FindNearbyDrivers
     * then applies ranking (distance, rating, surge rules).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ridehail.matching.grpc.FindDriverForTripResponse> findDriverForTrip(
        com.ridehail.matching.grpc.FindDriverForTripRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindDriverForTripMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_DRIVER_FOR_TRIP = 0;

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
        case METHODID_FIND_DRIVER_FOR_TRIP:
          serviceImpl.findDriverForTrip((com.ridehail.matching.grpc.FindDriverForTripRequest) request,
              (io.grpc.stub.StreamObserver<com.ridehail.matching.grpc.FindDriverForTripResponse>) responseObserver);
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
          getFindDriverForTripMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ridehail.matching.grpc.FindDriverForTripRequest,
              com.ridehail.matching.grpc.FindDriverForTripResponse>(
                service, METHODID_FIND_DRIVER_FOR_TRIP)))
        .build();
  }

  private static abstract class MatchingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MatchingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ridehail.matching.grpc.Matching.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MatchingService");
    }
  }

  private static final class MatchingServiceFileDescriptorSupplier
      extends MatchingServiceBaseDescriptorSupplier {
    MatchingServiceFileDescriptorSupplier() {}
  }

  private static final class MatchingServiceMethodDescriptorSupplier
      extends MatchingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MatchingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MatchingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MatchingServiceFileDescriptorSupplier())
              .addMethod(getFindDriverForTripMethod())
              .build();
        }
      }
    }
    return result;
  }
}
