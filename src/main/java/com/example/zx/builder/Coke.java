package com.example.zx.builder;

/**
 * @author :zx05098
 * @version $Id: Cole.java
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke cole";
    }

    @Override
    public float price() {
        return 10f;
    }
}
