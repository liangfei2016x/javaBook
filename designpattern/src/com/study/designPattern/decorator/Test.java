package com.study.designPattern.decorator;

public class Test {
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA ca = new ConcreteDecoratorA();
		ConcreteDecoratorB cb = new ConcreteDecoratorB();
		ca.setComponent(c);
		cb.setComponent(ca);
		cb.operation();

		Person person = new Person("小明");
		Sneakers sneakers = new Sneakers();
		BigTShirts bigTShirts = new BigTShirts();
		// 装饰对象
		sneakers.Decorate(person);
		bigTShirts.Decorate(sneakers);

		bigTShirts.show();

	}

}
