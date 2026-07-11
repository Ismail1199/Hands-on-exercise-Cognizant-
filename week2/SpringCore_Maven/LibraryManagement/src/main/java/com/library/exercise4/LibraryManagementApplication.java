package com.library.exercise4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "exercise4/applicationContext.xml");

        Book b1 = context.getBean("book", Book.class);
        Book b2 = context.getBean("book", Book.class);

        b1.display();
        b2.display();

        System.out.println(b1 == b2);

    }

}