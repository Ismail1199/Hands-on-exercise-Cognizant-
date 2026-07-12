package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private String code;
    private String name;

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Country.class);

    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    public Country(String code, String name) {
        System.out.println("Inside Parameterized Constructor");
        this.code = code;
        this.name = name;
    }

    public void setCode(String code) {
        LOGGER.debug("Inside setCode");
        this.code = code;
    }

    public void setName(String name) {
        LOGGER.debug("Inside setName");
        this.name = name;
    }

    public String getCode() {
        LOGGER.debug("Inside getCode");
        return code;
    }

    public String getName() {
        LOGGER.debug("Inside getName");
        return name;
    }


    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}