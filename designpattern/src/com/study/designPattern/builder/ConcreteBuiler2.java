package com.study.designPattern.builder;

public class ConcreteBuiler2 implements Builder {

	private Product product = new Product();

	@Override
	public void BuildPartA() {
		product.add("部件A");
	}

	@Override
	public void BuildPartB() {
		product.add("部件B");
	}

	@Override
	public Product GetResult() {
		return product;
	}

}
