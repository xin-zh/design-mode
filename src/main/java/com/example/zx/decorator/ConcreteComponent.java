package com.example.zx.decorator;

/**
 * 具体构件
 */
public class ConcreteComponent implements Component {
	public ConcreteComponent(){
		System.out.println("创建具体构件");
	}

	@Override
	public void operation() {
		System.out.println("创建具体构件的构建方法operation()");
	}
}
