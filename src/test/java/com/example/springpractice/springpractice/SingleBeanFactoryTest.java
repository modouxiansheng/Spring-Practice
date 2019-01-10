package com.example.springpractice.springpractice;

import com.example.springpractice.springpractice.Spring.BeanFactory.User;
import org.junit.Test;

import javax.annotation.Resource;

import static junit.framework.TestCase.assertTrue;

/**
 * @program: Spring-Practice
 * @description:
 * @author: hu_pf@suixingpay.com
 * @create: 2019-01-10 17:30
 **/
public class SingleBeanFactoryTest extends BaseTest{
    @Resource(name = "singleUser")
    private User user1;
    @Resource(name = "singleUser")
    private User user2;
    @Resource(name = "nonSingleUser")
    private User user3;
    @Resource(name = "nonSingleUser")
    private User user4;

    @Test
    public void testSingleBean(){
        assertTrue(user1 == user2);
        assertTrue(user3 != user4);
    }
}
