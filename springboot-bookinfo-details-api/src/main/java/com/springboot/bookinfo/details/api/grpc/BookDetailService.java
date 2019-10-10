package com.springboot.bookinfo.details.api.grpc;

import com.springboot.bookinfo.details.lib.detail.BookDetailProto;
import com.springboot.bookinfo.details.lib.detail.BookDetailServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * 类BookDetailService的实现描述: BookDetailService
 *
 * @author hongyang 2019-10-09 19:08
 */
@Slf4j
@GrpcService
public class BookDetailService extends BookDetailServiceGrpc.BookDetailServiceImplBase {

    @Override
    public void getBookDetail(BookDetailProto.GetBookDetailRequest request,
                              StreamObserver<BookDetailProto.BookDetail> responseObserver) {

        long productId = request.getProductId();

        BookDetailProto.BookDetail.Builder bookDetailBuilder = BookDetailProto.BookDetail.newBuilder();
        bookDetailBuilder.setId(productId);
        bookDetailBuilder.setAuthor("William Shakespeare");
        bookDetailBuilder.setLanguage("Chinese");
        bookDetailBuilder.setPages(200);
        bookDetailBuilder.setType("paperback");
        bookDetailBuilder.setYear(1595);
        bookDetailBuilder.setPublisher("PublisherA");
        bookDetailBuilder.setIsbn10("1234567892");
        bookDetailBuilder.setIsbn13("123-1234567892");

        responseObserver.onNext(bookDetailBuilder.build());
        responseObserver.onCompleted();

    }
}
