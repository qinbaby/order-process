package com.warehouse.sellercube.server.order.mysql.service.impl;

import com.warehouse.sellercube.server.order.mysql.entity.PreTreatmentOrder;
import com.warehouse.sellercube.server.order.mysql.service.PreTreatmentOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Chenjing on 2017/4/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PreTreatmentOrderServiceImplTest {
    @Autowired
    PreTreatmentOrderService preTreatmentOrderService;

    @Test
    public void getPreTreatmentOrdersByState() throws Exception {

    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void insertSelective() throws Exception {
        PreTreatmentOrder record=new PreTreatmentOrder();
        record.setCreatetime(new Date());
        record.setState(0);
        record.setLastupdatetime(new Date());
        record.setOrderid("sadsa");
        record.setOriginalpostid("asdsad");
        BigDecimal weight=new BigDecimal("0.23");
        record.setOriginalweight(weight);
        record.setErrorcode(0);
        System.out.println(preTreatmentOrderService.insertSelective(record));
    }

}