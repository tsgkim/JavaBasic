package com.basic.tu.override;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/**
 * 动物类
 *
 * @author: shiguang.tu
 * @create: 2018/11/2 10:23 AM
 */
class Animal {

    int num = 10;
    static int age = 20;

    public void eat() {
        System.out.println("动物吃饭");
    }

    public static void sleep() {
        System.out.println("动物睡觉");
    }

    public void run() {
        System.out.println("动物奔跑");
    }

    protected Number doSomething (int a, Integer b, Object c) throws SQLException{

        System.out.println("动物做事");
        return 7;

    }

}

/**
 * 猫类
 */
class Cat extends Animal {

    int num = 11;
    static int age = 21;
    String name = "cat";

    @Override
    public void eat() {
        System.out.println("猫吃饭");
    }

    /**
     * 这里不是 @Override
     * 覆写只能针对 非static、非final、非构造方法
     */
    public static void sleep() {
        System.out.println("猫睡觉");
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }

    /**
     * 1. 权限扩大  protect -> public (一大)
     * 2. 返回值是父类的 Number 的子类 (两小)
     * 3. 抛出的异常是 SQLException  的子类
     * 4. 方法名必须严格一致 (两同)
     * 5. 参数类型与个数必须严格一直
     * 6. 必须加 @Override
     *
     */
    @Override
    public Integer doSomething (int a, Integer b, Object c) throws SQLClientInfoException{

        if (a == 0) {
            throw new SQLClientInfoException();
        }

        System.out.println("猫做事");
        return 7;

    }

    /**
     * 多态成员访问的特点: 只有非静态的成员方法,编译看左边,运行看右边
     *  1. 成员变量
     *      编译看左边(父类),运行看左边(父类)
     *  2. 成员方法
     *      编译看左边(父类)，运行看右边(子类)。动态绑定
     *  3. 静态方法
     *      编译看左边(父类)，运行看左边(父类)。
     *
     *  多态的弊端: 不能使用子类特有的成员属性和子类特有的成员方法
     *
     */
    public static void main(String[] args) {

        Animal animal = new Cat();

        // 猫吃饭
        animal.eat();

        // 动物睡觉
        animal.sleep();

        // 动物奔跑
        animal.run();

        // 无法调用
        //animal.catchMouse();

        // 无法调用
        //System.out.println(String.format("name=%s", animal.name));

        // num=10
        System.out.println(String.format("num=%s", animal.num));

        // age=20
        System.out.println(String.format("age=%s", animal.age));

        Cat cat = (Cat) animal;

        // 猫吃饭
        cat.eat();

        // 猫睡觉
        cat.sleep();

        // 动物奔跑
        cat.run();

        // 猫捉老鼠
        cat.catchMouse();

        // name=cat
        System.out.println(String.format("name=%s", cat.name));

        // num=11
        System.out.println(String.format("num=%s", cat.num));

        // age=21
        System.out.println(String.format("age=%s", cat.age));

    }

}

