package com.warehouse.sellercube;

import com.warehouse.sellercube.thread.AsyncTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.task.TaskExecutor;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by chenjing on 2017/4/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadTest {
    @Autowired
    private AsyncTaskService asyncTaskService;

    @Autowired
    private TaskExecutor taskExecutor;
    @Test
    public void show()throws Exception{
        for(int i =0 ;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

        for (int i=0;i<5;i++){
            taskExecutor.execute(()->System.out.println(Thread.currentThread().getName()));
        }
    }
}
