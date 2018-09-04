package com.basic.ta.ta_17_scopes.son;

import com.basic.ta.ta_17_scopes.Person;

/** 
 * 
 * protected受保护的
 * 
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月1日 下午7:06:38 
*/
public class Father extends Person {

	//无法继承play()方法，不写修饰符时其他package和子孙类不能够访问
	
	void work(){
		System.out.println("人需要学习和工作");
	}

	
}
