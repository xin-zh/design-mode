package com.example.zx.abstractfactorypattern.supplier;

import com.example.zx.abstractfactorypattern.resolver.AbstractResolverRegister;

public class SupplierRegister extends AbstractResolverRegister<String, ISupplierProducer> {

    @Override
    protected Class<ISupplierProducer> getResolverClass() {
        return ISupplierProducer.class;
    }
}
