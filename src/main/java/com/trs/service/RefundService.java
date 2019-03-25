package com.trs.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trs.dto.ThirdRefundDTO;
import com.trs.dto.ThirdReturnGoodsDTO;
import com.trs.mapper.RefundMapper;
import com.trs.pojo.Refund;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/25 09:48
 */
@Service
public class RefundService extends ServiceImpl<RefundMapper, Refund> {

    public void save(ThirdRefundDTO dto){
        Refund refund = buildPojo(dto);
        int i =baseMapper.insert(refund);
        Assert.isTrue(i == 0, "insert error");
    }


    public void updateGoods(ThirdReturnGoodsDTO dto){
        Refund refund = baseMapper.find(dto.getOrderNo());
        refund.setLogisticsNo(dto.getLogisticsNo());
        refund.setLogisticsName(dto.getLogisticsName());
        refund.setShipmentNo(dto.getShipmentNo());
        refund.setSendTime(dto.getSendTime());
        int i = baseMapper.updateById(refund);
        Assert.isTrue(i == 0, "update error");
    }

    private Refund buildPojo(ThirdRefundDTO dto){
        Refund refund = JSON.parseObject(JSON.toJSONString(dto), Refund.class);
        return refund;
    }



}
