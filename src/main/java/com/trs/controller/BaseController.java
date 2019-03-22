package com.trs.controller;

import com.alibaba.fastjson.JSON;
import com.trs.dto.Result;
import com.trs.dto.ThirdDTO;
import com.trs.dto.ThirdRsaDTO;
import com.trs.pojo.TestConfig;
import com.trs.service.TestConfigService;
import com.trs.util.MD5Util;
import com.trs.util.RSAKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.Base64Utils;

import static com.trs.constant.KeyConst.PRIVATE_KEY;
import static com.trs.constant.KeyConst.PUBLIC_KEY;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/21 14:16
 */
@Service
public class BaseController {

    @Autowired
    TestConfigService testConfigService;

    public Result returnCheck(){
        TestConfig testConfig = testConfigService.find();
        switch (testConfig.getType()){
            case 1:
                return Result.success();
            case -1:
                return Result.fail("请求失败！");
            default:
                throw new RuntimeException("模拟请求出错！");
        }
    }

    public static ThirdDTO deCode(String cipherText, Class clazz){
        try {
            byte[] de = RSAKit.decryptByPrivateKey(Base64Utils.decodeFromString(cipherText), PRIVATE_KEY);
            ThirdRsaDTO thirdRsaDTO = JSON.parseObject(new String(de), ThirdRsaDTO.class);
            String data = thirdRsaDTO.getData();
            byte[] sign = RSAKit.decryptByPublicKey(Base64Utils.decodeFromString(thirdRsaDTO.getSign()), PUBLIC_KEY);
            Assert.isTrue(MD5Util.encode(data).equals(new String(sign)), "error");
            return (ThirdDTO) JSON.parseObject(data, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
