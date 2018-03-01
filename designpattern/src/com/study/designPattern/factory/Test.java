package com.study.designPattern.factory;

public class Test {
	public static void main(String[] args) {
		Operation operation;
		char operator;
		// 根据符号判断运算
		operator = '+';
		operation = OperationFactory.getOperation(operator);
		operation.numberA = 1;
		operation.numberB = 2;
		System.out.println(operation.getResult());
		// 想进行什么运算调用对应的类 (主要为了测试反射机制在工厂模式中的应用,这里不适用需求)
		operation = OperationFactory.getOperation1(OperationDiv.class);
		operation.numberA = 10;
		operation.numberB = 2;
		System.out.println(operation.getResult());
	}
}
