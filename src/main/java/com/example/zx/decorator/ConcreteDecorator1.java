package com.example.zx.decorator;

/**
 * 具体装饰1
 */
public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
	}

	public void preFunction() {
		System.out.println("前置：为具体构件角色1增加额外功能addedFunction()");
	}

	public void afterFunction() {
		System.out.println("后置：为具体构件角色1增加额外功能addedFunction()");
	}

	@Override
	public void operation() {
		preFunction();
		super.operation();
		afterFunction();
	}
}
