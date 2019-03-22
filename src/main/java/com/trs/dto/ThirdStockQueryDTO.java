package com.trs.dto;

/**
 * Title:
 * Description:
 * Project: hshop
 * Author: cg
 * Create Time:2019/3/19 17:22
 */
public class ThirdStockQueryDTO implements ThirdDTO {

    private String productCode;

    private Integer regionCode;

    public ThirdStockQueryDTO(){}

    public ThirdStockQueryDTO(String productCode, Integer regionCode){
        this.productCode = productCode;
        this.regionCode = regionCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }
}
