//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 11:56:10 AM MST 
//


package org.quakeml_1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalAxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalAxes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tAxis" type="{http://quakeml.org/xmlns/quakeml/1.1}Axis"/&gt;
 *         &lt;element name="pAxis" type="{http://quakeml.org/xmlns/quakeml/1.1}Axis"/&gt;
 *         &lt;element name="nAxis" type="{http://quakeml.org/xmlns/quakeml/1.1}Axis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAxes", propOrder = {
    "tAxis",
    "pAxis",
    "nAxis"
})
public class PrincipalAxes {

    @XmlElement(required = true)
    protected Axis tAxis;
    @XmlElement(required = true)
    protected Axis pAxis;
    protected Axis nAxis;

    /**
     * Gets the value of the tAxis property.
     * 
     * @return
     *     possible object is
     *     {@link Axis }
     *     
     */
    public Axis getTAxis() {
        return tAxis;
    }

    /**
     * Sets the value of the tAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Axis }
     *     
     */
    public void setTAxis(Axis value) {
        this.tAxis = value;
    }

    /**
     * Gets the value of the pAxis property.
     * 
     * @return
     *     possible object is
     *     {@link Axis }
     *     
     */
    public Axis getPAxis() {
        return pAxis;
    }

    /**
     * Sets the value of the pAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Axis }
     *     
     */
    public void setPAxis(Axis value) {
        this.pAxis = value;
    }

    /**
     * Gets the value of the nAxis property.
     * 
     * @return
     *     possible object is
     *     {@link Axis }
     *     
     */
    public Axis getNAxis() {
        return nAxis;
    }

    /**
     * Sets the value of the nAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Axis }
     *     
     */
    public void setNAxis(Axis value) {
        this.nAxis = value;
    }

}
