package com.study.designPattern.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * java
 * 
 * @author fei.liang
 *
 */
public class Resume implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String sex;
	private int age;
	private Company company;

	public Resume(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		company = new Company();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(String name, String address) {
		company.setName(name);
		company.setAddress(address);
	}

	/**
	 * 重写Object的clone方法可以实现潜克隆
	 */
	@Override
	protected Resume clone() throws CloneNotSupportedException {
		return (Resume) super.clone();
	}

	/**
	 * 深度克隆
	 * 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Resume deepClone() throws IOException, ClassNotFoundException {
		// 将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);

		// 将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (Resume) ois.readObject();

	}

	public void display() {
		System.out.println(name + "," + sex + "," + age + "," + company.toString());
	}
}
