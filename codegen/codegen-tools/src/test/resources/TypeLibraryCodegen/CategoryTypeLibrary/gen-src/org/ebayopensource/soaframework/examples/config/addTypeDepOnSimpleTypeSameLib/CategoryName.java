//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.14 at 11:51:19 PM IST 
//


package org.ebayopensource.soaframework.examples.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="Off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CategoryName")
@XmlEnum
public enum CategoryName {

    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    CategoryName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryName fromValue(String v) {
        for (CategoryName c: CategoryName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
