package com.basic.ta.algorithm.sort;

import java.util.Random;

/**
 * 该类用作排序的工具类，写了排序通用的一些方法
 * <p>
 * 所有数据类型的包装类都实现了 {@link Comparable#compareTo(Object)}，所以无需我们写比较算法，直接调用即可。
 *
 * @author 唐忠文
 * @qq 1358723085
 * @date 2017年6月11日 下午6:56:37
 */
public class Example {

    /**
     * 判断两个变量的大小，a<b为真
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * 交换数组a中下标为i和j的数的值
     *
     * @param a
     * @param i
     * @param j
     */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 检验一个数组是否是从小到大排序
     *
     * @param a
     * @return
     */
    public static boolean chick(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (less(a[i + 1], a[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 产生0~99的随机整数，用于测试
     *
     * @return
     */
    public static Integer[] sourceData() {
        Random random = new Random();
        Integer[] a = new Integer[15];
        for (int i = 0; i < 15; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
}