package com.domain;

import java.math.BigDecimal;


public class Product {
    private int pid;
    private String pname;
    private int price;
    private String description;
    private String imgs;



    public Product(String pname, int price, String description, String imgs) {
        this.pname = pname;
        this.price = price;
        this.description = description;
        this.imgs = imgs;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImgs() {
        return imgs;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }


}
