package com.cerence.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: textProcessorInput.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TextProcessorServiceGrpc {

  private TextProcessorServiceGrpc() {}

  public static final String SERVICE_NAME = "com.cerence.proto.TextProcessorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest,
      com.cerence.proto.TextProcessorInputResponse> getTextProcessorBingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TextProcessorBing",
      requestType = com.cerence.proto.TextProcessorInputRequest.class,
      responseType = com.cerence.proto.TextProcessorInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest,
      com.cerence.proto.TextProcessorInputResponse> getTextProcessorBingMethod() {
    io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest, com.cerence.proto.TextProcessorInputResponse> getTextProcessorBingMethod;
    if ((getTextProcessorBingMethod = TextProcessorServiceGrpc.getTextProcessorBingMethod) == null) {
      synchronized (TextProcessorServiceGrpc.class) {
        if ((getTextProcessorBingMethod = TextProcessorServiceGrpc.getTextProcessorBingMethod) == null) {
          TextProcessorServiceGrpc.getTextProcessorBingMethod = getTextProcessorBingMethod =
              io.grpc.MethodDescriptor.<com.cerence.proto.TextProcessorInputRequest, com.cerence.proto.TextProcessorInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TextProcessorBing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cerence.proto.TextProcessorInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cerence.proto.TextProcessorInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextProcessorServiceMethodDescriptorSupplier("TextProcessorBing"))
              .build();
        }
      }
    }
    return getTextProcessorBingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest,
      com.cerence.proto.TextProcessorInputResponse> getTextProcessorAcronymsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TextProcessorAcronyms",
      requestType = com.cerence.proto.TextProcessorInputRequest.class,
      responseType = com.cerence.proto.TextProcessorInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest,
      com.cerence.proto.TextProcessorInputResponse> getTextProcessorAcronymsMethod() {
    io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest, com.cerence.proto.TextProcessorInputResponse> getTextProcessorAcronymsMethod;
    if ((getTextProcessorAcronymsMethod = TextProcessorServiceGrpc.getTextProcessorAcronymsMethod) == null) {
      synchronized (TextProcessorServiceGrpc.class) {
        if ((getTextProcessorAcronymsMethod = TextProcessorServiceGrpc.getTextProcessorAcronymsMethod) == null) {
          TextProcessorServiceGrpc.getTextProcessorAcronymsMethod = getTextProcessorAcronymsMethod =
              io.grpc.MethodDescriptor.<com.cerence.proto.TextProcessorInputRequest, com.cerence.proto.TextProcessorInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TextProcessorAcronyms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cerence.proto.TextProcessorInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cerence.proto.TextProcessorInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextProcessorServiceMethodDescriptorSupplier("TextProcessorAcronyms"))
              .build();
        }
      }
    }
    return getTextProcessorAcronymsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest,
      com.cerence.proto.TextProcessorInputResponse> getTextProcessorEmojiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TextProcessorEmoji",
      requestType = com.cerence.proto.TextProcessorInputRequest.class,
      responseType = com.cerence.proto.TextProcessorInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest,
      com.cerence.proto.TextProcessorInputResponse> getTextProcessorEmojiMethod() {
    io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest, com.cerence.proto.TextProcessorInputResponse> getTextProcessorEmojiMethod;
    if ((getTextProcessorEmojiMethod = TextProcessorServiceGrpc.getTextProcessorEmojiMethod) == null) {
      synchronized (TextProcessorServiceGrpc.class) {
        if ((getTextProcessorEmojiMethod = TextProcessorServiceGrpc.getTextProcessorEmojiMethod) == null) {
          TextProcessorServiceGrpc.getTextProcessorEmojiMethod = getTextProcessorEmojiMethod =
              io.grpc.MethodDescriptor.<com.cerence.proto.TextProcessorInputRequest, com.cerence.proto.TextProcessorInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TextProcessorEmoji"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cerence.proto.TextProcessorInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cerence.proto.TextProcessorInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextProcessorServiceMethodDescriptorSupplier("TextProcessorEmoji"))
              .build();
        }
      }
    }
    return getTextProcessorEmojiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest,
      com.cerence.proto.TextProcessorInputResponse> getTextProcessorSpellCheckerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TextProcessorSpellChecker",
      requestType = com.cerence.proto.TextProcessorInputRequest.class,
      responseType = com.cerence.proto.TextProcessorInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest,
      com.cerence.proto.TextProcessorInputResponse> getTextProcessorSpellCheckerMethod() {
    io.grpc.MethodDescriptor<com.cerence.proto.TextProcessorInputRequest, com.cerence.proto.TextProcessorInputResponse> getTextProcessorSpellCheckerMethod;
    if ((getTextProcessorSpellCheckerMethod = TextProcessorServiceGrpc.getTextProcessorSpellCheckerMethod) == null) {
      synchronized (TextProcessorServiceGrpc.class) {
        if ((getTextProcessorSpellCheckerMethod = TextProcessorServiceGrpc.getTextProcessorSpellCheckerMethod) == null) {
          TextProcessorServiceGrpc.getTextProcessorSpellCheckerMethod = getTextProcessorSpellCheckerMethod =
              io.grpc.MethodDescriptor.<com.cerence.proto.TextProcessorInputRequest, com.cerence.proto.TextProcessorInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TextProcessorSpellChecker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cerence.proto.TextProcessorInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cerence.proto.TextProcessorInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextProcessorServiceMethodDescriptorSupplier("TextProcessorSpellChecker"))
              .build();
        }
      }
    }
    return getTextProcessorSpellCheckerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextProcessorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextProcessorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextProcessorServiceStub>() {
        @java.lang.Override
        public TextProcessorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextProcessorServiceStub(channel, callOptions);
        }
      };
    return TextProcessorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextProcessorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextProcessorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextProcessorServiceBlockingStub>() {
        @java.lang.Override
        public TextProcessorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextProcessorServiceBlockingStub(channel, callOptions);
        }
      };
    return TextProcessorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextProcessorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextProcessorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextProcessorServiceFutureStub>() {
        @java.lang.Override
        public TextProcessorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextProcessorServiceFutureStub(channel, callOptions);
        }
      };
    return TextProcessorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TextProcessorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void textProcessorBing(com.cerence.proto.TextProcessorInputRequest request,
        io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTextProcessorBingMethod(), responseObserver);
    }

    /**
     */
    public void textProcessorAcronyms(com.cerence.proto.TextProcessorInputRequest request,
        io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTextProcessorAcronymsMethod(), responseObserver);
    }

    /**
     */
    public void textProcessorEmoji(com.cerence.proto.TextProcessorInputRequest request,
        io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTextProcessorEmojiMethod(), responseObserver);
    }

    /**
     */
    public void textProcessorSpellChecker(com.cerence.proto.TextProcessorInputRequest request,
        io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTextProcessorSpellCheckerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTextProcessorBingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.cerence.proto.TextProcessorInputRequest,
                com.cerence.proto.TextProcessorInputResponse>(
                  this, METHODID_TEXT_PROCESSOR_BING)))
          .addMethod(
            getTextProcessorAcronymsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.cerence.proto.TextProcessorInputRequest,
                com.cerence.proto.TextProcessorInputResponse>(
                  this, METHODID_TEXT_PROCESSOR_ACRONYMS)))
          .addMethod(
            getTextProcessorEmojiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.cerence.proto.TextProcessorInputRequest,
                com.cerence.proto.TextProcessorInputResponse>(
                  this, METHODID_TEXT_PROCESSOR_EMOJI)))
          .addMethod(
            getTextProcessorSpellCheckerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.cerence.proto.TextProcessorInputRequest,
                com.cerence.proto.TextProcessorInputResponse>(
                  this, METHODID_TEXT_PROCESSOR_SPELL_CHECKER)))
          .build();
    }
  }

  /**
   */
  public static final class TextProcessorServiceStub extends io.grpc.stub.AbstractAsyncStub<TextProcessorServiceStub> {
    private TextProcessorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextProcessorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextProcessorServiceStub(channel, callOptions);
    }

    /**
     */
    public void textProcessorBing(com.cerence.proto.TextProcessorInputRequest request,
        io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTextProcessorBingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void textProcessorAcronyms(com.cerence.proto.TextProcessorInputRequest request,
        io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTextProcessorAcronymsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void textProcessorEmoji(com.cerence.proto.TextProcessorInputRequest request,
        io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTextProcessorEmojiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void textProcessorSpellChecker(com.cerence.proto.TextProcessorInputRequest request,
        io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTextProcessorSpellCheckerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TextProcessorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextProcessorServiceBlockingStub> {
    private TextProcessorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextProcessorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextProcessorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cerence.proto.TextProcessorInputResponse textProcessorBing(com.cerence.proto.TextProcessorInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTextProcessorBingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cerence.proto.TextProcessorInputResponse textProcessorAcronyms(com.cerence.proto.TextProcessorInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTextProcessorAcronymsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cerence.proto.TextProcessorInputResponse textProcessorEmoji(com.cerence.proto.TextProcessorInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTextProcessorEmojiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cerence.proto.TextProcessorInputResponse textProcessorSpellChecker(com.cerence.proto.TextProcessorInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTextProcessorSpellCheckerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TextProcessorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextProcessorServiceFutureStub> {
    private TextProcessorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextProcessorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextProcessorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cerence.proto.TextProcessorInputResponse> textProcessorBing(
        com.cerence.proto.TextProcessorInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTextProcessorBingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cerence.proto.TextProcessorInputResponse> textProcessorAcronyms(
        com.cerence.proto.TextProcessorInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTextProcessorAcronymsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cerence.proto.TextProcessorInputResponse> textProcessorEmoji(
        com.cerence.proto.TextProcessorInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTextProcessorEmojiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cerence.proto.TextProcessorInputResponse> textProcessorSpellChecker(
        com.cerence.proto.TextProcessorInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTextProcessorSpellCheckerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEXT_PROCESSOR_BING = 0;
  private static final int METHODID_TEXT_PROCESSOR_ACRONYMS = 1;
  private static final int METHODID_TEXT_PROCESSOR_EMOJI = 2;
  private static final int METHODID_TEXT_PROCESSOR_SPELL_CHECKER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextProcessorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextProcessorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEXT_PROCESSOR_BING:
          serviceImpl.textProcessorBing((com.cerence.proto.TextProcessorInputRequest) request,
              (io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse>) responseObserver);
          break;
        case METHODID_TEXT_PROCESSOR_ACRONYMS:
          serviceImpl.textProcessorAcronyms((com.cerence.proto.TextProcessorInputRequest) request,
              (io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse>) responseObserver);
          break;
        case METHODID_TEXT_PROCESSOR_EMOJI:
          serviceImpl.textProcessorEmoji((com.cerence.proto.TextProcessorInputRequest) request,
              (io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse>) responseObserver);
          break;
        case METHODID_TEXT_PROCESSOR_SPELL_CHECKER:
          serviceImpl.textProcessorSpellChecker((com.cerence.proto.TextProcessorInputRequest) request,
              (io.grpc.stub.StreamObserver<com.cerence.proto.TextProcessorInputResponse>) responseObserver);
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

  private static abstract class TextProcessorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextProcessorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cerence.proto.TextProcessorInputOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextProcessorService");
    }
  }

  private static final class TextProcessorServiceFileDescriptorSupplier
      extends TextProcessorServiceBaseDescriptorSupplier {
    TextProcessorServiceFileDescriptorSupplier() {}
  }

  private static final class TextProcessorServiceMethodDescriptorSupplier
      extends TextProcessorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextProcessorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextProcessorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextProcessorServiceFileDescriptorSupplier())
              .addMethod(getTextProcessorBingMethod())
              .addMethod(getTextProcessorAcronymsMethod())
              .addMethod(getTextProcessorEmojiMethod())
              .addMethod(getTextProcessorSpellCheckerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
