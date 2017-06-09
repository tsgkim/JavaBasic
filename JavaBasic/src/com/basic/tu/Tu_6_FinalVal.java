package com.basic.tu;

import org.junit.Test;

/** 
 * Q:使用final关键字修饰一个变量时，是引用不能变还是引用的对象不能变？<br>
 * A:引用不能变
 * 
 * @author 涂世广 
 * @qq 1515503123
 * @date 2017年6月4日 下午3:22:56 
*/
public class Tu_6_FinalVal {

	@Test
	public void testFinalVal() {
		// a 表示引用  (指向对象的一个引用) 现在引用的对象为 12
		final StringBuffer a = new StringBuffer("12");
		// 引用的对象还可以变为 1234  ==> 引用的对象可变
		a.append("34");
		// 这里 重新将变量a 实例化一个对象 报错  ==> 引用不能变
		//		a = new StringBuffer();
		System.out.println("a对象为：" + a);
	}
}
