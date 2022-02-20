package com.example.zx.prototype;

public class Circle extends Shape {
    public Circle(){
        type="Circle";
        System.out.println("Circle");
    }

    @Override
    void draw() {
        System.out.println("Draw a Circle");
    }
}
