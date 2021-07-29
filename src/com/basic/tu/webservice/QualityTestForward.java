package com.basic.tu.webservice;

import com.basic.tu.webservice.bean.Paths;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * Title：质检前移数据获取webservice接口
 * Description: 基于jdk1.6以上的javax.jws 发布webservice接口
 @WebService － 它是一个注解，用在类上指定将此类发布成一个ws。
 Endpoint – 此类为端点服务类，它的方法publish用于将一个已经添加了@WebService注解
 对象绑定到一个地址的端口上。
  * @author mdw
 */
@WebService
public class QualityTestForward {
    public QualityTestForward() {
    }

    /** 供客户端调用方法
     * @param xmlStr  传入参数
     * @return xmlStr 返回结果
     * */
    public String pushqualityTestForwardData(String xmlStr) throws JAXBException, IOException {
        System.out.println("获取的xml数据为"+xmlStr);
        // 解析xml数据
        Paths paths = ConvertData.xml2Object(xmlStr, Paths.class);
        System.out.println("解析到的数据为"+paths);
        return "欢迎你！ "+xmlStr;
    }


    //通过EndPoint(端点服务)发布一个WebService
    public static void main(String[] args) throws IOException, JAXBException {
        String xml = "<?xml version='1.0' encoding='UTF-8'?>\n" +
                "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <S:Body>\n" +
                "        <int:sendSupplyPathToSnc xmlns:int=\"http://tempuri.org/\">\n" +
                "            <int:paths>\n" +
                "                <int:XT_SUPPLYPATH>\n" +
                "                    <int:BAS_ITEM_SERVICE_RANGE_ID>606cce711745430e8dade0072eaf9da6</int:BAS_ITEM_SERVICE_RANGE_ID>\n" +
                "                    <int:CREATE_TIME>20210708091517</int:CREATE_TIME>\n" +
                "                    <int:CREATOR>admin</int:CREATOR>\n" +
                "                    <int:CUST_CODE>0000501138</int:CUST_CODE>\n" +
                "                    <int:CUST_NAME>湖南联诚轨道装备有限公司</int:CUST_NAME>\n" +
                "                    <int:FACTORY_CODE>1910</int:FACTORY_CODE>\n" +
                "                    <int:IS_QUALITY_BEFORE>Y</int:IS_QUALITY_BEFORE>\n" +
                "                    <int:ITEM_CODE>000000000901000351</int:ITEM_CODE>\n" +
                "                    <int:ITEM_NAME>案秤100KG</int:ITEM_NAME>\n" +
                "                    <int:LAST_MODIFYOR>admin</int:LAST_MODIFYOR>\n" +
                "                    <int:LAST_MODIFY_TIME>20210708094118</int:LAST_MODIFY_TIME>\n" +
                "                    <int:PROJECT_CODE>01-0003</int:PROJECT_CODE>\n" +
                "                    <int:PROJECT_NAME>时速300公里动车组（E09）</int:PROJECT_NAME>\n" +
                "                    <int:SERVICE_MODE>JIT</int:SERVICE_MODE>\n" +
                "                    <int:SUPPLIERS_CODE>WU</int:SUPPLIERS_CODE>\n" +
                "                    <int:SUPPLIERS_NAME>无</int:SUPPLIERS_NAME>\n" +
                "                    <int:OPERATION>1(0新增，1修改)</int:OPERATION>\n" +
                "                </int:XT_SUPPLYPATH>\n" +
                "            </int:paths>\n"+
                "        </int:sendSupplyPathToSnc>\n" +
                "    </S:Body>\n" +
                "</S:Envelope>";


        QualityTestForward qualityTestForward = new QualityTestForward();
        qualityTestForward.pushqualityTestForwardData(xml);


     /*参数:1,本地的服务地址;
           2,提供服务的类;
      */
//        Endpoint.publish("http://127.0.0.1:8080/Service/ServiceQualityTestForward", new QualityTestForward());
        System.out.println("发布成功!");
        //发布成功后 在浏览器输入 http://127.0.0.1:8080/Service/ServiceQualityTestForward?wsdl
    }

    // 读取本地xml格式文件
    private static String readFile(String path) throws IOException {
        InputStreamReader reader = new InputStreamReader(
                QualityTestForward.class.getResourceAsStream(path));
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            line = bufferedReader.lines().collect(Collectors.joining());
        }
        return line;
    }
}
