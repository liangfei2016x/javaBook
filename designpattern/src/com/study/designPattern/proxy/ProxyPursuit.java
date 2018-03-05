package com.study.designPattern.proxy;

/**
 * 代理追求者 ：代理对同一个对象，做同样的事样的事情
 * 
 * @author fei.liang
 *
 */
public class ProxyPursuit implements GiveGift {

	Pursuit pursuit;

	public ProxyPursuit(SchoolGirl schoolGirl) {
		pursuit = new Pursuit(schoolGirl);
	}

	@Override
	public void GiveDolls() {
		pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		pursuit.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		pursuit.GiveChocolate();
	}

}
