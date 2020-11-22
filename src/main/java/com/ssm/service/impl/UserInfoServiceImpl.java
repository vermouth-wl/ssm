package com.ssm.service.impl;

import com.ssm.dao.UserInfoDao;
import com.ssm.pojo.UserInfo;
import com.ssm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserInfoServiceImpl
 * @Description TODO 用户逻辑接口实现类
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-11-22 16:50
 * @Version 1.0
 **/
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo login(String userCode, String password) {
        return userInfoDao.findUserInfoByCond(userCode, password);
    }
}
