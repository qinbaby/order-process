package com.warehouse.sellercube.JMS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing on 2017/4/11.
 */
@Component
@RabbitListener(queues = "hello")
public class Reciver {

    private static final Logger log= LoggerFactory.getLogger(Reciver.class);

    @RabbitHandler
    public void process(String hello) {
       log.info("第一个消费者正在处理=》" + hello);
    }
}