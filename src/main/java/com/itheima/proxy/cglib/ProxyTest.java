package com.itheima.proxy.cglib;

import com.itheima.proxy.jdk.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(final String[] args) {
          final Target target = new Target();
          final Advice advice = new Advice();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
               advice.before();
                Object invoke = method.invoke(target, args);
                advice.afterReturning();
                return invoke;
            }
        });
        Target proxy = (Target) enhancer.create();
        proxy.save();


    }

}
