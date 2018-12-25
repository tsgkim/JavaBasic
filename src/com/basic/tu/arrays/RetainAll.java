package com.basic.tu.arrays;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

public class RetainAll {

    @Test
    public void myTest() {

        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
        List<Integer> list2 = Lists.newArrayList(2, 3);

        list1.removeAll(list2);

        System.out.println(list1);
        System.out.println(list2);

        List<Integer> list3 = Lists.newArrayList(1, 2, 3);
        List<Integer> list4 = Lists.newArrayList(2, 3);

        list4.retainAll(list3);

        System.out.println(list3);
        System.out.println(list4);


    }
}
