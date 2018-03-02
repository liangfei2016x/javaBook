package com.study.designPattern.decorator;

/**
 * 定义一个具体对象,也可以给此类增加一些职责
 * 
 * @author fei.liang
 *
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
	}

}
