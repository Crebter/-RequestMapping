package com.wudonglong.aop;

public class Target implements TargetInterface {
    public void save() {
//        int i = 1/0;
        System.out.println("sava running");

    }
}
