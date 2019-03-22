package com.trs.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trs.dto.ThirdOrderSaveDTO;
import com.trs.mapper.OrderMapper;
import com.trs.pojo.Order;
import com.trs.pojo.OrderGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/22 15:43
 */
@Service
public class OrderService extends ServiceImpl<OrderMapper, Order> {

    @Autowired
    private OrderGoodsService orderGoodsService;

    public void save(ThirdOrderSaveDTO orderSaveDTO){
        Order order = toOrder(orderSaveDTO);
        baseMapper.insert(order);
        orderGoodsService.saveOrderGoods(orderSaveDTO);
    }


    private Order toOrder(ThirdOrderSaveDTO dto){
        Order order = new Order();
        order.setOrderNo(dto.getOrderNo());
        order.setOrderPrice(dto.getOrderPrice());
        order.setUserName(dto.getUserName());
        order.setRecipientsAddr(dto.getRecipientsAddr());
        order.setRecipientsName(dto.getRecipientsName());
        order.setRecipientsPhone(dto.getRecipientsPhone());
        order.setRemark(dto.getRemark());
        order.setStatus(1);
        order.setOrderTime(dto.getOrderTime());
        return order;
    }
}
