package com.basic.tu.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author: shiguang.tu
 * @create: 2018/12/3 3:05 PM
 */
public class ArraysAsList {

    public static void main(String[] args) {

        String[] strs = new String[3];
        strs[0] = "0";
        strs[1] = "1";
        strs[2] = "2";

        List<String> strings = Arrays.asList(strs);

        strings.set(0, "zero");

        System.out.println(String.format("strs[0]=%s, strings[0]=%s", strs[0], strings.get(0)));

        /**
         * Arrays.asList(strs) 返回的是 Arrays 的内部类 java.util.Arrays.ArrayList，没有实现 add、remove、clear，下面都会报错
         */
        strings.add("3");
        strings.remove(2);
        strings.clear();

    }


}
