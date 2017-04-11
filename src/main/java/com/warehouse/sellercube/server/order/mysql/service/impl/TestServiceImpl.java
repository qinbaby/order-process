package com.warehouse.sellercube.server.order.mysql.service.impl;

import com.warehouse.sellercube.server.order.mysql.entity.Test;
import com.warehouse.sellercube.server.order.mysql.mapper.TestMapper;
import com.warehouse.sellercube.server.order.mysql.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/11.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Override
    public Test selectByPrimary(Long id) {
        return testMapper.selectByPrimaryKey(id);
    }
}
