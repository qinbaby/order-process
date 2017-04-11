package com.warehouse.sellercube.server.order.sqlserver.service;

import com.warehouse.sellercube.server.order.sqlserver.entity.Testsqlserver;

/**
 * Created by Administrator on 2017/4/11.
 */
public interface TestsqlserverService {
    Testsqlserver selectByPrimary(Long id);
}
