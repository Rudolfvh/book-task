package com.example.spring.entity.bean;

import org.springframework.beans.factory.DisposableBean;

public class DestroyBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Default-Destroy Bean");
    }
}