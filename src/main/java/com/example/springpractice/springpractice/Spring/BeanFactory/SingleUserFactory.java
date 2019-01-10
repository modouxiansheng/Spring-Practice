package com.example.springpractice.springpractice.Spring.BeanFactory;

import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 16:58
 **/
public class SingleUserFactory extends AbstractFactoryBean<User> {

    private String name;
    private Integer age;

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
