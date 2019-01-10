package com.example.springpractice.springpractice.Spring.WhatBean;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 15:17
 **/
public class Address {
    private String street;
    private int num;

    public Address(String street, int num) {
        this.street = street;
        this.num = num;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
