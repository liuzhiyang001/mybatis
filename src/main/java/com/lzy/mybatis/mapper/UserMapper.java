package com.lzy.mybatis.mapper;

import com.lzy.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface UserMapper {

//    public List<Map<String,Object>> getAllUser(){
//
//    }
    @Select("SELECT * from t_user")
    public  List<Map<String,Object>> getAllUser();

    public  List<User> selAll();
}
