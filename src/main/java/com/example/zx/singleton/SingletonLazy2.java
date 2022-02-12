package com.example.zx.singleton;

/**
 * @author :zx05098
 * @version $Id: SinglletonLazt2.java
 * 懒汉式：线程安全，第一次使用时初始化，必须加锁，会影响效率
 */
public class SingletonLazy2 {
    private static SingletonLazy2 instance;

    private SingletonLazy2() {

    }

    /**
     * 对方法加锁保持单例，会影响性能
     * @return
     */
    public static synchronized SingletonLazy2 getInstance() {
        if (instance == null) {
            instance = new SingletonLazy2();
        }
        return instance;
    }
}
