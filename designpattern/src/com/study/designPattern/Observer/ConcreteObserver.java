package com.study.designPattern.Observer;

/**
 * 具体观察者 实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题状态相协调
 * 
 * @author Afei
 *
 */
public class ConcreteObserver implements Observer {

	private String name;
	private String observerState;
	private ConcreteSubject subject;

	public ConcreteObserver(ConcreteSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}

	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("观察者" + name + "的状态是" + observerState);
	}

	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

}
