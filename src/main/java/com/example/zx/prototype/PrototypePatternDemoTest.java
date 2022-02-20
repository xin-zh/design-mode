package com.example.zx.prototype;

/**
 * 原型模式，clone出来的对象与原对象在堆里是不同的对象
 */
public class PrototypePatternDemoTest {

    public static void main(String[] args) {
        ShapeCache.initCache();

        ShapeCache.printShapeMap();

        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape);

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println(shape2);

        Shape shape3 = ShapeCache.getShape("3");
        System.out.println(shape3);
    }
}
