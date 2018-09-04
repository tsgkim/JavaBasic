package com.basic.tu.proxy.myDynamic.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class G3StudentHandler implements InvocationHandler {

	/**
	 * 态代理的代理类中定义了一个以Object类型的属性，而静态代理定义的是具体的G3Student的接口类型的属性。
	 * 所以，动态代理这样定义保证了，这个代理可以带不同的个核心类如：G3Student_boy、G3Student_girl。
	 */
	private Object g3Stu;

	public G3StudentHandler(Object g3Stu) {
		this.g3Stu = g3Stu;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		////调用代理的在核心对象处理核心业务之前的方法
		before();

		/**
		 * 核心对象的核心方法
		 * 
		 * 自动调用传入的核心类对象（G3Student_boy）的方法，并且传入参数args，返回一个Object类型的值。
		 * 具体是调用什么方法，传入什么参数，都不需要我们具体关注，只需写上这条代码，并且把返回值返回即可。
		 */
		Object returnValue = method.invoke(g3Stu, args);

		//调用代理的在核心对象处理核心业务之后的方法
		after();

		return returnValue;
	}

	private void before() {
		//这个是代理（G3Student_handler）准备饭菜的需要做的流程：    
		System.out.println("代理：准备买菜");
		System.out.println("代理：准备洗菜");
		System.out.println("代理：准备炒菜");
		System.out.println("代理：准备煮饭");
		System.out.println("-----------------");
	}

	private void after() {
		//这个是代理（G3Student_handler）准备补品的需要做的流程：
		System.out.println("-----------------");
		System.out.println("代理 ：购买补品");
		System.out.println("代理 ：熬制部品");
		System.out.println("代理 ：加入佐料");
		System.out.println();
	}

}
