package com.itheima.proxy.jdk;

public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("增强save。。。。");
    }
}
