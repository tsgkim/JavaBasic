package com.basic.tu;

import org.junit.Test;

/** 
 * java中通过跳出当前的多重嵌套循环
 *
 * @author 涂世广 
 * @qq 1515503123
 * @date 2017年6月1日 下午4:05:35 
*/
public class Tu_3_ForBreak {

	@Test
	public void forBreak() {
		int i = 0;
		one: for (; i < 10; i++) {
			two: for (int j = 0; j < 10; j++) {
				three: for (int k = 0; k < 10; k++) {
					if (i == 3) {
						break one;
					}
				}
			}
		}

		System.out.println("i的值为：" + i);
	}
}
