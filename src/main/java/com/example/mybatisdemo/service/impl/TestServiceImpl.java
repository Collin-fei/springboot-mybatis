package com.example.mybatisdemo.service.impl;

import com.example.mybatisdemo.entity.Activity;
import com.example.mybatisdemo.entity.ActivityExample;
import com.example.mybatisdemo.mapper.ActivityMapper;
import com.example.mybatisdemo.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Collin
 * @Date: 2022/12/21 16:31
 * @description:
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public List<Activity> selectByExample(ActivityExample example) {
        PageHelper.startPage(1,10);
        List<Activity> activities = activityMapper.selectByExample(example);
        PageInfo<Activity> pageInfo = new PageInfo<>(activities);
        return pageInfo.getList();
    }
}
