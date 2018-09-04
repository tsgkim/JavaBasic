package com.basic.ta.ta_18_overload_override;

/** 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月1日 下午6:50:21 
*/
public class Person {

	public String name;
	private String sex;
	public int age;
	
	public Person(){
		
	}
	
	public Person(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	private String getName() {
		return name;
	}
	protected  void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	
	
}
