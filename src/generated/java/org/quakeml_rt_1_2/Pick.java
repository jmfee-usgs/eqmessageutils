//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.21 at 09:51:58 AM MDT 
//


package org.quakeml_rt_1_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for Pick complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pick"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://quakeml.org/xmlns/bed-rt/1.2}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://quakeml.org/xmlns/bed-rt/1.2}TimeQuantity"/&gt;
 *         &lt;element name="waveformID" type="{http://quakeml.org/xmlns/bed-rt/1.2}WaveformStreamID"/&gt;
 *         &lt;element name="filterID" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="methodID" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="horizontalSlowness" type="{http://quakeml.org/xmlns/bed-rt/1.2}RealQuantity" minOccurs="0"/&gt;
 *         &lt;element name="backazimuth" type="{http://quakeml.org/xmlns/bed-rt/1.2}RealQuantity" minOccurs="0"/&gt;
 *         &lt;element name="slownessMethodID" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="onset" type="{http://quakeml.org/xmlns/bed-rt/1.2}PickOnset" minOccurs="0"/&gt;
 *         &lt;element name="phaseHint" type="{http://quakeml.org/xmlns/bed-rt/1.2}Phase" minOccurs="0"/&gt;
 *         &lt;element name="polarity" type="{http://quakeml.org/xmlns/bed-rt/1.2}PickPolarity" minOccurs="0"/&gt;
 *         &lt;element name="evaluationMode" type="{http://quakeml.org/xmlns/bed-rt/1.2}EvaluationMode" minOccurs="0"/&gt;
 *         &lt;element name="evaluationStatus" type="{http://quakeml.org/xmlns/bed-rt/1.2}EvaluationStatus" minOccurs="0"/&gt;
 *         &lt;element name="creationInfo" type="{http://quakeml.org/xmlns/bed-rt/1.2}CreationInfo" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="publicID" use="required" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pick", propOrder = {
    "comments",
    "time",
    "waveformID",
    "filterID",
    "methodID",
    "horizontalSlowness",
    "backazimuth",
    "slownessMethodID",
    "onset",
    "phaseHint",
    "polarity",
    "evaluationMode",
    "evaluationStatus",
    "creationInfo",
    "anies"
})
public class Pick {

    @XmlElement(name = "comment")
    protected List<Comment> comments;
    @XmlElement(required = true)
    protected TimeQuantity time;
    @XmlElement(required = true)
    protected WaveformStreamID waveformID;
    @XmlSchemaType(name = "anyURI")
    protected String filterID;
    @XmlSchemaType(name = "anyURI")
    protected String methodID;
    protected RealQuantity horizontalSlowness;
    protected RealQuantity backazimuth;
    @XmlSchemaType(name = "anyURI")
    protected String slownessMethodID;
    @XmlSchemaType(name = "string")
    protected PickOnset onset;
    protected Phase phaseHint;
    @XmlSchemaType(name = "string")
    protected PickPolarity polarity;
    @XmlSchemaType(name = "string")
    protected EvaluationMode evaluationMode;
    @XmlSchemaType(name = "string")
    protected EvaluationStatus evaluationStatus;
    protected CreationInfo creationInfo;
    @XmlAnyElement
    protected List<Element> anies;
    @XmlAttribute(name = "publicID", required = true)
    protected String publicID;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComments() {
        if (comments == null) {
            comments = new ArrayList<Comment>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link TimeQuantity }
     *     
     */
    public TimeQuantity getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeQuantity }
     *     
     */
    public void setTime(TimeQuantity value) {
        this.time = value;
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
     * Gets the value of the filterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterID() {
        return filterID;
    }

    /**
     * Sets the value of the filterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterID(String value) {
        this.filterID = value;
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
     * Gets the value of the horizontalSlowness property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getHorizontalSlowness() {
        return horizontalSlowness;
    }

    /**
     * Sets the value of the horizontalSlowness property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setHorizontalSlowness(RealQuantity value) {
        this.horizontalSlowness = value;
    }

    /**
     * Gets the value of the backazimuth property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getBackazimuth() {
        return backazimuth;
    }

    /**
     * Sets the value of the backazimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setBackazimuth(RealQuantity value) {
        this.backazimuth = value;
    }

    /**
     * Gets the value of the slownessMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlownessMethodID() {
        return slownessMethodID;
    }

    /**
     * Sets the value of the slownessMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlownessMethodID(String value) {
        this.slownessMethodID = value;
    }

    /**
     * Gets the value of the onset property.
     * 
     * @return
     *     possible object is
     *     {@link PickOnset }
     *     
     */
    public PickOnset getOnset() {
        return onset;
    }

    /**
     * Sets the value of the onset property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickOnset }
     *     
     */
    public void setOnset(PickOnset value) {
        this.onset = value;
    }

    /**
     * Gets the value of the phaseHint property.
     * 
     * @return
     *     possible object is
     *     {@link Phase }
     *     
     */
    public Phase getPhaseHint() {
        return phaseHint;
    }

    /**
     * Sets the value of the phaseHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phase }
     *     
     */
    public void setPhaseHint(Phase value) {
        this.phaseHint = value;
    }

    /**
     * Gets the value of the polarity property.
     * 
     * @return
     *     possible object is
     *     {@link PickPolarity }
     *     
     */
    public PickPolarity getPolarity() {
        return polarity;
    }

    /**
     * Sets the value of the polarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickPolarity }
     *     
     */
    public void setPolarity(PickPolarity value) {
        this.polarity = value;
    }

    /**
     * Gets the value of the evaluationMode property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationMode }
     *     
     */
    public EvaluationMode getEvaluationMode() {
        return evaluationMode;
    }

    /**
     * Sets the value of the evaluationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationMode }
     *     
     */
    public void setEvaluationMode(EvaluationMode value) {
        this.evaluationMode = value;
    }

    /**
     * Gets the value of the evaluationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationStatus }
     *     
     */
    public EvaluationStatus getEvaluationStatus() {
        return evaluationStatus;
    }

    /**
     * Sets the value of the evaluationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationStatus }
     *     
     */
    public void setEvaluationStatus(EvaluationStatus value) {
        this.evaluationStatus = value;
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
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Element>();
        }
        return this.anies;
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

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
