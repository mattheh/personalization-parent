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
 * an individual or company associated with an address
 * 
 * <p>Java class for DeliveryNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryName1" type="{http://eai.officedepot.com/model/ODCommon}DeliveryNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="deliveryName2" type="{http://eai.officedepot.com/model/ODCommon}DeliveryNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="deliveryName3" type="{http://eai.officedepot.com/model/ODCommon}DeliveryNameSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryNameType", propOrder = {
    "deliveryName1",
    "deliveryName2",
    "deliveryName3"
})
public class DeliveryNameType {

    protected String deliveryName1;
    protected String deliveryName2;
    protected String deliveryName3;

    /**
     * Gets the value of the deliveryName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryName1() {
        return deliveryName1;
    }

    /**
     * Sets the value of the deliveryName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryName1(String value) {
        this.deliveryName1 = value;
    }

    /**
     * Gets the value of the deliveryName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryName2() {
        return deliveryName2;
    }

    /**
     * Sets the value of the deliveryName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryName2(String value) {
        this.deliveryName2 = value;
    }

    /**
     * Gets the value of the deliveryName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryName3() {
        return deliveryName3;
    }

    /**
     * Sets the value of the deliveryName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryName3(String value) {
        this.deliveryName3 = value;
    }

}
