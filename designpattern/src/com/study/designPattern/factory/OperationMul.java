package com.study.designPattern.factory;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return numberA * numberB;
	}

}
