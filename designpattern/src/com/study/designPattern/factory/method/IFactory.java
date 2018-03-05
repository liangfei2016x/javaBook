package com.study.designPattern.factory.method;

import com.study.designPattern.factory.Operation;

/**
 * 工厂方法模式
 * 
 * @author fei.liang
 *
 */
public interface IFactory {
	Operation CreateOperation();
}
