package com.itheima.proxy.test05;

import org.springframework.stereotype.Component;

@Component("demo2")
public class Demo2 implements JieKou1 {
    @Override
    public void demo1() {
        System.out.println("目标类");
       // int a=8/0;
    }
}
