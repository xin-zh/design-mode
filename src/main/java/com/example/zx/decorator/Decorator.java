package com.example.zx.decorator;

/**
 * 抽象装饰
 */
public abstract class Decorator implements Component {
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
	}
}
