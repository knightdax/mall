package com.macro.mall.tiny.service;

import com.macro.mall.tiny.model.PmsBrand;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PmsBrandService {
    List<PmsBrand> listAll();
}
