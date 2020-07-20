package com.wudonglong.factory;

import com.wudonglong.dao.UserDao;
import com.wudonglong.dao.impl.UserDaoImpl;

public class DynamicFactory {



    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }


}
