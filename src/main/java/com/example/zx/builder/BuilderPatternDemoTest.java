package com.example.zx.builder;

/**
 * @author :zx05098
 * @version $Id: BuilderPatternDemoTest.java
 */
public class BuilderPatternDemoTest {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal noVegMeal = builder.prepareNoVegMeal();
        System.out.println("No Veg Meal");
        noVegMeal.showItems();
        System.out.println("Total Cost:" + noVegMeal.getCost());
    }
}
