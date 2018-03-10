package com.study.designPattern.Observer;

public class Test {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject, "x"));
		subject.attach(new ConcreteObserver(subject, "y"));
		subject.attach(new ConcreteObserver(subject, "z"));

		subject.setSubjectState("ABC");
		subject.notice();

	}
}
