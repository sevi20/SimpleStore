package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Appliance extends Product {
    private String model;
    private LocalDate productionDate;
    private double weight;


    public Appliance(String name, String brand, float price, String model, String productionDate, double weight) {
        super(name, brand, price);
        this.model = model;
        this.productionDate = LocalDate.parse(productionDate, DateTimeFormatter.BASIC_ISO_DATE);
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void showFeatures() {
        System.out.println("Food name: " + name+ "\n" +
                "Brand: " + brand + "\n"+
                "Price: $" + price + "\n" +
                "Production Date: " + productionDate.toString() + '\n' +
                "Weight: " + getWeight());
    }

    @Override
    public float getDiscount(LocalDateTime purchaseDate) {
        Calendar c1 = Calendar.getInstance();

        if(price > 999 &&
                ((c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (Calendar.DAY_OF_WEEK == Calendar.SUNDAY)))
        {
            return 5;
        }

        return 0;
    }
}
