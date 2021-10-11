package com.examApplication.stub.exam;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This defines our service for the target folder
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: exam.proto")
public final class ExamGRpcServiceGrpc {

  private ExamGRpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.examApplication.stub.exam.ExamGRpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.examApplication.stub.exam.ExamGRpcRequest,
      com.examApplication.stub.exam.ExamGRpcResponse> getGetExamByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getExamById",
      requestType = com.examApplication.stub.exam.ExamGRpcRequest.class,
      responseType = com.examApplication.stub.exam.ExamGRpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.examApplication.stub.exam.ExamGRpcRequest,
      com.examApplication.stub.exam.ExamGRpcResponse> getGetExamByIdMethod() {
    io.grpc.MethodDescriptor<com.examApplication.stub.exam.ExamGRpcRequest, com.examApplication.stub.exam.ExamGRpcResponse> getGetExamByIdMethod;
    if ((getGetExamByIdMethod = ExamGRpcServiceGrpc.getGetExamByIdMethod) == null) {
      synchronized (ExamGRpcServiceGrpc.class) {
        if ((getGetExamByIdMethod = ExamGRpcServiceGrpc.getGetExamByIdMethod) == null) {
          ExamGRpcServiceGrpc.getGetExamByIdMethod = getGetExamByIdMethod =
              io.grpc.MethodDescriptor.<com.examApplication.stub.exam.ExamGRpcRequest, com.examApplication.stub.exam.ExamGRpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getExamById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examApplication.stub.exam.ExamGRpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examApplication.stub.exam.ExamGRpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExamGRpcServiceMethodDescriptorSupplier("getExamById"))
              .build();
        }
      }
    }
    return getGetExamByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.examApplication.stub.exam.ExamGRpcResponse> getFindByExamsPassedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByExamsPassed",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.examApplication.stub.exam.ExamGRpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.examApplication.stub.exam.ExamGRpcResponse> getFindByExamsPassedMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.examApplication.stub.exam.ExamGRpcResponse> getFindByExamsPassedMethod;
    if ((getFindByExamsPassedMethod = ExamGRpcServiceGrpc.getFindByExamsPassedMethod) == null) {
      synchronized (ExamGRpcServiceGrpc.class) {
        if ((getFindByExamsPassedMethod = ExamGRpcServiceGrpc.getFindByExamsPassedMethod) == null) {
          ExamGRpcServiceGrpc.getFindByExamsPassedMethod = getFindByExamsPassedMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.examApplication.stub.exam.ExamGRpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByExamsPassed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examApplication.stub.exam.ExamGRpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExamGRpcServiceMethodDescriptorSupplier("findByExamsPassed"))
              .build();
        }
      }
    }
    return getFindByExamsPassedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExamGRpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExamGRpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExamGRpcServiceStub>() {
        @java.lang.Override
        public ExamGRpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExamGRpcServiceStub(channel, callOptions);
        }
      };
    return ExamGRpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExamGRpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExamGRpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExamGRpcServiceBlockingStub>() {
        @java.lang.Override
        public ExamGRpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExamGRpcServiceBlockingStub(channel, callOptions);
        }
      };
    return ExamGRpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExamGRpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExamGRpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExamGRpcServiceFutureStub>() {
        @java.lang.Override
        public ExamGRpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExamGRpcServiceFutureStub(channel, callOptions);
        }
      };
    return ExamGRpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This defines our service for the target folder
   * </pre>
   */
  public static abstract class ExamGRpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getExamById(com.examApplication.stub.exam.ExamGRpcRequest request,
        io.grpc.stub.StreamObserver<com.examApplication.stub.exam.ExamGRpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExamByIdMethod(), responseObserver);
    }

    /**
     */
    public void findByExamsPassed(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.examApplication.stub.exam.ExamGRpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByExamsPassedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExamByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.examApplication.stub.exam.ExamGRpcRequest,
                com.examApplication.stub.exam.ExamGRpcResponse>(
                  this, METHODID_GET_EXAM_BY_ID)))
          .addMethod(
            getFindByExamsPassedMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.examApplication.stub.exam.ExamGRpcResponse>(
                  this, METHODID_FIND_BY_EXAMS_PASSED)))
          .build();
    }
  }

  /**
   * <pre>
   * This defines our service for the target folder
   * </pre>
   */
  public static final class ExamGRpcServiceStub extends io.grpc.stub.AbstractAsyncStub<ExamGRpcServiceStub> {
    private ExamGRpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExamGRpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExamGRpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getExamById(com.examApplication.stub.exam.ExamGRpcRequest request,
        io.grpc.stub.StreamObserver<com.examApplication.stub.exam.ExamGRpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExamByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByExamsPassed(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.examApplication.stub.exam.ExamGRpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByExamsPassedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This defines our service for the target folder
   * </pre>
   */
  public static final class ExamGRpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExamGRpcServiceBlockingStub> {
    private ExamGRpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExamGRpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExamGRpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.examApplication.stub.exam.ExamGRpcResponse getExamById(com.examApplication.stub.exam.ExamGRpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExamByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.examApplication.stub.exam.ExamGRpcResponse> findByExamsPassed(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByExamsPassedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This defines our service for the target folder
   * </pre>
   */
  public static final class ExamGRpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExamGRpcServiceFutureStub> {
    private ExamGRpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExamGRpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExamGRpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.examApplication.stub.exam.ExamGRpcResponse> getExamById(
        com.examApplication.stub.exam.ExamGRpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExamByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXAM_BY_ID = 0;
  private static final int METHODID_FIND_BY_EXAMS_PASSED = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExamGRpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExamGRpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXAM_BY_ID:
          serviceImpl.getExamById((com.examApplication.stub.exam.ExamGRpcRequest) request,
              (io.grpc.stub.StreamObserver<com.examApplication.stub.exam.ExamGRpcResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_EXAMS_PASSED:
          serviceImpl.findByExamsPassed((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.examApplication.stub.exam.ExamGRpcResponse>) responseObserver);
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

  private static abstract class ExamGRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExamGRpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.examApplication.stub.exam.Exam.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExamGRpcService");
    }
  }

  private static final class ExamGRpcServiceFileDescriptorSupplier
      extends ExamGRpcServiceBaseDescriptorSupplier {
    ExamGRpcServiceFileDescriptorSupplier() {}
  }

  private static final class ExamGRpcServiceMethodDescriptorSupplier
      extends ExamGRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExamGRpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExamGRpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExamGRpcServiceFileDescriptorSupplier())
              .addMethod(getGetExamByIdMethod())
              .addMethod(getFindByExamsPassedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
