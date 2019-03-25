package com.trs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trs.pojo.Product;
import org.apache.ibatis.annotations.Select;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/22 17:36
 */
public interface ProductMapper extends BaseMapper<Product> {

    @Select("select * from product where productCode = #{productCode} limit 0,1 ")
    Product find(String productCode);

}
