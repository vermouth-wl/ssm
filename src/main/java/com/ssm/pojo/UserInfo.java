package com.ssm.pojo;

/**
 * @Classname UserInfo
 * @Description TODO 用户实体类
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-11-22 16:43
 * @Version 1.0
 **/
public class UserInfo {

    private Integer id;
    private String userCode;
    private String userName;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
