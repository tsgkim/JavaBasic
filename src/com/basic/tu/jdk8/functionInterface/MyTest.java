package com.basic.tu.jdk8.functionInterface;

import org.junit.Test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 函数式接口测试类
 *
 * @author: shiguang.tu
 * @create: 2018/11/10 11:07 AM
 */
public class MyTest {

    /**
     * 创建函数式接口实例
     */
    @Test
    public void createFunctionInterfaceInstance() {

        /**
         * 1、lambda表达式
         *      接收一个String类型的参数，返回一个String类型的结果
         */
        FunctionInterfaceTest test1 = item -> item + "hello world!";

        System.out.println(String.format("Invoke test1.getInfo() return=%s", test1.getInfo("22")));

        /**
         * 2、方法引用
         */
        FunctionInterfaceTest test2 = MyTest::getInfo;

        System.out.println(String.format("Invoke test2.getInfo() return=%s", test2.getInfo("22")));

        /**
         * 3、构造方法引用
         */
        FunctionInterfaceTest test3 = String::new;

    }

    /**
     * @see java.util.function.Function 接收一个T类型的参数，返回一个R类型的结果
     */
    @Test
    public void testFunction() {

        Function<String, String> function = MyTest::getInfo;

        System.out.println(String.format("Invoke function.apply() return=%s", function.apply("22")));

    }

    /**
     * @see java.util.function.Function 接收一个T类型的参数，返回一个R类型的结果
     * function2的输出类型与function1的输入类型一定要一致
     */
    @Test
    public void testFunctionCompose() {

        Function<Integer, String> function1 = value -> "hello的长度：" + value;
        Function<String, Integer> function2 = String::length;

        Function<String, String> compose = function1.compose(function2);
        System.out.println(compose.apply("hello"));

    }

    /**
     * @see java.util.function.Function 接收一个T类型的参数，返回一个R类型的结果
     * default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
     * function2的输出类型与function1的输入类型一定要一致
     */
    @Test
    public void testFunctionAndThen() {

        Function<Integer, String> function1 = value -> "hello的长度：" + value;
        Function<String, Integer> function2 = String::length;

        Function<String, String> compose = function2.andThen(function1);
        System.out.println(compose.apply("hello"));

    }

    /**
     * @see java.util.function.BiFunction 接收T类型和U类型的两个参数，返回一个R类型的结果
     */
    @Test
    public void testBiFunction() {

        BiFunction<String, String, String> function = MyTest::getInfo;

        System.out.println(String.format("Invoke function.apply() return=%s", function.apply("00", "11")));

    }

    /**
     * @see java.util.function.Consumer 接收一个T类型的参数，不返回值
     */
    @Test
    public void testConsumer() {

        Consumer<String> consumer = item -> System.out.println(String.format("Item=%s", item));

        consumer.accept("11");

    }

    /**
     * @see java.util.function.BiConsumer 接收T类型和U类型的两个参数，不返回值
     */
    @Test
    public void testBiConsumer() {

        BiConsumer<String, String> consumer = (var0, var1) -> System.out.println(var0 + var1);

        consumer.accept("00", "11");

    }

    /**
     * @see java.util.function.Predicate 接收一个T类型的参数，返回一个boolean类型的结果
     */
    @Test
    public void testPredicate() {

        Predicate<Boolean> predicate = MyTest::check;

        System.out.println(predicate.test(true) ? "true" : "false");

    }

    /**
     * @see java.util.function.BiPredicate 接收T类型和U类型的两个参数，返回一个boolean类型的结果
     */
    @Test
    public void testBiPredicate() {

        BiPredicate<Boolean, Boolean> predicate = MyTest::check;

        System.out.println(predicate.test(true, false) ? "true" : "false");

    }

    /**
     * @see java.util.function.Supplier 不接受参数，返回一个T类型的结果
     */
    @Test
    public void testSupplier() {

        Supplier<MyTest> supplier = () -> new MyTest();

        System.out.println(supplier.get());

    }

    private static String getInfo(String item) {
        return item + "！世界";
    }

    private static String getInfo(String var0, String var1) {
        return var0 + var1;
    }

    private static boolean check(Boolean item) {
        return item;
    }

    private static boolean check(Boolean var0, Boolean var1) {
        return var0 && var1;
    }

}
