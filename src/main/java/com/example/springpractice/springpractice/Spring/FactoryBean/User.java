package com.example.springpractice.springpractice.Spring.FactoryBean;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 16:24
 **/
public class User {

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
