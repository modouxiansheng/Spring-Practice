package com.example.springpractice.springpractice;

import com.example.springpractice.springpractice.Spring.BeanFactory.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

import static junit.framework.TestCase.assertEquals;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 16:35
 **/
public class BeanFactoryTest extends BaseTest{

    @Autowired
    private User user;

    @Test
    public void testBeanFactory(){
        assertEquals(new Integer(10),user.getAge());
        assertEquals("Grace",user.getName());
    }
}
