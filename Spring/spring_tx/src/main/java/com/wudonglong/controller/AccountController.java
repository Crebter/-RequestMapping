package com.wudonglong.controller;

import com.wudonglong.service.AccountService;
import com.wudonglong.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {
    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) app.getBean("accountService");
        accountService.transfer("cat","cat2",333);
    }
}
