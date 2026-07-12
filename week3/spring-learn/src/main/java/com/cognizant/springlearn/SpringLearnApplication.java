package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);

        LOGGER.info("Today's Date : {}", format.format(new Date()));

//        Country country1 =
//                context.getBean("country", Country.class);
//
//        Country country2 =
//                context.getBean("country", Country.class);
//
//        LOGGER.info("Country1 : {}", country1);
//        LOGGER.info("Country2 : {}", country2);
//
//        LOGGER.info("Same Object : {}", country1 == country2);

        context.close();
    }
}