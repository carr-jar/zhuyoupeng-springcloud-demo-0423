package com.zhuyoupeng.userservice.bean;

import lombok.Data;

@Data
public class UserVo extends User{
    private String provinceName;
    private String cityName;
}
