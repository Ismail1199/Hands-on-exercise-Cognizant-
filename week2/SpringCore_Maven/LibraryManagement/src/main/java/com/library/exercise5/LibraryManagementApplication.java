package com.library.exercise5;

import com.library.exercise5.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "exercise5/applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.issueBook();

    }

}