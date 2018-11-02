package com.basic.tu.serializable;

import java.io.Serializable;

/**
 * 人对象
 *
 * @author: shiguang.tu
 * @create: 2018/11/1 3:34 PM
 */
public class People implements Serializable {

    private static final long serialVersionUID = 1L;

    private static String noSerialStr = "noxxx";

    private String name;

    /**
     * transient 修饰，不会被序列化
     */
    transient private Integer age;

    private String addTip;

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

    public String getAddTip() {
        return addTip;
    }

    public void setAddTip(String addTip) {
        this.addTip = addTip;
    }

}

