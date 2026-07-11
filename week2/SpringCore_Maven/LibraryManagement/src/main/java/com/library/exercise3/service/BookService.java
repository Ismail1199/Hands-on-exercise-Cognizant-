package com.library.exercise3.service;

import com.library.exercise3.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        bookRepository.displayBook();
    }

}