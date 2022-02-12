package com.example.zx.builder;

/**
 * @author :zx05098
 * @version $Id: VegBurger.java
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float price() {
        return 15f;
    }
}
