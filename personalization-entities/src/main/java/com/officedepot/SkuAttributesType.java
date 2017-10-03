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
 * If the item is poisonous/toxic etc
 * 				Alphanumeric industry Standard Codes
 * 
 * <p>Java class for SkuAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkuAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fireCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="safetyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="demandForecastingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isImportItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isBottleDepositEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPrivateLabelItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isReadyToAssemble" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCarcinogenic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="containsHazardousMaterials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="requiresAgeVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkuAttributesType", namespace = "http://eai.officedepot.com/model/Inventory", propOrder = {
    "fireCode",
    "safetyCode",
    "demandForecastingCode",
    "isImportItem",
    "isBottleDepositEligible",
    "isPrivateLabelItem",
    "isReadyToAssemble",
    "isCarcinogenic",
    "containsHazardousMaterials",
    "requiresAgeVerification"
})
public class SkuAttributesType {

    protected String fireCode;
    protected String safetyCode;
    protected String demandForecastingCode;
    protected Boolean isImportItem;
    protected Boolean isBottleDepositEligible;
    protected Boolean isPrivateLabelItem;
    protected Boolean isReadyToAssemble;
    protected Boolean isCarcinogenic;
    protected Boolean containsHazardousMaterials;
    protected Boolean requiresAgeVerification;

    /**
     * Gets the value of the fireCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFireCode() {
        return fireCode;
    }

    /**
     * Sets the value of the fireCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFireCode(String value) {
        this.fireCode = value;
    }

    /**
     * Gets the value of the safetyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafetyCode() {
        return safetyCode;
    }

    /**
     * Sets the value of the safetyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafetyCode(String value) {
        this.safetyCode = value;
    }

    /**
     * Gets the value of the demandForecastingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandForecastingCode() {
        return demandForecastingCode;
    }

    /**
     * Sets the value of the demandForecastingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandForecastingCode(String value) {
        this.demandForecastingCode = value;
    }

    /**
     * Gets the value of the isImportItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImportItem() {
        return isImportItem;
    }

    /**
     * Sets the value of the isImportItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImportItem(Boolean value) {
        this.isImportItem = value;
    }

    /**
     * Gets the value of the isBottleDepositEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBottleDepositEligible() {
        return isBottleDepositEligible;
    }

    /**
     * Sets the value of the isBottleDepositEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBottleDepositEligible(Boolean value) {
        this.isBottleDepositEligible = value;
    }

    /**
     * Gets the value of the isPrivateLabelItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivateLabelItem() {
        return isPrivateLabelItem;
    }

    /**
     * Sets the value of the isPrivateLabelItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivateLabelItem(Boolean value) {
        this.isPrivateLabelItem = value;
    }

    /**
     * Gets the value of the isReadyToAssemble property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadyToAssemble() {
        return isReadyToAssemble;
    }

    /**
     * Sets the value of the isReadyToAssemble property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadyToAssemble(Boolean value) {
        this.isReadyToAssemble = value;
    }

    /**
     * Gets the value of the isCarcinogenic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCarcinogenic() {
        return isCarcinogenic;
    }

    /**
     * Sets the value of the isCarcinogenic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCarcinogenic(Boolean value) {
        this.isCarcinogenic = value;
    }

    /**
     * Gets the value of the containsHazardousMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsHazardousMaterials() {
        return containsHazardousMaterials;
    }

    /**
     * Sets the value of the containsHazardousMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsHazardousMaterials(Boolean value) {
        this.containsHazardousMaterials = value;
    }

    /**
     * Gets the value of the requiresAgeVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresAgeVerification() {
        return requiresAgeVerification;
    }

    /**
     * Sets the value of the requiresAgeVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresAgeVerification(Boolean value) {
        this.requiresAgeVerification = value;
    }

}
