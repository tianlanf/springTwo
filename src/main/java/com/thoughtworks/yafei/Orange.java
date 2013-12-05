package com.thoughtworks.yafei;

public class Orange implements Fruit {
    @Override
    public boolean isSweet() {
        System.out.println("Orange is sour.");
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
