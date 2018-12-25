package com.basic.ta.algorithm.sort;

import org.junit.Test;

/**
 * 选择排序
 * <p>
 * 思想是，扫描一遍数组，找到最小的与数组的第一个交换位置；再从数组第二个数扫描到最小的与数组的第二个数交换位置...进行下去
 *
 * @author 唐忠文
 * @qq 1358723085
 * @date 2017年6月11日 下午7:31:57
 */
public class SelectSort {

    /**
     * 时间复杂度 O(n^2)
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (Example.less(a[j], a[min])) {
                    min = j;
                }
            }
            Example.exch(a, i, min);
        }
    }

    @Test
    public void test() {
        Integer[] a = Example.sourceData();
        sort(a);
        System.out.println(Example.chick(a));
        for (Integer i : a) {
            System.out.print(i + " ");
        }
    }
}
