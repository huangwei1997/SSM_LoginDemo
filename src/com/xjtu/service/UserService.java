package com.xjtu.service;

import com.xjtu.pojo.User;

public interface UserService {
    //用户登录
    User selUserInfoService(String uname,String upwd);
}
