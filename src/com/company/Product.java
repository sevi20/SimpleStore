package com.company;

import java.time.LocalDateTime;

public class Product {
    public String name;
    public String brand;
    public float price;

    public Product(String name, String brand, float price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public float getDiscount(LocalDateTime purchaseDate){
        return 0;
    }

    public void showFeatures() {
            System.out.println("Product name: " + name + "\n" +
                    "Brand: " + brand + "\n"+
                    "Price: $" + price);
        }
    }
