package com.company;

public class Beverage extends Perishable {

    public Beverage(String name, String brand, float price, String expirationDate) {
        super(name, brand, price, expirationDate);
    }

    @Override
    public void showFeatures() {
        super.showFeatures();
    }
}
