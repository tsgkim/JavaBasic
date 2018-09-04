package com.basic.ta.supplement._Class;

import java.lang.reflect.Method;

/** 
 * 
 * invoke(obj, args)用于执行某对象的方法，obj指的是当前那个对象的方法（当是静态方法是填null）
 * args指的是方法带的参数，无参方法时空缺
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月2日 下午4:15:13 
*/
public class T6 {

	public static void main(String[] args) {
		try {
			Class<?> clazz=Class.forName("com.basic.supplement._Class.Person");
			Person person=(Person) clazz.newInstance();
			Method setAgeMethod=clazz.getMethod("setAge", String.class);
			setAgeMethod.invoke(person, "20");
			Method getAgeMethod=clazz.getMethod("getAge");
			System.out.println(getAgeMethod.invoke(person));
			
			Method playMethod=clazz.getMethod("play");
			playMethod.invoke(null);  //play为静态方法
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
