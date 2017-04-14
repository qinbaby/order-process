package com.warehouse.sellercube.JMS.queue2;

import com.warehouse.sellercube.config.RabbitConfig;
import com.warehouse.sellercube.server.order.mysql.entity.PreTreatmentOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing on 2017/4/11.
 */

/**
 * 监听队列2，把拿到最低邮费的订单拿过来，也就是把preTreatmentOrder表状态为0的订单拿过来处理
 */
@Component
@RabbitListener(queues = RabbitConfig.QUEUE2)
@Async
public class Reciver1 {

    private static final Logger log = LoggerFactory.getLogger(Reciver1.class);

    @Autowired
    private Process2 process2;

    @RabbitHandler
    public synchronized void process(PreTreatmentOrder preTreatmentOrder) {
        process2.processing(preTreatmentOrder);
    }
}

