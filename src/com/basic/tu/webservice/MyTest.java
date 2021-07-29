package com.basic.tu.webservice;

import com.basic.tu.webservice.bean.Envelope;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @company: MEGVII
 * @author: tushiguang
 * @create: 2021/7/29 17:13
 **/
public class MyTest {
    public static void main(String[] args) {
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
        XStream xStream = new XStream(new DomDriver());
        xStream.ignoreUnknownElements();
        xStream.processAnnotations(Envelope.class);
        Envelope envelope = (Envelope) xStream.fromXML(xml);
        System.out.println(envelope);
    }
}
