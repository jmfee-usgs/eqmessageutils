//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 11:56:10 AM MST 
//


package org.quakeml_1_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;sequence&gt;
 *           &lt;element name="derivedOriginID" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference"/&gt;
 *           &lt;element name="momentMagnitudeID" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference" minOccurs="0"/&gt;
 *           &lt;element name="scalarMoment" type="{http://quakeml.org/xmlns/quakeml/1.1}RealQuantity" minOccurs="0"/&gt;
 *           &lt;element name="tensor" type="{http://quakeml.org/xmlns/quakeml/1.1}Tensor" minOccurs="0"/&gt;
 *           &lt;element name="variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *           &lt;element name="varianceReduction" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *           &lt;element name="doubleCouple" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *           &lt;element name="clvd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *           &lt;element name="iso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *           &lt;element name="greensFunctionID" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference" minOccurs="0"/&gt;
 *           &lt;element name="filterID" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference" minOccurs="0"/&gt;
 *           &lt;element name="sourceTimeFunction" type="{http://quakeml.org/xmlns/quakeml/1.1}SourceTimeFunction" minOccurs="0"/&gt;
 *           &lt;element name="methodID" type="{http://quakeml.org/xmlns/quakeml/1.1}ResourceReference" minOccurs="0"/&gt;
 *           &lt;element name="method" type="{http://quakeml.org/xmlns/quakeml/1.1}MomentTensorMethod" minOccurs="0"/&gt;
 *           &lt;element name="status" type="{http://quakeml.org/xmlns/quakeml/1.1}MomentTensorStatus" minOccurs="0"/&gt;
 *           &lt;element name="cmtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="cmtVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="creationInfo" type="{http://quakeml.org/xmlns/quakeml/1.1}CreationInfo" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="dataUsed" type="{http://quakeml.org/xmlns/quakeml/1.1}DataUsed" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="comment" type="{http://quakeml.org/xmlns/quakeml/1.1}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MomentTensor", propOrder = {
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
    "method",
    "status",
    "cmtName",
    "cmtVersion",
    "creationInfo",
    "dataUsed",
    "comment"
})
public class MomentTensor {

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
    protected MomentTensorMethod method;
    @XmlSchemaType(name = "string")
    protected MomentTensorStatus status;
    protected String cmtName;
    protected String cmtVersion;
    protected CreationInfo creationInfo;
    protected List<DataUsed> dataUsed;
    protected List<Comment> comment;

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
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link MomentTensorMethod }
     *     
     */
    public MomentTensorMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentTensorMethod }
     *     
     */
    public void setMethod(MomentTensorMethod value) {
        this.method = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MomentTensorStatus }
     *     
     */
    public MomentTensorStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentTensorStatus }
     *     
     */
    public void setStatus(MomentTensorStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the cmtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtName() {
        return cmtName;
    }

    /**
     * Sets the value of the cmtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtName(String value) {
        this.cmtName = value;
    }

    /**
     * Gets the value of the cmtVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtVersion() {
        return cmtVersion;
    }

    /**
     * Sets the value of the cmtVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtVersion(String value) {
        this.cmtVersion = value;
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
     * Gets the value of the dataUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataUsed }
     * 
     * 
     */
    public List<DataUsed> getDataUsed() {
        if (dataUsed == null) {
            dataUsed = new ArrayList<DataUsed>();
        }
        return this.dataUsed;
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

}
