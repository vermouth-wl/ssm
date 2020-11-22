package com.ssm.controller;

import com.ssm.pojo.UserInfo;
import com.ssm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname UserInfoController
 * @Description TODO 用户控制器
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-11-22 16:52
 * @Version 1.0
 **/
@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/login")
    public String login(UserInfo userInfo) {
        UserInfo tempUserInfo = userInfoService.login(userInfo.getUserCode(), userInfo.getPassword());
        if (tempUserInfo != null && tempUserInfo.getUserCode() != null) {
            return "index";
        } else {
            return "redirect:/login.jsp";
        }
    }
}
