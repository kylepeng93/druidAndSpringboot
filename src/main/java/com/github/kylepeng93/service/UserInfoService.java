package com.github.kylepeng93.service;

import com.github.kylepeng93.pojo.UserInfoPojo;

/**
 * 用户信息服务接口
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-24 下午11:21
 */
public interface UserInfoService {
    UserInfoPojo getUserInfoById(Integer id);
}
