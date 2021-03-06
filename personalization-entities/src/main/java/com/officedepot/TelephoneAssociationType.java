//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 10:48:26 AM CDT 
//


package com.officedepot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phoneType" type="{http://eai.officedepot.com/model/ODCommon}TelephoneNumberTypeType" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://eai.officedepot.com/model/ODCommon}TelephoneNumberType" minOccurs="0"/&gt;
 *         &lt;element name="isPrimary" type="{http://eai.officedepot.com/model/ODCommon}IsPrimaryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneAssociationType", propOrder = {
    "phoneType",
    "phone",
    "isPrimary"
})
public class TelephoneAssociationType {

    @XmlSchemaType(name = "token")
    protected TelephoneNumberTypeType phoneType;
    protected TelephoneNumberType phone;
    protected Boolean isPrimary;

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberTypeType }
     *     
     */
    public TelephoneNumberTypeType getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberTypeType }
     *     
     */
    public void setPhoneType(TelephoneNumberTypeType value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberType }
     *     
     */
    public TelephoneNumberType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberType }
     *     
     */
    public void setPhone(TelephoneNumberType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

}
