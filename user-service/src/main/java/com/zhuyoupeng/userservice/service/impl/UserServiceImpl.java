package com.zhuyoupeng.userservice.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import com.zhuyoupeng.userservice.bean.User;
import com.zhuyoupeng.userservice.bean.UserVo;
import com.zhuyoupeng.userservice.mapper.UserMapper;
import com.zhuyoupeng.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper mapper;
    @Override
    public IPage<UserVo> getPage(Page page, UserVo vo) {
        return mapper.getPage(page,vo);
    }
}
