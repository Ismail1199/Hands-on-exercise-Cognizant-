package com.library.exercise8.service;

import com.library.exercise8.repository.BookRepository;

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