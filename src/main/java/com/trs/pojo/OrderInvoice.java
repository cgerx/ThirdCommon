package com.trs.pojo;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/22 15:18
 */
public class OrderInvoice {

    public static final String TABLE_NAME = "order_invoice";

    private String orderNo;

    private Integer type;

    private String head;

    private String code;

    private String bank;

    private String account;

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

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
