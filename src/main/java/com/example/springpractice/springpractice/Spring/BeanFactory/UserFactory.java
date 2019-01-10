package com.example.springpractice.springpractice.Spring.BeanFactory;

import org.springframework.beans.factory.FactoryBean;

import javax.annotation.PostConstruct;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 16:23
 **/
public class UserFactory implements FactoryBean<User> {
    private String name;
    private Integer age;

    @Override
    public User getObject() throws Exception {
        System.out.println("getObject Begin");
        return new User(name,age);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @PostConstruct
    public void Initialize(){
        System.out.println("Initialize Begin");
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
