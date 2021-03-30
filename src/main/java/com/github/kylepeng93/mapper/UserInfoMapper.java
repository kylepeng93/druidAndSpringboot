package com.github.kylepeng93.mapper;

import com.github.kylepeng93.pojo.UserInfoPojo;
import org.apache.ibatis.annotations.Select;

/**
 * 用户信息数据访问层
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-24 下午11:11
 */
public interface UserInfoMapper {

    UserInfoPojo selectByPrimaryKey(int id);

}
