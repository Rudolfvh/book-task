package com.example.spring.entity.bean;

import org.springframework.beans.factory.InitializingBean;

public class InitBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Default-Init Bean");
    }

}
