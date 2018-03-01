package com.study.designPattern.strategy;

/**
 * 正常收费
 * 
 * @author fei.liang
 *
 */
public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
