package com.trs.dto;

/**
 * Title:
 * Description:
 * Project: hshop
 * Author: cg
 * Create Time:2019/3/18 14:39
 */
public class ThirdInvoiceInfoDTO implements ThirdDTO {

    private Integer type;

    private String head;

    private String code;

    private String bank;

    private String account;


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
