package com.warehouse.sellercube.controller;

import com.warehouse.sellercube.JMS.Sender;
import com.warehouse.sellercube.common.entity.Result;
import com.warehouse.sellercube.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/11.
 */
@RestController
public class TestController {
    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public Result send(){
        sender.send();
        return ResultUtil.success("嘿嘿嘿");
    }
}
