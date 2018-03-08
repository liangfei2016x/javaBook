package com.study.designPattern.template;

/**
 * 模板方法 把不变的行为搬到父类中，减少子类中重复的代码
 * 
 * @author fei.liang
 *
 */
public abstract class TemplateBase {
	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();

	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("调用");
	}
}
