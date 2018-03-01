package com.study.designPattern.singleton;

/**
 * 懒汉模式
 * 
 * @author fei.liang
 *
 */
public class SingletonLazy {

	private static SingletonLazy singleton;

	/**
	 * 私有 不能被实例化
	 */
	private SingletonLazy() {
	}

	public static SingletonLazy getInstance() {
		if (singleton == null) {
			singleton = new SingletonLazy();
		}
		return singleton;
	}

	public void say() {
		System.out.println("I am Singleton");
	}

}
