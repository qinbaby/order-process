package com.warehouse.sellercube.server.order.mysql.service;

/**
 * Created by Chenjing on 2017/4/14.
 */
public interface OrderParentService {
    int updateSourceStateIdByOrderid(Integer sourceStateId,String orderId);
}
