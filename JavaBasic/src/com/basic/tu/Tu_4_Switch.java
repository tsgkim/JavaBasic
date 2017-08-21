package com.basic.tu;

import org.junit.Test;

/** 
 * 在Java中整型、实型、字符型被视为简单数据类型，这些类型由低级到高级分别为(byte，short，char)--int--long--float--double
 * 布尔型boolean；字符型char；整型byte、short、int、long；浮点型float、double；两种类变量，即String和Date
 * 
 * 比 int 还要低级的数据类型可以使用 switch ==> byte，short，char (低级可以转换为高级  高级转换为低级 如果在低级数据范围以内没有问题 不在 会发生数据溢出)
 * swithc　是用　int 做比较  byte，short，char放在switch中是可以自动转换为 int 
 * 
 * jdk 1.7 可以支持String
 * 
 * @author 涂世广 
 * @qq 1515503123
 * @date 2017年6月1日 下午4:16:15 
*/
public class Tu_4_Switch {

	@Test
	public void byteSwitch() {
		//  字节型
		byte i = 1;
		byte j = 'a'; // 97

		// 由于 byte 可以自动转化为 int 所以可以使用switch
		switch (i) {
		case 1:
			System.out.println("i==1");
			break;
		default:
			break;
		}
		switch (j) {
		case 'a':
			System.out.println("j==a");
			break;
		default:
			break;
		}
	}

	@Test
	public void shortSwitch() {
		// 短整型
		short i = 1;
		short j = 'a'; // 97

		// 由于 short 可以自动转化为 int 所以可以使用switch
		switch (i) {
		case 1:
			System.out.println("i==1");
			break;
		default:
			break;
		}
		switch (j) {
		case 'a':
			System.out.println("j==a");
			break;
		default:
			break;
		}
	}

	@Test
	public void charSwitch() {
		// 字符型
		char j = 'a'; // 97

		// 由于 char 可以自动转化为 int 所以可以使用switch
		switch (j) {
		case 'a':
			System.out.println("j==a");
			break;
		default:
			break;
		}
	}

	@Test
	public void longSwitch() {
		// 长整型
		long j = 'a'; // 97

		// 由于 long 不可以自动转化为 int 所以不可以使用switch
		//		switch (j) {
		//		case 'a':
		//			System.out.println("j==a");
		//			break;
		//		default:
		//			break;
		//		}
	}

	@Test
	public void stringSwitch() {
		// 字符串
		String j = "今天是个好天气";

		// jdk 1.7 可以支持String
		switch (j) {
		case "今天是个好天气":
			System.out.println("今天是个好天气");
			break;
		default:
			break;
		}
	}
}
