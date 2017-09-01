package com.basic.tu.myAbstract;

import com.basic.tu.myInterface.IA;

/**
 * 抽象类可以实现接口
 * 
 * @author 涂世广
 * @qq 1515503123
 * @date 创建时间：2017年8月31日 上午17:02:00
 */
public abstract class AbstractAImpl implements IA {

	// 抽象类中可以有静态的main方法
	public static void main(String[] args) {

	}

	// 抽象类允许有抽象方法
	abstract void myAbstractMethod();

	@Override
	public void testIA() {
		System.out.println("AbstractAImpl===>testIA");

	}

	void mytest() {
		// TODO Auto-generated method stub
		
	}

}
