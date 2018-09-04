package com.basic.tu.proxy.myStatic.proxy;

import com.basic.tu.proxy.myStatic.G3Student;
import com.basic.tu.proxy.myStatic.impl.G3Student_boy;
import com.basic.tu.proxy.myStatic.impl.G3Student_girl;

/*
*    代理对象（G3Student_proxy）的目的是帮助核心对象（G3Student_boy / G3Student_girl）做非核心的事情。
*    但是代理对象（G3Student_proxy）必须和核心对象（G3Student_boy / G3Student_girl）实现共同的 G3Student 接口。
*/
public class G3StudentProxy implements G3Student {

	//定义一个高三学生接口 作为属性，目的是就是在处理完代理需要做的事情之后调用高三男孩或者是高三女孩需要做的核心业务，
	//但是不是代理具体去做这些核心的事情，只是调用它们而已。    
	private G3Student g3S;

	//创建一个代理的参数为 高三学生接口 的构造函数，判断但传入的字符串为boy就构造一个高三男孩的实例，如果传入的参数为girl就构造一个高三女孩的实例。
	public G3StudentProxy(String sex) {
		if ("boy".equals(sex)) {
			g3S = new G3Student_boy();
		} else if ("girl".equals(sex)) {
			g3S = new G3Student_girl();
		}
	}

	@Override
	public void studyAtHome(String core) {
		//这个是代理（G3Student_proxy）准备饭菜的需要做的流程：    
		System.out.println("代理：准备买菜");
		System.out.println("代理：准备洗菜");
		System.out.println("代理：准备炒菜");
		System.out.println("代理：准备煮饭");
		System.out.println("-----------------");

		//通过定义的属性，并且在调用G3Student_proxy的含参数的构造函数创建相对应的实例，调用这个具体的实例的方法
		g3S.studyAtHome(core);

		//这个是代理（G3Student_proxy）准备补品的需要做的流程：
		System.out.println("-----------------");
		System.out.println("代理 ：购买补品");
		System.out.println("代理 ：熬制部品");
		System.out.println("代理 ：加入佐料");
		System.out.println();
	}

	@Override
	public void studyAtSchool(String core) {
		//这个是代理准备（G3Student_proxy）饭菜的需要做的流程：    
		System.out.println("代理：准备买菜");
		System.out.println("代理：准备洗菜");
		System.out.println("代理：准备炒菜");
		System.out.println("代理：准备煮饭");
		System.out.println("-----------------");

		//通过定义的属性，并且在调用G3Student_proxy的含参数的构造函数创建相对应的实例，调用这个具体的实例的方法
		g3S.studyAtSchool(core);

		System.out.println("-----------------");
		//这个是代理（G3Student_proxy）准备补品的需要做的流程：
		System.out.println("代理 ：购买补品");
		System.out.println("代理 ：熬制部品");
		System.out.println("代理 ：加入佐料");
		System.out.println();
	}

}