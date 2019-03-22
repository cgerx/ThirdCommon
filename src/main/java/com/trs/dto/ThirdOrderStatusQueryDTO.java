package com.trs.dto;

/**
 * Title:
 * Description:
 * Project: hshop
 * Author: cg
 * Create Time:2019/3/18 14:46
 */
public class ThirdOrderStatusQueryDTO implements ThirdDTO {

    public ThirdOrderStatusQueryDTO(){}

    public ThirdOrderStatusQueryDTO(String orderNos) {
        this.orderNos = orderNos;
    }

    private String orderNos;

    public String getOrderNos() {
        return orderNos;
    }

    public void setOrderNos(String orderNos) {
        this.orderNos = orderNos;
    }
}
