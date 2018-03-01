package com.study.designPattern.factory;

public class OperationSub extends Operation {

	@Override
	public double getResult() {
		return numberA - numberB;
	}

}
