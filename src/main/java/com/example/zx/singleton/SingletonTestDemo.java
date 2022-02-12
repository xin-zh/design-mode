package com.example.zx.singleton;

import java.util.stream.IntStream;

/**
 * @author :zx05098
 * @version $Id: SingletonTestDemo.java
 */
public class SingletonTestDemo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);

        System.out.println("==============================");

        long start1 = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(t -> Singleton.getInstance());
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        long start2 = System.currentTimeMillis();
        IntStream.range(1, 10000).parallel().forEach(t -> Singleton.getInstance());
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

    }

    /***
     *
     * designmode.singleton.Singleton@4554617c
     * designmode.singleton.Singleton@4554617c
     *  请求次数     100    10000    1000000000
     *  非并发请求    35      37        41
     *  并发请求      4       3         25
     */
}
