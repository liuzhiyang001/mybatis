package com.lzy.mybatis.mapper;

import com.lzy.mybatis.entity.Food;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface FoodMapper {

    /*
    添加
     */
    @Insert("INSERT INTO foods(food_name,food_taste,food_price,food_description) VALUES(#{foodName},#{foodTaste},#{foodPrice},#{foodDescription})")
    int addFood(Food food);

    @Delete("DELETE FROM foods WHERE id=#{arg0}")
    int delFood(Long id);

    /*
    查询分页
     */
    @Select("SELECT * FROM foods")
    List<Map<String,Object>> getAll();

    @Select("SELECT count(*) FROM foods")
    int getCount();
}
