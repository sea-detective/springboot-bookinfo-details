package com.springboot.bookinfo.details.api.controller;

import com.springboot.bookinfo.details.api.controller.response.BookDetail;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类BookinfoDetailsController的实现描述: BookinfoDetailsController
 *
 * @author hongyang 2019-10-08 17:20
 */
@RestController
public class BookDetailsController {

    @RequestMapping("/details/{productId}")
    public BookDetail getBookDetail(@PathVariable(name = "productId") Long productId) {

        BookDetail bookDetail = new BookDetail();
        bookDetail.setId(productId);
        bookDetail.setAuthor("William Shakespeare");
        bookDetail.setLanguage("English");
        bookDetail.setPages(200);
        bookDetail.setType("paperback");
        bookDetail.setYear(1595);
        bookDetail.setPublisher("PublisherA");
        bookDetail.setIsbn10("1234567890");
        bookDetail.setIsbn13("123-1234567890");

        return bookDetail;

    }

}
