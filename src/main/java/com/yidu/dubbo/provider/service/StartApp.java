package com.yidu.dubbo.provider.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        synchronized (StartApp.class) {
            while (true) {
                try {
                    System.out.println("provider registered!");
                    StartApp.class.wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
