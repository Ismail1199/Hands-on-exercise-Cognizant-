package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code,
                              HttpServletRequest request)
            throws CountryNotFoundException {

        LOGGER.info("START");
        LOGGER.info("Accept Header : {}", request.getHeader("Accept"));

        Country country = countryService.getCountry(code);

        LOGGER.info("END");

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