package com.study.designPattern.Observer;

/**
 * 具体主题 将有关状态存入具体观察者对象
 * 
 * @author Afei
 *
 */
public class ConcreteSubject extends Subject {

	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}
