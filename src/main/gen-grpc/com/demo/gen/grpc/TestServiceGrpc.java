package com.demo.gen.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class TestServiceGrpc {

  private TestServiceGrpc() {}

  public static final String SERVICE_NAME = "TestService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.demo.gen.grpc.TestProto.TestRequest,
      com.demo.gen.grpc.TestProto.TestResponse> METHOD_GET_INFO_RPC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TestService", "getInfoRpc"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.demo.gen.grpc.TestProto.TestRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.demo.gen.grpc.TestProto.TestResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.demo.gen.grpc.TestProto.TestRequest,
      com.demo.gen.grpc.TestProto.ListResponse> METHOD_GET_LIST_INFO_RPC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "TestService", "getListInfoRpc"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.demo.gen.grpc.TestProto.TestRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.demo.gen.grpc.TestProto.ListResponse.getDefaultInstance()));

  public static TestServiceStub newStub(io.grpc.Channel channel) {
    return new TestServiceStub(channel);
  }

  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestServiceBlockingStub(channel);
  }

  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestServiceFutureStub(channel);
  }

  public static interface TestService {

    public void getInfoRpc(com.demo.gen.grpc.TestProto.TestRequest request,
        io.grpc.stub.StreamObserver<com.demo.gen.grpc.TestProto.TestResponse> responseObserver);

    public void getListInfoRpc(com.demo.gen.grpc.TestProto.TestRequest request,
        io.grpc.stub.StreamObserver<com.demo.gen.grpc.TestProto.ListResponse> responseObserver);
  }

  public static interface TestServiceBlockingClient {

    public com.demo.gen.grpc.TestProto.TestResponse getInfoRpc(com.demo.gen.grpc.TestProto.TestRequest request);

    public com.demo.gen.grpc.TestProto.ListResponse getListInfoRpc(com.demo.gen.grpc.TestProto.TestRequest request);
  }

  public static interface TestServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<com.demo.gen.grpc.TestProto.TestResponse> getInfoRpc(
        com.demo.gen.grpc.TestProto.TestRequest request);

    public com.google.common.util.concurrent.ListenableFuture<com.demo.gen.grpc.TestProto.ListResponse> getListInfoRpc(
        com.demo.gen.grpc.TestProto.TestRequest request);
  }

  public static class TestServiceStub extends io.grpc.stub.AbstractStub<TestServiceStub>
      implements TestService {
    private TestServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getInfoRpc(com.demo.gen.grpc.TestProto.TestRequest request,
        io.grpc.stub.StreamObserver<com.demo.gen.grpc.TestProto.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INFO_RPC, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getListInfoRpc(com.demo.gen.grpc.TestProto.TestRequest request,
        io.grpc.stub.StreamObserver<com.demo.gen.grpc.TestProto.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_LIST_INFO_RPC, getCallOptions()), request, responseObserver);
    }
  }

  public static class TestServiceBlockingStub extends io.grpc.stub.AbstractStub<TestServiceBlockingStub>
      implements TestServiceBlockingClient {
    private TestServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.demo.gen.grpc.TestProto.TestResponse getInfoRpc(com.demo.gen.grpc.TestProto.TestRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INFO_RPC, getCallOptions(), request);
    }

    @java.lang.Override
    public com.demo.gen.grpc.TestProto.ListResponse getListInfoRpc(com.demo.gen.grpc.TestProto.TestRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_LIST_INFO_RPC, getCallOptions(), request);
    }
  }

  public static class TestServiceFutureStub extends io.grpc.stub.AbstractStub<TestServiceFutureStub>
      implements TestServiceFutureClient {
    private TestServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.demo.gen.grpc.TestProto.TestResponse> getInfoRpc(
        com.demo.gen.grpc.TestProto.TestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INFO_RPC, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.demo.gen.grpc.TestProto.ListResponse> getListInfoRpc(
        com.demo.gen.grpc.TestProto.TestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_LIST_INFO_RPC, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFO_RPC = 0;
  private static final int METHODID_GET_LIST_INFO_RPC = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestService serviceImpl;
    private final int methodId;

    public MethodHandlers(TestService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INFO_RPC:
          serviceImpl.getInfoRpc((com.demo.gen.grpc.TestProto.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.demo.gen.grpc.TestProto.TestResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_INFO_RPC:
          serviceImpl.getListInfoRpc((com.demo.gen.grpc.TestProto.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.demo.gen.grpc.TestProto.ListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final TestService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_INFO_RPC,
          asyncUnaryCall(
            new MethodHandlers<
              com.demo.gen.grpc.TestProto.TestRequest,
              com.demo.gen.grpc.TestProto.TestResponse>(
                serviceImpl, METHODID_GET_INFO_RPC)))
        .addMethod(
          METHOD_GET_LIST_INFO_RPC,
          asyncUnaryCall(
            new MethodHandlers<
              com.demo.gen.grpc.TestProto.TestRequest,
              com.demo.gen.grpc.TestProto.ListResponse>(
                serviceImpl, METHODID_GET_LIST_INFO_RPC)))
        .build();
  }
}
