package com.trs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trs.pojo.Refund;
import org.apache.ibatis.annotations.Select;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/25 09:47
 */
public interface RefundMapper extends BaseMapper<Refund> {


    @Select("select * from refund where orderNo = #{orderNo} limit 0,1")
    Refund find(String orderNo);

}
