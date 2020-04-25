package com.zhuyoupeng.userservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhuyoupeng.userservice.bean.City;
import com.zhuyoupeng.userservice.bean.CityVo;
import com.zhuyoupeng.userservice.mapper.CityMapper;
import com.zhuyoupeng.userservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 12288 kB 服务实现类
 * </p>
 *
 * @author carr
 * @since 2020-04-25
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {
    @Autowired
    CityMapper cityMapper;
    @Override
    public List<CityVo> clist() {
        return cityMapper.clist();
    }
}
