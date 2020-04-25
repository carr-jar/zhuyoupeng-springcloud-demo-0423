package com.zhuyoupeng.userservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuyoupeng.userservice.bean.City;
import com.zhuyoupeng.userservice.bean.CityVo;

import java.util.List;

/**
 * <p>
 * InnoDB free: 12288 kB Mapper 接口
 * </p>
 *
 * @author carr
 * @since 2020-04-25
 */
public interface CityMapper extends BaseMapper<City> {

    List<CityVo> clist();
}
