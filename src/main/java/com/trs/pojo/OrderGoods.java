package com.trs.pojo;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/22 15:17
 */
public class OrderGoods {

    private String productCode;

    private Integer num;

    private Double goodsPrice;

    private String orderNo;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
