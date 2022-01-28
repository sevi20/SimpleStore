package com.company;

import java.util.Arrays;
import java.util.List;

public class Cart {
    List<CartItem> cartItems;

    public Cart(CartItem... cartItems) {
        this.cartItems = Arrays.asList(cartItems);
    }
}
