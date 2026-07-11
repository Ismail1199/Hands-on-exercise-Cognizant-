package com.library.exercise5.service;

import com.library.exercise5.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void issueBook() {

        System.out.println("BookService is processing request...");

        bookRepository.getBook();

    }

}