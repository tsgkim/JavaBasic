package com.basic.tu.exception;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: shiguang.tu
 * @create: 2018/12/3 9:31 PM
 */
public class Test1 {

    public void myMethod(String aa) {

        if (null == aa) {
            throw new RuntimeException(String.format("%s 不能为空", aa));
        }

    }

    public void myMethod2(String aa) throws Exception {

        // ....
        new MyResult().message = "余额不足";
        throw new Exception(new MyResult());

    }

    public static void main(String[] args) {

        new Test1().myMethod(null);

        try {
            new Test1().myMethod2(null);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    class MyResult extends Throwable {
        String message;
    }

    @Test
    public void myTest() {

        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");


        // iterator
        for (String item : list) {
            if ("b".equals(item)) {

                // 没有 iterator remove
                list.remove(item);
            }
        }



        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String s = it.next();

            if (s.equals("b")) {

                // it 的 remove
                it.remove();
            }

        }


    }


}
