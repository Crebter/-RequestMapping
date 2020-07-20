package com.wudonglong.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wudonglong.dao.AccountDao;
import com.wudonglong.service.AccountService;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
//@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    //事务属性
    @Transactional
    public void transfer(String outMan, String inMan, double money){
        accountDao.out(outMan,money);
//        int i = 1/0;
        accountDao.in(inMan,money);
    }
}
