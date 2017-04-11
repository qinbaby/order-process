package com.warehouse.sellercube.server.order.sqlserver.service.impl;

import com.warehouse.sellercube.server.order.sqlserver.entity.Testsqlserver;
import com.warehouse.sellercube.server.order.sqlserver.mapper.TestsqlserverMapper;
import com.warehouse.sellercube.server.order.sqlserver.service.TestsqlserverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/11.
 */
@Service
public class TestsqlserverServiceImpl implements TestsqlserverService {

    @Autowired
    TestsqlserverMapper testsqlserverMapper;
    @Override
    public Testsqlserver selectByPrimary(Long id) {
        return testsqlserverMapper.selectByPrimaryKey(id);
    }
}
