package com.example.springpractice.springpractice;

import com.example.springpractice.springpractice.Spring.WhatBean.Address;
import com.example.springpractice.springpractice.Spring.WhatBean.Company;
import com.example.springpractice.springpractice.Spring.WhatBean.Config;
import org.apache.catalina.User;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringpracticeApplicationTests {

	@Autowired
	private Address address;
	@Autowired
	private Company company2;

	@Test
	public void whatBeanTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Company company = context.getBean("company",Company.class);
		assertEquals("High Street", company.getAddress().getStreet());
		assertEquals(10000, company.getAddress().getNum());
		System.out.println(1);
	}

}

