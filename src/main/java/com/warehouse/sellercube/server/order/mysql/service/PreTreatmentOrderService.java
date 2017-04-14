package com.warehouse.sellercube.server.order.mysql.service;

import com.warehouse.sellercube.server.order.mysql.entity.PreTreatmentOrder;

import java.util.List;

/**
 * Created by Chenjing on 2017/4/13.
 */
public interface PreTreatmentOrderService {

    List<PreTreatmentOrder> getPreTreatmentOrdersByState(Integer state);

    int updateByPrimaryKeySelective(PreTreatmentOrder preTreatmentOrder);

    int insertSelective(PreTreatmentOrder preTreatmentOrder);

    int updateByOrderid(PreTreatmentOrder preTreatmentOrder);
}
