package com.example.zx.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Duck greenDuck=new GreenHeadDuck();
        Duck stoneDuck=new StoneDuck();
        greenDuck.quack();
        greenDuck.fly();
        greenDuck.display();

        stoneDuck.quack();
        stoneDuck.fly();
        stoneDuck.display();

    }
}
