package com.study.designPattern.singleton;

public class Test {
	public static void main(String[] args) {
		SingletonLazy singletonLazy = SingletonLazy.getInstance();
		singletonLazy.say();
	}

}
