package com.basic.ta.algorithm.sort;

import org.junit.Test;


/** 
 * 归并排序
 * 
 * 思想是，先把一个数组等分成两半，把两个数组分别排好序，再合并成一个数组
 * 然后再把两个数组按同样方法递归下去，递归结束的条件是每个数组的长度为1，因为一个数组长度为1本身就是有序的
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月11日 下午7:10:51 
*/
public class MargeSort {

	public static Comparable[] aux;  //辅助数组

	/**
	 * 将两个有序数组（lo~mid），（mid+1~hi）合并一个有序数组
	 * @param a
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];  //数组使用前一定要初始化，给定数组长度
		sort(a, 0, a.length - 1);
	}
	
	public static void marge(Comparable[] a, int lo, int mid, int hi) {
		int i = lo;
		int j = mid + 1;
		for (int k = lo; k <= hi; k++) {   
			aux[k] = a[k];  
		}
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {          //左边数组中的值都取完了，直接把右边数组值按顺序插入数组a即可
				a[k] = aux[j++];
			} else if (j > hi) {    //右边数组中的值都取完了，直接把左边数组值按顺序插入数组a即可
				a[k] = aux[i++];
			} else if (Example.less(aux[i], aux[j])) {
				a[k] = aux[i++];
			} else {
				a[k] = aux[j++];
			}
		}
	}

	public static void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		marge(a, lo, mid, hi);
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

