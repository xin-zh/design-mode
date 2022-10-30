package com.example.zx.decorator;

/**
 * 具体装饰2
 */
public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}

	public void addedFunction() {
		System.out.println("为具体构件角色1增加额外功能addedFunction()");
	}

	@Override
	public void operation() {

	}
}
