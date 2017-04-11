package com.warehouse.sellercube;

import com.warehouse.sellercube.config.ApplicationContextProvider;
import com.warehouse.sellercube.thread.MoniotrTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/4/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadTest {
    @Test
    public void show()throws Exception{
        MoniotrTask m1=ApplicationContextProvider.getBean("mTask", MoniotrTask.class);
        MoniotrTask m2=ApplicationContextProvider.getBean("mTask", MoniotrTask.class);
        MoniotrTask m3=ApplicationContextProvider.getBean("mTask", MoniotrTask.class);
        System.out.println(m1+" => "+m1.getName());
        System.out.println(m2+" => "+m2.getName());
        System.out.println(m3+" => "+m3.getName());

    }
}