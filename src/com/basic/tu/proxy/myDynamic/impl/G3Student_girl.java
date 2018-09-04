package com.basic.tu.proxy.myDynamic.impl;

import com.basic.tu.proxy.myDynamic.G3Student;

//定义一个高三女孩的类（目标对象、核心对象、target对象），实现了高三学生的接口。
public class G3Student_girl implements G3Student {

	//高三女孩 的第一个业务流程：在家学习
	@Override
	public void studyAtHome(String core) {
		//核心的事情在家学习。
		System.out.println(core + "在HOME学习");
	}

	//高三女孩 的第二个业务流程：在学校学习
	@Override
	public void studyAtSchool(String core) {
		//核心的事情在家学习。
		System.out.println(core + "在SCHOOOL学习");
	}

}
