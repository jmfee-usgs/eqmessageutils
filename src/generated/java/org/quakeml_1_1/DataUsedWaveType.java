//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.21 at 09:51:51 AM MDT 
//


package org.quakeml_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataUsedWaveType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataUsedWaveType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="body waves"/&gt;
 *     &lt;enumeration value="P body waves"/&gt;
 *     &lt;enumeration value="long-period body waves"/&gt;
 *     &lt;enumeration value="surface waves"/&gt;
 *     &lt;enumeration value="intermediate-period surface waves"/&gt;
 *     &lt;enumeration value="long-period mantle waves"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataUsedWaveType")
@XmlEnum
public enum DataUsedWaveType {

    @XmlEnumValue("body waves")
    BODY_WAVES("body waves"),
    @XmlEnumValue("P body waves")
    P_BODY_WAVES("P body waves"),
    @XmlEnumValue("long-period body waves")
    LONG_PERIOD_BODY_WAVES("long-period body waves"),
    @XmlEnumValue("surface waves")
    SURFACE_WAVES("surface waves"),
    @XmlEnumValue("intermediate-period surface waves")
    INTERMEDIATE_PERIOD_SURFACE_WAVES("intermediate-period surface waves"),
    @XmlEnumValue("long-period mantle waves")
    LONG_PERIOD_MANTLE_WAVES("long-period mantle waves"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DataUsedWaveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataUsedWaveType fromValue(String v) {
        for (DataUsedWaveType c: DataUsedWaveType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
