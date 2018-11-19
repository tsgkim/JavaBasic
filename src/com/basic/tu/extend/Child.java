package com.basic.tu.extend;

public class Child extends Parent {

	/**
	 * 子类方法的访问权限只能比父类的更大，不能更小
	 */
	//	private void testPerson() {
	//		System.out.println("我是人");
	//	}

	@Override
    public void testParent() {
        System.out.println("我是testChild");
	}
}
