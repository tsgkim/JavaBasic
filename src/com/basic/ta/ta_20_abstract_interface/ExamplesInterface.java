package com.basic.ta.ta_20_abstract_interface;

/** 
* 
* 接口中不能有具体实现的方法
* 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月1日 下午5:13:40 
*/
public interface ExamplesInterface {
	//接口中变量默认修饰为public static final的
	int AGE=20;
//	private String NAME="ZHANGSAN"; 报错
	
	//接口中方法默认修饰为public abstract的且只能是public abstract方法（用其他关键字，比如private、protected、static、 final等修饰会报编译错误）
	int getAge();
	
//	static String getName(); 报错

}
