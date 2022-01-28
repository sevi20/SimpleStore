package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        Food apple = new Food("Apple", "Fruit", 1.50f, "20210614");
        apple.showFeatures();
        System.out.println("-------------------------------------------------");
        Beverage milk = new Beverage("Milk", "Drink",0.99f, "20220202");
        milk.showFeatures();
        System.out.println("-------------------------------------------------");
        Cloth t_shirt = new Cloth("T-shirt", "Clothe",15.99f, Cloth.size.S.toString(),"violet");
        t_shirt.showFeatures();
        System.out.println("-------------------------------------------------");
        Appliance laptop = new Appliance("Laptop","Computer", 2345,"LG","20210303",1.125 );
        laptop.showFeatures();
        System.out.println("-------------------------------------------------");

        CartItem item1 = new CartItem(apple,2.45f);
        CartItem item2  = new CartItem(milk,3);
        CartItem item3 = new CartItem(t_shirt, 2);
        CartItem item4 = new CartItem(laptop,1);

        Cart cart = new Cart(item1, item2, item3, item4);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime purchaseDateTime = LocalDateTime.parse("2021-06-14 12:34:56", formatter);

        Cashier.printReceipt(purchaseDateTime, cart);

    }
}
