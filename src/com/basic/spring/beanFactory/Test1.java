package com.basic.spring.beanFactory;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.util.ResourceUtils;

/**
 * @author: shiguang.tu
 * @create: 2018/12/6 4:28 PM
 */
public class Test1 {

    private String name;
    private Integer age;

    @Test
    public void myTest() {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        new XmlBeanDefinitionReader(factory).loadBeanDefinitions(
                        new PathMatchingResourcePatternResolver().getResource(
                ResourceUtils.CLASSPATH_URL_PREFIX + "com/basic/spring/beanFactory/beans.xml"));

        Test1 test_1 = factory.getBean("test1", Test1.class);
        Assertions.assertEquals(test_1.myMethod(), "Hello world !");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                ResourceUtils.CLASSPATH_URL_PREFIX + "com/basic/spring/beanFactory/beans.xml");

        Test1 test_2 = ctx.getBean("test1", Test1.class);
        Assertions.assertEquals(test_2.myMethod(), "Hello world !");

    }

    public String myMethod() {
        return "Hello world !";
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
