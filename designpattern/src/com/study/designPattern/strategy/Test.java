package com.study.designPattern.strategy;

public class Test {
	public static void main(String[] args) {

		CashRebate cashRebate = new CashRebate(0.8);
		double money = cashRebate.acceptCash(100);
		System.out.println(money);

		CashReturn cashReturn = new CashReturn(300, 100);
		System.out.println(cashReturn.acceptCash(305));

		CashStrategyFactory cashStrategyFactory = new CashStrategyFactory("打折");
		System.out.println(cashStrategyFactory.getResult(200));

	}
}
