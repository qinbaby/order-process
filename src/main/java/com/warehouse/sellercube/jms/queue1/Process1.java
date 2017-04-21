package com.warehouse.sellercube.jms.queue1;

import com.warehouse.sellercube.jms.queue2.Sender2;
import com.warehouse.sellercube.server.order.mysql.entity.OrderParent;
import com.warehouse.sellercube.server.order.mysql.entity.PreTreatmentOrder;
import com.warehouse.sellercube.server.order.mysql.service.PreTreatmentOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Chenjing on 2017/4/14.
 */
@Component
public class Process1 {

    private static final Logger log = LoggerFactory.getLogger(Process1.class);

    @Autowired
    private PreTreatmentOrderService preTreatmentOrderService;

    @Autowired
    private Sender2 sender;

    public void processing(OrderParent orderParent) {
        int count = preTreatmentOrderService.countByOrderId(orderParent.getOrderid());
        if (count >= 1) {
            log.error("该订单{}已经处理过一次了，不再进行处理", orderParent.getOrderid());
            //TODO sqlserver or orderparent 状态直接设置为0
            return;
        }

        //todo 预留一个第三方接口，假如拿到了
        PreTreatmentOrder record = new PreTreatmentOrder();
        record.setCreatetime(new Date());
        record.setState(0);
        record.setLastupdatetime(new Date());
        record.setOrderid(orderParent.getOrderid());
        record.setOriginalpostid(orderParent.getPostid());
        BigDecimal weight = new BigDecimal(orderParent.getWeight());
        record.setOriginalweight(weight);
        try {
            sender.send(record);
        }catch (Exception e){
            log.error("发送到队列2失败,失败信息：{}",e.getMessage());
        }

    }
}
