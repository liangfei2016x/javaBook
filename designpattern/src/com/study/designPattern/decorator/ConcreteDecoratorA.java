package com.study.designPattern.decorator;

public class ConcreteDecoratorA extends Decorator {

	public String addState;

	@Override
	public void operation() {
		super.operation();
		addState = "New State";
		System.out.println("具体装饰对象A的操作");
	}

}
