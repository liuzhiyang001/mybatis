package com.lzy.mybatis.service.impl;

import com.lzy.mybatis.entity.User;
import com.lzy.mybatis.mapper.UserMapper;
import com.lzy.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
        /*
        所以商品
         */
    @Override
    public List<Map<String,Object>> getAllUser(){
        return this.userMapper.getAllUser();
    }

    @Override
    public List <User> sellAll() {
        return this.userMapper.selAll();
    }
}
