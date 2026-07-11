package com.library.exercise7.service;

import com.library.exercise7.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection Executed");
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection Executed");
    }

    public void issueBook() {
        System.out.println("BookService is processing...");
        bookRepository.displayBook();
    }

}