package com.itheima;


import com.itheima.proxy.test04.JieKou;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-test04.xml")
public class cheshi04 {
    @Autowired
    private JieKou kou;
    @Test
    public void test(){
        kou.fangFa();
    }
}
