package com.basic.ta.supplement._Class;

/** 
*
* 反射获取类的三种方式（个人感觉第二种方式最简洁，但几乎所有人都用第一种方式，可能是第一种方式让人看得更清晰明了）
* 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月2日 下午3:14:42 
*/
public class T1 {

	public static void main(String[] args) {
		try {
			Class<?> class1=Class.forName("com.basic.supplement._Class.Person");
			
			Class<?> class2=Person.class;
			
			Person person=new Person();
			Class<?> class3=person.getClass();
			
			System.out.println(class1);
			System.out.println(class2);
			System.out.println(class3);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
