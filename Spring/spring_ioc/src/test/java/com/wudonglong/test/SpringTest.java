package com.wudonglong.test;

import com.wudonglong.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    //测试scope属性
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 =  (UserDao) app.getBean("userDao");
//        UserDao userDao2 =  (UserDao) app.getBean("userDao");

        //地址相同则说明是singleton,地址不相同则说明是prototype
        System.out.println(userDao1);
//        System.out.println(userDao2);
    }

    @Test
    //测试Bean的生命周期
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 =  (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
    }
}
