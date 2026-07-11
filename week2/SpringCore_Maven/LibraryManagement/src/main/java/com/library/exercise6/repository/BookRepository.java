package com.library.exercise6.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public void getBook() {
        System.out.println("Book fetched from Repository");
    }

}