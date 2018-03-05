package com.study.designPattern.proxy;

/**
 * 实际追求者
 * 
 * @author fei.liang
 *
 */
public class Pursuit implements GiveGift {
	SchoolGirl schoolGirl;

	public Pursuit(SchoolGirl schoolGirl) {
		this.schoolGirl = schoolGirl;
	}

	@Override
	public void GiveDolls() {
		System.out.println("送娃娃给" + schoolGirl.getName());
	}

	@Override
	public void GiveFlowers() {
		System.out.println("送花给" + schoolGirl.getName());
	}

	@Override
	public void GiveChocolate() {
		System.out.println("送巧克力" + schoolGirl.getName());
	}

}
