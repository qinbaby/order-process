package com.warehouse.sellercube.JMS.queue1;

import com.warehouse.sellercube.config.RabbitConfig;
import com.warehouse.sellercube.server.order.mysql.entity.OrderParent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by chenjing on 2017/4/11.*/


@Component
public class Sender1 implements RabbitTemplate.ConfirmCallback {

    private static final Logger log= LoggerFactory.getLogger(Sender1.class);

    private RabbitTemplate rabbitTemplate;

    /**
     * 构造方法注入
     */
    @Autowired
    public Sender1(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        rabbitTemplate.setConfirmCallback(this); //rabbitTemplate如果为单例的话，那回调就是最后设置的内容
    }

    public void send(OrderParent orderParent) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE,RabbitConfig.ROUTINGKEY1, orderParent,
                new CorrelationData(UUID.randomUUID().toString()));
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        if (!b) {
            log.error("消息消费失败:id=>{},原因=>{}",correlationData.toString(),s);
        }
    }
}
