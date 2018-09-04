package com.basic.ta.ta_17_scopes.son;

/** 
 * 
 * protected受保护的，子孙类是可以访问的
 * 
 * 不写修饰符时，同一个包里是可以访问的
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月1日 下午7:06:58 
*/
public class Son extends Father {

	@Override
	protected void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		super.work();
	}

	
}
