//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.21 at 09:51:51 AM MDT 
//


package org.quakeml_1_1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OriginQuality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginQuality"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associatedPhaseCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="usedPhaseCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="asociatedStationCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="usedStationCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="depthPhaseCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="standardError" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="azimuthalGap" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="secondaryAzimuthalGap" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="groundTruthLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maximumDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minimumDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="medianDistance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginQuality", propOrder = {
    "associatedPhaseCount",
    "usedPhaseCount",
    "asociatedStationCount",
    "usedStationCount",
    "depthPhaseCount",
    "standardError",
    "azimuthalGap",
    "secondaryAzimuthalGap",
    "groundTruthLevel",
    "maximumDistance",
    "minimumDistance",
    "medianDistance"
})
public class OriginQuality {

    protected BigInteger associatedPhaseCount;
    protected BigInteger usedPhaseCount;
    protected BigInteger asociatedStationCount;
    protected BigInteger usedStationCount;
    protected BigInteger depthPhaseCount;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal standardError;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal azimuthalGap;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal secondaryAzimuthalGap;
    protected String groundTruthLevel;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal maximumDistance;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal minimumDistance;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal medianDistance;

    /**
     * Gets the value of the associatedPhaseCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssociatedPhaseCount() {
        return associatedPhaseCount;
    }

    /**
     * Sets the value of the associatedPhaseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssociatedPhaseCount(BigInteger value) {
        this.associatedPhaseCount = value;
    }

    /**
     * Gets the value of the usedPhaseCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedPhaseCount() {
        return usedPhaseCount;
    }

    /**
     * Sets the value of the usedPhaseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedPhaseCount(BigInteger value) {
        this.usedPhaseCount = value;
    }

    /**
     * Gets the value of the asociatedStationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAsociatedStationCount() {
        return asociatedStationCount;
    }

    /**
     * Sets the value of the asociatedStationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAsociatedStationCount(BigInteger value) {
        this.asociatedStationCount = value;
    }

    /**
     * Gets the value of the usedStationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedStationCount() {
        return usedStationCount;
    }

    /**
     * Sets the value of the usedStationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedStationCount(BigInteger value) {
        this.usedStationCount = value;
    }

    /**
     * Gets the value of the depthPhaseCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepthPhaseCount() {
        return depthPhaseCount;
    }

    /**
     * Sets the value of the depthPhaseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepthPhaseCount(BigInteger value) {
        this.depthPhaseCount = value;
    }

    /**
     * Gets the value of the standardError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getStandardError() {
        return standardError;
    }

    /**
     * Sets the value of the standardError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardError(BigDecimal value) {
        this.standardError = value;
    }

    /**
     * Gets the value of the azimuthalGap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAzimuthalGap() {
        return azimuthalGap;
    }

    /**
     * Sets the value of the azimuthalGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzimuthalGap(BigDecimal value) {
        this.azimuthalGap = value;
    }

    /**
     * Gets the value of the secondaryAzimuthalGap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getSecondaryAzimuthalGap() {
        return secondaryAzimuthalGap;
    }

    /**
     * Sets the value of the secondaryAzimuthalGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryAzimuthalGap(BigDecimal value) {
        this.secondaryAzimuthalGap = value;
    }

    /**
     * Gets the value of the groundTruthLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundTruthLevel() {
        return groundTruthLevel;
    }

    /**
     * Sets the value of the groundTruthLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundTruthLevel(String value) {
        this.groundTruthLevel = value;
    }

    /**
     * Gets the value of the maximumDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMaximumDistance() {
        return maximumDistance;
    }

    /**
     * Sets the value of the maximumDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumDistance(BigDecimal value) {
        this.maximumDistance = value;
    }

    /**
     * Gets the value of the minimumDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMinimumDistance() {
        return minimumDistance;
    }

    /**
     * Sets the value of the minimumDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumDistance(BigDecimal value) {
        this.minimumDistance = value;
    }

    /**
     * Gets the value of the medianDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMedianDistance() {
        return medianDistance;
    }

    /**
     * Sets the value of the medianDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedianDistance(BigDecimal value) {
        this.medianDistance = value;
    }

}
