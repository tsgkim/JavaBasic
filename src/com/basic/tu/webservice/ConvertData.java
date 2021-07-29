package com.basic.tu.webservice;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class ConvertData {

    private static final Logger log = LoggerFactory.getLogger(ConvertData.class);

    public ConvertData() {
    }

    //最后需要将传入的xml格式的字符串映射解析为java类
    public static <T> T xml2Object(String xmlStr, Class<T> c) {
        try {
            // JAXB（即Java Architecturefor XML Binding）是一个业界的标准，
            //即是一项可以根据XML Schema产生Java类的技术。
            //该过程中，JAXB也提供了将XML实例文档反向生成Java对象树的方法，
            //并能将Java对象树的内容重新写到XML实例文档。
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            T t = (T) unmarshaller.unmarshal(new StringReader(xmlStr));
            return t;

        } catch (JAXBException e) {
            log.error(e.getMessage(),e);
            System.out.println(e);
            return null;
        }
    }

}
