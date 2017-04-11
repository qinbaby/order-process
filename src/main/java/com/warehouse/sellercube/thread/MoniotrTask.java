package com.warehouse.sellercube.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/11.
 */
@Component("mTask")
@Scope("prototype")
public class MoniotrTask extends Thread {

    private final static Logger logger= LoggerFactory.getLogger(MoniotrTask.class);

    //参数封装
    private String test;

    public void setMonitor(String param) {
        this.test = param;
    }

    public String getTest() {
        return test;
    }

    @Override
    public void run() {
        logger.info("线程:"+Thread.currentThread().getName()+"运行中.....");
    }

}
