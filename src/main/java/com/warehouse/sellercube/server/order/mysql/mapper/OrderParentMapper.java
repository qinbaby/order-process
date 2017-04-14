package com.warehouse.sellercube.server.order.mysql.mapper;

import com.warehouse.sellercube.server.order.mysql.entity.OrderParent;
import com.warehouse.sellercube.server.order.mysql.entity.OrderParentKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderParentMapper {
    int deleteByPrimaryKey(OrderParentKey key);

    int insert(OrderParent record);

    int insertSelective(OrderParent record);

    OrderParent selectByPrimaryKey(OrderParentKey key);

    int updateByPrimaryKeySelective(OrderParent record);

    int updateByPrimaryKey(OrderParent record);

    /**
     * 拿到一千个订单
     * @param state
     * @return
     */
    List<OrderParent> getOrderParentsByState(Integer state);

    /**
     * 根据orderid进行更新 sourcestateid
     */
    int updateSourceStateIdByOrderid(@Param("sourceStateId") Integer sourcestateid,@Param("orderId")String orderid);
}