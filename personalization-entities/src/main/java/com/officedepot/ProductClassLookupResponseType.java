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
 * 
 * 				Product Class Lookup Response
 * 			
 * 
 * <p>Java class for ProductClassLookupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductClassLookupResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.officedepot.com/model/transaction}transactionHeader"/&gt;
 *         &lt;element name="results" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="classes" type="{http://eai.officedepot.com/service/ProductHierarchyService}ProductClassLookupResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="resultSummary" type="{http://eai.officedepot.com/model/ODCommon}BaseLookupResultSummaryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductClassLookupResponseType", namespace = "http://eai.officedepot.com/service/ProductHierarchyService", propOrder = {
    "transactionHeader",
    "results",
    "resultSummary"
})
public class ProductClassLookupResponseType {

    @XmlElement(namespace = "http://www.officedepot.com/model/transaction", required = true)
    protected InternalTransactionHeaderWithHistoryType transactionHeader;
    protected ProductClassLookupResponseType.Results results;
    protected BaseLookupResultSummaryType resultSummary;

    /**
     * Gets the value of the transactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InternalTransactionHeaderWithHistoryType }
     *     
     */
    public InternalTransactionHeaderWithHistoryType getTransactionHeader() {
        return transactionHeader;
    }

    /**
     * Sets the value of the transactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalTransactionHeaderWithHistoryType }
     *     
     */
    public void setTransactionHeader(InternalTransactionHeaderWithHistoryType value) {
        this.transactionHeader = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassLookupResponseType.Results }
     *     
     */
    public ProductClassLookupResponseType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassLookupResponseType.Results }
     *     
     */
    public void setResults(ProductClassLookupResponseType.Results value) {
        this.results = value;
    }

    /**
     * Gets the value of the resultSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BaseLookupResultSummaryType }
     *     
     */
    public BaseLookupResultSummaryType getResultSummary() {
        return resultSummary;
    }

    /**
     * Sets the value of the resultSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseLookupResultSummaryType }
     *     
     */
    public void setResultSummary(BaseLookupResultSummaryType value) {
        this.resultSummary = value;
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
     *         &lt;element name="classes" type="{http://eai.officedepot.com/service/ProductHierarchyService}ProductClassLookupResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "classes"
    })
    public static class Results {

        @XmlElement(namespace = "http://eai.officedepot.com/service/ProductHierarchyService")
        protected List<ProductClassLookupResultType> classes;

        /**
         * Gets the value of the classes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClasses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductClassLookupResultType }
         * 
         * 
         */
        public List<ProductClassLookupResultType> getClasses() {
            if (classes == null) {
                classes = new ArrayList<ProductClassLookupResultType>();
            }
            return this.classes;
        }

    }

}
