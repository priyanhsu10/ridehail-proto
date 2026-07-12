package com.ridehail.location.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: location.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LocationServiceGrpc {

  private LocationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ridehail.location.v1.LocationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ridehail.location.grpc.FindNearbyDriversRequest,
      com.ridehail.location.grpc.FindNearbyDriversResponse> getFindNearbyDriversMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindNearbyDrivers",
      requestType = com.ridehail.location.grpc.FindNearbyDriversRequest.class,
      responseType = com.ridehail.location.grpc.FindNearbyDriversResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ridehail.location.grpc.FindNearbyDriversRequest,
      com.ridehail.location.grpc.FindNearbyDriversResponse> getFindNearbyDriversMethod() {
    io.grpc.MethodDescriptor<com.ridehail.location.grpc.FindNearbyDriversRequest, com.ridehail.location.grpc.FindNearbyDriversResponse> getFindNearbyDriversMethod;
    if ((getFindNearbyDriversMethod = LocationServiceGrpc.getFindNearbyDriversMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getFindNearbyDriversMethod = LocationServiceGrpc.getFindNearbyDriversMethod) == null) {
          LocationServiceGrpc.getFindNearbyDriversMethod = getFindNearbyDriversMethod =
              io.grpc.MethodDescriptor.<com.ridehail.location.grpc.FindNearbyDriversRequest, com.ridehail.location.grpc.FindNearbyDriversResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindNearbyDrivers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.location.grpc.FindNearbyDriversRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.location.grpc.FindNearbyDriversResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("FindNearbyDrivers"))
              .build();
        }
      }
    }
    return getFindNearbyDriversMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ridehail.location.grpc.GetDriverLocationRequest,
      com.ridehail.location.grpc.DriverLocation> getGetDriverLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDriverLocation",
      requestType = com.ridehail.location.grpc.GetDriverLocationRequest.class,
      responseType = com.ridehail.location.grpc.DriverLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ridehail.location.grpc.GetDriverLocationRequest,
      com.ridehail.location.grpc.DriverLocation> getGetDriverLocationMethod() {
    io.grpc.MethodDescriptor<com.ridehail.location.grpc.GetDriverLocationRequest, com.ridehail.location.grpc.DriverLocation> getGetDriverLocationMethod;
    if ((getGetDriverLocationMethod = LocationServiceGrpc.getGetDriverLocationMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetDriverLocationMethod = LocationServiceGrpc.getGetDriverLocationMethod) == null) {
          LocationServiceGrpc.getGetDriverLocationMethod = getGetDriverLocationMethod =
              io.grpc.MethodDescriptor.<com.ridehail.location.grpc.GetDriverLocationRequest, com.ridehail.location.grpc.DriverLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDriverLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.location.grpc.GetDriverLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ridehail.location.grpc.DriverLocation.getDefaultInstance()))
              .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("GetDriverLocation"))
              .build();
        }
      }
    }
    return getGetDriverLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceStub>() {
        @java.lang.Override
        public LocationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceStub(channel, callOptions);
        }
      };
    return LocationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceBlockingStub>() {
        @java.lang.Override
        public LocationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceBlockingStub(channel, callOptions);
        }
      };
    return LocationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceFutureStub>() {
        @java.lang.Override
        public LocationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceFutureStub(channel, callOptions);
        }
      };
    return LocationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sync query used by Matching Service - backed by Redis GEOSEARCH.
     * </pre>
     */
    default void findNearbyDrivers(com.ridehail.location.grpc.FindNearbyDriversRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.location.grpc.FindNearbyDriversResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindNearbyDriversMethod(), responseObserver);
    }

    /**
     */
    default void getDriverLocation(com.ridehail.location.grpc.GetDriverLocationRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.location.grpc.DriverLocation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDriverLocationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LocationService.
   */
  public static abstract class LocationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LocationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LocationService.
   */
  public static final class LocationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LocationServiceStub> {
    private LocationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync query used by Matching Service - backed by Redis GEOSEARCH.
     * </pre>
     */
    public void findNearbyDrivers(com.ridehail.location.grpc.FindNearbyDriversRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.location.grpc.FindNearbyDriversResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindNearbyDriversMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDriverLocation(com.ridehail.location.grpc.GetDriverLocationRequest request,
        io.grpc.stub.StreamObserver<com.ridehail.location.grpc.DriverLocation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDriverLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LocationService.
   */
  public static final class LocationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LocationServiceBlockingStub> {
    private LocationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync query used by Matching Service - backed by Redis GEOSEARCH.
     * </pre>
     */
    public com.ridehail.location.grpc.FindNearbyDriversResponse findNearbyDrivers(com.ridehail.location.grpc.FindNearbyDriversRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindNearbyDriversMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ridehail.location.grpc.DriverLocation getDriverLocation(com.ridehail.location.grpc.GetDriverLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDriverLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LocationService.
   */
  public static final class LocationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LocationServiceFutureStub> {
    private LocationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sync query used by Matching Service - backed by Redis GEOSEARCH.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ridehail.location.grpc.FindNearbyDriversResponse> findNearbyDrivers(
        com.ridehail.location.grpc.FindNearbyDriversRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindNearbyDriversMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ridehail.location.grpc.DriverLocation> getDriverLocation(
        com.ridehail.location.grpc.GetDriverLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDriverLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_NEARBY_DRIVERS = 0;
  private static final int METHODID_GET_DRIVER_LOCATION = 1;

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
        case METHODID_FIND_NEARBY_DRIVERS:
          serviceImpl.findNearbyDrivers((com.ridehail.location.grpc.FindNearbyDriversRequest) request,
              (io.grpc.stub.StreamObserver<com.ridehail.location.grpc.FindNearbyDriversResponse>) responseObserver);
          break;
        case METHODID_GET_DRIVER_LOCATION:
          serviceImpl.getDriverLocation((com.ridehail.location.grpc.GetDriverLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.ridehail.location.grpc.DriverLocation>) responseObserver);
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
          getFindNearbyDriversMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ridehail.location.grpc.FindNearbyDriversRequest,
              com.ridehail.location.grpc.FindNearbyDriversResponse>(
                service, METHODID_FIND_NEARBY_DRIVERS)))
        .addMethod(
          getGetDriverLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ridehail.location.grpc.GetDriverLocationRequest,
              com.ridehail.location.grpc.DriverLocation>(
                service, METHODID_GET_DRIVER_LOCATION)))
        .build();
  }

  private static abstract class LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ridehail.location.grpc.Location.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationService");
    }
  }

  private static final class LocationServiceFileDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier {
    LocationServiceFileDescriptorSupplier() {}
  }

  private static final class LocationServiceMethodDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LocationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LocationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationServiceFileDescriptorSupplier())
              .addMethod(getFindNearbyDriversMethod())
              .addMethod(getGetDriverLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
