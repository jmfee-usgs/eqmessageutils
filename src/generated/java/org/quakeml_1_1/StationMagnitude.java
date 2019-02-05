//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 11:56:10 AM MST 
//


package org.quakeml_1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StationMagnitude complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationMagnitude"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="originID" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference"/&gt;
 *           &lt;element name="mag" type="{http://quakeml.org/xmlns/quakeml/1.1}RealQuantity"/&gt;
 *           &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="amplitudeID" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference" minOccurs="0"/&gt;
 *           &lt;element name="methodID" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference" minOccurs="0"/&gt;
 *           &lt;element name="waveformID" type="{http://quakeml.org/xmlns/quakeml/1.1}WaveformStreamID" minOccurs="0"/&gt;
 *           &lt;element name="creationInfo" type="{http://quakeml.org/xmlns/quakeml/1.1}CreationInfo" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="comment" type="{http://quakeml.org/xmlns/quakeml/1.1}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="publicID" use="required" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationMagnitude", propOrder = {
    "originID",
    "mag",
    "type",
    "amplitudeID",
    "methodID",
    "waveformID",
    "creationInfo",
    "comment"
})
public class StationMagnitude {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String originID;
    @XmlElement(required = true)
    protected RealQuantity mag;
    protected String type;
    @XmlSchemaType(name = "anyURI")
    protected String amplitudeID;
    @XmlSchemaType(name = "anyURI")
    protected String methodID;
    protected WaveformStreamID waveformID;
    protected CreationInfo creationInfo;
    protected List<Comment> comment;
    @XmlAttribute(name = "publicID", required = true)
    protected String publicID;

    /**
     * Gets the value of the originID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginID() {
        return originID;
    }

    /**
     * Sets the value of the originID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginID(String value) {
        this.originID = value;
    }

    /**
     * Gets the value of the mag property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getMag() {
        return mag;
    }

    /**
     * Sets the value of the mag property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setMag(RealQuantity value) {
        this.mag = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the amplitudeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmplitudeID() {
        return amplitudeID;
    }

    /**
     * Sets the value of the amplitudeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmplitudeID(String value) {
        this.amplitudeID = value;
    }

    /**
     * Gets the value of the methodID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodID() {
        return methodID;
    }

    /**
     * Sets the value of the methodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodID(String value) {
        this.methodID = value;
    }

    /**
     * Gets the value of the waveformID property.
     * 
     * @return
     *     possible object is
     *     {@link WaveformStreamID }
     *     
     */
    public WaveformStreamID getWaveformID() {
        return waveformID;
    }

    /**
     * Sets the value of the waveformID property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaveformStreamID }
     *     
     */
    public void setWaveformID(WaveformStreamID value) {
        this.waveformID = value;
    }

    /**
     * Gets the value of the creationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreationInfo }
     *     
     */
    public CreationInfo getCreationInfo() {
        return creationInfo;
    }

    /**
     * Sets the value of the creationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreationInfo }
     *     
     */
    public void setCreationInfo(CreationInfo value) {
        this.creationInfo = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the publicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicID() {
        return publicID;
    }

    /**
     * Sets the value of the publicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicID(String value) {
        this.publicID = value;
    }

}
