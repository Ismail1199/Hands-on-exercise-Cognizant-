package com.library.exercise6;

import com.library.exercise6.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "exercise6/applicationContext.xml");

        BookService service =
                context.getBean(BookService.class);

        service.issueBook();

    }

}