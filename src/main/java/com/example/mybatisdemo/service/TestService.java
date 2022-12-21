package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.Activity;
import com.example.mybatisdemo.entity.ActivityExample;

import java.util.List;

/**
 * @author: Collin
 * @Date: 2022/12/21 16:31
 * @description:
 */
public interface TestService {
    List<Activity> selectByExample(ActivityExample example);
}
