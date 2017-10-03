//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 10:48:26 AM CDT 
//


package com.officedepot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionCountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionCountryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryCode" type="{http://eai.officedepot.com/model/ODCommon}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="countrySpecificPhysicalAttributesList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="countrySpecificPhysicalAttributes" type="{http://eai.officedepot.com/model/Inventory}SkuUPCPhysicalAttributesType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionCountryType", namespace = "http://eai.officedepot.com/model/Supplier", propOrder = {
    "countryCode",
    "countrySpecificPhysicalAttributesList"
})
public class DistributionCountryType {

    protected String countryCode;
    protected DistributionCountryType.CountrySpecificPhysicalAttributesList countrySpecificPhysicalAttributesList;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countrySpecificPhysicalAttributesList property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionCountryType.CountrySpecificPhysicalAttributesList }
     *     
     */
    public DistributionCountryType.CountrySpecificPhysicalAttributesList getCountrySpecificPhysicalAttributesList() {
        return countrySpecificPhysicalAttributesList;
    }

    /**
     * Sets the value of the countrySpecificPhysicalAttributesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionCountryType.CountrySpecificPhysicalAttributesList }
     *     
     */
    public void setCountrySpecificPhysicalAttributesList(DistributionCountryType.CountrySpecificPhysicalAttributesList value) {
        this.countrySpecificPhysicalAttributesList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="countrySpecificPhysicalAttributes" type="{http://eai.officedepot.com/model/Inventory}SkuUPCPhysicalAttributesType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "countrySpecificPhysicalAttributes"
    })
    public static class CountrySpecificPhysicalAttributesList {

        @XmlElement(namespace = "http://eai.officedepot.com/model/Supplier", required = true)
        protected List<SkuUPCPhysicalAttributesType> countrySpecificPhysicalAttributes;

        /**
         * Gets the value of the countrySpecificPhysicalAttributes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countrySpecificPhysicalAttributes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountrySpecificPhysicalAttributes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SkuUPCPhysicalAttributesType }
         * 
         * 
         */
        public List<SkuUPCPhysicalAttributesType> getCountrySpecificPhysicalAttributes() {
            if (countrySpecificPhysicalAttributes == null) {
                countrySpecificPhysicalAttributes = new ArrayList<SkuUPCPhysicalAttributesType>();
            }
            return this.countrySpecificPhysicalAttributes;
        }

    }

}
