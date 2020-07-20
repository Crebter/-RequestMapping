package com.wudonglong.demo;

import com.wudonglong.service.UserService;
import com.wudonglong.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService)app.getBean("userService");

//        ApplicationContext app = new FileSystemXmlApplicationContext("D:\\Spring\\spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserService userService =  app.getBean(UserService.class);
        userService.sava();

        //错误示范(仅在容器中才会出现Service里面包着有dao层)  这里运行代码时会出现空指针
//        UserService userService = new UserServiceImpl();
//        userService1.sava();
    }
}
