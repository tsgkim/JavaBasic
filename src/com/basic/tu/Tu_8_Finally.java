package com.basic.tu;

import java.util.HashMap;
import java.util.Map;

/** 
 * finally 使用
 * 
 * @author 涂世广 
 * @qq 1515503123
 * @date 2017年9月4日 下午09:48:00 
*/
public class Tu_8_Finally {

	public static void main(String[] args) {
		// 3
		System.out.println(getMap().get("test"));
		
		// 1
		System.out.println(test());
		
		// 2
		System.out.println(test2());
		
		/**
		 * func1
		 * func2
		 * 2
		 */
		System.out.println(test3());
	}

	public static Map<String, Integer> getMap() {
		Map<String, Integer> map = new HashMap<>();
		try {
			map.put("test", 1);
			return map;
		} catch (Exception e) {
			map.put("test", 1);
			return map;
		} finally {
			map.put("test", 3);
		}
	}

	public static int test() {
		int x = 1;
		try {
			return x;
		} finally {
			++x;
		}
	}

	@SuppressWarnings("finally")
	public static int test2() {
		int x = 1;
		try {
			return x;
		} finally {
			return ++x;
		}
	}

	@SuppressWarnings("finally")
	public static int test3() {
		try {
			return func1();
		} finally {
			return func2();
		}
	}

	public static int func1() {
		System.out.println("func1");
		return 1;
	}

	public static int func2() {
		System.out.println("func2");
		return 2;
	}

}
