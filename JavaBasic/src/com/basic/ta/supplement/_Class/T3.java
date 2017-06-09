package com.basic.ta.supplement._Class;

import java.lang.reflect.Field;

/** 
 * 
 * getDeclaredFields()能得到该类的所有属性，与范围修饰符无关
 * getFields()能获得本类和父类中所有public修饰的属性
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月2日 下午3:41:19 
*/
public class T3 {

	public static void main(String[] args) {
		try {
			Class<?> clazz=Class.forName("com.basic.supplement._Class.Person");
			/*Field[] fields=clazz.getFields();
			age*/
			Field[] fields=clazz.getDeclaredFields();
			for(Field field:fields){
				System.out.println(field.getName());
				/*id
				name
				age*/
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
