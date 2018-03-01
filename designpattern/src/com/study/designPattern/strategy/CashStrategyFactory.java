package com.study.designPattern.strategy;

/**
 * 策略+工厂
 * 
 * @author fei.liang
 *
 */
public class CashStrategyFactory {

	CashSuper cashSuper = null;

	public CashStrategyFactory(String strategy) {
		switch (strategy) {
		case "正常收费":
			cashSuper = new CashNormal();
			break;
		case "打折":
			cashSuper = new CashRebate(0.8);
			break;
		case "满减":
			cashSuper = new CashReturn(300, 100);
			break;
		default:
			break;
		}
	}

	public double getResult(double money) {
		return cashSuper.acceptCash(money);
	}

}
