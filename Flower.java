package com.example.android.myapplicationdynamicfragment.model;

/**
 * Created by ASUS on 3/28/2018.
 */

public class Flower {

    String name;
    String price;
    String description;

    int pic;

    public Flower(String name, String price, String description, int pic) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
