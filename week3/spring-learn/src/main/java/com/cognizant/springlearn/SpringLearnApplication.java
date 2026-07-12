package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);

        System.out.println("Today's Date : " +
                format.format(new Date()));

        context.close();
    }
}