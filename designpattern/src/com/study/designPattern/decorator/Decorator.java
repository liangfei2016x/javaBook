package com.study.designPattern.decorator;

/**
 * 对于Component来说，不需要知道Decorator的存在
 * 
 * @author fei.liang
 *
 */
public abstract class Decorator extends Component {

	protected Component component;

	/**
	 * 装饰Component，也就是实例化
	 * 
	 * @param component
	 */
	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if (component != null) {
			component.operation();
		}
	}

}
