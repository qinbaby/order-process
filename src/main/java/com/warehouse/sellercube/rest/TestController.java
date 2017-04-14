package com.warehouse.sellercube.rest;

import com.warehouse.sellercube.JMS.queue1.Sender1;
import com.warehouse.sellercube.common.entity.Result;
import com.warehouse.sellercube.server.order.mysql.entity.OrderParent;
import com.warehouse.sellercube.utils.ResultUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/11.
 */

@RestController
public class TestController {
    @Autowired
    private Sender1 sender;

    @GetMapping("/send")
    public Result send(){
        sender.send(new OrderParent());
        return ResultUtil.success("嘿嘿嘿");
    }

    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping("/delete/{userid}")
    public Result a() {
        return ResultUtil.success("nihao");
    }
}

