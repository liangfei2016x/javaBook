package com.study.designPattern.decorator;

public class PersonDecorator extends Person {

	protected Person person;

	/**
	 * 装饰
	 */
	public void Decorate(Person person) {
		this.person = person;
	}

	@Override
	public void show() {
		if (person != null) {
			person.show();
		}
	}

}
