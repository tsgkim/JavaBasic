package com.basic.tu.myAbstract;

/**
 * 普通类继承抽象类 如果抽象类中有抽象方法 那么在该普通类中必须@Override该抽象方法
 * 
 * @author 涂世广
 * @qq 1515503123
 * @date 创建时间：2017年8月31日 上午17:02:00
 */
public class Test extends AbstractAImpl {

	public void myTest() {
		// 抽象类不能创建实例对象
		//		AbstractAImpl aa = new AbstractAImpl();
	}

	@Override
	void myAbstractMethod() {
		// TODO Auto-generated method stub

	}

}