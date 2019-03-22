package com.trs.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.trs.dto.ThirdGoodsDTO;
import com.trs.dto.ThirdOrderSaveDTO;
import com.trs.mapper.OrderGoodsMapper;
import com.trs.pojo.OrderGoods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/22 17:25
 */
@Service
public class OrderGoodsService extends ServiceImpl<OrderGoodsMapper, OrderGoods> {

    public void saveOrderGoods(ThirdOrderSaveDTO dto){
        List<OrderGoods> orderGoodsList = buildOrderGoods(dto);
        orderGoodsList.stream().forEach(this.baseMapper::insert);
    }

    private List<OrderGoods> buildOrderGoods(ThirdOrderSaveDTO dto){
        List<OrderGoods> orderGoodsList = Lists.newArrayList();
        for (ThirdGoodsDTO good : dto.getGoods()) {
            OrderGoods orderGoods = new OrderGoods();
            orderGoods.setGoodsPrice(good.getGoodsPrice());
            orderGoods.setNum(good.getNum());
            orderGoods.setOrderNo(dto.getOrderNo());
            orderGoods.setProductCode(good.getProductCode());
            orderGoodsList.add(orderGoods);
        }
        return orderGoodsList;
    }

}
