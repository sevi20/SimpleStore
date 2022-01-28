package com.company;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Cloth extends Product {

    protected enum size {XS, S, M, L, XL};
    private String clotheSize;
    private String color;

    public Cloth(String name, String brand, float price, String clotheSize, String color){
        super(name, brand, price);
        this.clotheSize = clotheSize;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getClotheSize() {
        return clotheSize;
    }

    @Override
    public void showFeatures() {
        System.out.println("Product name: " + name + "\n" +
                "Brand: " + brand + "\n" +
                "Price: $" + price + "\n" +
                "Size: " + getClotheSize() + "\n" +
                "Color: " + getColor());
    }

    @Override
    public float getDiscount(LocalDateTime purchaseDate) {
        Calendar c1 = Calendar.getInstance();

        if(!((c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (Calendar.DAY_OF_WEEK == Calendar.SUNDAY)))
        {
            return  10.0f;
        }
        return 0;
    }
}