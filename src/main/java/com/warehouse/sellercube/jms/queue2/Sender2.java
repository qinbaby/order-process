package com.warehouse.sellercube.jms.queue2;

import com.warehouse.sellercube.config.RabbitConfig;
import com.warehouse.sellercube.server.order.mysql.entity.PreTreatmentOrder;
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
public class Sender2 implements RabbitTemplate.ConfirmCallback {

    private static final Logger log= LoggerFactory.getLogger(Sender2.class);

    private RabbitTemplate rabbitTemplate;

    /**
     * 构造方法注入
     */
    @Autowired
    public Sender2(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        rabbitTemplate.setConfirmCallback(this); //rabbitTemplate如果为单例的话，那回调就是最后设置的内容
    }

    public void send(PreTreatmentOrder preTreatmentOrder) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE,RabbitConfig.ROUTINGKEY2, preTreatmentOrder,
                new CorrelationData(UUID.randomUUID().toString()));
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        if (b) {
            log.info("消息消费成功=>"+correlationData);
        } else {
            log.error("消息消费失败:id=>{},原因=>{}",correlationData.toString(),s);
        }
    }
}
