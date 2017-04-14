package com.warehouse.sellercube.server.order.mysql.service.impl;

import com.warehouse.sellercube.server.order.mysql.entity.PreTreatmentOrder;
import com.warehouse.sellercube.server.order.mysql.mapper.PreTreatmentOrderMapper;
import com.warehouse.sellercube.server.order.mysql.service.PreTreatmentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenjing on 2017/4/13.
 */
@Service
public class PreTreatmentOrderServiceImpl implements PreTreatmentOrderService {

    @Autowired
    private PreTreatmentOrderMapper preTreatmentOrderMapper;

    @Override
    public List<PreTreatmentOrder> getPreTreatmentOrdersByState(Integer state) {
        return preTreatmentOrderMapper.getPreTreatmentOrdersByState(state);
    }

    @Override
    public int updateByPrimaryKeySelective(PreTreatmentOrder preTreatmentOrder) {
        return preTreatmentOrderMapper.updateByPrimaryKeySelective(preTreatmentOrder);
    }

    @Override
    public int insertSelective(PreTreatmentOrder preTreatmentOrder) {
        return preTreatmentOrderMapper.insertSelective(preTreatmentOrder);
    }

    @Override
    public int updateByOrderid(PreTreatmentOrder preTreatmentOrder) {
        return preTreatmentOrderMapper.updateByOrderid(preTreatmentOrder);
    }

    @Override
    public int countByOrderId(String orderId) {
        return preTreatmentOrderMapper.countByOrderId(orderId);
    }
}
