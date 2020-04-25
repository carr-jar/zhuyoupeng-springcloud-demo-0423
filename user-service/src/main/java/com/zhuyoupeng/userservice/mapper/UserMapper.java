package com.zhuyoupeng.userservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuyoupeng.userservice.bean.User;
import com.zhuyoupeng.userservice.bean.UserVo;

public interface UserMapper extends BaseMapper<User> {
    IPage<UserVo> getPage(Page page, UserVo vo);
}
