package com.example.zx.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecorator2(component);
		decorator.operation();

	}

}
