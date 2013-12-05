package com.thoughtworks.yafei;

public class SweetLover {
    public static final String POSITIVE_RESPONSE = "Love this fruit!";
    public static final String NEGATIVE_RESPONSE = "Don't like this fruit...";
    private Fruit fruit;

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public String eat() {
        if (fruit.isSweet()) {
            return POSITIVE_RESPONSE;
        } else {
            return NEGATIVE_RESPONSE;
        }
    }
}
