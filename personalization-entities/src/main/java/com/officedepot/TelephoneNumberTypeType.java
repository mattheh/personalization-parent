//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 10:48:26 AM CDT 
//


package com.officedepot;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneNumberTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneNumberTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Fax"/&gt;
 *     &lt;enumeration value="Emergency 1"/&gt;
 *     &lt;enumeration value="Emergency 2"/&gt;
 *     &lt;enumeration value="Home"/&gt;
 *     &lt;enumeration value="Mobile"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Unlisted"/&gt;
 *     &lt;enumeration value="Work"/&gt;
 *     &lt;enumeration value="WPH"/&gt;
 *     &lt;enumeration value="WFX"/&gt;
 *     &lt;enumeration value="TXT"/&gt;
 *     &lt;enumeration value="HFX"/&gt;
 *     &lt;enumeration value="HMB"/&gt;
 *     &lt;enumeration value="HPG"/&gt;
 *     &lt;enumeration value="HPH"/&gt;
 *     &lt;enumeration value="WMB"/&gt;
 *     &lt;enumeration value="WPG"/&gt;
 *     &lt;enumeration value="Billing"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelephoneNumberTypeType")
@XmlEnum
public enum TelephoneNumberTypeType {

    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Emergency 1")
    EMERGENCY_1("Emergency 1"),
    @XmlEnumValue("Emergency 2")
    EMERGENCY_2("Emergency 2"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unlisted")
    UNLISTED("Unlisted"),
    @XmlEnumValue("Work")
    WORK("Work"),
    WPH("WPH"),
    WFX("WFX"),
    TXT("TXT"),
    HFX("HFX"),
    HMB("HMB"),
    HPG("HPG"),
    HPH("HPH"),
    WMB("WMB"),
    WPG("WPG"),
    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Business")
    BUSINESS("Business");
    private final String value;

    TelephoneNumberTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneNumberTypeType fromValue(String v) {
        for (TelephoneNumberTypeType c: TelephoneNumberTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
