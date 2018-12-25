package com.basic.ta.algorithm.sort;

import org.junit.Test;

/**
 * 冒泡排序
 *
 * @author 唐忠文
 * @qq 1358723085
 * @date 2017年6月11日 下午7:20:28
 */
public class BubbleSort {

    /**
     * 时间复杂度 O(n^2)
     */
    public static void sort(Comparable[] a) {

        for (int j = a.length - 1; j > 0; j--) {

            for (int i = 0; i < j; i++) {

                if (Example.less(a[i], a[i + 1]) == false) {
                    Example.exch(a, i, i + 1);
                }

            }
        }
    }


    @Test
    public void test() {

        Integer[] a = Example.sourceData();

        /**
         * {@link Integer#compareTo(Integer)} 方法进行比较
         */
        sort(a);

        System.out.println(Example.chick(a));
        for (Integer i : a) {
            System.out.print(i + " ");
        }
    }


}
