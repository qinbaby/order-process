package com.warehouse.sellercube.server.order.mysql.mapper;

import com.warehouse.sellercube.server.order.mysql.entity.PreTreatmentOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PreTreatmentOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PreTreatmentOrder record);

    int insertSelective(PreTreatmentOrder record);

    PreTreatmentOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PreTreatmentOrder record);

    int updateByPrimaryKey(PreTreatmentOrder record);

    /**
     * 根据状态获取预处理订单
     *
     * @param state
     * @return List<PreTreatmentOrder>
     */
    List<PreTreatmentOrder> getPreTreatmentOrdersByState(Integer state);

    /**
     *根据orderid更新
     * @param preTreatmentOrder
     */
    int updateByOrderid(PreTreatmentOrder preTreatmentOrder);

    int countByOrderId(String orderId);
}