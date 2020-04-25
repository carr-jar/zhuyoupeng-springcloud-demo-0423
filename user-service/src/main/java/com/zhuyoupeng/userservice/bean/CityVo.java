package com.zhuyoupeng.userservice.bean;

import lombok.Data;

import java.util.List;

@Data
public class CityVo {
    private Integer id;
    private String name;
    private List<CityVo> list;
}
