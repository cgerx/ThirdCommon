package com.trs.dto;

import java.io.Serializable;

/**
 * Title:
 * Description:
 * Project: hshop
 * Author: cg
 * Create Time:2019/3/18 14:36
 */
public class ThirdRsaDTO implements Serializable {

    public ThirdRsaDTO(){}

    public ThirdRsaDTO(String appName, String sign, String data){
        this.appName = appName;
        this.sign = sign;
        this.data = data;
    }

    private String appName;

    private String data;

    private String sign;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
