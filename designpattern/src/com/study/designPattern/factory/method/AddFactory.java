package com.study.designPattern.factory.method;

import com.study.designPattern.factory.Operation;
import com.study.designPattern.factory.OperationAdd;

public class AddFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		return new OperationAdd();
	}

}
