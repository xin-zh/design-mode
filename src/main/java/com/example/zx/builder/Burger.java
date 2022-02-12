package com.example.zx.builder;
/**
 * @author :zx05098
 * @version $Id: Burger.java
 * 汉堡
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
