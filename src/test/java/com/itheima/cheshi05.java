package com.itheima;


import com.itheima.proxy.test05.JieKou1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-Demo.xml")
public class cheshi05 {
    @Autowired
    private JieKou1 jiekou;
    @Test
    public void test(){
        jiekou.demo1();
    }
}
