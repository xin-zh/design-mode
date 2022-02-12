package com.example.zx.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :zx05098
 * @version $Id: Meal.java
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(String.format("Item:%s,Price:%s,Packing:%s", item.name(), item.price(), item.packing()));
        }
    }
}
