package io.haileab.bookapplication.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Book {
    private String isbn;
    private String title;
    private String author;
    private BigDecimal price;
}
