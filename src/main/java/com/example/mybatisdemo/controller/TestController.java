package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.Activity;
import com.example.mybatisdemo.entity.ActivityExample;
import com.example.mybatisdemo.mapper.ActivityMapper;
import com.example.mybatisdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: Collin
 * @Date: 2022/12/21 15:32
 * @description:测试
 */
@Controller
public class TestController {
    @Autowired
    private ActivityMapper activityMapper;
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public Activity test() {
        return activityMapper.selectByPrimaryKey(2);
    }

    @RequestMapping("/testPage")
    @ResponseBody
    public List<Activity> testPage() {
        ActivityExample activityExample = new ActivityExample();
        activityExample.createCriteria().andActivityNameEqualTo("春季外卖节");
        return testService.selectByExample(activityExample);
    }
}
