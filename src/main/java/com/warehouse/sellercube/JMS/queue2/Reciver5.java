package com.warehouse.sellercube.JMS.queue2;

import com.warehouse.sellercube.config.RabbitConfig;
import com.warehouse.sellercube.server.order.mysql.entity.OrderParent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing on 2017/4/11.
 */

@Component
@RabbitListener(queues = RabbitConfig.QUEUE2)
@Async
public class Reciver5 {

    private static final Logger log= LoggerFactory.getLogger(Reciver5.class);

    @RabbitHandler
    public void process(OrderParent orderParent) {
       log.info("第五个消费者正在处理=》" + orderParent);
    }
}

