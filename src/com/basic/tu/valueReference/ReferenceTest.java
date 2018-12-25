package com.basic.tu.valueReference;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * 测试引用传递问题
 *
 * @author: shiguang.tu
 * @create: 2018/11/19 12:25 PM
 */
public class ReferenceTest {

    private String name;
    private Integer age;

    /**
     * test2 = test1 之后，改变任何一个对象的属性值，都会互相改变
     */
    @Test
    public void myTest() {

        ReferenceTest test1 = new ReferenceTest();
        test1.setName("张三");
        test1.setAge(23);

        ReferenceTest test2 = test1;
        Assertions.assertEquals(test2.toString(), test1.toString());

        test1.setName("李四");
        Assertions.assertEquals("李四", test2.getName());

        test2.setName("王五");
        Assertions.assertEquals("王五", test1.getName());

        ReferenceTest test3 = new ReferenceTest();
        test3.setName("赵六");
        test3.setAge(15);
        test1 = test3;
        Assertions.assertEquals(test1.toString(), test3.toString());
        Assertions.assertNotEquals(test1.toString(), test2.toString());
        Assertions.assertEquals("王五", test2.getName());

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


