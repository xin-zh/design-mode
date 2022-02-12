package com.example.zx.abstractfactorypattern;
import com.example.zx.common.color.Blue;
import com.example.zx.common.color.Color;
import com.example.zx.common.color.Green;
import com.example.zx.common.color.Red;
import com.example.zx.common.shape.Shape;
import org.apache.commons.lang3.StringUtils;

public class ColorFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (StringUtils.isEmpty(color)) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
