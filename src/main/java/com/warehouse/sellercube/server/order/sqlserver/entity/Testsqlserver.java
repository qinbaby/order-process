package com.warehouse.sellercube.server.order.sqlserver.entity;

public class Testsqlserver {
    private Long id;

    private String orderid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }
}