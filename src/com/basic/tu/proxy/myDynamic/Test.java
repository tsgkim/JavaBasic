package com.basic.tu.proxy.myDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.basic.tu.proxy.myDynamic.handler.G3StudentHandler;
import com.basic.tu.proxy.myDynamic.impl.G3Student_boy;

public class Test {

	public static void main(String[] args) {
		G3Student boy = new G3Student_boy();

		InvocationHandler handler1 = new G3StudentHandler(boy);

		G3Student g3boy = (G3Student) Proxy.newProxyInstance(boy.getClass().getClassLoader(),
				boy.getClass().getInterfaces(), handler1);

		g3boy.studyAtSchool("小明");
		g3boy.studyAtHome("小明");
	}

}
