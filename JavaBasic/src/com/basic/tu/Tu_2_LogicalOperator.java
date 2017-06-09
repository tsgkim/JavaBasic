package com.basic.tu;

import org.junit.Test;

/**
 * 四大逻辑运算符 & && | || 用法
 * 
 * @author 涂世广
 * @qq 1515503123
 * @date 2017年6月1日 上午11:54:44
 */
public class Tu_2_LogicalOperator {

	/**
	 * &&只要第一个条件不满足，后面条件就不再判断
	 */
	@Test
	public void test1() {
		if ((23 != 23) && (100 / 0 == 0)) {
			System.out.println("运算没有问题。");
		} else {
			System.out.println("没有报错");
		}
	}
	
	/**
	 * &要对所有的条件都进行判断
	 */
	@Test
	public void test2() {
		if ((23 != 23) & (100 / 0 == 0)) {
			System.out.println("运算没有问题。");
		} else {
			System.out.println("没有报错");
		}
	}
	
	/**
	 * ||只要满足第一个条件，后面的条件就不再判断
	 */
	@Test
	public void test3() {
		if ((23 == 23) || (100 / 0 == 0)) {
			System.out.println("运算没有问题。");
		} else {
			System.out.println("没有报错");
		}
	}
	
	/**
	 * |要对所有的条件进行判断
	 */
	@Test
	public void test4() {
		if ((23 == 23) | (100 / 0 == 0)) {
			System.out.println("运算没有问题。");
		} else {
			System.out.println("没有报错");
		}
	}

}
