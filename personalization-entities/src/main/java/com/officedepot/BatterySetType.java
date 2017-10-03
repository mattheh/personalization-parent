//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 10:48:26 AM CDT 
//


package com.officedepot;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatterySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatterySetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batterySize" type="{http://eai.officedepot.com/model/ODCommon}BatterySizesType" minOccurs="0"/&gt;
 *         &lt;element name="quantityRequired" type="{http://eai.officedepot.com/model/ODCommon}QuantityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatterySetType", propOrder = {
    "batterySize",
    "quantityRequired"
})
public class BatterySetType {

    protected String batterySize;
    protected BigInteger quantityRequired;

    /**
     * Gets the value of the batterySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatterySize() {
        return batterySize;
    }

    /**
     * Sets the value of the batterySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatterySize(String value) {
        this.batterySize = value;
    }

    /**
     * Gets the value of the quantityRequired property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityRequired() {
        return quantityRequired;
    }

    /**
     * Sets the value of the quantityRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityRequired(BigInteger value) {
        this.quantityRequired = value;
    }

}
