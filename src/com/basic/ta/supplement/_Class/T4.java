package com.basic.ta.supplement._Class;

/** 
 * 
 * newInstance()方法用于通过反射创建一个对象， 可以对生成的对象进行操作
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月2日 下午3:47:59 
*/
public class T4 {

	public static void main(String[] args) {
		try {
			Class<?> clazz=Class.forName("com.basic.supplement._Class.Person");
			Person person=(Person) clazz.newInstance(); //这个方法得到的是Object的对象，需要向上转型
			person.setAge("22");
			System.out.println(person.getAge());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
