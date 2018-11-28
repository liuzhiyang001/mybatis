package com.lzy.mybatis.service.impl;

import com.lzy.mybatis.entity.Food;
import com.lzy.mybatis.mapper.FoodMapper;
import com.lzy.mybatis.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public Boolean addFood(Food food) {
        return this.foodMapper.addFood(food) >=1? true:false;
    }

    @Override
    public Boolean delFood(Long id) {
        return this.foodMapper.delFood(id)>=1?true:false;
    }

    @Override
    public List <Map<String, Object>> getAll() {
        return this.foodMapper.getAll();
    }

    @Override
    public int getCount() {
        return this.foodMapper.getCount();
    }


}
