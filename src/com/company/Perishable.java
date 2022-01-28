package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class Perishable extends Product {

    private LocalDate expirationDate;

    public Perishable(String name, String brand, float price, String expirationDate){
        super(name, brand, price);
        this.expirationDate = LocalDate.parse(expirationDate, DateTimeFormatter.BASIC_ISO_DATE);
    }

    private LocalDate getExpirationDate() {
        return expirationDate;
    }


    @Override
    public void showFeatures() {
        System.out.println("Food name: " + name + "\n" +
                "Brand: " + brand + "\n"+
                "Price: $" + price + "\n" +
                "Expiration Date: " + expirationDate.toString());
    }

    @Override
    public float getDiscount(LocalDateTime purchaseDate) {

        if (expirationDate.isAfter(ChronoLocalDate.from(purchaseDate.minusDays(5))) ) {
            if (expirationDate.isAfter(ChronoLocalDate.from(purchaseDate.minusDays(1)))) {
                return 50.0f;
            }
            return  10.0f;
        }
        return  0;
    }
}