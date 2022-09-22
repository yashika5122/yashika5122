package com.proto.sum;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: sum/sum.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InputServiceGrpc {

  private InputServiceGrpc() {}

  public static final String SERVICE_NAME = "sum.InputService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.sum.InputRequest,
      com.proto.sum.InputResponse> getInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Input",
      requestType = com.proto.sum.InputRequest.class,
      responseType = com.proto.sum.InputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.sum.InputRequest,
      com.proto.sum.InputResponse> getInputMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.InputRequest, com.proto.sum.InputResponse> getInputMethod;
    if ((getInputMethod = InputServiceGrpc.getInputMethod) == null) {
      synchronized (InputServiceGrpc.class) {
        if ((getInputMethod = InputServiceGrpc.getInputMethod) == null) {
          InputServiceGrpc.getInputMethod = getInputMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.InputRequest, com.proto.sum.InputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Input"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.InputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.InputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InputServiceMethodDescriptorSupplier("Input"))
              .build();
        }
      }
    }
    return getInputMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InputServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InputServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InputServiceStub>() {
        @java.lang.Override
        public InputServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InputServiceStub(channel, callOptions);
        }
      };
    return InputServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InputServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InputServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InputServiceBlockingStub>() {
        @java.lang.Override
        public InputServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InputServiceBlockingStub(channel, callOptions);
        }
      };
    return InputServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InputServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InputServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InputServiceFutureStub>() {
        @java.lang.Override
        public InputServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InputServiceFutureStub(channel, callOptions);
        }
      };
    return InputServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InputServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void input(com.proto.sum.InputRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.InputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInputMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInputMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.sum.InputRequest,
                com.proto.sum.InputResponse>(
                  this, METHODID_INPUT)))
          .build();
    }
  }

  /**
   */
  public static final class InputServiceStub extends io.grpc.stub.AbstractAsyncStub<InputServiceStub> {
    private InputServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InputServiceStub(channel, callOptions);
    }

    /**
     */
    public void input(com.proto.sum.InputRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.InputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInputMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InputServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InputServiceBlockingStub> {
    private InputServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InputServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.sum.InputResponse input(com.proto.sum.InputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInputMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InputServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InputServiceFutureStub> {
    private InputServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InputServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.sum.InputResponse> input(
        com.proto.sum.InputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInputMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INPUT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InputServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InputServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INPUT:
          serviceImpl.input((com.proto.sum.InputRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.sum.InputResponse>) responseObserver);
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

  private static abstract class InputServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InputServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.sum.Sum.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InputService");
    }
  }

  private static final class InputServiceFileDescriptorSupplier
      extends InputServiceBaseDescriptorSupplier {
    InputServiceFileDescriptorSupplier() {}
  }

  private static final class InputServiceMethodDescriptorSupplier
      extends InputServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InputServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InputServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InputServiceFileDescriptorSupplier())
              .addMethod(getInputMethod())
              .build();
        }
      }
    }
    return result;
  }
}
