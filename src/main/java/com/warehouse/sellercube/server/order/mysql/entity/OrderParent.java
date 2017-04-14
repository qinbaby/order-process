package com.warehouse.sellercube.server.order.mysql.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderParent extends OrderParentKey implements Serializable {
    private String traceid;

    private Integer stateconfigid;

    private Integer sourcestateid;

    private String receivename;

    private Integer countryid;

    private String country;

    private String postid;

    private String address;

    private Date deliverydate;

    private Date senddate;

    private String phone;

    private String city;

    private String county;

    private String zip;

    private String deliveryaddress;

    private String weight;

    private String freight;

    private String transportweight;

    private String remark;

    private String email;

    private String shippingservice;

    private String shipworksorder;

    private Byte isshipworksisdown;

    private String shipworksstoreid;

    private String ebayuserid;

    private String ebaysrn;

    private String issendmail;

    private Integer orderparenttagid;

    private String confirmedremarks;

    private Date paytime;

    private String flytdetailshop;

    private String salecountry;

    private Date saletime;

    private Date checkouttime;

    private Date changestatetime;

    private Date sortgentime;

    private Date receivetime;

    private String buyeraddress1;

    private String buyeraddress2;

    private String upsreturn;

    private String usaweight;

    private Boolean isholdup;

    private String usaparcelset;

    private String shippingandhanding;

    private String insurance;

    private String totalprice;

    private String batchprocessingid;

    private String holdupreasons;

    private String paypaltransactionid;

    private Date importdatetime;

    private String volumeweight;

    private String deduct;

    private String costprice;

    private String profitreport;

    private String ups3daystype;

    private String isdelivery;

    private String pakeprice;

    private String inside;

    private String uspspostageamount;

    private String uspsinsuredvalue;

    private String uspsinsurancefee;

    private String flytuserid;

    private Integer processcenterid;

    private String sellercubepno;

    private Boolean isrepeatsend;

    private String setting;

    private String trackingno;

    private String trackingremark;

    private String packerrorinfor;

    private String packsubmitinfor;

    private String packprintinfor;

    private String pakeageid;

    private BigDecimal uspsreturnfreight;

    private Date settoprocessingtime;

    private String location;

    private BigDecimal inprice;

    private Boolean isppaddress;

    private Boolean isebayapidownload;

    private String receivefreightuser;

    private String receivefreightplace;

    private String errorcode;

    private String monerytype;

    private Date uspsreturndatatime;

    private String shelfno;

    private String point;

    private String deductprocess;

    private String deliveryuser;

    private String ppnotes;

    private String affiliate;

    private Boolean isppaudit;

    private Integer productmanagerid;

    private Boolean isparent;

    private Boolean issplit;

    private Boolean isreplenishment;

    private String clientip;

    private String ordertype;

    private Boolean issyncorder;

    private String usertraceid;

    private Integer productspecialerid;

    private Boolean isrequestsplit;

    private Boolean isfedextreace;

    private Byte paymenttype;

    private String posttypeoption;

    private Integer orderdetailtype;

    private Date insystemdatetime;

    private String fnprocessingid;

    public String getTraceid() {
        return traceid;
    }

    public void setTraceid(String traceid) {
        this.traceid = traceid == null ? null : traceid.trim();
    }

    public Integer getStateconfigid() {
        return stateconfigid;
    }

    public void setStateconfigid(Integer stateconfigid) {
        this.stateconfigid = stateconfigid;
    }

    public Integer getSourcestateid() {
        return sourcestateid;
    }

    public void setSourcestateid(Integer sourcestateid) {
        this.sourcestateid = sourcestateid;
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid == null ? null : postid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress == null ? null : deliveryaddress.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight == null ? null : freight.trim();
    }

    public String getTransportweight() {
        return transportweight;
    }

    public void setTransportweight(String transportweight) {
        this.transportweight = transportweight == null ? null : transportweight.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getShippingservice() {
        return shippingservice;
    }

    public void setShippingservice(String shippingservice) {
        this.shippingservice = shippingservice == null ? null : shippingservice.trim();
    }

    public String getShipworksorder() {
        return shipworksorder;
    }

    public void setShipworksorder(String shipworksorder) {
        this.shipworksorder = shipworksorder == null ? null : shipworksorder.trim();
    }

    public Byte getIsshipworksisdown() {
        return isshipworksisdown;
    }

    public void setIsshipworksisdown(Byte isshipworksisdown) {
        this.isshipworksisdown = isshipworksisdown;
    }

    public String getShipworksstoreid() {
        return shipworksstoreid;
    }

    public void setShipworksstoreid(String shipworksstoreid) {
        this.shipworksstoreid = shipworksstoreid == null ? null : shipworksstoreid.trim();
    }

    public String getEbayuserid() {
        return ebayuserid;
    }

    public void setEbayuserid(String ebayuserid) {
        this.ebayuserid = ebayuserid == null ? null : ebayuserid.trim();
    }

    public String getEbaysrn() {
        return ebaysrn;
    }

    public void setEbaysrn(String ebaysrn) {
        this.ebaysrn = ebaysrn == null ? null : ebaysrn.trim();
    }

    public String getIssendmail() {
        return issendmail;
    }

    public void setIssendmail(String issendmail) {
        this.issendmail = issendmail == null ? null : issendmail.trim();
    }

    public Integer getOrderparenttagid() {
        return orderparenttagid;
    }

    public void setOrderparenttagid(Integer orderparenttagid) {
        this.orderparenttagid = orderparenttagid;
    }

    public String getConfirmedremarks() {
        return confirmedremarks;
    }

    public void setConfirmedremarks(String confirmedremarks) {
        this.confirmedremarks = confirmedremarks == null ? null : confirmedremarks.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getFlytdetailshop() {
        return flytdetailshop;
    }

    public void setFlytdetailshop(String flytdetailshop) {
        this.flytdetailshop = flytdetailshop == null ? null : flytdetailshop.trim();
    }

    public String getSalecountry() {
        return salecountry;
    }

    public void setSalecountry(String salecountry) {
        this.salecountry = salecountry == null ? null : salecountry.trim();
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public Date getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(Date checkouttime) {
        this.checkouttime = checkouttime;
    }

    public Date getChangestatetime() {
        return changestatetime;
    }

    public void setChangestatetime(Date changestatetime) {
        this.changestatetime = changestatetime;
    }

    public Date getSortgentime() {
        return sortgentime;
    }

    public void setSortgentime(Date sortgentime) {
        this.sortgentime = sortgentime;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public String getBuyeraddress1() {
        return buyeraddress1;
    }

    public void setBuyeraddress1(String buyeraddress1) {
        this.buyeraddress1 = buyeraddress1 == null ? null : buyeraddress1.trim();
    }

    public String getBuyeraddress2() {
        return buyeraddress2;
    }

    public void setBuyeraddress2(String buyeraddress2) {
        this.buyeraddress2 = buyeraddress2 == null ? null : buyeraddress2.trim();
    }

    public String getUpsreturn() {
        return upsreturn;
    }

    public void setUpsreturn(String upsreturn) {
        this.upsreturn = upsreturn == null ? null : upsreturn.trim();
    }

    public String getUsaweight() {
        return usaweight;
    }

    public void setUsaweight(String usaweight) {
        this.usaweight = usaweight == null ? null : usaweight.trim();
    }

    public Boolean getIsholdup() {
        return isholdup;
    }

    public void setIsholdup(Boolean isholdup) {
        this.isholdup = isholdup;
    }

    public String getUsaparcelset() {
        return usaparcelset;
    }

    public void setUsaparcelset(String usaparcelset) {
        this.usaparcelset = usaparcelset == null ? null : usaparcelset.trim();
    }

    public String getShippingandhanding() {
        return shippingandhanding;
    }

    public void setShippingandhanding(String shippingandhanding) {
        this.shippingandhanding = shippingandhanding == null ? null : shippingandhanding.trim();
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance == null ? null : insurance.trim();
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    public String getBatchprocessingid() {
        return batchprocessingid;
    }

    public void setBatchprocessingid(String batchprocessingid) {
        this.batchprocessingid = batchprocessingid == null ? null : batchprocessingid.trim();
    }

    public String getHoldupreasons() {
        return holdupreasons;
    }

    public void setHoldupreasons(String holdupreasons) {
        this.holdupreasons = holdupreasons == null ? null : holdupreasons.trim();
    }

    public String getPaypaltransactionid() {
        return paypaltransactionid;
    }

    public void setPaypaltransactionid(String paypaltransactionid) {
        this.paypaltransactionid = paypaltransactionid == null ? null : paypaltransactionid.trim();
    }

    public Date getImportdatetime() {
        return importdatetime;
    }

    public void setImportdatetime(Date importdatetime) {
        this.importdatetime = importdatetime;
    }

    public String getVolumeweight() {
        return volumeweight;
    }

    public void setVolumeweight(String volumeweight) {
        this.volumeweight = volumeweight == null ? null : volumeweight.trim();
    }

    public String getDeduct() {
        return deduct;
    }

    public void setDeduct(String deduct) {
        this.deduct = deduct == null ? null : deduct.trim();
    }

    public String getCostprice() {
        return costprice;
    }

    public void setCostprice(String costprice) {
        this.costprice = costprice == null ? null : costprice.trim();
    }

    public String getProfitreport() {
        return profitreport;
    }

    public void setProfitreport(String profitreport) {
        this.profitreport = profitreport == null ? null : profitreport.trim();
    }

    public String getUps3daystype() {
        return ups3daystype;
    }

    public void setUps3daystype(String ups3daystype) {
        this.ups3daystype = ups3daystype == null ? null : ups3daystype.trim();
    }

    public String getIsdelivery() {
        return isdelivery;
    }

    public void setIsdelivery(String isdelivery) {
        this.isdelivery = isdelivery == null ? null : isdelivery.trim();
    }

    public String getPakeprice() {
        return pakeprice;
    }

    public void setPakeprice(String pakeprice) {
        this.pakeprice = pakeprice == null ? null : pakeprice.trim();
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside == null ? null : inside.trim();
    }

    public String getUspspostageamount() {
        return uspspostageamount;
    }

    public void setUspspostageamount(String uspspostageamount) {
        this.uspspostageamount = uspspostageamount == null ? null : uspspostageamount.trim();
    }

    public String getUspsinsuredvalue() {
        return uspsinsuredvalue;
    }

    public void setUspsinsuredvalue(String uspsinsuredvalue) {
        this.uspsinsuredvalue = uspsinsuredvalue == null ? null : uspsinsuredvalue.trim();
    }

    public String getUspsinsurancefee() {
        return uspsinsurancefee;
    }

    public void setUspsinsurancefee(String uspsinsurancefee) {
        this.uspsinsurancefee = uspsinsurancefee == null ? null : uspsinsurancefee.trim();
    }

    public String getFlytuserid() {
        return flytuserid;
    }

    public void setFlytuserid(String flytuserid) {
        this.flytuserid = flytuserid == null ? null : flytuserid.trim();
    }

    public Integer getProcesscenterid() {
        return processcenterid;
    }

    public void setProcesscenterid(Integer processcenterid) {
        this.processcenterid = processcenterid;
    }

    public String getSellercubepno() {
        return sellercubepno;
    }

    public void setSellercubepno(String sellercubepno) {
        this.sellercubepno = sellercubepno == null ? null : sellercubepno.trim();
    }

    public Boolean getIsrepeatsend() {
        return isrepeatsend;
    }

    public void setIsrepeatsend(Boolean isrepeatsend) {
        this.isrepeatsend = isrepeatsend;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting == null ? null : setting.trim();
    }

    public String getTrackingno() {
        return trackingno;
    }

    public void setTrackingno(String trackingno) {
        this.trackingno = trackingno == null ? null : trackingno.trim();
    }

    public String getTrackingremark() {
        return trackingremark;
    }

    public void setTrackingremark(String trackingremark) {
        this.trackingremark = trackingremark == null ? null : trackingremark.trim();
    }

    public String getPackerrorinfor() {
        return packerrorinfor;
    }

    public void setPackerrorinfor(String packerrorinfor) {
        this.packerrorinfor = packerrorinfor == null ? null : packerrorinfor.trim();
    }

    public String getPacksubmitinfor() {
        return packsubmitinfor;
    }

    public void setPacksubmitinfor(String packsubmitinfor) {
        this.packsubmitinfor = packsubmitinfor == null ? null : packsubmitinfor.trim();
    }

    public String getPackprintinfor() {
        return packprintinfor;
    }

    public void setPackprintinfor(String packprintinfor) {
        this.packprintinfor = packprintinfor == null ? null : packprintinfor.trim();
    }

    public String getPakeageid() {
        return pakeageid;
    }

    public void setPakeageid(String pakeageid) {
        this.pakeageid = pakeageid == null ? null : pakeageid.trim();
    }

    public BigDecimal getUspsreturnfreight() {
        return uspsreturnfreight;
    }

    public void setUspsreturnfreight(BigDecimal uspsreturnfreight) {
        this.uspsreturnfreight = uspsreturnfreight;
    }

    public Date getSettoprocessingtime() {
        return settoprocessingtime;
    }

    public void setSettoprocessingtime(Date settoprocessingtime) {
        this.settoprocessingtime = settoprocessingtime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public BigDecimal getInprice() {
        return inprice;
    }

    public void setInprice(BigDecimal inprice) {
        this.inprice = inprice;
    }

    public Boolean getIsppaddress() {
        return isppaddress;
    }

    public void setIsppaddress(Boolean isppaddress) {
        this.isppaddress = isppaddress;
    }

    public Boolean getIsebayapidownload() {
        return isebayapidownload;
    }

    public void setIsebayapidownload(Boolean isebayapidownload) {
        this.isebayapidownload = isebayapidownload;
    }

    public String getReceivefreightuser() {
        return receivefreightuser;
    }

    public void setReceivefreightuser(String receivefreightuser) {
        this.receivefreightuser = receivefreightuser == null ? null : receivefreightuser.trim();
    }

    public String getReceivefreightplace() {
        return receivefreightplace;
    }

    public void setReceivefreightplace(String receivefreightplace) {
        this.receivefreightplace = receivefreightplace == null ? null : receivefreightplace.trim();
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode == null ? null : errorcode.trim();
    }

    public String getMonerytype() {
        return monerytype;
    }

    public void setMonerytype(String monerytype) {
        this.monerytype = monerytype == null ? null : monerytype.trim();
    }

    public Date getUspsreturndatatime() {
        return uspsreturndatatime;
    }

    public void setUspsreturndatatime(Date uspsreturndatatime) {
        this.uspsreturndatatime = uspsreturndatatime;
    }

    public String getShelfno() {
        return shelfno;
    }

    public void setShelfno(String shelfno) {
        this.shelfno = shelfno == null ? null : shelfno.trim();
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    public String getDeductprocess() {
        return deductprocess;
    }

    public void setDeductprocess(String deductprocess) {
        this.deductprocess = deductprocess == null ? null : deductprocess.trim();
    }

    public String getDeliveryuser() {
        return deliveryuser;
    }

    public void setDeliveryuser(String deliveryuser) {
        this.deliveryuser = deliveryuser == null ? null : deliveryuser.trim();
    }

    public String getPpnotes() {
        return ppnotes;
    }

    public void setPpnotes(String ppnotes) {
        this.ppnotes = ppnotes == null ? null : ppnotes.trim();
    }

    public String getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(String affiliate) {
        this.affiliate = affiliate == null ? null : affiliate.trim();
    }

    public Boolean getIsppaudit() {
        return isppaudit;
    }

    public void setIsppaudit(Boolean isppaudit) {
        this.isppaudit = isppaudit;
    }

    public Integer getProductmanagerid() {
        return productmanagerid;
    }

    public void setProductmanagerid(Integer productmanagerid) {
        this.productmanagerid = productmanagerid;
    }

    public Boolean getIsparent() {
        return isparent;
    }

    public void setIsparent(Boolean isparent) {
        this.isparent = isparent;
    }

    public Boolean getIssplit() {
        return issplit;
    }

    public void setIssplit(Boolean issplit) {
        this.issplit = issplit;
    }

    public Boolean getIsreplenishment() {
        return isreplenishment;
    }

    public void setIsreplenishment(Boolean isreplenishment) {
        this.isreplenishment = isreplenishment;
    }

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip == null ? null : clientip.trim();
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    public Boolean getIssyncorder() {
        return issyncorder;
    }

    public void setIssyncorder(Boolean issyncorder) {
        this.issyncorder = issyncorder;
    }

    public String getUsertraceid() {
        return usertraceid;
    }

    public void setUsertraceid(String usertraceid) {
        this.usertraceid = usertraceid == null ? null : usertraceid.trim();
    }

    public Integer getProductspecialerid() {
        return productspecialerid;
    }

    public void setProductspecialerid(Integer productspecialerid) {
        this.productspecialerid = productspecialerid;
    }

    public Boolean getIsrequestsplit() {
        return isrequestsplit;
    }

    public void setIsrequestsplit(Boolean isrequestsplit) {
        this.isrequestsplit = isrequestsplit;
    }

    public Boolean getIsfedextreace() {
        return isfedextreace;
    }

    public void setIsfedextreace(Boolean isfedextreace) {
        this.isfedextreace = isfedextreace;
    }

    public Byte getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Byte paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getPosttypeoption() {
        return posttypeoption;
    }

    public void setPosttypeoption(String posttypeoption) {
        this.posttypeoption = posttypeoption == null ? null : posttypeoption.trim();
    }

    public Integer getOrderdetailtype() {
        return orderdetailtype;
    }

    public void setOrderdetailtype(Integer orderdetailtype) {
        this.orderdetailtype = orderdetailtype;
    }

    public Date getInsystemdatetime() {
        return insystemdatetime;
    }

    public void setInsystemdatetime(Date insystemdatetime) {
        this.insystemdatetime = insystemdatetime;
    }

    public String getFnprocessingid() {
        return fnprocessingid;
    }

    public void setFnprocessingid(String fnprocessingid) {
        this.fnprocessingid = fnprocessingid == null ? null : fnprocessingid.trim();
    }

    @Override
    public String toString() {
        return "OrderParent{" +
                "traceid='" + traceid + '\'' +
                ", stateconfigid=" + stateconfigid +
                ", sourcestateid=" + sourcestateid +
                ", receivename='" + receivename + '\'' +
                ", countryid=" + countryid +
                ", country='" + country + '\'' +
                ", postid='" + postid + '\'' +
                ", address='" + address + '\'' +
                ", deliverydate=" + deliverydate +
                ", senddate=" + senddate +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", zip='" + zip + '\'' +
                ", deliveryaddress='" + deliveryaddress + '\'' +
                ", weight='" + weight + '\'' +
                ", freight='" + freight + '\'' +
                ", transportweight='" + transportweight + '\'' +
                ", remark='" + remark + '\'' +
                ", email='" + email + '\'' +
                ", shippingservice='" + shippingservice + '\'' +
                ", shipworksorder='" + shipworksorder + '\'' +
                ", isshipworksisdown=" + isshipworksisdown +
                ", shipworksstoreid='" + shipworksstoreid + '\'' +
                ", ebayuserid='" + ebayuserid + '\'' +
                ", ebaysrn='" + ebaysrn + '\'' +
                ", issendmail='" + issendmail + '\'' +
                ", orderparenttagid=" + orderparenttagid +
                ", confirmedremarks='" + confirmedremarks + '\'' +
                ", paytime=" + paytime +
                ", flytdetailshop='" + flytdetailshop + '\'' +
                ", salecountry='" + salecountry + '\'' +
                ", saletime=" + saletime +
                ", checkouttime=" + checkouttime +
                ", changestatetime=" + changestatetime +
                ", sortgentime=" + sortgentime +
                ", receivetime=" + receivetime +
                ", buyeraddress1='" + buyeraddress1 + '\'' +
                ", buyeraddress2='" + buyeraddress2 + '\'' +
                ", upsreturn='" + upsreturn + '\'' +
                ", usaweight='" + usaweight + '\'' +
                ", isholdup=" + isholdup +
                ", usaparcelset='" + usaparcelset + '\'' +
                ", shippingandhanding='" + shippingandhanding + '\'' +
                ", insurance='" + insurance + '\'' +
                ", totalprice='" + totalprice + '\'' +
                ", batchprocessingid='" + batchprocessingid + '\'' +
                ", holdupreasons='" + holdupreasons + '\'' +
                ", paypaltransactionid='" + paypaltransactionid + '\'' +
                ", importdatetime=" + importdatetime +
                ", volumeweight='" + volumeweight + '\'' +
                ", deduct='" + deduct + '\'' +
                ", costprice='" + costprice + '\'' +
                ", profitreport='" + profitreport + '\'' +
                ", ups3daystype='" + ups3daystype + '\'' +
                ", isdelivery='" + isdelivery + '\'' +
                ", pakeprice='" + pakeprice + '\'' +
                ", inside='" + inside + '\'' +
                ", uspspostageamount='" + uspspostageamount + '\'' +
                ", uspsinsuredvalue='" + uspsinsuredvalue + '\'' +
                ", uspsinsurancefee='" + uspsinsurancefee + '\'' +
                ", flytuserid='" + flytuserid + '\'' +
                ", processcenterid=" + processcenterid +
                ", sellercubepno='" + sellercubepno + '\'' +
                ", isrepeatsend=" + isrepeatsend +
                ", setting='" + setting + '\'' +
                ", trackingno='" + trackingno + '\'' +
                ", trackingremark='" + trackingremark + '\'' +
                ", packerrorinfor='" + packerrorinfor + '\'' +
                ", packsubmitinfor='" + packsubmitinfor + '\'' +
                ", packprintinfor='" + packprintinfor + '\'' +
                ", pakeageid='" + pakeageid + '\'' +
                ", uspsreturnfreight=" + uspsreturnfreight +
                ", settoprocessingtime=" + settoprocessingtime +
                ", location='" + location + '\'' +
                ", inprice=" + inprice +
                ", isppaddress=" + isppaddress +
                ", isebayapidownload=" + isebayapidownload +
                ", receivefreightuser='" + receivefreightuser + '\'' +
                ", receivefreightplace='" + receivefreightplace + '\'' +
                ", errorcode='" + errorcode + '\'' +
                ", monerytype='" + monerytype + '\'' +
                ", uspsreturndatatime=" + uspsreturndatatime +
                ", shelfno='" + shelfno + '\'' +
                ", point='" + point + '\'' +
                ", deductprocess='" + deductprocess + '\'' +
                ", deliveryuser='" + deliveryuser + '\'' +
                ", ppnotes='" + ppnotes + '\'' +
                ", affiliate='" + affiliate + '\'' +
                ", isppaudit=" + isppaudit +
                ", productmanagerid=" + productmanagerid +
                ", isparent=" + isparent +
                ", issplit=" + issplit +
                ", isreplenishment=" + isreplenishment +
                ", clientip='" + clientip + '\'' +
                ", ordertype='" + ordertype + '\'' +
                ", issyncorder=" + issyncorder +
                ", usertraceid='" + usertraceid + '\'' +
                ", productspecialerid=" + productspecialerid +
                ", isrequestsplit=" + isrequestsplit +
                ", isfedextreace=" + isfedextreace +
                ", paymenttype=" + paymenttype +
                ", posttypeoption='" + posttypeoption + '\'' +
                ", orderdetailtype=" + orderdetailtype +
                ", insystemdatetime=" + insystemdatetime +
                ", fnprocessingid='" + fnprocessingid + '\'' +
                '}';
    }
}