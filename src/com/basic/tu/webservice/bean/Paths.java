//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.07.29 时间 01:36:21 PM CST 
//


package com.basic.tu.webservice.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://tempuri.org/}XT_SUPPLYPATH"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xtsupplypath"
})
@XmlRootElement(name = "int:paths")
public class Paths {

    @XmlElement(name = "XT_SUPPLYPATH", required = true)
    protected XTSUPPLYPATH xtsupplypath;

    /**
     * 获取xtsupplypath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XTSUPPLYPATH }
     *     
     */
    public XTSUPPLYPATH getXTSUPPLYPATH() {
        return xtsupplypath;
    }

    /**
     * 设置xtsupplypath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XTSUPPLYPATH }
     *     
     */
    public void setXTSUPPLYPATH(XTSUPPLYPATH value) {
        this.xtsupplypath = value;
    }

}
