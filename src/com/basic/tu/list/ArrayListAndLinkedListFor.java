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

        // arraylist使用foreach遍历耗时 12ms
        long ayyaybefore = System.currentTimeMillis();
        for (String ii : arrayList) {
        }
        long ayyayafter = System.currentTimeMillis();
        System.out.println("arraylist使用foreach遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");

        // arraylist使用iterator遍历耗时 8ms
        Iterator aiterator = arrayList.iterator();
        ayyaybefore = System.currentTimeMillis();
        while (aiterator.hasNext()) {
            aiterator.next();
        }
        ayyayafter = System.currentTimeMillis();
        System.out.println("arraylist使用iterator遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");

        // arrayList使用for遍历耗时 5ms
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
        Iterator literator = linkedList.iterator();
        ayyaybefore = System.currentTimeMillis();
        while (literator.hasNext()) {
            literator.next();
        }
        ayyayafter = System.currentTimeMillis();
        System.out.println("linkedList使用iterator遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");

        // linkedlist使用for遍历耗时 97026ms
        ayyaybefore = System.currentTimeMillis();
        for (int ii = 0; ii < linkedList.size(); ii++) {
            linkedList.get(ii);
        }
        ayyayafter = System.currentTimeMillis();
        System.out.println("linkedlist使用for遍历的时间是:" + (ayyayafter - ayyaybefore) + "ms");
    }
}
