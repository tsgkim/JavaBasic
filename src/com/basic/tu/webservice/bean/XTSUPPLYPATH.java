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
 *         &lt;element ref="{http://tempuri.org/}BAS_ITEM_SERVICE_RANGE_ID"/>
 *         &lt;element ref="{http://tempuri.org/}CREATE_TIME"/>
 *         &lt;element ref="{http://tempuri.org/}CREATOR"/>
 *         &lt;element ref="{http://tempuri.org/}CUST_CODE"/>
 *         &lt;element ref="{http://tempuri.org/}CUST_NAME"/>
 *         &lt;element ref="{http://tempuri.org/}FACTORY_CODE"/>
 *         &lt;element ref="{http://tempuri.org/}IS_QUALITY_BEFORE"/>
 *         &lt;element ref="{http://tempuri.org/}ITEM_CODE"/>
 *         &lt;element ref="{http://tempuri.org/}ITEM_NAME"/>
 *         &lt;element ref="{http://tempuri.org/}LAST_MODIFYOR"/>
 *         &lt;element ref="{http://tempuri.org/}LAST_MODIFY_TIME"/>
 *         &lt;element ref="{http://tempuri.org/}PROJECT_CODE"/>
 *         &lt;element ref="{http://tempuri.org/}PROJECT_NAME"/>
 *         &lt;element ref="{http://tempuri.org/}SERVICE_MODE"/>
 *         &lt;element ref="{http://tempuri.org/}SUPPLIERS_CODE"/>
 *         &lt;element ref="{http://tempuri.org/}SUPPLIERS_NAME"/>
 *         &lt;element ref="{http://tempuri.org/}OPERATION"/>
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
    "basitemservicerangeid",
    "createtime",
    "creator",
    "custcode",
    "custname",
    "factorycode",
    "isqualitybefore",
    "itemcode",
    "itemname",
    "lastmodifyor",
    "lastmodifytime",
    "projectcode",
    "projectname",
    "servicemode",
    "supplierscode",
    "suppliersname",
    "operation"
})
@XmlRootElement(name = "XT_SUPPLYPATH")
public class XTSUPPLYPATH {

    @XmlElement(name = "BAS_ITEM_SERVICE_RANGE_ID", required = true)
    protected String basitemservicerangeid;
    @XmlElement(name = "CREATE_TIME", required = true)
    protected String createtime;
    @XmlElement(name = "CREATOR", required = true)
    protected String creator;
    @XmlElement(name = "CUST_CODE", required = true)
    protected String custcode;
    @XmlElement(name = "CUST_NAME", required = true)
    protected String custname;
    @XmlElement(name = "FACTORY_CODE", required = true)
    protected String factorycode;
    @XmlElement(name = "IS_QUALITY_BEFORE", required = true)
    protected String isqualitybefore;
    @XmlElement(name = "ITEM_CODE", required = true)
    protected String itemcode;
    @XmlElement(name = "ITEM_NAME", required = true)
    protected String itemname;
    @XmlElement(name = "LAST_MODIFYOR", required = true)
    protected String lastmodifyor;
    @XmlElement(name = "LAST_MODIFY_TIME", required = true)
    protected String lastmodifytime;
    @XmlElement(name = "PROJECT_CODE", required = true)
    protected String projectcode;
    @XmlElement(name = "PROJECT_NAME", required = true)
    protected String projectname;
    @XmlElement(name = "SERVICE_MODE", required = true)
    protected String servicemode;
    @XmlElement(name = "SUPPLIERS_CODE", required = true)
    protected String supplierscode;
    @XmlElement(name = "SUPPLIERS_NAME", required = true)
    protected String suppliersname;
    @XmlElement(name = "OPERATION", required = true)
    protected String operation;

    /**
     * 获取basitemservicerangeid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASITEMSERVICERANGEID() {
        return basitemservicerangeid;
    }

    /**
     * 设置basitemservicerangeid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASITEMSERVICERANGEID(String value) {
        this.basitemservicerangeid = value;
    }

    /**
     * 获取createtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATETIME() {
        return createtime;
    }

    /**
     * 设置createtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATETIME(String value) {
        this.createtime = value;
    }

    /**
     * 获取creator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATOR() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATOR(String value) {
        this.creator = value;
    }

    /**
     * 获取custcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTCODE() {
        return custcode;
    }

    /**
     * 设置custcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTCODE(String value) {
        this.custcode = value;
    }

    /**
     * 获取custname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNAME() {
        return custname;
    }

    /**
     * 设置custname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNAME(String value) {
        this.custname = value;
    }

    /**
     * 获取factorycode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACTORYCODE() {
        return factorycode;
    }

    /**
     * 设置factorycode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACTORYCODE(String value) {
        this.factorycode = value;
    }

    /**
     * 获取isqualitybefore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISQUALITYBEFORE() {
        return isqualitybefore;
    }

    /**
     * 设置isqualitybefore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISQUALITYBEFORE(String value) {
        this.isqualitybefore = value;
    }

    /**
     * 获取itemcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCODE() {
        return itemcode;
    }

    /**
     * 设置itemcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCODE(String value) {
        this.itemcode = value;
    }

    /**
     * 获取itemname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMNAME() {
        return itemname;
    }

    /**
     * 设置itemname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMNAME(String value) {
        this.itemname = value;
    }

    /**
     * 获取lastmodifyor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTMODIFYOR() {
        return lastmodifyor;
    }

    /**
     * 设置lastmodifyor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTMODIFYOR(String value) {
        this.lastmodifyor = value;
    }

    /**
     * 获取lastmodifytime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTMODIFYTIME() {
        return lastmodifytime;
    }

    /**
     * 设置lastmodifytime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTMODIFYTIME(String value) {
        this.lastmodifytime = value;
    }

    /**
     * 获取projectcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROJECTCODE() {
        return projectcode;
    }

    /**
     * 设置projectcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROJECTCODE(String value) {
        this.projectcode = value;
    }

    /**
     * 获取projectname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROJECTNAME() {
        return projectname;
    }

    /**
     * 设置projectname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROJECTNAME(String value) {
        this.projectname = value;
    }

    /**
     * 获取servicemode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICEMODE() {
        return servicemode;
    }

    /**
     * 设置servicemode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICEMODE(String value) {
        this.servicemode = value;
    }

    /**
     * 获取supplierscode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERSCODE() {
        return supplierscode;
    }

    /**
     * 设置supplierscode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERSCODE(String value) {
        this.supplierscode = value;
    }

    /**
     * 获取suppliersname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERSNAME() {
        return suppliersname;
    }

    /**
     * 设置suppliersname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERSNAME(String value) {
        this.suppliersname = value;
    }

    /**
     * 获取operation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATION() {
        return operation;
    }

    /**
     * 设置operation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATION(String value) {
        this.operation = value;
    }

}
