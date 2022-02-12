package com.example.zx.abstractfactorypattern.product;

import com.example.zx.abstractfactorypattern.resolver.IResolver;

public interface IProductProducer extends IResolver<String> {

    /**
     * 业务处理
     */
    void handle();

    /**
     * 前置处理
     */
    void preHandle();

    /**
     * 后置处理
     */
    void postHandle();
}
