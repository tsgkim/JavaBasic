package com.basic.tu;

import org.junit.Test;

/** 
 * == 与 equals 区别 <br>
 * 
 * @see <a href="https://app.yinxiang.com/shard/s69/nl/16913508/b1f85efc-5d69-4642-acbc-6a76e6244ef0">印象笔记笔记</a><br>
 * <a href="http://www.cnblogs.com/dolphin0520/p/3592500.html">网上参考</a><br>
 * 
 * 
 * @author 涂世广 
 * @qq 1515503123
 * @date 2017年6月4日 下午3:45:51 
*/
public class Tu_7_Equal {

	@Test
	public void testEqual() {
		
		int n = 3;
		int m = 3;
		System.out.println(n == m);

		String str = new String("hello");
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2);

		str1 = str;
		str2 = str;
		System.out.println(str1 == str2);
	}
}
