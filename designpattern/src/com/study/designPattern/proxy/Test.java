package com.study.designPattern.proxy;

public class Test {
	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl();
		schoolGirl.setName("静静");
		// 用代理去
		ProxyPursuit proxyPursuit = new ProxyPursuit(schoolGirl);
		proxyPursuit.GiveDolls();
		proxyPursuit.GiveFlowers();
		proxyPursuit.GiveChocolate();
	}

}
