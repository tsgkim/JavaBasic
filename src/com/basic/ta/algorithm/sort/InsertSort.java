package com.basic.ta.algorithm.sort;

import org.junit.Test;

/** 
 * 插入排序
 * 
 * 思想是，像玩扑克牌一样，一张一张的拿，保证拿下一张前你手上的牌是排好序的
 * 
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月11日 下午7:32:35 
*/
public class InsertSort {

	public static void sort(Comparable[] a){
		for(int i=1;i<a.length ;i++){
			for(int j=i;j>0 && Example.less(a[j], a[j-1]);j--){ //新拿的一张牌，如果前面的牌比它大就交换顺序
				Example.exch(a, j, j-1);
			}
		}
	}
	
	@Test
	public void test(){
		Integer[] a = Example.sourceData();
		sort(a);
		System.out.println(Example.chick(a));
		for (Integer i : a) {
			System.out.print(i + " ");
		}
	}
}
