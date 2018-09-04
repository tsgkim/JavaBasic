package com.basic.tu.myAbstract;

import com.basic.tu.myInterface.IA;

/**
 * (1)含有abstract修饰符的class即为抽象类
 * (2)abstract类不能创建的实例对象
 * (3)含有abstract方法的类必须定义为abstract class
 * (4)abstract class类中的方法不必是抽象的
 * (5)abstract class类中定义抽象方法必须在具体(Concrete)子类中实现
 * (6)不能有抽象构造方法或抽象静态方法
 * (7)如果的子类没有实现抽象父类中的所有抽象方法，那么子类也必须定义为abstract类型
 * 抽象类可以实现接口
 * 含有
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
	
	abstract void myAbstractMethod2();

	@Override
	public void testIA() {
		System.out.println("AbstractAImpl===>testIA");

	}

	void mytest() {
		// TODO Auto-generated method stub
		
	}

}
