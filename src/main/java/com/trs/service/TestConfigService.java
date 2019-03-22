package com.trs.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trs.dto.Result;
import com.trs.mapper.TestConfigMapper;
import com.trs.pojo.TestConfig;
import org.springframework.stereotype.Service;

/**
 * Title:
 * Description:
 * Project: ThirdCommon
 * Author: cg
 * Create Time:2019/3/22 17:44
 */
@Service
public class TestConfigService extends ServiceImpl<TestConfigMapper, TestConfig> {

    public TestConfig find(){
        return baseMapper.selectFirst();
    }
}
