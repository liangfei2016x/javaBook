package com.study.designPattern.builder;

/**
 * ???
 * 
 * @author fei.liang
 *
 */
public class Test {
	public static void main(String[] args) {
		Director d1 = new Director();
		Builder b1 = new ConcreteBuiler1();
		Builder b2 = new ConcreteBuiler2();
		d1.construct(b1);
		Product p1 = b1.GetResult();
		p1.show();

		d1.construct(b2);
		Product p2 = b2.GetResult();
		p2.show();

	}

}
