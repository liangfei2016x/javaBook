package com.study.designPattern.factory.method;

import com.study.designPattern.factory.Operation;

/**
 * 好用么?... 好像不太好.
 * 
 * @author fei.liang
 *
 */
public class Test {
	public static void main(String[] args) {
		IFactory iFactory = new AddFactory();
		Operation add = iFactory.CreateOperation();
		add.numberA = 1;
		add.numberB = 2;
		System.out.println(add.getResult());
	}
}
