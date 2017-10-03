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
 * <p>Java class for RecycledInformationBreakdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecycledInformationBreakdownType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasRecycledContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="recycledPercentage" type="{http://eai.officedepot.com/model/ODCommon}PercentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecycledInformationBreakdownType", namespace = "http://eai.officedepot.com/model/Inventory", propOrder = {
    "hasRecycledContent",
    "recycledPercentage"
})
public class RecycledInformationBreakdownType {

    protected Boolean hasRecycledContent;
    protected Double recycledPercentage;

    /**
     * Gets the value of the hasRecycledContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRecycledContent() {
        return hasRecycledContent;
    }

    /**
     * Sets the value of the hasRecycledContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRecycledContent(Boolean value) {
        this.hasRecycledContent = value;
    }

    /**
     * Gets the value of the recycledPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecycledPercentage() {
        return recycledPercentage;
    }

    /**
     * Sets the value of the recycledPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecycledPercentage(Double value) {
        this.recycledPercentage = value;
    }

}
