package com.example.zx.strategy;

/**
 * 坏的行为
 */
public  class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Bad fly....");
    }
}
