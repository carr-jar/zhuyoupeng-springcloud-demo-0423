package com.zhuyoupeng.userservice.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuyoupeng.userservice.bean.User;
import com.zhuyoupeng.userservice.bean.UserVo;
import com.zhuyoupeng.userservice.service.IUserService;
import com.zhuyoupeng.userservice.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService iUserService;
    @RequestMapping("list")
    public ResultEntity list(@RequestParam(defaultValue = "1")int currentPage,
                             @RequestParam(defaultValue = "3")int pageSize, UserVo vo
                           ){
        Page<User> page = new Page<>(currentPage,pageSize);
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        if(user!=null){
//            if(user.getUsername()!=null && !"".equals(user.getUsername().trim())){
//                wrapper.like("username",user.getUsername());
//            }
//        }
//        return ResultEntity.ok(iUserService.page(page,wrapper));
        return ResultEntity.ok(iUserService.getPage(page,vo));
    }
    @PostMapping("add")
    public ResultEntity add(@RequestBody User user){
        user.setCreatetime(new Date());
        iUserService.save(user);
        return ResultEntity.ok("成功");
    }
    @PostMapping("update")
    public ResultEntity update(@RequestBody User user){
        iUserService.saveOrUpdate(user);
        return ResultEntity.ok("成功");
    }
    @PostMapping("dels")
    public ResultEntity dels(@RequestParam(value = "uids") Integer[] uids){
        for (Integer uid: uids
             ) {
            QueryWrapper<User> wrapper = new QueryWrapper<>();
            wrapper.eq("uid",uid);
            iUserService.remove(wrapper);
        }
        return ResultEntity.ok("成功");
    }
}
