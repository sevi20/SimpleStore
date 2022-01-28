package com.company;

public class CartItem {
    Product product;
    public float quantity;

    public CartItem(Product product, float quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
