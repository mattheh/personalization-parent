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
 * <p>Java class for SkuUPCPackageTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkuUPCPackageTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="INNER"/&gt;
 *     &lt;enumeration value="MASTER"/&gt;
 *     &lt;enumeration value="PALLET"/&gt;
 *     &lt;enumeration value="TIER"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SkuUPCPackageTypeType", namespace = "http://eai.officedepot.com/model/Inventory")
@XmlEnum
public enum SkuUPCPackageTypeType {

    SELL,
    INNER,
    MASTER,
    PALLET,
    TIER,
    OTHER;

    public String value() {
        return name();
    }

    public static SkuUPCPackageTypeType fromValue(String v) {
        return valueOf(v);
    }

}
