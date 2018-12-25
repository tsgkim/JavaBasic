package com.basic.tu.guava.reflection;

import com.google.common.collect.Lists;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeToken;
import me.andpay.ti.test.mockito.MockitoExtension;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 *
 * @author: shiguang.tu
 * @create: 2018/12/5 6:02 PM
 */
@ExtendWith(MockitoExtension.class)
public class Test1 {

    private String name;
    private Integer age;

    @Test
    public void myTest() throws NoSuchMethodException, NoSuchFieldException {

        // JDK 泛型类型擦除
        ArrayList<String> stringList = Lists.newArrayList();
        ArrayList<Integer> intList = Lists.newArrayList();
        assertTrue(stringList.getClass().isAssignableFrom(intList.getClass()));

        // guava 泛型类型不擦除
        TypeToken<ArrayList<String>> stringListTok = new TypeToken<ArrayList<String>>(){};
        TypeToken<ArrayList<Integer>> integerListTok = new TypeToken<ArrayList<Integer>>(){};
        assertFalse(stringListTok.getClass().isAssignableFrom(integerListTok.getClass()));

        int myMethod = Test1.class.getMethod("myMethod").getModifiers();

        // JDK 判断是否是 public
        assertTrue(Modifier.isPublic(myMethod));
        assertFalse(!(Modifier.isPrivate(myMethod) || Modifier.isPublic(myMethod)));

        // guava 判断是否是 public
        assertTrue(Invokable.from(Test1.class.getMethod("myMethod")).isPublic());
        assertFalse(Invokable.from(Test1.class.getMethod("myMethod")).isPackagePrivate());

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
