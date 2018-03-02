package com.study.designPattern.decorator;

class TShirts extends PersonDecorator {

	@Override
	public void show() {
		System.out.println("T恤");
		super.show();
	}

}

class BigTShirts extends PersonDecorator {

	@Override
	public void show() {
		System.out.println("大T恤");
		super.show();
	}

}

class BigTrouser extends PersonDecorator {

	@Override
	public void show() {
		System.out.println("垮裤");
		super.show();
	}

}

class Sneakers extends PersonDecorator {

	@Override
	public void show() {
		System.out.println("球鞋");
		super.show();
	}

}

class Suit extends PersonDecorator {

	@Override
	public void show() {
		System.out.println("西装");
		super.show();
	}

}

class Tie extends PersonDecorator {

	@Override
	public void show() {
		System.out.println("领带");
		super.show();
	}

}

class LeatherShoes extends PersonDecorator {

	@Override
	public void show() {
		System.out.println("皮鞋");
		super.show();
	}

}
