package com.wudonglong.anno;

import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TargetInterface {
    public void save() {
//        int i = 1/0;
        System.out.println("sava running");

    }
}
