//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 10:48:26 AM CDT 
//


package com.officedepot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Product Sub Class Lookup Result
 * 			
 * 
 * <p>Java class for ProductSubClassLookupResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSubClassLookupResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="subClass" type="{http://eai.officedepot.com/model/Inventory}SkuSubClassDetailType" minOccurs="0"/&gt;
 *           &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSubClassLookupResultType", namespace = "http://eai.officedepot.com/service/ProductHierarchyService", propOrder = {
    "subClassCode",
    "subClass",
    "errorMessage"
})
public class ProductSubClassLookupResultType {

    protected String subClassCode;
    protected SkuSubClassDetailType subClass;
    protected String errorMessage;

    /**
     * Gets the value of the subClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClassCode() {
        return subClassCode;
    }

    /**
     * Sets the value of the subClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClassCode(String value) {
        this.subClassCode = value;
    }

    /**
     * Gets the value of the subClass property.
     * 
     * @return
     *     possible object is
     *     {@link SkuSubClassDetailType }
     *     
     */
    public SkuSubClassDetailType getSubClass() {
        return subClass;
    }

    /**
     * Sets the value of the subClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkuSubClassDetailType }
     *     
     */
    public void setSubClass(SkuSubClassDetailType value) {
        this.subClass = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
