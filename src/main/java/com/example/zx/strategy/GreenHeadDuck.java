package com.example.zx.strategy;

/**
 * 通过行为组对象，将具体的行为实现，而不是在实现类中完成某种行为
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck(){
        flyBehavior=new GoodFlyBehavior() ;
        quackBehavior=new GagaQuackBehavior() ;
    }
    @Override
    public void display() {
        System.out.println("Green Head Duck");
    }
}
