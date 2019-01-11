package com.example.springpractice.springpractice.Spring.FactoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 16:33
 **/
@Configuration
public class FactoryBeanAppConfig {

    @Bean
    public UserFactory userFactory(){
        System.out.println("Initialize Factory Begin");
        UserFactory userFactory = new UserFactory();
        userFactory.setAge(10);
        userFactory.setName("Grace");
        return userFactory;
    }

    @Bean(name = "singleUser")
    public SingleUserFactory getSingle(){
        SingleUserFactory singleUserFactory = new SingleUserFactory();
        singleUserFactory.setAge(12);
        singleUserFactory.setName("Single");
        return singleUserFactory;
    }

    @Bean(name = "nonSingleUser")
    public NonSingleUserFactory getNonSingle(){
        NonSingleUserFactory nonSingleUserFactory = new NonSingleUserFactory();
        nonSingleUserFactory.setAge(12);
        nonSingleUserFactory.setName("NonSingle");
        return nonSingleUserFactory;
    }

}
