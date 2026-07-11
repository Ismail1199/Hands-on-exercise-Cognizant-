package com.library.exercise3;

import com.library.exercise3.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "exercise3/applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.displayBook();

    }

}