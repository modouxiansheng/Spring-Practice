package com.example.springpractice.springpractice.Spring.WhatBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 15:24
 **/
@Configuration
//@ComponentScan(basePackageClasses = Company.class)
public class Config {

    @Bean
    public Address getAddress(){
        return new Address("High Street",10000);
    }
}
