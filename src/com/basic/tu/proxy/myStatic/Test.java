package com.basic.tu.proxy.myStatic;

import com.basic.tu.proxy.myStatic.proxy.G3StudentProxy;

public class Test {

	public static void main(String[] args) {
		//创建一个代理对象，并且传入相对应的参数构造出具体的实例
		G3Student b = new G3StudentProxy("boy");
		//通过这个代理对象执行相关的方法（代理对象和核心对象有共同接口）
		b.studyAtHome("小明");
		b.studyAtSchool("小明");
	}

}
