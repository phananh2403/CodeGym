package com.codegymhueJava;

import java.io.Serializable;

public class Products implements Serializable {
    private String code;
    private String name;
    private String madeBy;
    private int price;
    private String info;

    public Products() {
    }

    public Products(String code, String name, String madeBy, int price, String info) {
        this.code = code;
        this.name = name;
        this.madeBy = madeBy;
        this.price = price;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "\t" + code + "\t\t" + name + "\t\t" + madeBy + "\t\t" + price + "\t\t" + info;
    }
}
