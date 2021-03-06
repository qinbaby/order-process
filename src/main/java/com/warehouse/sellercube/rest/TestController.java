package com.warehouse.sellercube.rest;

import com.warehouse.sellercube.common.entity.Result;
import com.warehouse.sellercube.utils.ResultUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/11.
 */

@RestController
public class TestController {

    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping("/delete/{userid}")
    public Result a() {
        return ResultUtil.success("nihao");
    }
}

