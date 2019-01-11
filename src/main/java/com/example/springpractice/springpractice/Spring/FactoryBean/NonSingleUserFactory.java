package com.example.springpractice.springpractice.Spring.FactoryBean;

import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 16:59
 **/
public class NonSingleUserFactory extends AbstractFactoryBean<User> {

    private String name;
    private Integer age;

    public NonSingleUserFactory(){
        setSingleton(false);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    protected User createInstance() throws Exception {
        return new User(name,age);
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
