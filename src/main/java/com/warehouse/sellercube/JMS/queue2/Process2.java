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
        //todo api check something

        if (true) {

        } else {
            //if api check fail,then will try three times
            //todo something
            for (int i = 1; i <= 3; i++) {
                preTreatmentOrder.setApiretrycount(i);

            }
        }


        //todo normal check something

        if (true) {

        } else {
            //if normal check fail,then will try three times
            //todo something
            for (int i = 1; i <= 3; i++) {
                preTreatmentOrder.setNcretrycount(i);
            }
        }

        //处理完成
        this.complete(preTreatmentOrder);
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
        orderParentService.updateSourceStateIdByOrderid(33, preTreatmentOrder.getOrderid());
    }
}
