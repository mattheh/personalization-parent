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
 * <p>Java class for RecycledMaterialInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecycledMaterialInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aggregateRecycleInformation" type="{http://eai.officedepot.com/model/Inventory}RecycledInformationBreakdownType" minOccurs="0"/&gt;
 *         &lt;element name="preConsumerRecycleInformation" type="{http://eai.officedepot.com/model/Inventory}RecycledInformationBreakdownType" minOccurs="0"/&gt;
 *         &lt;element name="postConsumerRecycleInformation" type="{http://eai.officedepot.com/model/Inventory}RecycledInformationBreakdownType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecycledMaterialInformationType", namespace = "http://eai.officedepot.com/model/Inventory", propOrder = {
    "aggregateRecycleInformation",
    "preConsumerRecycleInformation",
    "postConsumerRecycleInformation"
})
public class RecycledMaterialInformationType {

    protected RecycledInformationBreakdownType aggregateRecycleInformation;
    protected RecycledInformationBreakdownType preConsumerRecycleInformation;
    protected RecycledInformationBreakdownType postConsumerRecycleInformation;

    /**
     * Gets the value of the aggregateRecycleInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RecycledInformationBreakdownType }
     *     
     */
    public RecycledInformationBreakdownType getAggregateRecycleInformation() {
        return aggregateRecycleInformation;
    }

    /**
     * Sets the value of the aggregateRecycleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecycledInformationBreakdownType }
     *     
     */
    public void setAggregateRecycleInformation(RecycledInformationBreakdownType value) {
        this.aggregateRecycleInformation = value;
    }

    /**
     * Gets the value of the preConsumerRecycleInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RecycledInformationBreakdownType }
     *     
     */
    public RecycledInformationBreakdownType getPreConsumerRecycleInformation() {
        return preConsumerRecycleInformation;
    }

    /**
     * Sets the value of the preConsumerRecycleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecycledInformationBreakdownType }
     *     
     */
    public void setPreConsumerRecycleInformation(RecycledInformationBreakdownType value) {
        this.preConsumerRecycleInformation = value;
    }

    /**
     * Gets the value of the postConsumerRecycleInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RecycledInformationBreakdownType }
     *     
     */
    public RecycledInformationBreakdownType getPostConsumerRecycleInformation() {
        return postConsumerRecycleInformation;
    }

    /**
     * Sets the value of the postConsumerRecycleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecycledInformationBreakdownType }
     *     
     */
    public void setPostConsumerRecycleInformation(RecycledInformationBreakdownType value) {
        this.postConsumerRecycleInformation = value;
    }

}