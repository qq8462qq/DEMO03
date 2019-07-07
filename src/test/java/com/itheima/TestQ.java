package com.itheima;

import com.itheima.proxy.test02.JieKou;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestQ {
    @Autowired
    private JieKou jieKou;
    @Test
    public void test02(){
        jieKou.Q();
    }
}
