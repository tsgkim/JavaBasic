package com.basic.tu.generic;

/**
 * 泛型定义 Demo
 *
 * @author: shiguang.tu
 * @create: 2018/11/2 3:22 PM
 */
public class GenericDefinitionDemo<T> {

    /**
     * String 出现在尖括号里，它就不是 java.lang.String，仅仅是一个代号
     * GenericDefinitionDemo<T> 的 <T> 和 <String, T, Tsgkim> 的 T 是两个不同的指代，可以完全不同，互不影响
     *
     */
    static <String, T, Tsgkim> String get(String string, Tsgkim tsgkim) {
        return string;
    }

    public static void main(String[] args) {

        Integer first = 222;
        Long second = 333L;

        Integer integer = get(first, second);
    }


}
