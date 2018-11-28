package com.lzy.mybatis.entity;

public class PageBean extends User{

    private String rows;

    private  String total;

    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public PageBean(String rows, String total) {
        this.rows = rows;
        this.total = total;
    }

    public PageBean(Integer id, String name, Integer age, String address, String password, String rows, String total) {
        super(id, name, age, address, password);
        this.rows = rows;
        this.total = total;
    }
}
