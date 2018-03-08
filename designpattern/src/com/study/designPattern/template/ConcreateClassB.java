package com.study.designPattern.template;

public class ConcreateClassB extends TemplateBase {

	@Override
	public void primitiveOperation1() {
		System.out.println("具体实现B-1");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("具体实现B-2");
	}

}
