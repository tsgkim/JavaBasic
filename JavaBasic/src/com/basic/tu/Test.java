package com.basic.tu;

import java.util.HashMap;
import java.util.Map;

public class Test {

    @org.junit.Test
    public void testmy() {
        System.out.print("Hello world!");
    }

    @org.junit.Test
    public void testStringBuild() {
        StringBuilder sb = new StringBuilder();

        sb.append("1");
        sb.append("2");
        System.out.println(sb.toString());

        Map<String, Object> map = new HashMap<>();

        useStringBuild(sb, map, 1, 2);

        System.out.println(sb.toString());

    }

    private Map<String, Object> useStringBuild(StringBuilder sb, Map<String, Object> map, int a, int b) {
        sb.append("3");
        return map;
    }
}
