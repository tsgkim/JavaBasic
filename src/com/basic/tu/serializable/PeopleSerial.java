//package com.basic.tu.serializable;
//
//import me.andpay.ti.util.FileUtil;
//import me.andpay.ti.util.JSON;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//
///**
// * 人序列化
// *
// * @author: shiguang.tu
// * @create: 2018/11/1 3:50 PM
// */
//public class PeopleSerial {
//
//    private static final String PEOPLE_FILE_PATH = "/Users/tsgkim/Downloads/people.txt";
//
//    @Test
//    public void peopleSerialTest() throws Exception {
//
//        People people = new People();
//        people.setAge(23);
//        people.setName("张三");
//
//        System.out.println(String.format("People=%s", JSON.getDefault().toJSONString(people)));
//
//        // 如果将 People implements Serializable 去掉，这里将会抛异常，无法序列化
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FileUtil.createNewFile(PEOPLE_FILE_PATH)));
//
//        objectOutputStream.writeObject(people);
//
//        objectOutputStream.close();
//    }
//
//    @Test
//    public void peopleDeSerialTest() throws Exception {
//
//        /**
//         * 如果将 People 中 private static final Long serialVersionUID = 1L; 去掉，序列化后，再在 People 中增加 addTip 属性，
//         *      执行下面反序列化，将会报错
//         * 但是将 People 中 private static final Long serialVersionUID = 1L; 加上，序列化后，再在 People 中增加 addTip 属性，
//         *      执行下面反序列化，不会报错
//         */
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(PEOPLE_FILE_PATH)));
//
//        People people = (People)objectInputStream.readObject();
//
//        objectInputStream.close();
//
//        System.out.println(String.format("People=%s", JSON.getDefault().toJSONString(people)));
//
//    }
//
//
//}
