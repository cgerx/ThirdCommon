package com.trs.dto;

import java.util.Date;

/**
 * Title:
 * Description:
 * Project: hshop
 * Author: cg
 * Create Time:2019/3/18 14:51
 */
public class ThirdOrderSynchronizeDTO implements ThirdDTO {

    private String orderNo;

    private Integer status;

    private String logisticsNo;

    private String shipmentNo;

    private Date sendTime;

    private String sendRemark;

    private Date closeTime;

    private Integer refundStatus;

    private String refundRefuseReason;

    private Date firstCheckTime;

    private Date goodsCheckTime;

    private Date finishTime;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public String getShipmentNo() {
        return shipmentNo;
    }

    public void setShipmentNo(String shipmentNo) {
        this.shipmentNo = shipmentNo;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendRemark() {
        return sendRemark;
    }

    public void setSendRemark(String sendRemark) {
        this.sendRemark = sendRemark;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundRefuseReason() {
        return refundRefuseReason;
    }

    public void setRefundRefuseReason(String refundRefuseReason) {
        this.refundRefuseReason = refundRefuseReason;
    }

    public Date getFirstCheckTime() {
        return firstCheckTime;
    }

    public void setFirstCheckTime(Date firstCheckTime) {
        this.firstCheckTime = firstCheckTime;
    }

    public Date getGoodsCheckTime() {
        return goodsCheckTime;
    }

    public void setGoodsCheckTime(Date goodsCheckTime) {
        this.goodsCheckTime = goodsCheckTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}
