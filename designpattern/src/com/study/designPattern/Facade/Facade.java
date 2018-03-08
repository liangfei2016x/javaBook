package com.study.designPattern.Facade;

/**
 * 外观模式：为子系统中的一组接口提供一个一致的界面，
 * 
 * 此模式定义了一个更高层的接口，这个 接口使子系统更加容易使用
 * 
 * @author fei.liang
 *
 */
public class Facade {
	SubSystemOne subSystemOne;
	SubSystemTwo subSystemTwo;
	SubSystemThree subSystemThree;

	public Facade() {
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
	}

	public void methodA() {
		subSystemOne.oneMethod();
		subSystemTwo.twoMethod();
		System.out.println("组合一");
	}

	public void methodB() {
		subSystemTwo.twoMethod();
		subSystemThree.threeMethod();
		System.out.println("组合二");
	}
}
