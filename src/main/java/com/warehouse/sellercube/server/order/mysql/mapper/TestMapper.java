package com.warehouse.sellercube.server.order.mysql.mapper;


import com.warehouse.sellercube.server.order.mysql.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {
    Test selectByPrimaryKey(@Param("id") Long id);
}