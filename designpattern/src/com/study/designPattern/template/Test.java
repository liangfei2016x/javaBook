package com.study.designPattern.template;

public class Test {
	public static void main(String[] args) {
		TemplateBase tb;
		tb = new ConcreateClassA();
		tb.templateMethod();
		tb = new ConcreateClassB();
		tb.templateMethod();

	}
}
