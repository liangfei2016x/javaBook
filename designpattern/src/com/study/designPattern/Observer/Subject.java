package com.study.designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题或者说抽象通知者，把所有的观察者对象放在一个集合里面
 * 
 * @author Afei
 *
 */
public abstract class Subject {
	private List<Observer> listObserver = new ArrayList<Observer>();

	/**
	 * 增加观察者
	 */
	public void attach(Observer observer) {
		listObserver.add(observer);
	}

	/**
	 * 移除观察者
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		listObserver.remove(observer);
	}

	/**
	 * 通知
	 */
	public void notice() {
		for (Observer observer : listObserver) {
			observer.update();
		}
	}
}
