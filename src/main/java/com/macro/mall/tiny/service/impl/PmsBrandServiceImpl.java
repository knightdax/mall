package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mapper.PmsBrandMapper;
import com.macro.mall.tiny.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    public PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAll() {
        return pmsBrandMapper.selectByExample(null);
    }
}
