//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.21 at 09:51:58 AM MDT 
//


package org.quakeml_rt_1_2;

import java.math.BigDecimal;
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
 * <p>Java class for MomentTensor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MomentTensor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataUsed" type="{http://quakeml.org/xmlns/bed-rt/1.2}DataUsed" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://quakeml.org/xmlns/bed-rt/1.2}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="derivedOriginID" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference"/&gt;
 *         &lt;element name="momentMagnitudeID" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="scalarMoment" type="{http://quakeml.org/xmlns/bed-rt/1.2}RealQuantity" minOccurs="0"/&gt;
 *         &lt;element name="tensor" type="{http://quakeml.org/xmlns/bed-rt/1.2}Tensor" minOccurs="0"/&gt;
 *         &lt;element name="variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="varianceReduction" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="doubleCouple" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="clvd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="iso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="greensFunctionID" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="filterID" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="sourceTimeFunction" type="{http://quakeml.org/xmlns/bed-rt/1.2}SourceTimeFunction" minOccurs="0"/&gt;
 *         &lt;element name="methodID" type="{http://quakeml.org/xmlns/bed-rt/1.2}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://quakeml.org/xmlns/bed-rt/1.2}MomentTensorCategory" minOccurs="0"/&gt;
 *         &lt;element name="inversionType" type="{http://quakeml.org/xmlns/bed-rt/1.2}MTInversionType" minOccurs="0"/&gt;
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
@XmlType(name = "MomentTensor", propOrder = {
    "dataUseds",
    "comments",
    "derivedOriginID",
    "momentMagnitudeID",
    "scalarMoment",
    "tensor",
    "variance",
    "varianceReduction",
    "doubleCouple",
    "clvd",
    "iso",
    "greensFunctionID",
    "filterID",
    "sourceTimeFunction",
    "methodID",
    "category",
    "inversionType",
    "creationInfo",
    "anies"
})
public class MomentTensor {

    @XmlElement(name = "dataUsed")
    protected List<DataUsed> dataUseds;
    @XmlElement(name = "comment")
    protected List<Comment> comments;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String derivedOriginID;
    @XmlSchemaType(name = "anyURI")
    protected String momentMagnitudeID;
    protected RealQuantity scalarMoment;
    protected Tensor tensor;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal variance;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal varianceReduction;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal doubleCouple;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal clvd;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "double")
    protected BigDecimal iso;
    @XmlSchemaType(name = "anyURI")
    protected String greensFunctionID;
    @XmlSchemaType(name = "anyURI")
    protected String filterID;
    protected SourceTimeFunction sourceTimeFunction;
    @XmlSchemaType(name = "anyURI")
    protected String methodID;
    @XmlSchemaType(name = "string")
    protected MomentTensorCategory category;
    @XmlSchemaType(name = "string")
    protected MTInversionType inversionType;
    protected CreationInfo creationInfo;
    @XmlAnyElement
    protected List<Element> anies;
    @XmlAttribute(name = "publicID", required = true)
    protected String publicID;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dataUseds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataUseds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataUseds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataUsed }
     * 
     * 
     */
    public List<DataUsed> getDataUseds() {
        if (dataUseds == null) {
            dataUseds = new ArrayList<DataUsed>();
        }
        return this.dataUseds;
    }

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
     * Gets the value of the derivedOriginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedOriginID() {
        return derivedOriginID;
    }

    /**
     * Sets the value of the derivedOriginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedOriginID(String value) {
        this.derivedOriginID = value;
    }

    /**
     * Gets the value of the momentMagnitudeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomentMagnitudeID() {
        return momentMagnitudeID;
    }

    /**
     * Sets the value of the momentMagnitudeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomentMagnitudeID(String value) {
        this.momentMagnitudeID = value;
    }

    /**
     * Gets the value of the scalarMoment property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getScalarMoment() {
        return scalarMoment;
    }

    /**
     * Sets the value of the scalarMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setScalarMoment(RealQuantity value) {
        this.scalarMoment = value;
    }

    /**
     * Gets the value of the tensor property.
     * 
     * @return
     *     possible object is
     *     {@link Tensor }
     *     
     */
    public Tensor getTensor() {
        return tensor;
    }

    /**
     * Sets the value of the tensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tensor }
     *     
     */
    public void setTensor(Tensor value) {
        this.tensor = value;
    }

    /**
     * Gets the value of the variance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getVariance() {
        return variance;
    }

    /**
     * Sets the value of the variance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariance(BigDecimal value) {
        this.variance = value;
    }

    /**
     * Gets the value of the varianceReduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getVarianceReduction() {
        return varianceReduction;
    }

    /**
     * Sets the value of the varianceReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarianceReduction(BigDecimal value) {
        this.varianceReduction = value;
    }

    /**
     * Gets the value of the doubleCouple property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getDoubleCouple() {
        return doubleCouple;
    }

    /**
     * Sets the value of the doubleCouple property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoubleCouple(BigDecimal value) {
        this.doubleCouple = value;
    }

    /**
     * Gets the value of the clvd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getClvd() {
        return clvd;
    }

    /**
     * Sets the value of the clvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClvd(BigDecimal value) {
        this.clvd = value;
    }

    /**
     * Gets the value of the iso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getIso() {
        return iso;
    }

    /**
     * Sets the value of the iso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso(BigDecimal value) {
        this.iso = value;
    }

    /**
     * Gets the value of the greensFunctionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreensFunctionID() {
        return greensFunctionID;
    }

    /**
     * Sets the value of the greensFunctionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreensFunctionID(String value) {
        this.greensFunctionID = value;
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
     * Gets the value of the sourceTimeFunction property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTimeFunction }
     *     
     */
    public SourceTimeFunction getSourceTimeFunction() {
        return sourceTimeFunction;
    }

    /**
     * Sets the value of the sourceTimeFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTimeFunction }
     *     
     */
    public void setSourceTimeFunction(SourceTimeFunction value) {
        this.sourceTimeFunction = value;
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link MomentTensorCategory }
     *     
     */
    public MomentTensorCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentTensorCategory }
     *     
     */
    public void setCategory(MomentTensorCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the inversionType property.
     * 
     * @return
     *     possible object is
     *     {@link MTInversionType }
     *     
     */
    public MTInversionType getInversionType() {
        return inversionType;
    }

    /**
     * Sets the value of the inversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTInversionType }
     *     
     */
    public void setInversionType(MTInversionType value) {
        this.inversionType = value;
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
