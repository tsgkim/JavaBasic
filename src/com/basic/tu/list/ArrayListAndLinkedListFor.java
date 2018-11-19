package com.basic.tu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 测试 arrayList & linkedList for 循环
 *
 * @author: shiguang.tu
 * @create: 2018/11/13 3:55 PM
 */
public class ArrayListAndLinkedListFor {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        for (long i = 0; i < 1000000; i++) {
            arrayList.add("" + i);
            linkedList.add("" + i);
        }

        /**
         * arraylist使用foreach遍历耗时 12ms
         * 增强型 for 实际上使用的 iterator 迭代器进行遍历，所以比 iterator 要稍微慢些
         */
        long ayyaybefore = System.currentTimeMillis();
        for (String ii : arrayList) {
        }
        long ayyayafter = System.currentTimeMillis();
        System.out.println("arraylist使用foreach遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");

        /**
         * arraylist使用iterator遍历耗时 8ms
         * iterator 迭代器也是通过索引能够找到对应值，但是迭代器有一些判断代码和属性维护，所以比普通 for 速度慢些
         */
        Iterator aiterator = arrayList.iterator();
        ayyaybefore = System.currentTimeMillis();
        while (aiterator.hasNext()) {
            aiterator.next();
        }
        ayyayafter = System.currentTimeMillis();
        System.out.println("arraylist使用iterator遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");

        /**
         * arrayList使用for遍历耗时 5ms
         * arrayList 就是数组，数组通过索引能够迅速找到对应值，所以 for 循环是最快的方式
         */
        ayyaybefore = System.currentTimeMillis();
        for (int ii = 0; ii < arrayList.size(); ii++) {
            arrayList.get(ii);
        }
        ayyayafter = System.currentTimeMillis();
        System.out.println("arrayList使用for遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");

        // linkedlist使用foreach遍历耗时 24ms
        ayyaybefore = System.currentTimeMillis();
        for (String ii : linkedList) {
        }
        ayyayafter = System.currentTimeMillis();
        System.out.println("linkedlist使用foreach遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");

        // linkedList使用iterator遍历耗时 27ms
        Iterator literator = linkedList.listIterator();
        ayyaybefore = System.currentTimeMillis();
        while (literator.hasNext()) {
            literator.next();
            //System.out.println(String.format("i = %s", literator.next()));
        }
        ayyayafter = System.currentTimeMillis();
        System.out.println("linkedList使用iterator遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");

        /*
         linkedlist使用for遍历 电脑直接发热，等好长时间都不见结果

         LinkedList是双向链表，java.util.LinkedList#node(int) 因此是算出i在一半前还是一半后，一半前正序遍历、一半后倒序遍历，这样会快很多。

         原因就在两个for循环里面，以前者为例：
         1、get(0)，直接拿到0位的Node0的地址，拿到Node0里面的数据
         2、get(1)，直接拿到0位的Node0的地址，从0位的Node0中找到下一个1位的Node1的地址，找到Node1，拿到Node1里面的数据
         3、get(2)，直接拿到0位的Node0的地址，从0位的Node0中找到下一个1位的Node1的地址，找到Node1，
            从1位的Node1中找到下一个2位的Node2的地址，找到Node2，拿到Node2里面的数据。

         后面的以此类推。也就是说，LinkedList在get任何一个位置的数据的时候，都会把前面的数据走一遍。假如我有10个数据，
         那么将要查询1+2+3+4+5+5+4+3+2+1=30次数据，相比ArrayList，却只需要查询10次数据就行了，随着LinkedList的容量越大，差距会越拉越大。
         其实使用LinkedList到底要查询多少次数据，大家应该已经很明白了，
         来算一下：按照前一半算应该是（1 + 0.5N） * 0.5N / 2，后一半算上即乘以2，应该是（1 + 0.5N） * 0.5N = 0.25N2 + 0.5N，
         忽略低阶项和首项系数，得出结论，LinikedList遍历的时间复杂度为O(n^2)，N为LinkedList的容量。

         时间复杂度有以下经验规则：
         O(1) < O(log2N) < O(n) < O(N * log2N) < O(n^2) < O(N^3) < 2N < 3N < N!

         前四个比较好、中间两个一般、后3个很烂。也就是说O(N^2)是相对糟糕的一种时间复杂度了，N大一点，程序就会执行得比较慢
         */
        //ayyaybefore = System.currentTimeMillis();
        //for (int ii = 0; ii < linkedList.size(); ii++) {
        //    linkedList.get(ii);
        //}
        //ayyayafter = System.currentTimeMillis();
        //System.out.println("linkedlist使用for遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");
    }
}
