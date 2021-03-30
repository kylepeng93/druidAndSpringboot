package com.github.kylepeng93.service.impl;

import com.github.kylepeng93.mapper.UserInfoMapper;
import com.github.kylepeng93.pojo.UserInfoPojo;
import com.github.kylepeng93.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息服务实现
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-24 下午11:22
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoPojo getUserInfoById(Integer id) {
        if (id == null) return null;
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
