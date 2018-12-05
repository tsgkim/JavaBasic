package com.basic.tu.algorithm;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: shiguang.tu
 * @create: 2018/12/4 3:27 PM
 */
public class Test1 {

    public static void main(String[] args) {

        int arrays[] = new int[10];
        arrays[0] = 0;
        arrays[1] = 1;
        arrays[2] = 2;
        arrays[3] = 3;
        arrays[4] = 4;
        arrays[5] = 5;
        arrays[6] = 3;
        arrays[7] = 0;
        arrays[8] = 0;
        arrays[9] = 0;

        Map<Integer, String> map = new HashMap<>(10);

        for (int i = 0; i < 10; i++) {

            String s = map.get(arrays[i]);

            if (null == s) {
                map.put(arrays[i], String.valueOf(i));
            } else {
                map.put(arrays[i], s + "," + String.valueOf(i));
            }

        }

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();

            if (entry.getValue().length() > 1) {
                System.out.println(String.format("值: %s，位于: %s", entry.getKey(), entry.getValue()));
            }
        }

    }

    @Test
    public void myTest() {

        float high = 10;
        float passHigh = 0;

        for (int i = 0; i < 10; i++) {

            passHigh += high + (high / 2);

            high = high / 2;

        }

        System.out.println(String.format("passHigh=%s, high=%s", passHigh, high));

    }


}
