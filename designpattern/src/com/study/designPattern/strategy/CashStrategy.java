package com.study.designPattern.strategy;

/**
 * 收费策略
 * 
 * @author fei.liang
 *
 */
public class CashStrategy {

	// 声明一个现金收费父类对象
	private CashSuper cashSuper;

	public CashSuper getCashSuper() {
		return cashSuper;
	}

	// 设置策略行为，参数为具体的现金收费子类（正常，打折或返利）
	public void setCashSuper(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}

	// 得到现金促销计算结果（利用了多态机制，不同的策略行为导致不同的结果）
	public double getResult(double money) {
		return cashSuper.acceptCash(money);
	}
}
