package com.study.designPattern.factory;

public class OperationFactory {
	// 通常用的方法
	public static Operation getOperation(char operator) {
		Operation operation = null;
		switch (operator) {
		case '+':
			operation = new OperationAdd();
			break;
		case '-':
			operation = new OperationSub();
			break;
		case '*':
			operation = new OperationMul();
			break;
		case '/':
			operation = new OperationDiv();
			break;
		default:
			throw new RuntimeException("不支持的运算");
		}
		return operation;
	}

	// 利用反射机制创建对象
	public static <T> T getOperation1(Class<? extends T> clazz) {
		T obj = null;
		try {
			obj = (T) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
