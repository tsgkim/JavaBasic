package com.basic.ta.supplement._Class;

/** 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月2日 下午3:01:44 
*/
public class Person {

	private String id;
	private String name;
	public String age;

	public Person() {

	}

	public Person(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static void play(){
		System.out.println("小明喜欢打球");
	}
	
}
