package com.example.zx.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap=new Hashtable();


    public static  Shape getShape(String shapeId){
        Shape shapeCache = shapeMap.get(shapeId);
        return (Shape) shapeCache.clone();
    }

    public static void printShapeMap(){
        for (Shape shape:shapeMap.values()){
            System.out.println(shape);
        }
    }

    /**
     * 初始化缓存数据
     */
    public static void initCache(){
        Shape circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Shape rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Shape square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
    }
}
