package com.lzy.mybatis.service;

import com.lzy.mybatis.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    /*
        所以商品
         */
    List<Map<String,Object>> getAllUser();

    List<User> sellAll();
}
