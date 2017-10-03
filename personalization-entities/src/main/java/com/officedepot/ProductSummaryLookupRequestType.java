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
 * 				Product Summary Lookup Request
 * 			
 * 
 * <p>Java class for ProductSummaryLookupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSummaryLookupRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.officedepot.com/model/transaction}transactionHeader"/&gt;
 *         &lt;element name="productCodes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ProductSummaryLookupRequestType", namespace = "http://eai.officedepot.com/service/ProductHierarchyService", propOrder = {
    "transactionHeader",
    "productCodes"
})
public class ProductSummaryLookupRequestType {

    @XmlElement(namespace = "http://www.officedepot.com/model/transaction", required = true)
    protected InternalTransactionHeaderWithHistoryType transactionHeader;
    @XmlElement(required = true)
    protected ProductSummaryLookupRequestType.ProductCodes productCodes;

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
     * Gets the value of the productCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSummaryLookupRequestType.ProductCodes }
     *     
     */
    public ProductSummaryLookupRequestType.ProductCodes getProductCodes() {
        return productCodes;
    }

    /**
     * Sets the value of the productCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSummaryLookupRequestType.ProductCodes }
     *     
     */
    public void setProductCodes(ProductSummaryLookupRequestType.ProductCodes value) {
        this.productCodes = value;
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
     *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "productCode"
    })
    public static class ProductCodes {

        @XmlElement(namespace = "http://eai.officedepot.com/service/ProductHierarchyService", required = true)
        protected List<String> productCode;

        /**
         * Gets the value of the productCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getProductCode() {
            if (productCode == null) {
                productCode = new ArrayList<String>();
            }
            return this.productCode;
        }

    }

}