package com.wudonglong.dao.impl;

import com.wudonglong.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="com.wudonglong.dao.impl.UserDaoImpl"></bean>
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void sava() {
        System.out.println("sava success!");
    }
}
