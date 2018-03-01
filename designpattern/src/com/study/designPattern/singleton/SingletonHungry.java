package com.study.designPattern.singleton;

/**
 * 饿汉模式
 * 
 * @author fei.liang
 *
 */
public class SingletonHungry {

	private static SingletonHungry singleton = new SingletonHungry();

	/**
	 * 私有 不能被实例化
	 */
	private SingletonHungry() {
	}

	public static SingletonHungry getInstance() {
		return singleton;
	}

	public void say() {
		System.out.println("I am Singleton");
	}
}
