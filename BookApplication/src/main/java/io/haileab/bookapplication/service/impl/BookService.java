package io.haileab.bookapplication.service.impl;

import io.haileab.bookapplication.domain.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(String isbn);
    Book getBook(String isbn);
    List<Book> getAllBooks();

}
