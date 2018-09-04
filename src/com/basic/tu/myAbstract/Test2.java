package com.basic.tu.myAbstract;

/**
 * 如果的子类没有实现抽象父类中的所有抽象方法，那么子类也必须定义为abstract类型
 * 
 * @author 涂世广
 * @qq 1515503123
 * @date 创建时间：2017年9月01日 上午11:54:00
 */
public abstract class Test2 extends AbstractAImpl {

	public void myTest() {
		// 抽象类不能创建实例对象
		//		AbstractAImpl aa = new AbstractAImpl();
	}

	@Override
	void myAbstractMethod() {
		// TODO Auto-generated method stub

	}
	
}