package com.basic.tu.staticCode;

class Parent {

    static {
        System.out.println("父类静态代码块");
    }

    public Parent() {
        System.out.println("父类构造方法");
    }
}

class Child extends Parent {

    static {
        System.out.println("子类静态代码块");
    }

    public Child() {
        System.out.println("子类构造方法");

    }

    /**
     * 执行顺序
     *  父类静态代码块 -> 子类静态代码块 -> 父类构造方法 -> 子类构造方法
     * @param args
     */
    public static void main(String[] args) {
        // 静态代码块只执行一次
        new Child();
        new Child();
    }

}
