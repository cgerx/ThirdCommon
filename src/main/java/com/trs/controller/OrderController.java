package com.trs.controller;

import com.alibaba.fastjson.JSON;
import com.trs.dto.*;
import com.trs.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/21 13:53
 */
@RequestMapping("order")
@RestController
public class OrderController extends BaseController{

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);


    @Autowired
    private OrderService orderService;

    @PostMapping("save")
    public Result save(@RequestBody String thirdRsaDTO){
        LOGGER.info("订单保存:{}", JSON.toJSONString(thirdRsaDTO));
        ThirdOrderSaveDTO dto = (ThirdOrderSaveDTO) deCode(thirdRsaDTO, ThirdOrderSaveDTO.class);
        LOGGER.info("订单保存解密:{}", JSON.toJSONString(dto));
        orderService.save(dto);
        return returnCheck();
    }


    @PostMapping("pay")
    public Result pay(@RequestBody String thirdRsaDTO){
        LOGGER.info("订单支付:{}", JSON.toJSONString(thirdRsaDTO));
        ThirdPayNotifyDTO dto = (ThirdPayNotifyDTO) deCode(thirdRsaDTO, ThirdPayNotifyDTO.class);
        LOGGER.info("订单支付解密:{}", JSON.toJSONString(dto));
        return returnCheck();
    }


    @PostMapping("info")
    public Result info(@RequestBody String thirdRsaDTO){
        LOGGER.info("订单信息同步:{}", JSON.toJSONString(thirdRsaDTO));
        ThirdOrderStatusQueryDTO dto = (ThirdOrderStatusQueryDTO) deCode(thirdRsaDTO, ThirdOrderStatusQueryDTO.class);
        LOGGER.info("订单信息同步解密:{}", JSON.toJSONString(dto));
        return returnCheck();
    }
}
