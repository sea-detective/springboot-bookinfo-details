package com.springboot.bookinfo.details.api.controller.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 类BookDetail的实现描述: 书籍的详细信息
 *
 * @author hongyang 2019-10-08 17:24
 */
public class BookDetail {

    private Long id;
    private String author;
    private Integer year;
    private String type;
    private Integer pages;
    private String publisher;
    private String language;
    private String isbn10;
    private String isbn13;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("author", author)
                .append("year", year)
                .append("type", type)
                .append("pages", pages)
                .append("publisher", publisher)
                .append("language", language)
                .append("isbn10", isbn10)
                .append("isbn13", isbn13)
                .toString();
    }
}
