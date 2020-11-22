package com.ssm.service;

import com.ssm.pojo.UserInfo;

/**
 * @InterfaceName UserInfoService
 * @Description TODO 业务逻辑层
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-11-22 16:49
 * @Version 1.0
 **/
public interface UserInfoService {
    public UserInfo login(String userCode, String password);
}
