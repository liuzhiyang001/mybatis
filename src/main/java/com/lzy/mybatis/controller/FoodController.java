package com.lzy.mybatis.controller;

import com.lzy.mybatis.entity.Food;
import com.lzy.mybatis.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/food")
public class FoodController {


    @Autowired
    private FoodService foodService;
    /*
    添加食品
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Boolean addFood(Food food){

        return  this.foodService.addFood(food);
    }
    /*
   添加食品
    */
    @RequestMapping(value = "/del")
    @ResponseBody
    public Boolean delFood(Long id){

        return  this.foodService.delFood(id);
    }

    /*
        查询所有食品
   */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<Map<String, Object>> getALlFood(HttpServletRequest request, HttpServletResponse response){


        int page=Integer.parseInt(request.getParameter("page"));
        int pageSzie=Integer.parseInt(request.getParameter("rows"));//pageSzie

        int startRecord=(page-1)*pageSzie+1;

        //int total=commonservice.gettstunumber();
        System.out.println(page);
        System.out.println(pageSzie);
        return  this.foodService.getAll();
    }
    /*
        测试jsp的easyUI
     */

    @RequestMapping(value = "/myTest")
    public String getJsp(){

        return  "myTest";
    }


}
