package com.basic.tu.valueReference;

import me.andpay.ti.util.JSON;
import org.junit.Test;

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
        System.out.println(String.format("test1=%s", JSON.getDefault().toJSONString(test1)));


        ReferenceTest test2 = test1;

        System.out.println(String.format("test2=%s", JSON.getDefault().toJSONString(test2)));
        test1.setName("李四");
        System.out.println(String.format("test2=%s", JSON.getDefault().toJSONString(test2)));

        test2.setName("王五");
        System.out.println(String.format("test1=%s", JSON.getDefault().toJSONString(test1)));
        System.out.println(String.format("test2=%s", JSON.getDefault().toJSONString(test2)));

        //test1 = new ReferenceTest();
        //System.out.println(String.format("test1=%s", JSON.getDefault().toJSONString(test1)));
        //System.out.println(String.format("test2=%s", JSON.getDefault().toJSONString(test2)));

        //test1 = new ReferenceTest();
        //test1.setName("赵六");
        //test1.setAge(15);
        //System.out.println(String.format("test1=%s", JSON.getDefault().toJSONString(test1)));
        //System.out.println(String.format("test2=%s", JSON.getDefault().toJSONString(test2)));

        ReferenceTest test3 = new ReferenceTest();
        test3.setName("赵六");
        test3.setAge(15);
        test1 = test3;
        System.out.println(String.format("test1=%s", JSON.getDefault().toJSONString(test1)));
        System.out.println(String.format("test2=%s", JSON.getDefault().toJSONString(test2)));

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


