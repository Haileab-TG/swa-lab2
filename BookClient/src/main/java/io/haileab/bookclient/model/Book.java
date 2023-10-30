package io.haileab.bookclient.model;

import lombok.*;

import java.math.BigDecimal;


@Data
public class Book {

    private Long id;
    private String isbn;
    private String title;
    private String author;
    private BigDecimal price;
}
