package com.basic.tu.proxy.myDynamic;

import com.basic.tu.proxy.myDynamic.handler.G3StudentHandler;
import com.basic.tu.proxy.myDynamic.impl.G3Student_boy;
import com.google.common.reflect.Reflection;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class MyTest {

    public static void main(String[] args) {

        G3Student boy = new G3Student_boy();

        G3Student g3boy = (G3Student) Proxy.newProxyInstance(
                boy.getClass().getClassLoader(),
                boy.getClass().getInterfaces(),
                new G3StudentHandler(boy));

        g3boy.studyAtSchool("小明");
        g3boy.studyAtHome("小明");

    }

    /**
     * 使用 guava 工具包实现动态代理
     */
    @Test
    public void myTest() {

        G3Student boy = new G3Student_boy();

        G3Student g3boy = Reflection.newProxy(G3Student.class, new G3StudentHandler(boy));

        g3boy.studyAtSchool("小明");
        g3boy.studyAtHome("小明");

    }

}
