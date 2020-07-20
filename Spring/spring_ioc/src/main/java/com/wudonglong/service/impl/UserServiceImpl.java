package com.wudonglong.service.impl;

import com.wudonglong.dao.UserDao;
import com.wudonglong.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {

    }

    //    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void sava() {
       userDao.save();
    }
}
