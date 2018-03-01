package com.study.designPattern.factory;

public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return numberA + numberB;
	}

}
