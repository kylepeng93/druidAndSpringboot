package com.github.kylepeng93.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * 用户信息pojo
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-24 下午11:12
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserInfoPojo {
    private Integer id;
    private String userId;
    private String userName;
    private String sex;
    private Integer age;
    private String phoneNumber;
    private String address;
    private String inputUser;
    private Date inputTime;
    private String updateUser;
    private Date updateTime;
}
