package com.ssm.dao;

import com.ssm.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @InterfaceName UserInfoDao
 * @Description TODO 数据库访问层
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-11-22 16:45
 * @Version 1.0
 **/
public interface UserInfoDao {

    // 根据用户编码和密码查询
    @Select("select * from userinfo t where t.user_code = #{userCode} and t.password = #{password}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "userCode", column = "user_code"),
            @Result(property = "userName", column = "user_name")
    })
    public UserInfo findUserInfoByCond(@Param("userCode") String userCode, @Param("password") String password);
}
