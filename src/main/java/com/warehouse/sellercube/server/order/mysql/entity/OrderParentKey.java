package com.warehouse.sellercube.server.order.mysql.entity;

import java.io.Serializable;

public class OrderParentKey implements Serializable {
    private Integer id;

    private String orderid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    @Override
    public String toString() {
        return "OrderParentKey{" +
                "id=" + id +
                ", orderid='" + orderid + '\'' +
                '}';
    }
}