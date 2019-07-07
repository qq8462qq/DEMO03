package com.itheima.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
          final Target target = new Target();
        TargetInterface p = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                method.invoke(target,args);
                return null;
            }
        });
        p.save();
    }

}
