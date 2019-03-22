package com.trs.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trs.mapper.ProductMapper;
import com.trs.pojo.Product;
import org.springframework.stereotype.Service;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/22 17:36
 */
@Service
public class ProductService extends ServiceImpl<ProductMapper, Product> {
}
