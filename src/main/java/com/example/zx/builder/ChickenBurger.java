package com.example.zx.builder;

/**
 * @author :zx05098
 * @version $Id: ChickenBurger.java
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float price() {
        return 45f;
    }
}
