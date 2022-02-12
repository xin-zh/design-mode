package com.example.zx.factorypattern;

import com.example.zx.common.shape.Circle;
import com.example.zx.common.shape.Rectangle;
import com.example.zx.common.shape.Shape;
import com.example.zx.common.shape.Square;
import org.apache.commons.lang3.StringUtils;


public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (StringUtils.isEmpty(shapeType)) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
