package com.basic.ta.ta_20_abstract_interface;

/** 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月1日 下午5:28:09 
*/
public class Student {

	public int age;
	public String name;
	
//	public abstract void getAge();报错     抽象方法只能由抽象类定义，也就是说有抽象方法的类必定是抽象类

	public Student() {

	}

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
