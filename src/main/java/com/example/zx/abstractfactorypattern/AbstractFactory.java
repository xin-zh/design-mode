package com.example.zx.abstractfactorypattern;


import com.example.zx.common.color.Color;
import com.example.zx.common.shape.Shape;

public interface AbstractFactory {
    Shape getShape(String shape);

    Color getColor(String color);
}
