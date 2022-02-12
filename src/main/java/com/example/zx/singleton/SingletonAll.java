package com.example.zx.singleton;

/**
 * @author :zx05098
 * @version $Id: SingletonAll.java
 * 饿汉式加载,易于实现但是会产生垃圾对象,在类装载时就已经初始化对象了
 *
 */
public class SingletonAll {
    private static SingletonAll instance = new SingletonAll();

    private SingletonAll() {

    }

    public static SingletonAll getInstance() {
        return instance;
    }
}
