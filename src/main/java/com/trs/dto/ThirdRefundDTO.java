package com.trs.dto;

import java.util.Date;

/**
 * Title:
 * Description:
 * Project: hshop
 * Author: cg
 * Create Time:2019/3/18 14:47
 */
public class ThirdRefundDTO implements ThirdDTO {


    private String orderNo;

    private Integer type;

    private String reason;

    private String desc;

    private String pics;

    private Date submitTime;

    private Date firstCheckTime;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getFirstCheckTime() {
        return firstCheckTime;
    }

    public void setFirstCheckTime(Date firstCheckTime) {
        this.firstCheckTime = firstCheckTime;
    }
}
