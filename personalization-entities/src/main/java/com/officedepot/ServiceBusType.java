//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 10:48:26 AM CDT 
//


package com.officedepot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is information about the transaction that is
 * 				only populated by the ESB.
 * 
 * <p>Java class for ServiceBusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correlationID" type="{http://www.officedepot.com/model/transaction}CorrelationIDType" minOccurs="0"/&gt;
 *         &lt;element name="timeReceived" type="{http://www.officedepot.com/model/transaction}MessageDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="service" type="{http://www.officedepot.com/model/transaction}ServiceType"/&gt;
 *         &lt;element name="document" type="{http://www.officedepot.com/model/transaction}TransactionDocumentType"/&gt;
 *         &lt;element name="routing" type="{http://www.officedepot.com/model/transaction}RoutingType" minOccurs="0"/&gt;
 *         &lt;element name="invocation" type="{http://www.officedepot.com/model/transaction}InvocationType" minOccurs="0"/&gt;
 *         &lt;element name="security" type="{http://www.officedepot.com/model/transaction}SecurityType" minOccurs="0"/&gt;
 *         &lt;element name="environment" type="{http://www.officedepot.com/model/transaction}EnvironmentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBusType", namespace = "http://www.officedepot.com/model/transaction", propOrder = {
    "correlationID",
    "timeReceived",
    "service",
    "document",
    "routing",
    "invocation",
    "security",
    "environment"
})
@XmlSeeAlso({
    ServiceBusHistoryType.class
})
public class ServiceBusType {

    protected String correlationID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeReceived;
    @XmlElement(required = true)
    protected ServiceType service;
    @XmlElement(required = true)
    protected TransactionDocumentType document;
    protected RoutingType routing;
    protected InvocationType invocation;
    protected SecurityType security;
    protected EnvironmentType environment;

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the timeReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeReceived() {
        return timeReceived;
    }

    /**
     * Sets the value of the timeReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeReceived(XMLGregorianCalendar value) {
        this.timeReceived = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDocumentType }
     *     
     */
    public TransactionDocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDocumentType }
     *     
     */
    public void setDocument(TransactionDocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingType }
     *     
     */
    public RoutingType getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingType }
     *     
     */
    public void setRouting(RoutingType value) {
        this.routing = value;
    }

    /**
     * Gets the value of the invocation property.
     * 
     * @return
     *     possible object is
     *     {@link InvocationType }
     *     
     */
    public InvocationType getInvocation() {
        return invocation;
    }

    /**
     * Sets the value of the invocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvocationType }
     *     
     */
    public void setInvocation(InvocationType value) {
        this.invocation = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityType }
     *     
     */
    public SecurityType getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityType }
     *     
     */
    public void setSecurity(SecurityType value) {
        this.security = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentType }
     *     
     */
    public EnvironmentType getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentType }
     *     
     */
    public void setEnvironment(EnvironmentType value) {
        this.environment = value;
    }

}