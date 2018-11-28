package com.lzy.mybatis.entity;

public class Food {

    private Long id;

    private String foodName ;

    private String foodTaste ;

    private float foodPrice ;

    private String foodDescription ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodTaste() {
        return foodTaste;
    }

    public void setFoodTaste(String foodTaste) {
        this.foodTaste = foodTaste;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public Food() {
    }

    public Food(Long id, String foodName, String foodTaste, float foodPrice, String foodDescription) {
        this.id = id;
        this.foodName = foodName;
        this.foodTaste = foodTaste;
        this.foodPrice = foodPrice;
        this.foodDescription = foodDescription;
    }
}
