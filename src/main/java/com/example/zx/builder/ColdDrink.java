package com.example.zx.builder;

/**
 * @author :zx05098
 * @version $Id: ColdDrink.java
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
