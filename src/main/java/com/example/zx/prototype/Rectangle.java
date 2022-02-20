package com.example.zx.prototype;

public class Rectangle extends Shape {
    public Rectangle(){
        type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw a Rectangle");
    }
}
