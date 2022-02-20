package com.example.zx.prototype;

public class PrototypePatternDemoTest2 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Circle clone = (Circle) circle.clone();
    }
}
