package com.wudonglong.service.impl;

import com.wudonglong.dao.UserDao;
import com.wudonglong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean id="userService" class="com.wudonglong.service.impl.UserServiceImpl">
@Service("userService")
public class UserServiceImpl implements UserService {
    //<property name="userDao" ref="userDao"></property>


//    @Autowired //按照数据类型从Spring容器中进行匹配的
//    @Qualifier("userDao")//按照ID值从容器中进行匹配的 但是主要此处 @Qualifier 结合 @Autowired一起使用
    @Resource(name="userDao")
    private UserDao userDao;

    @Value("${jdbc.Driver}")
    private String driver;

    @Override
    public void sava() {
//        System.out.println(driver);
        userDao.sava();
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Service对象的初始化方法");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Service对象的销毁方法");
//    }
}
