package com.github.kylepeng93.controller;

import com.github.kylepeng93.pojo.UserInfoPojo;
import com.github.kylepeng93.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 用户信息控制器
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-24 下午11:18
 */
@RestController
@RequestMapping("/user-manager/v1")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @GetMapping(value = "/getUserInfo")
    public UserInfoPojo getUserInfo(@RequestParam int id) {
        UserInfoPojo userInfoPojo = userInfoService.getUserInfoById(id);
        return userInfoPojo;
    }
}
