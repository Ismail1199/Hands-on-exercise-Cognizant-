package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public Country getCountry(String code) {

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
            default:
                context.close();
                throw new CountryNotFoundException();
        }

        context.close();
        return country;
    }
}