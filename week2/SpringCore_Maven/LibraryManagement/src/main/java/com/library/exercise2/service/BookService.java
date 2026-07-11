package com.library.exercise2.service;

import com.library.exercise2.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("BookService is calling BookRepository...");
        bookRepository.displayBook();
    }
}