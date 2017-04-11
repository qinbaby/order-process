package com.warehouse.sellercube.server.order.mysql.service;

import com.warehouse.sellercube.server.order.mysql.entity.Test;

/**
 * Created by chenjing on 2017/4/11.
 */
public interface TestService {
    Test selectByPrimary(Long id);
}
