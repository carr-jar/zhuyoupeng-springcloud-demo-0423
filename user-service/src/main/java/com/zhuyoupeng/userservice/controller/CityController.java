package com.zhuyoupeng.userservice.controller;


import com.zhuyoupeng.userservice.bean.CityVo;
import com.zhuyoupeng.userservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 12288 kB 前端控制器
 * </p>
 *
 * @author carr
 * @since 2020-04-25
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    ICityService iCityService;
    @RequestMapping("list")
    public List<CityVo> clist(){
        return iCityService.clist();
    }
}

