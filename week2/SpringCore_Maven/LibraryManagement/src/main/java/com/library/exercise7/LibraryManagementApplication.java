package com.library.exercise7;

import com.library.exercise7.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "exercise7/applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.issueBook();
    }
}