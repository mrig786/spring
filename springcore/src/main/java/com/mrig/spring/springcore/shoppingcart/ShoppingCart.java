package com.mrig.spring.springcore.shoppingcart;

public class ShoppingCart {
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "item=" + item +
                '}';
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    private Item item;
}
