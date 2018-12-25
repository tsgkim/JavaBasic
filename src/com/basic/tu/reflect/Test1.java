package com.basic.tu.reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * @author: shiguang.tu
 * @create: 2018/12/5 6:02 PM
 */
public class Test1 {

    private String name;
    private Integer age;

    @Test
    public void myTest() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 第一种获取反射方式
        Class<Test1> test1Class_1 = Test1.class;

        // 第二种获取反射方式
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Class<?> test1Class_2 = contextClassLoader.loadClass("com.basic.tu.reflect.Test1");

        Test1 test1_1 = (Test1)test1Class_2.getDeclaredConstructor((Class<?>[]) null).newInstance();
        Test1 test1_2 = (Test1)test1Class_2.newInstance();
        Test1 test1_3 = test1Class_1.newInstance();

        test1_1.myMethod();
        test1_2.myMethod();
        test1_3.myMethod();



    }

    public void myMethod() {
        System.out.println("Hello world !");
    }

    public Test1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
