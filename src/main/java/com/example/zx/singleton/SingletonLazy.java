package com.example.zx.singleton;

/**
 * @author :zx05098
 * @version $Id: SingletonLazy.java
 * 1.懒汉式：线程不安全，不支持多线程
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {

    }

    /**
     * 并发请求时，可能获取到多个对象，不能保证单例
     * @return
     */
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
