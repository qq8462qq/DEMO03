package com.itheima.proxy.Test03;

import org.aspectj.lang.ProceedingJoinPoint;

public class WW {
    public void QW(){
        System.out.println("W前置增强。。。。。");
    }
    public void QZ(){
        System.out.println("W最终增强。。。。。");
    }
    public void QY(){

        System.out.println("W异常抛出增强。。。。。");

    }
    public void QH(){
        System.out.println("W后置增强。。。。。");
    }
    public Object Q(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("W环绕前增强。。。。。");
        Object proceed = pjp.proceed();
        System.out.println("W环绕后增强。。。。。");
        return proceed;
    }


}
