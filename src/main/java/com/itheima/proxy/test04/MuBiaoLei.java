package com.itheima.proxy.test04;

import org.springframework.stereotype.Component;

@Component("mubiaolei")
public class MuBiaoLei implements JieKou {
    @Override
    public void fangFa() {
       //int a=1/0;
        System.out.println("目标类。。。。。。");
    }
}
