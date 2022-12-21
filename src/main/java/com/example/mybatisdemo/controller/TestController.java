package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.Activity;
import com.example.mybatisdemo.mapper.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Collin
 * @Date: 2022/12/21 15:32
 * @description:
 */
@Controller
public class TestController {
    @Autowired
    private ActivityMapper activityMapper;

    @RequestMapping("/test")
    @ResponseBody
    public Activity test() {
        return activityMapper.selectByPrimaryKey(2);
    }
}
