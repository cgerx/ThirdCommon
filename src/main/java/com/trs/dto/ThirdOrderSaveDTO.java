package com.trs.dto;

import java.util.Date;
import java.util.List;

/**
 * Title:
 * Description:
 * Project: hshop
 * Author: cg
 * Create Time:2019/3/18 14:37
 */
public class ThirdOrderSaveDTO implements ThirdDTO {

    private String orderNo;

    private Double orderPrice;

    private String userName;

    private String recipientsName;

    private String recipientsPhone;

    private String recipientsAddr;

    private String remark;

    private Date orderTime;

    private List<ThirdGoodsDTO> goods;

    private ThirdInvoiceInfoDTO invoiceInfo;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRecipientsName() {
        return recipientsName;
    }

    public void setRecipientsName(String recipientsName) {
        this.recipientsName = recipientsName;
    }

    public String getRecipientsPhone() {
        return recipientsPhone;
    }

    public void setRecipientsPhone(String recipientsPhone) {
        this.recipientsPhone = recipientsPhone;
    }

    public String getRecipientsAddr() {
        return recipientsAddr;
    }

    public void setRecipientsAddr(String recipientsAddr) {
        this.recipientsAddr = recipientsAddr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public List<ThirdGoodsDTO> getGoods() {
        return goods;
    }

    public void setGoods(List<ThirdGoodsDTO> goods) {
        this.goods = goods;
    }

    public ThirdInvoiceInfoDTO getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(ThirdInvoiceInfoDTO invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }
}
