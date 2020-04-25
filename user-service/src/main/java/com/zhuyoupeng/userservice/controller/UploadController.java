package com.zhuyoupeng.userservice.controller;

import com.zhuyoupeng.userservice.vo.ResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("user")
public class UploadController {
    @RequestMapping("/upload")
    public ResultEntity upload(MultipartFile file) throws IOException {
        try {
            if (file != null && !file.isEmpty()) {
                //上传路径地址
                String path = "D:\\pics\\";
                //文件名称
                String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
                //创建文件对象
                File destFile = new File(path, fileName);
                file.transferTo(destFile);
                System.out.println(file);
                return ResultEntity.ok("http://localhost:97/img/" + fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultEntity.error("upload");
    }
}
