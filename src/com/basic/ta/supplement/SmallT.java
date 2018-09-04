/**
 * 
 */
package com.basic.ta.supplement;

/**
 * try中的return语句调用的函数先于finally中调用的函数执行
 * Return并不是让函数马上返回，而是return语句执行后，将把返回结果放置进函数栈中，此时函数并不是马上返回，
 * 它要执行finally语句后才真正开始返回
 * 
 * @author 唐忠文
 * @qq 1358723085
 * @date 2017年6月13日 下午4:46:13
 *
 */
public class SmallT {

	public static void main(String args[]) {
		SmallT t = new SmallT();
		int b = t.get();
		System.out.println(b);
	}

	public int get() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
}
