package com.study.designPattern.decorator;

public class Person {

	public Person() {

	}

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("装扮的" + name);
	}
}
