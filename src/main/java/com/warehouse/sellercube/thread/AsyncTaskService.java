package com.warehouse.sellercube.thread;

/**
 * Created by Administrator on 2017/4/11.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class AsyncTaskService {

    private  static  final  Logger  LOGGER= LoggerFactory.getLogger(AsyncTaskService.class);
    @Async
    public void executeAsyncTask(Integer i){
        LOGGER.info("?执行异步任务: "+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        LOGGER.info("?执行异步任务+1: "+(i+1));
    }

}