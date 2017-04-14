package com.warehouse.sellercube.job;

import com.warehouse.sellercube.JMS.queue1.Sender1;
import com.warehouse.sellercube.server.order.mysql.entity.OrderParent;
import com.warehouse.sellercube.server.order.mysql.mapper.OrderParentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.Date;
import java.util.List;

/**
 * Created by Chenjing on 2017/4/14.
 */

/**
 * 描述：该定时任务定时将orderparent表的内容发送到rabbitmq队列1  间隔五分钟
 */
@Component
public class OrderParentJob {

    private static final Logger log = LoggerFactory.getLogger(OrderParentJob.class);

    @Autowired
    private OrderParentMapper orderParentMapper;

    @Autowired
    private Sender1 sender;

    @Scheduled(initialDelay = 300 * 1000, fixedRate = 300 * 1000)
    public void Job() {
        /**
         * 因为Quartz与SpringMVC的context不同，父context无法访问子context中的bean。
         * 那么autowired的bean便无法注入进来，所以加上下面这段话
         */
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
        List<OrderParent> orderParents = orderParentMapper.getOrderParentsByState(-3);
        if (null != orderParents && !orderParents.isEmpty()) {
            orderParents.parallelStream().forEach(x -> sender.send(x));
        } else {
            log.info("当前orderparent表没有符合条件状态为-3的记录，时间：{}", new Date());
        }
    }
}
