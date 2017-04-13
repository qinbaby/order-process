package com.warehouse.sellercube.JMS;

import com.warehouse.sellercube.config.RabbitConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing on 2017/4/11.*/


@Component
@RabbitListener(queues = RabbitConfig.QUEUE)
@Async
public class Reciver2 {

    private static final Logger log= LoggerFactory.getLogger(Reciver2.class);

    @RabbitHandler
    public void process(String hello) {
       log.info("第二个消费者正在处理=》" + hello);
    }
}
