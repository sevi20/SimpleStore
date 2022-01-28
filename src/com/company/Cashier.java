package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cashier {

    public static void printReceipt(LocalDateTime purchaseDate, Cart cart) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedPurchaseDateTime = purchaseDate.format(formatter);

        System.out.println("Date: " + formattedPurchaseDateTime + "\n" +
                "----- Products -----" + "\n");

        float totalDiscount = 0;
        float subTotal = 0;

        for (CartItem item : cart.cartItems) {

            float currentItemSum = item.product.price * item.quantity;
            subTotal += currentItemSum;

            System.out.println(item.product.name + " - " + item.product.brand + "\n" +
                    item.quantity + " x " + item.product.price + " = " + currentItemSum + "\n");

            float discount = item.product.getDiscount(purchaseDate);

            if (discount > 0) {
                float realDiscount = discount / 100 * currentItemSum;
                System.out.println("#discount " + discount + "% -" + realDiscount);

                totalDiscount += realDiscount;
            }

            System.out.println("\n\n");
        }

        System.out.println("-----------------------------------------------------------------------------------\n" +
                "SUBTOTAL: $" + subTotal + "\n" +
                "DISCOUNT: $" + totalDiscount + "\n\n" +
                "TOTAL: $" + (subTotal - totalDiscount));
    }
}
