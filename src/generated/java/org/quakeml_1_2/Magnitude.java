//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.21 at 09:51:54 AM MDT 
//


package org.quakeml_1_2;

import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for Magnitude complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Magnitude"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://quakeml.org/xmlns/bed/1.2}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stationMagnitudeContribution" type="{http://quakeml.org/xmlns/bed/1.2}StationMagnitudeContribution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mag" type="{http://quakeml.org/xmlns/bed/1.2}RealQuantity"/&gt;
 *         &lt;element name="type" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="originID" type="{http://quakeml.org/xmlns/bed/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="methodID" type="{http://quakeml.org/xmlns/bed/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="stationCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="azimuthalGap" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="evaluationMode" type="{http://quakeml.org/xmlns/bed/1.2}EvaluationMode" minOccurs="0"/&gt;
 *         &lt;element name="evaluationStatus" type="{http://quakeml.org/xmlns/bed/1.2}EvaluationStatus" minOccurs="0"/&gt;
 *         &lt;element name="creationInfo" type="{http://quakeml.org/xmlns/bed/1.2}CreationInfo" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://anss.org/xmlns/catalog/0.1}CatalogAttributes"/&gt;
 *       &lt;attribute name="publicID" use="required" type="{http://quakeml.org/xmlns/bed/1.2}ResourceReference" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Magnitude", propOrder = {
    "comments",
    "stationMagnitudeContributions",
    "mag",
    "type",
    "originID",
    "methodID",
    "stationCount",
    "azimuthalGap",
    "evaluationMode",
    "evaluationStatus",
    "creationInfo",
    "anies"
})
public class Magnitude {

    @XmlElement(name = "comment")
    protected List<Comment> comments;
    @XmlElement(name = "stationMagnitudeContribution")
    protected List<StationMagnitudeContribution> stationMagnitudeContributions;
    @XmlElement(required = true)
    protected RealQuantity mag;
    protected String type;
    @XmlSchemaType(name = "anyURI")
    protected String originID;
    @XmlSchemaType(name = "anyURI")
    protected String methodID;
    protected BigInteger stationCount;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal azimuthalGap;
    @XmlSchemaType(name = "string")
    protected EvaluationMode evaluationMode;
    @XmlSchemaType(name = "string")
    protected EvaluationStatus evaluationStatus;
    protected CreationInfo creationInfo;
    @XmlAnyElement(lax = true)
    protected List<Object> anies;
    @XmlAttribute(name = "publicID", required = true)
    protected String publicID;
    @XmlAttribute(name = "datasource", namespace = "http://anss.org/xmlns/catalog/0.1")
    protected String datasource;
    @XmlAttribute(name = "dataid", namespace = "http://anss.org/xmlns/catalog/0.1")
    protected String dataid;
    @XmlAttribute(name = "datatype", namespace = "http://anss.org/xmlns/catalog/0.1")
    protected String datatype;
    @XmlAttribute(name = "eventsource", namespace = "http://anss.org/xmlns/catalog/0.1")
    protected String eventsource;
    @XmlAttribute(name = "eventid", namespace = "http://anss.org/xmlns/catalog/0.1")
    protected String eventid;
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
     * Gets the value of the stationMagnitudeContributions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationMagnitudeContributions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationMagnitudeContributions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationMagnitudeContribution }
     * 
     * 
     */
    public List<StationMagnitudeContribution> getStationMagnitudeContributions() {
        if (stationMagnitudeContributions == null) {
            stationMagnitudeContributions = new ArrayList<StationMagnitudeContribution>();
        }
        return this.stationMagnitudeContributions;
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
     * Gets the value of the stationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStationCount() {
        return stationCount;
    }

    /**
     * Sets the value of the stationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStationCount(BigInteger value) {
        this.stationCount = value;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Object>();
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
     * Gets the value of the datasource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * Sets the value of the datasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasource(String value) {
        this.datasource = value;
    }

    /**
     * Gets the value of the dataid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataid() {
        return dataid;
    }

    /**
     * Sets the value of the dataid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataid(String value) {
        this.dataid = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the eventsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventsource() {
        return eventsource;
    }

    /**
     * Sets the value of the eventsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventsource(String value) {
        this.eventsource = value;
    }

    /**
     * Gets the value of the eventid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventid() {
        return eventid;
    }

    /**
     * Sets the value of the eventid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventid(String value) {
        this.eventid = value;
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