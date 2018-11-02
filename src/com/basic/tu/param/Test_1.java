package com.basic.tu.param;

import org.junit.Test;

/**
 * 测试案例
 *
 * @author: shiguang.tu
 * @create: 2018/11/1 9:06 PM
 */
public class Test_1 {

    private static int intStatic = 22;
    private static String stringStatic = "Hello world!";
    private static StringBuilder stringBuilderStatic = new StringBuilder("World hello!");

    @Test
    public void myTest() {

        System.out.println(String.format("intStatic=%s", intStatic));

        intMethod(intStatic);

        System.out.println(String.format("intStatic=%s", intStatic));

        System.out.println(String.format("stringStatic=%s", stringStatic));

        stringMethod(stringStatic);

        System.out.println(String.format("stringStatic=%s", stringStatic));

        System.out.println(String.format("stringBuilderStatic=%s", stringBuilderStatic));

        stringBuildMethod(stringBuilderStatic, stringBuilderStatic);

        System.out.println(String.format("stringBuilderStatic=%s", stringBuilderStatic));

    }

    private static void intMethod(int param) {
        param = 33;
    }

    private static void stringMethod(String param) {
        param = "string static";
    }

    private static void stringBuildMethod(StringBuilder sb1, StringBuilder sb2) {

        sb1.append("a");
        sb2.append("b");

        sb1 = new StringBuilder("c");
        sb1.append("d");

        System.out.println(String.format("sb1=%s", sb1));

    }



}
