package com.basic.ta.supplement._Class;

import java.lang.reflect.Method;

/**  
*  
* getDeclaredMethods()获取本类所有的方法,从运行结果看能获取到所有方法与范围修饰符无关，但不会得到构造方法
* getMethods()获取本类和父类中所有的public修饰的方法
* 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月2日 下午3:23:41 
*/
public class T2 {

	public static void main(String[] args) {
		try {
			Class<?> clazz=Class.forName("com.basic.supplement._Class.Person");
			
			/*Method[] methods=clazz.getMethods();  getId
			getAge
			setAge
			wait
			wait
			wait
			equals
			toString
			hashCode
			getClass
			notify
			notifyAll*/
			
			Method[] methods=clazz.getDeclaredMethods();
			/*getName
			getId
			setName
			setAge
			getAge
			setId*/
			for(Method method:methods){
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
