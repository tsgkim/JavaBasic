package com.basic.tu;

import java.lang.reflect.Field;

public class ClassTest {

    /**
     * 任何一个小写的 class 定义的类，有一个属性 class 来获取大写的 Class 对象
     */
    private static Class<One> oneClass = One.class;
    private static Class<Another> anotherClass = Another.class;

    public static void main(String[] args) throws Exception {

        One one = oneClass.newInstance();
        one.call();

        Another another = anotherClass.newInstance();
        another.speak();

        Field inner = oneClass.getDeclaredField("inner");
        inner.setAccessible(true);

        System.out.println(one.getInner());
        inner.set(one, "inner changed");
        System.out.println(one.getInner());
    }

}

class One {

    private String inner = "inner";

    public void call() {
        System.out.println("One call");
    }

    public String getInner() {
        return inner;
    }

}

class Another {

    public void speak() {
        System.out.println("Another speak");
    }
}