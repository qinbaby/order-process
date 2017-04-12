package com.warehouse.sellercube.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/11.
 */

@RestController
public class TestController {
/*    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public Result send(){
        sender.send();
        return ResultUtil.success("嘿嘿嘿");
    }*/

    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping("/asd")
    public String a() {
        return "asd";
    }
}

