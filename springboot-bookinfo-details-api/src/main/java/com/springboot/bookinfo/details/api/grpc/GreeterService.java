package com.springboot.bookinfo.details.api.grpc;


import com.springboot.bookinfo.details.lib.greeter.GreeterGrpc;
import com.springboot.bookinfo.details.lib.greeter.GreeterProto;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * 类GreeterService的实现描述: GreeterService
 *
 * @author hongyang 2019-10-09 14:01
 */
@Slf4j
@GrpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(GreeterProto.HelloRequest request,
                         StreamObserver<GreeterProto.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final GreeterProto.HelloReply.Builder replyBuilder = GreeterProto.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }
}
