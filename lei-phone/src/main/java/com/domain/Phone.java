package com.domain;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class Phone {

    private int pid;
    private String pname;
    private BigDecimal price;
    private String description;

    public Phone() {

    }

    public Phone(String pname, BigDecimal price, String description) {
        this.pname = pname;
        this.price = price;
        this.description = description;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
