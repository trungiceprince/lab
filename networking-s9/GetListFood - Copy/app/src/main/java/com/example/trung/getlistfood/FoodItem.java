package com.example.trung.getlistfood;

/**
 * Created by trung on 11/27/2016.
 */

public class FoodItem {
    String name;
    String image;
    String detail;
    int price;

    public FoodItem( String image, String name, String detail, int price) {
        this.name = name;
        this.image = image;
        this.detail = detail;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                '}';
    }
}
