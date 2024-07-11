package grpc.ca.sandraLibrary;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Air Conditioning service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sampleSandrajService1.proto")
public final class AirConditioningGrpc {

  private AirConditioningGrpc() {}

  public static final String SERVICE_NAME = "samplesandrajservice1.AirConditioning";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ca.sandraLibrary.ControlRequest,
      grpc.ca.sandraLibrary.ControlResponse> getControlTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "controlTemperature",
      requestType = grpc.ca.sandraLibrary.ControlRequest.class,
      responseType = grpc.ca.sandraLibrary.ControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ca.sandraLibrary.ControlRequest,
      grpc.ca.sandraLibrary.ControlResponse> getControlTemperatureMethod() {
    io.grpc.MethodDescriptor<grpc.ca.sandraLibrary.ControlRequest, grpc.ca.sandraLibrary.ControlResponse> getControlTemperatureMethod;
    if ((getControlTemperatureMethod = AirConditioningGrpc.getControlTemperatureMethod) == null) {
      synchronized (AirConditioningGrpc.class) {
        if ((getControlTemperatureMethod = AirConditioningGrpc.getControlTemperatureMethod) == null) {
          AirConditioningGrpc.getControlTemperatureMethod = getControlTemperatureMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.sandraLibrary.ControlRequest, grpc.ca.sandraLibrary.ControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "samplesandrajservice1.AirConditioning", "controlTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.sandraLibrary.ControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.sandraLibrary.ControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirConditioningMethodDescriptorSupplier("controlTemperature"))
                  .build();
          }
        }
     }
     return getControlTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirConditioningStub newStub(io.grpc.Channel channel) {
    return new AirConditioningStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirConditioningBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirConditioningBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirConditioningFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirConditioningFutureStub(channel);
  }

  /**
   * <pre>
   * Air Conditioning service definition.
   * </pre>
   */
  public static abstract class AirConditioningImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Bidirectional streaming RPC for temperature control.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.ca.sandraLibrary.ControlRequest> controlTemperature(
        io.grpc.stub.StreamObserver<grpc.ca.sandraLibrary.ControlResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getControlTemperatureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getControlTemperatureMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.ca.sandraLibrary.ControlRequest,
                grpc.ca.sandraLibrary.ControlResponse>(
                  this, METHODID_CONTROL_TEMPERATURE)))
          .build();
    }
  }

  /**
   * <pre>
   * Air Conditioning service definition.
   * </pre>
   */
  public static final class AirConditioningStub extends io.grpc.stub.AbstractStub<AirConditioningStub> {
    private AirConditioningStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirConditioningStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirConditioningStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirConditioningStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC for temperature control.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.ca.sandraLibrary.ControlRequest> controlTemperature(
        io.grpc.stub.StreamObserver<grpc.ca.sandraLibrary.ControlResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getControlTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Air Conditioning service definition.
   * </pre>
   */
  public static final class AirConditioningBlockingStub extends io.grpc.stub.AbstractStub<AirConditioningBlockingStub> {
    private AirConditioningBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirConditioningBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirConditioningBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirConditioningBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Air Conditioning service definition.
   * </pre>
   */
  public static final class AirConditioningFutureStub extends io.grpc.stub.AbstractStub<AirConditioningFutureStub> {
    private AirConditioningFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirConditioningFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirConditioningFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirConditioningFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONTROL_TEMPERATURE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirConditioningImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirConditioningImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONTROL_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.controlTemperature(
              (io.grpc.stub.StreamObserver<grpc.ca.sandraLibrary.ControlResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AirConditioningBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirConditioningBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ca.sandraLibrary.SmartLibrarySandraImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirConditioning");
    }
  }

  private static final class AirConditioningFileDescriptorSupplier
      extends AirConditioningBaseDescriptorSupplier {
    AirConditioningFileDescriptorSupplier() {}
  }

  private static final class AirConditioningMethodDescriptorSupplier
      extends AirConditioningBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirConditioningMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirConditioningGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirConditioningFileDescriptorSupplier())
              .addMethod(getControlTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
