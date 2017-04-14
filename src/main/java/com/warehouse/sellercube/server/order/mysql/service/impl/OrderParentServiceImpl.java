package com.warehouse.sellercube.server.order.mysql.service.impl;

import com.warehouse.sellercube.server.order.mysql.entity.OrderParent;
import com.warehouse.sellercube.server.order.mysql.mapper.OrderParentMapper;
import com.warehouse.sellercube.server.order.mysql.service.OrderParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Chenjing on 2017/4/14.
 */
@Service
public class OrderParentServiceImpl implements OrderParentService {

    @Autowired
    private OrderParentMapper orderParentMapper;

    @Override
    public int updateSourceStateIdByOrderid(Integer sourceStateId, String orderId) {
        return orderParentMapper.updateSourceStateIdByOrderid(sourceStateId,orderId);
    }
}
