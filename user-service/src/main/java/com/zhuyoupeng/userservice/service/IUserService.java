package com.zhuyoupeng.userservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuyoupeng.userservice.bean.User;
import com.zhuyoupeng.userservice.bean.UserVo;
import org.springframework.stereotype.Service;

public interface IUserService extends IService<User> {
    IPage<UserVo> getPage(Page page,UserVo vo);
}
