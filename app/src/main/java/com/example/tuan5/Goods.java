package com.example.tuan5;

import java.io.Serializable;

public class Goods implements Serializable {
    private String name;
    private  String nameShop;
    private String price;
    private int imgeGoods;

    public Goods(String name, String nameShop, String price, int imgeGoods) {
        this.name = name;
        this.nameShop = nameShop;
        this.price = price;
        this.imgeGoods = imgeGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImgeGoods() {
        return imgeGoods;
    }

    public void setImgeGoods(int imgeGoods) {
        this.imgeGoods = imgeGoods;
    }
}
