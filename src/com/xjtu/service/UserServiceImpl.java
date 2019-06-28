package com.xjtu.service;

import com.xjtu.mapper.UserMapper;
import com.xjtu.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    public User selUserInfoService(String uname, String upwd) {
        return userMapper.getUserInfo(uname,upwd);
    }
}
