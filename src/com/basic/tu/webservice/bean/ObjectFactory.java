//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.07.29 时间 01:36:21 PM CST 
//


package com.basic.tu.webservice.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CREATOR_QNAME = new QName("http://tempuri.org/", "CREATOR");
    private final static QName _ISQUALITYBEFORE_QNAME = new QName("http://tempuri.org/", "IS_QUALITY_BEFORE");
    private final static QName _OPERATION_QNAME = new QName("http://tempuri.org/", "OPERATION");
    private final static QName _CREATETIME_QNAME = new QName("http://tempuri.org/", "CREATE_TIME");
    private final static QName _CUSTCODE_QNAME = new QName("http://tempuri.org/", "CUST_CODE");
    private final static QName _SERVICEMODE_QNAME = new QName("http://tempuri.org/", "SERVICE_MODE");
    private final static QName _CUSTNAME_QNAME = new QName("http://tempuri.org/", "CUST_NAME");
    private final static QName _LASTMODIFYOR_QNAME = new QName("http://tempuri.org/", "LAST_MODIFYOR");
    private final static QName _SUPPLIERSCODE_QNAME = new QName("http://tempuri.org/", "SUPPLIERS_CODE");
    private final static QName _FACTORYCODE_QNAME = new QName("http://tempuri.org/", "FACTORY_CODE");
    private final static QName _SUPPLIERSNAME_QNAME = new QName("http://tempuri.org/", "SUPPLIERS_NAME");
    private final static QName _ITEMCODE_QNAME = new QName("http://tempuri.org/", "ITEM_CODE");
    private final static QName _LASTMODIFYTIME_QNAME = new QName("http://tempuri.org/", "LAST_MODIFY_TIME");
    private final static QName _PROJECTCODE_QNAME = new QName("http://tempuri.org/", "PROJECT_CODE");
    private final static QName _ITEMNAME_QNAME = new QName("http://tempuri.org/", "ITEM_NAME");
    private final static QName _BASITEMSERVICERANGEID_QNAME = new QName("http://tempuri.org/", "BAS_ITEM_SERVICE_RANGE_ID");
    private final static QName _PROJECTNAME_QNAME = new QName("http://tempuri.org/", "PROJECT_NAME");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XTSUPPLYPATH }
     * 
     */
    public XTSUPPLYPATH createXTSUPPLYPATH() {
        return new XTSUPPLYPATH();
    }

    /**
     * Create an instance of {@link SendSupplyPathToSnc }
     * 
     */
    public SendSupplyPathToSnc createSendSupplyPathToSnc() {
        return new SendSupplyPathToSnc();
    }

    /**
     * Create an instance of {@link Paths }
     * 
     */
    public Paths createPaths() {
        return new Paths();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CREATOR")
    public JAXBElement<String> createCREATOR(String value) {
        return new JAXBElement<String>(_CREATOR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IS_QUALITY_BEFORE")
    public JAXBElement<String> createISQUALITYBEFORE(String value) {
        return new JAXBElement<String>(_ISQUALITYBEFORE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OPERATION")
    public JAXBElement<String> createOPERATION(String value) {
        return new JAXBElement<String>(_OPERATION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CREATE_TIME")
    public JAXBElement<String> createCREATETIME(String value) {
        return new JAXBElement<String>(_CREATETIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CUST_CODE")
    public JAXBElement<String> createCUSTCODE(String value) {
        return new JAXBElement<String>(_CUSTCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SERVICE_MODE")
    public JAXBElement<String> createSERVICEMODE(String value) {
        return new JAXBElement<String>(_SERVICEMODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CUST_NAME")
    public JAXBElement<String> createCUSTNAME(String value) {
        return new JAXBElement<String>(_CUSTNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LAST_MODIFYOR")
    public JAXBElement<String> createLASTMODIFYOR(String value) {
        return new JAXBElement<String>(_LASTMODIFYOR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SUPPLIERS_CODE")
    public JAXBElement<String> createSUPPLIERSCODE(String value) {
        return new JAXBElement<String>(_SUPPLIERSCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FACTORY_CODE")
    public JAXBElement<String> createFACTORYCODE(String value) {
        return new JAXBElement<String>(_FACTORYCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SUPPLIERS_NAME")
    public JAXBElement<String> createSUPPLIERSNAME(String value) {
        return new JAXBElement<String>(_SUPPLIERSNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ITEM_CODE")
    public JAXBElement<String> createITEMCODE(String value) {
        return new JAXBElement<String>(_ITEMCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LAST_MODIFY_TIME")
    public JAXBElement<String> createLASTMODIFYTIME(String value) {
        return new JAXBElement<String>(_LASTMODIFYTIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PROJECT_CODE")
    public JAXBElement<String> createPROJECTCODE(String value) {
        return new JAXBElement<String>(_PROJECTCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ITEM_NAME")
    public JAXBElement<String> createITEMNAME(String value) {
        return new JAXBElement<String>(_ITEMNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BAS_ITEM_SERVICE_RANGE_ID")
    public JAXBElement<String> createBASITEMSERVICERANGEID(String value) {
        return new JAXBElement<String>(_BASITEMSERVICERANGEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PROJECT_NAME")
    public JAXBElement<String> createPROJECTNAME(String value) {
        return new JAXBElement<String>(_PROJECTNAME_QNAME, String.class, null, value);
    }

}
