package com.trs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trs.pojo.TestConfig;
import org.apache.ibatis.annotations.Select;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/22 17:44
 */
public interface TestConfigMapper extends BaseMapper<TestConfig> {

    @Select("select * from test_config limit 0,1")
    TestConfig selectFirst();
}
