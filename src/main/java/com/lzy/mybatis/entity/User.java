package com.lzy.mybatis.entity;

public class User {

    private Integer id;

    private String name;

    private  Integer age;

    private String address;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(Integer id, String name, Integer age, String address, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.password = password;
    }
}
