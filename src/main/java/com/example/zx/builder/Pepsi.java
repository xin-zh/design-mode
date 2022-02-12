package com.example.zx.builder;

/**
 * @author :zx05098
 * @version $Id: Pepsi.java
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi Cole";
    }

    @Override
    public float price() {
        return 8f;
    }
}
