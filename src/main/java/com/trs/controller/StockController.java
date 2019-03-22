package com.trs.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.trs.dto.Result;
import com.trs.dto.ThirdReturnGoodsDTO;
import com.trs.dto.ThirdRsaDTO;
import com.trs.dto.ThirdStockQueryDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/21 13:59
 */
@RestController
public class StockController extends BaseController{


    private static final Logger LOGGER = LoggerFactory.getLogger(StockController.class);

    @PostMapping("stock")
    public Result stock(@RequestBody String thirdRsaDTO){
        LOGGER.info("查询库存:{}", JSON.toJSONString(thirdRsaDTO));
        ThirdStockQueryDTO dto = (ThirdStockQueryDTO) deCode(thirdRsaDTO, ThirdStockQueryDTO.class);
        LOGGER.info("查询库存解密:{}", JSON.toJSONString(dto));
        Map map = Maps.newHashMap();
        map.put("stock", 100);
        Result result = returnCheck();
        result.setData(map);
        return result;
    }
}
