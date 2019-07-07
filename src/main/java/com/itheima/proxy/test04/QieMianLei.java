package com.itheima.proxy.test04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("qiemianlei")
@Aspect
public class QieMianLei {
   @Before("execution(* com.itheima.proxy..*.*(..))")
    public void zhengQiangQ(){
        System.out.println("增强前置。。。");
    }
    @After("dailizhujie()")
    public void zhengQiangZ(){
        System.out.println("增强最终。。。");
    }
    @AfterReturning("dailizhujie()")
    public void zhengQiangH(){
        System.out.println("增强后置。。。");
    }

    @Around("dailizhujie()")
    public Object zhengQiangHR(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("增强环绕前。。。");
        Object proceed = pjp.proceed();
        System.out.println("增强环绕后。。。");
         return proceed;
    }
    @AfterThrowing("QieMianLei.dailizhujie()")
    public void zhengQiangY(){
        System.out.println("异常抛出。。。");
    }
    @Pointcut("execution(* com.itheima.proxy..*.*(..))")
    public void dailizhujie(){

    }





















}
