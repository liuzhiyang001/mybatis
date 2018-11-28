package com.lzy.mybatis.service;

import com.lzy.mybatis.entity.Food;
import com.lzy.mybatis.entity.User;

import java.util.List;
import java.util.Map;

public interface FoodService {
    /*
        所以商品
         */

     Boolean addFood(Food food);

     Boolean delFood(Long id);

    List<Map<String,Object>> getAll();

    int getCount();
}
