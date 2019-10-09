package com.springboot.bookinfo.details.lib.detail;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: detail/detail.proto")
public final class BookDetailServiceGrpc {

  private BookDetailServiceGrpc() {}

  public static final String SERVICE_NAME = "BookDetailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest,
      com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail> getGetBookDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBookDetail",
      requestType = com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest.class,
      responseType = com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest,
      com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail> getGetBookDetailMethod() {
    io.grpc.MethodDescriptor<com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest, com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail> getGetBookDetailMethod;
    if ((getGetBookDetailMethod = BookDetailServiceGrpc.getGetBookDetailMethod) == null) {
      synchronized (BookDetailServiceGrpc.class) {
        if ((getGetBookDetailMethod = BookDetailServiceGrpc.getGetBookDetailMethod) == null) {
          BookDetailServiceGrpc.getGetBookDetailMethod = getGetBookDetailMethod = 
              io.grpc.MethodDescriptor.<com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest, com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookDetailService", "GetBookDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail.getDefaultInstance()))
                  .setSchemaDescriptor(new BookDetailServiceMethodDescriptorSupplier("GetBookDetail"))
                  .build();
          }
        }
     }
     return getGetBookDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookDetailServiceStub newStub(io.grpc.Channel channel) {
    return new BookDetailServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookDetailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookDetailServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookDetailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookDetailServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BookDetailServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBookDetail(com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest request,
        io.grpc.stub.StreamObserver<com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookDetailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBookDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest,
                com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail>(
                  this, METHODID_GET_BOOK_DETAIL)))
          .build();
    }
  }

  /**
   */
  public static final class BookDetailServiceStub extends io.grpc.stub.AbstractStub<BookDetailServiceStub> {
    private BookDetailServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookDetailServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookDetailServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookDetailServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBookDetail(com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest request,
        io.grpc.stub.StreamObserver<com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBookDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookDetailServiceBlockingStub extends io.grpc.stub.AbstractStub<BookDetailServiceBlockingStub> {
    private BookDetailServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookDetailServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookDetailServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookDetailServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail getBookDetail(com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBookDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookDetailServiceFutureStub extends io.grpc.stub.AbstractStub<BookDetailServiceFutureStub> {
    private BookDetailServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookDetailServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookDetailServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookDetailServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail> getBookDetail(
        com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBookDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOK_DETAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookDetailServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookDetailServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOOK_DETAIL:
          serviceImpl.getBookDetail((com.springboot.bookinfo.details.lib.detail.BookDetailProto.GetBookDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.springboot.bookinfo.details.lib.detail.BookDetailProto.BookDetail>) responseObserver);
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

  private static abstract class BookDetailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookDetailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.springboot.bookinfo.details.lib.detail.BookDetailProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookDetailService");
    }
  }

  private static final class BookDetailServiceFileDescriptorSupplier
      extends BookDetailServiceBaseDescriptorSupplier {
    BookDetailServiceFileDescriptorSupplier() {}
  }

  private static final class BookDetailServiceMethodDescriptorSupplier
      extends BookDetailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookDetailServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookDetailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookDetailServiceFileDescriptorSupplier())
              .addMethod(getGetBookDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
