package com.study.designPattern.builder;

public class Director {

	public void construct(Builder builder) {
		builder.BuildPartA();
		builder.BuildPartB();
	}
}
