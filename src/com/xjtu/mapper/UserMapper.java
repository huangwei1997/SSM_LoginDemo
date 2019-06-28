package com.xjtu.mapper;

import com.xjtu.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    //根据用户名和密码查询用户信息
    @Select("select * from user where uname=#{0} and upwd=#{1}")
    User getUserInfo(String uname,String upwd);
}
