package com.warehouse.sellercube.JMS.queue2;

import com.warehouse.sellercube.server.order.mysql.entity.PreTreatmentOrder;
import com.warehouse.sellercube.server.order.mysql.service.OrderParentService;
import com.warehouse.sellercube.server.order.mysql.service.PreTreatmentOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chenjing on 2017/4/14.
 */
@Component
public class Process2 {

    private static final Logger log = LoggerFactory.getLogger(Process.class);

    @Autowired
    private PreTreatmentOrderService preTreatmentOrderService;

    @Autowired
    private OrderParentService orderParentService;

    public void processing(PreTreatmentOrder preTreatmentOrder) {
        //模拟第三方接口

    }

    /**
     * 该方法代表所有的都执行完毕
     *
     * @param preTreatmentOrder
     */
    @Transactional
    public void complete(PreTreatmentOrder preTreatmentOrder) {
        preTreatmentOrder.setState(2);
        preTreatmentOrderService.updateByOrderid(preTreatmentOrder);
        orderParentService.updateSourceStateIdByOrderid(2, preTreatmentOrder.getOrderid());
    }
}
