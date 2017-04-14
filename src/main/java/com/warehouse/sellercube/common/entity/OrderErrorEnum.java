package com.warehouse.sellercube.common.entity;

/**
 * Created by Chenjing on 2017/4/14.
 */

/**
 * 预处理订单的错误代码和错误描述
 */
public enum  OrderErrorEnum {
    SUCCESS(1,"成功"),
    ERROR(2,"失败");

    private int code;
    private String msg;

    private OrderErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
