package com.study.designPattern.Prototype;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		/**
		 * 潜克隆不能克隆引用类型数据
		 */
		Resume r1 = new Resume("小米", "男", 10);
		r1.setCompany("xx公司", "深圳");
		Resume r2 = r1.clone();
		r2.setAge(11);
		r1.setCompany("yy公司", "北京");
		/**
		 * 深度克隆
		 */
		Resume r3 = r1.deepClone();
		r3.setCompany("zz公司", "上海");
		r1.display();
		r2.display();
		r3.display();
	}

}
