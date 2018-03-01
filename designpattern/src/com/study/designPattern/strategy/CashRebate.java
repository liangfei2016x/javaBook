package com.study.designPattern.strategy;

/**
 * 打折收费
 * 
 * @author fei.liang
 *
 */
public class CashRebate extends CashSuper {

	private double moneyRebate;

	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
