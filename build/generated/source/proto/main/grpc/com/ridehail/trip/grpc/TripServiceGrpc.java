package com.ridehail.trip.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: trip.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TripServiceGrpc {

  private TripServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ridehail.trip.v1.TripService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ridehail.trip.grpc.GetTripRequest,
      com.ridehail.trip.grpc.Trip> getGetTripMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrip",
      requestType = com.ridehail.trip.grpc.GetTripRequest.class,
      responseType = com.ridehail.trip.grpc.Trip.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ridehail.trip.grpc.GetTripRequest,
      com.ridehail.trip.grpc.Trip> getGetTripMethod() {
    io.grpc.MethodDescriptor<com.ridehail.trip.grpc.GetTripRequest, com.ridehail.trip.grpc.Trip> getGetTripMethod;
    if ((getGetTripMethod = TripServiceGrpc.getGetTripMethod) == null) {
      synchronized (TripServiceGrpc.class) {
        if ((getGetTripMethod = TripServiceGrpc.getGetTripMethod) == null) {
          TripServiceGrpc.getGetTripMethod = getGetTripMethod =
              io.grpc.MethodDescriptor.<com.ridehail.trip.grpc.GetTripRequest, com.ridehail.trip.grpc.Trip>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.trip.grpc.GetTripRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.trip.grpc.Trip.getDefaultInstance()))
              .setSchemaDescriptor(new TripServiceMethodDescriptorSupplier("GetTrip"))
              .build();
        }
      }
    }
    return getGetTripMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TripServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripServiceStub>() {
        @java.lang.Override
        public TripServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripServiceStub(channel, callOptions);
        }
      };
    return TripServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TripServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripServiceBlockingStub>() {
        @java.lang.Override
        public TripServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripServiceBlockingStub(channel, callOptions);
        }
      };
    return TripServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TripServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripServiceFutureStub>() {
        @java.lang.Override
        public TripServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripServiceFutureStub(channel, callOptions);
        }
      };
    return TripServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Trip creation/lifecycle transitions happen via REST from the API gateway and
     * via Kafka events (see events/topics.md). This RPC exists for other services
     * (e.g. Notification) that need a synchronous point-in-time read of trip state.
     * </pre>
     */
    default void getTrip(com.ridehail.trip.grpc.GetTripRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.trip.grpc.Trip> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTripMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TripService.
   */
  public static abstract class TripServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TripServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TripService.
   */
  public static final class TripServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TripServiceStub> {
    private TripServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Trip creation/lifecycle transitions happen via REST from the API gateway and
     * via Kafka events (see events/topics.md). This RPC exists for other services
     * (e.g. Notification) that need a synchronous point-in-time read of trip state.
     * </pre>
     */
    public void getTrip(com.ridehail.trip.grpc.GetTripRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.trip.grpc.Trip> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTripMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TripService.
   */
  public static final class TripServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TripServiceBlockingStub> {
    private TripServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Trip creation/lifecycle transitions happen via REST from the API gateway and
     * via Kafka events (see events/topics.md). This RPC exists for other services
     * (e.g. Notification) that need a synchronous point-in-time read of trip state.
     * </pre>
     */
    public com.ridehail.trip.grpc.Trip getTrip(com.ridehail.trip.grpc.GetTripRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTripMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TripService.
   */
  public static final class TripServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TripServiceFutureStub> {
    private TripServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Trip creation/lifecycle transitions happen via REST from the API gateway and
     * via Kafka events (see events/topics.md). This RPC exists for other services
     * (e.g. Notification) that need a synchronous point-in-time read of trip state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ridehail.trip.grpc.Trip> getTrip(
        com.ridehail.trip.grpc.GetTripRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTripMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRIP = 0;

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
        case METHODID_GET_TRIP:
          serviceImpl.getTrip((com.ridehail.trip.grpc.GetTripRequest) request,
              (io.grpc.stub.StreamObserver<com.ridehail.trip.grpc.Trip>) responseObserver);
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
          getGetTripMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ridehail.trip.grpc.GetTripRequest,
              com.ridehail.trip.grpc.Trip>(
                service, METHODID_GET_TRIP)))
        .build();
  }

  private static abstract class TripServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TripServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ridehail.trip.grpc.TripOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TripService");
    }
  }

  private static final class TripServiceFileDescriptorSupplier
      extends TripServiceBaseDescriptorSupplier {
    TripServiceFileDescriptorSupplier() {}
  }

  private static final class TripServiceMethodDescriptorSupplier
      extends TripServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TripServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TripServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TripServiceFileDescriptorSupplier())
              .addMethod(getGetTripMethod())
              .build();
        }
      }
    }
    return result;
  }
}
