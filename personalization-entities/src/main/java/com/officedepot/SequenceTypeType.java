//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 10:48:26 AM CDT 
//


package com.officedepot;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequenceTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SequenceTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILLING_ADDRESS"/&gt;
 *     &lt;enumeration value="MAILING_ADDRESS"/&gt;
 *     &lt;enumeration value="SHIPPING_ADDRESS"/&gt;
 *     &lt;enumeration value="CONTACT"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="PHONE"/&gt;
 *     &lt;enumeration value="ADDRESS"/&gt;
 *     &lt;enumeration value="USER"/&gt;
 *     &lt;enumeration value="DEFAULT_BILLING_ADDRESS"/&gt;
 *     &lt;enumeration value="DEFAULT_SHIPPING_ADDRESS"/&gt;
 *     &lt;enumeration value="DEFAULT_MAILING_ADDRESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SequenceTypeType")
@XmlEnum
public enum SequenceTypeType {

    BILLING_ADDRESS,
    MAILING_ADDRESS,
    SHIPPING_ADDRESS,
    CONTACT,
    EMAIL,
    PHONE,
    ADDRESS,
    USER,
    DEFAULT_BILLING_ADDRESS,
    DEFAULT_SHIPPING_ADDRESS,
    DEFAULT_MAILING_ADDRESS;

    public String value() {
        return name();
    }

    public static SequenceTypeType fromValue(String v) {
        return valueOf(v);
    }

}