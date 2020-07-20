package wudonglong.service.impl;


import wudonglong.dao.UserDao;
import wudonglong.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void sava() {
        userDao.sava();
    }
}
