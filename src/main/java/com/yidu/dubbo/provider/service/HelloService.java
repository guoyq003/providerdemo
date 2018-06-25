package com.yidu.dubbo.provider.service;

public interface HelloService {
    public String sayHello(String name,int age);
    public String getUserInfo(String name,String password);
    public int getNum(int n);
    public double getsim(String str1, String str2);
    public void whileSleepFun();
}
