package com.basic.ta.algorithm.sort;

import java.util.Random;

/** 
 * 
 * 该类用作排序的工具类，写了排序通用的一些方法
 * 
 * Comparable接口中只有一个compareTo抽象方法，该方法用户自定义比较两个对象的大小
 * 能把一组同类型的对象排序，需要满足的唯一条件是能按一定规则比较大小
 * 所以只要一个类实现了Comparable接口，重写了compareTo方法，这个类中的对象就能比较大小了，也就是说可以排序了
 * 所以为了使排序算法能够通用，把变量都定义为Comparable类型
 * 
 * 
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月11日 下午6:56:37 
*/
public class Example {

	/**
	 * 判断两个变量的大小，a<b为真
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean less(Comparable a,Comparable b){ 
		return a.compareTo(b)<0;
	}
	
	/**
	 * 交换数组a中下标为i和j的数的值
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void exch(Comparable[] a,int i,int j){
		Comparable temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	/**
	 * 检验一个数组是否是从小到大排序
	 * @param a
	 * @return
	 */
	public static boolean chick(Comparable[] a){
		for(int i=0;i<a.length-1;i++){
			if(less(a[i+1],a[i])){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 产生0~99的随机整数，用于测试
	 * @return
	 */
	public static Integer[] sourceData(){
		Random random=new Random();
		Integer[] a=new Integer[15];
		for(int i=0;i<15;i++){
			a[i]=random.nextInt(100);
		}
		return a;
	}
}