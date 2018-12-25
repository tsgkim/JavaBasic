package com.basic.ta.algorithm.sort;

import org.junit.Test;

/**
 * 快速排序
 * <p>
 * 思想是，在数组中取一个数，把数组中小于这个数的数放在数组的左边，大于这个数的数放在右边
 * 那么，这个数左边的都小于这个数右边的都大于这个数
 * 递归的，按同样方法将左右两边数组继续切分，直至每个数组中只有一个数就都排好序了
 *
 * @author 唐忠文
 * @qq 1358723085
 * @date 2017年6月11日 下午7:47:11
 */
public class QuickSort {

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        Comparable j = a[lo]; //切记不能写成j=a[0]
        int lift = lo, right = hi + 1;
        while (true) {
            while (!Example.less(j, a[++lift])) {
                if (lift == hi) {
                    break;
                }
            }
            while (Example.less(j, a[--right])) {
                if (right == lo) {
                    break;
                }
            }
            if (lift >= right) {
                break;
            }
            Example.exch(a, lift, right);
        }
        Example.exch(a, lo, right);
        return right;
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
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
