package com.example.zx.singleton;

/**
 * @author :zx05098
 * @version $Id: Singleton.java
 * 双重锁机制，保证获取到的只有一个对象
 */
public class Singleton {
    /**
     * 可见性 当多个线程访问一个变量时，一个线程修改了这个变量的值，其他线程能立即看到修改的值
     * volatile 保证修改的值立即更新到主存上，当其他线程需要读取时，会去内存中读取新值
     */
    private volatile static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    synchronized (Singleton.class) {
                        singleton = new Singleton();
                    }
                }
            }
        }
        return singleton;
    }
}
