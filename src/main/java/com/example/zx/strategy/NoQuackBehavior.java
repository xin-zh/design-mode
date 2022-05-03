package com.example.zx.strategy;

public  class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No Quack....");
    }
}
