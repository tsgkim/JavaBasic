package com.basic.tu.myInterface;

/**
 *
 * @author: shiguang.tu
 * @create: 2018/12/7 1:32 PM
 */
public interface ITest1 {

    void myMethod();

}

class Test_1 implements ITest1 {

    @Override
    public void myMethod() {

        System.out.println("Test_1");

    }

    public static void main(String[] args) {

    }

}

class Test_2 implements ITest1 {

    @Override
    public void myMethod() {

        System.out.println("Test_1");

    }
}