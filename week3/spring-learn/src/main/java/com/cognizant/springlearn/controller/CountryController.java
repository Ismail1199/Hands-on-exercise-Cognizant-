package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CountryController {

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = null;

        switch (code.toUpperCase()) {
            case "IN":
                country = context.getBean("countryIndia", Country.class);
                break;

            case "US":
                country = context.getBean("countryUS", Country.class);
                break;

            case "DE":
                country = context.getBean("countryGermany", Country.class);
                break;

            case "JP":
                country = context.getBean("countryJapan", Country.class);
                break;
        }

        context.close();

        return country;
    }
    @GetMapping("/country")
    public Country getCountry() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);

        context.close();

        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries = new ArrayList<>();

        countries.add(context.getBean("countryIndia", Country.class));
        countries.add(context.getBean("countryUS", Country.class));
        countries.add(context.getBean("countryGermany", Country.class));
        countries.add(context.getBean("countryJapan", Country.class));

        context.close();

        return countries;
    }

}