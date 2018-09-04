package com.basic.ta.ta_17_scopes;

/** 
 * 
 * public，private，protected，以及不写（表示friendly）时的区别,测试protected,friendly两种情况
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月1日 下午7:05:49 
*/
public class Person {
	
	void play(){
		System.out.println("愉快的玩耍");
	}
	
	protected void sleep(){
		System.out.println("人要睡觉");
	}
}
