package com.example.zx.builder;

/**
 * @author :zx05098
 * @version $Id: Item.java
 */
public interface Item {
    String name();

    /**
     * 打包
     * @return
     */
    Packing packing();

    float price();
}
