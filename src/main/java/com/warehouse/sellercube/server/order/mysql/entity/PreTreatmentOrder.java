package com.warehouse.sellercube.server.order.mysql.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PreTreatmentOrder implements Serializable {
    private Long id;

    private String orderid;

    private String originalpostid;

    private String newpostid;

    private BigDecimal originalweight;

    private BigDecimal newfreight;

    private Date createtime;

    private Integer state;

    private String traceid;

    private String urlfile;

    private Boolean isreturn;

    private Integer errorcode;

    private String errordesc;

    private Date lastupdatetime;

    private String remark;

    private Boolean isnormalcheck;

    private Boolean isapicheck;

    private Integer ncretrycount;

    private Integer apiretrycount;

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

    public String getOriginalpostid() {
        return originalpostid;
    }

    public void setOriginalpostid(String originalpostid) {
        this.originalpostid = originalpostid == null ? null : originalpostid.trim();
    }

    public String getNewpostid() {
        return newpostid;
    }

    public void setNewpostid(String newpostid) {
        this.newpostid = newpostid == null ? null : newpostid.trim();
    }

    public BigDecimal getOriginalweight() {
        return originalweight;
    }

    public void setOriginalweight(BigDecimal originalweight) {
        this.originalweight = originalweight;
    }

    public BigDecimal getNewfreight() {
        return newfreight;
    }

    public void setNewfreight(BigDecimal newfreight) {
        this.newfreight = newfreight;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTraceid() {
        return traceid;
    }

    public void setTraceid(String traceid) {
        this.traceid = traceid == null ? null : traceid.trim();
    }

    public String getUrlfile() {
        return urlfile;
    }

    public void setUrlfile(String urlfile) {
        this.urlfile = urlfile == null ? null : urlfile.trim();
    }

    public Boolean getIsreturn() {
        return isreturn;
    }

    public void setIsreturn(Boolean isreturn) {
        this.isreturn = isreturn;
    }

    public Integer getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(Integer errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrordesc() {
        return errordesc;
    }

    public void setErrordesc(String errordesc) {
        this.errordesc = errordesc == null ? null : errordesc.trim();
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsnormalcheck() {
        return isnormalcheck;
    }

    public void setIsnormalcheck(Boolean isnormalcheck) {
        this.isnormalcheck = isnormalcheck;
    }

    public Boolean getIsapicheck() {
        return isapicheck;
    }

    public void setIsapicheck(Boolean isapicheck) {
        this.isapicheck = isapicheck;
    }

    public Integer getNcretrycount() {
        return ncretrycount;
    }

    public void setNcretrycount(Integer ncretrycount) {
        this.ncretrycount = ncretrycount;
    }

    public Integer getApiretrycount() {
        return apiretrycount;
    }

    public void setApiretrycount(Integer apiretrycount) {
        this.apiretrycount = apiretrycount;
    }

    @Override
    public String toString() {
        return "PreTreatmentOrder{" +
                "id=" + id +
                ", orderid='" + orderid + '\'' +
                ", originalpostid='" + originalpostid + '\'' +
                ", newpostid='" + newpostid + '\'' +
                ", originalweight=" + originalweight +
                ", newfreight=" + newfreight +
                ", createtime=" + createtime +
                ", state=" + state +
                ", traceid='" + traceid + '\'' +
                ", urlfile='" + urlfile + '\'' +
                ", isreturn=" + isreturn +
                ", errorcode=" + errorcode +
                ", errordesc='" + errordesc + '\'' +
                ", lastupdatetime=" + lastupdatetime +
                ", remark='" + remark + '\'' +
                ", isnormalcheck=" + isnormalcheck +
                ", isapicheck=" + isapicheck +
                ", ncretrycount=" + ncretrycount +
                ", apiretrycount=" + apiretrycount +
                '}';
    }
}