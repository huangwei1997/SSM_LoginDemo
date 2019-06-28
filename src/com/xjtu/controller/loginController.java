package com.xjtu.controller;

import com.xjtu.pojo.User;
import com.xjtu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class loginController {
    //声明业务层对象
    @Resource
    private UserService userServiceImpl;
    //用户登录
    @RequestMapping("/login")
    public String userLogin(String uname,String upwd){
        //处理请求
        User user = userServiceImpl.selUserInfoService(uname,upwd);
        //响应
        if(user!=null){
            return "main"; //自定义视图解析器的请求转发
        }else{
            return "forward:/login.jsp"; //默认视图解析器的请求转发
        }

    }
}
