package com.example.zx.strategy;

/**
 * 好的行为
 */
public  class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Good fly....");
    }
}
