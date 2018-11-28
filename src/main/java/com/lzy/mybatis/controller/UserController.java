package com.lzy.mybatis.controller;

import com.lzy.mybatis.entity.User;
import com.lzy.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Map<String,Object>> getAllUser(){
        return this.userService.getAllUser();
    }

    @RequestMapping("/list2")
    @ResponseBody
    public List<User> selAll(){
        return this.userService.sellAll();
    }
}
