package com.library.exercise6.service;

import com.library.exercise6.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void issueBook() {

        System.out.println("BookService is processing request...");

        bookRepository.getBook();

    }

}