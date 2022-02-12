package com.example.zx.abstractfactorypattern.product;

import com.example.zx.abstractfactorypattern.resolver.AbstractResolverRegister;

public class ProductRegister extends AbstractResolverRegister<String, IProductProducer> {
    @Override
    protected Class<IProductProducer> getResolverClass() {
        return IProductProducer.class;
    }
}
