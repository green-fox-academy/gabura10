package com.webshop.webshop.models;

import java.util.*;

public class ShopItem implements Comparable<ShopItem> {
    protected String name;
    protected String description;
    protected int price;
    protected int quantityOfStock;

    public ShopItem(String name, String description, int price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(int quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }
    @Override
    public int compareTo(ShopItem thing){
        if (this.price > thing.price){
            return 1;
        }
        return 0;
    }
}
