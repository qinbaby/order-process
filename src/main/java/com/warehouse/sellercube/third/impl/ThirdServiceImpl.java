package com.warehouse.sellercube.third.impl;

import com.alibaba.fastjson.JSONArray;
import com.warehouse.sellercube.third.ThirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Chenjing on 2017/4/13.
 */
public class ThirdServiceImpl implements ThirdService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public JSONArray getData() {
        return null;
    }
}
