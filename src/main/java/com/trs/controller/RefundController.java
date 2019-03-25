package com.trs.controller;

import com.alibaba.fastjson.JSON;
import com.trs.dto.Result;
import com.trs.dto.ThirdRefundDTO;
import com.trs.dto.ThirdReturnGoodsDTO;
import com.trs.service.RefundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/21 14:01
 */
@RestController
public class RefundController extends BaseController{

    private static final Logger LOGGER = LoggerFactory.getLogger(RefundController.class);

    @Autowired
    private RefundService refundService;

    @PostMapping("refund")
    public Result refund(@RequestBody String thirdRsaDTO){
        LOGGER.info("退款保存:{}", JSON.toJSONString(thirdRsaDTO));
        ThirdRefundDTO dto = (ThirdRefundDTO) deCode(thirdRsaDTO, ThirdRefundDTO.class);
        LOGGER.info("退款保存解密:{}", JSON.toJSONString(dto));
        refundService.save(dto);
        return returnCheck();
    }

    @PostMapping("return/goods")
    public Result returnGoods(@RequestBody String thirdRsaDTO){
        LOGGER.info("退回货物:{}", JSON.toJSONString(thirdRsaDTO));
        ThirdReturnGoodsDTO dto = (ThirdReturnGoodsDTO) deCode(thirdRsaDTO, ThirdReturnGoodsDTO.class);
        LOGGER.info("退回货物解密:{}", JSON.toJSONString(dto));
        refundService.updateGoods(dto);
        return returnCheck();
    }
}
