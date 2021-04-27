package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/brand")
public class PmsBrandController {

    @Autowired
    PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @RequestMapping(value = "list" ,method = RequestMethod.GET)
    public void createBrand(){
       List<PmsBrand> pmsBrandList = pmsBrandService.listAll();
       LOGGER.info("{}",pmsBrandList);
    }
}
