package com.basic.ta.supplement._Class;

import java.lang.reflect.Field;

/** 
 * 
 * 通过反射获取对象字段属性，并且赋值
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月2日 下午3:59:28 
*/
public class T5 {

	public static void main(String[] args) {
		try {
			Class<?> clazz=Class.forName("com.basic.supplement._Class.Person");
			Person person=(Person) clazz.newInstance();
			//获取age属性
			Field ageField=clazz.getDeclaredField("age");
			ageField.set(person, "19");    //前面的参数指定属于哪个对象
			System.out.println(ageField.get(person)); //取值的时候也一样
			
		/*	//获取id属性   
		 *   报错，因为id是私有的，但可以添加 idField.setAccessible( true )解决;
		 *   通过setAccessible(true)的方式关闭安全检查就可以解决报错还可以提升反射速度
			Field idField=clazz.getDeclaredField("id");
			idField.set(person, "19");    //前面的参数指定属于哪个对象
			System.out.println(idField.get(person)); //取值的时候也一样
*/			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
