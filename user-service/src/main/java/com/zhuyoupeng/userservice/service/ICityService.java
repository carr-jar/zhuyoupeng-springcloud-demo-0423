package com.zhuyoupeng.userservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuyoupeng.userservice.bean.City;
import com.zhuyoupeng.userservice.bean.CityVo;

import java.util.List;

/**
 * <p>
 * InnoDB free: 12288 kB 服务类
 * </p>
 *
 * @author carr
 * @since 2020-04-25
 */
public interface ICityService extends IService<City> {

    List<CityVo> clist();
}
