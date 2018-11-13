package com.basic.tu.jdk8.functionInterface;

/**
 * 函数式接口
 *
 * 1. 被@FunctionalInterface注释的接口，满足@FunctionalInterface注释的约束
 * 2. 没有被@FunctionalInterface注释的接口，但是满足@FunctionalInterface注释的约束

 * @author: shiguang.tu
 * @create: 2018/11/10 10:53 AM
 */
@FunctionalInterface
public interface FunctionInterfaceTest {

    /**
     * 接口有且只能有个一个抽象方法，只有方法定义，没有方法体
     *
     * @param input
     * @return
     */
    String getInfo(String input);

    /**
     * 在接口中覆写Object类中的public方法，不算是函数式接口的方法
     *
     * @return
     */
    @Override
    String toString();  //Object中的方法

}

@FunctionalInterface
interface FunctionInterfaceTest_2 {

    String getInfo(String input);

}

interface FunctionInterfaceTest_3 {

    String getInfo(String input);

}