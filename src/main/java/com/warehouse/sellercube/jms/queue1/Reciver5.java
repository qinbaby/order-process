package com.warehouse.sellercube.jms.queue1;

import com.warehouse.sellercube.config.RabbitConfig;
import com.warehouse.sellercube.server.order.mysql.entity.OrderParent;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing on 2017/4/11.
 */

@Component("queue1Rec5")
@RabbitListener(queues = RabbitConfig.QUEUE1)
@Async
public class Reciver5 {

    @Autowired
    private Process1 process;

    /**
     * 拿到最便宜的邮寄方式，插入到pre表里，pre里面的state为0
     *
     * @param orderParent
     */
    @RabbitHandler
    public synchronized void process(OrderParent orderParent) {
        process.processing(orderParent);
    }
}

