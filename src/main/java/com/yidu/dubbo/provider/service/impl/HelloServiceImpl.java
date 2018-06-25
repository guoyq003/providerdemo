package com.yidu.dubbo.provider.service.impl;

import com.yidu.dubbo.provider.service.HelloService;
import com.yidu.dubbo.provider.util.UtilFun;

@org.springframework.stereotype.Service("helloServiceImpl")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name,int age) {
        return "Hi,"+name+"你的年龄是:"+age+"岁!";
    }

    @Override
    public String getUserInfo(String name, String password) {
        if (name.equals("test")&&"E10ADC3949BA59ABBE56E057F20F883E".equals(password)){
            return "Hi,你的姓名是："+name+",年龄是20岁";
        }else if ("test1".equals(name)&&password.equals("C8837B23FF8AAA8A2DDE915473CE0991")){
            return "Hi,你的姓名是："+name+",年龄是32岁";
        }else {
            return "用户名或密码错误,请重新输入!";
        }
    }

    @Override
    public int getNum(int n) {
        int num=0;
        for (int i=1;i<=n;i++){
            num=UtilFun.getFibonacciSequenceNum(i);
        }
        return num;
    }

    @Override
    public double getsim(String str1, String str2) {
        return UtilFun.sim(str1,str2);
    }

    @Override
    public void whileSleepFun() {
        while (true){
            UtilFun.getFibonacciSequenceNum(10);
        }
    }

}
