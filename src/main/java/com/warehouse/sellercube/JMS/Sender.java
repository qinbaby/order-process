package com.warehouse.sellercube.JMS;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by chenjing on 2017/4/11.
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send() {
        String context = "hello " + new Date();
        //System.out.println("Sender : " + context);
        for (int i=0,j=1000;i<j;i++){
        this.rabbitTemplate.convertAndSend("hello", "这是第"+i+"次=》"+context);
        }
    }
}
