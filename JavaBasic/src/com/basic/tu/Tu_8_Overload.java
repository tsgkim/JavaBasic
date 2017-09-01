package com.basic.tu;

/**
 * 重载Overload表示同一个类中可以有多个名称相同的方法，但这些方法的参数列表各不相同（即参数个数或类型不同）。<br/>
 * 对于继承来说，如果某一方法在父类中是访问权限是priavte，那么就不能在子类对其进行重载，如果定义的话，也只是定义了一个新方法，
 * 	而不会达到重载的效果
 * 
 * @author 涂世广
 * @qq 1515503123
 * @date 创建时间：2017年8月31日 上午10:54:44
 */
public class Tu_8_Overload {

	public void testOverload() {

	}

	public void testOverload(int a) {

	}

	public void testOverload(int a, int b) {

	}

	public void testOverload(int a, float b) {

	}

	public void testOverload(float a, int b) {

	}

	// 不能通过访问权限进行重载
	//	private void testOverload(float a, int b) {
	//
	//	}

	// 不能通过返回返回类型进行重载
	//	public int testOverload(float a, int b) {
	//
	//	}

	// 不能通过抛出异常的不同进行重载
	//	public void testOverload(float a, int b) throws NullPointerException{
	//
	//	}

}
