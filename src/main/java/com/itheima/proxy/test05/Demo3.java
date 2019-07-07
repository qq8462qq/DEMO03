package com.itheima.proxy.test05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("demo3")
@Aspect
public class Demo3 {
    //@Before("execution(* com.itheima.proxy.test05.*.*(..))")
   // @Before("demo9()")
    @Before("Demo3.demo9()")//可以以类名调用demo9的方法实现地址代理
    public void demo4(){
        System.out.println("前置增强......");
    }
   // @AfterReturning("execution(* com.itheima.proxy.test05.*.*(..))")
    @AfterReturning("demo9()")
    public void demo5(){
        System.out.println("后置增强......");
    }
    //@Around("execution(* com.itheima.proxy.test05.*.*(..))")
    @Around("demo9()")
    public Object demo6(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强......");
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强......");
        return proceed;
    }
   // @AfterThrowing("execution(* com.itheima.proxy.test05.*.*(..))")
    @AfterThrowing("demo9()")
    public void demo7(){
        System.out.println("异常抛出......");
    }
    //@After("execution(* com.itheima.proxy.test05.*.*(..))")
    @After("demo9()")
    public void demo8(){
        System.out.println("最终执行类......");
        System.out.println("天若有情、天亦老！");
    }
    @Pointcut("execution(* com.itheima.proxy.test05.*.*(..))")//可以抽取一个方法来代理地址、简化代码
    public void demo9(){
        System.out.println("天若有情、天亦老！");

    }

}
