package com.warehouse.sellercube.thread;

import com.google.common.collect.ImmutableList;
import com.warehouse.sellercube.config.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by chenjing on 2017/4/11.
 */
@Component
public class StartTask   {

    final static Logger logger= LoggerFactory.getLogger(StartTask.class);

    //定义在构造方法完毕后，执行这个初始化方法
    @PostConstruct
    public  void init(){
        List<String> list= ImmutableList.of("a","b","c","d");
        logger.info("监控任务的总Task数：{}",list.size());
        for(int i=0;i<list.size();i++) {
            MoniotrTask moniotrTask=   ApplicationContextProvider.getBean("mTask", MoniotrTask.class);
            moniotrTask.setMonitor(list.get(i));
            moniotrTask.start();
            logger.info("第{}个监控task: {}启动 !",(i+1),list.get(i).toString());
        }
    }
}
