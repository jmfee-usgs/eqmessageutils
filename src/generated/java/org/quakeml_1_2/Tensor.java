//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.21 at 09:51:54 AM MDT 
//


package org.quakeml_1_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for Tensor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tensor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mrr" type="{http://quakeml.org/xmlns/bed/1.2}RealQuantity"/&gt;
 *         &lt;element name="Mtt" type="{http://quakeml.org/xmlns/bed/1.2}RealQuantity"/&gt;
 *         &lt;element name="Mpp" type="{http://quakeml.org/xmlns/bed/1.2}RealQuantity"/&gt;
 *         &lt;element name="Mrt" type="{http://quakeml.org/xmlns/bed/1.2}RealQuantity"/&gt;
 *         &lt;element name="Mrp" type="{http://quakeml.org/xmlns/bed/1.2}RealQuantity"/&gt;
 *         &lt;element name="Mtp" type="{http://quakeml.org/xmlns/bed/1.2}RealQuantity"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tensor", propOrder = {
    "mrr",
    "mtt",
    "mpp",
    "mrt",
    "mrp",
    "mtp",
    "anies"
})
public class Tensor {

    @XmlElement(name = "Mrr", required = true)
    protected RealQuantity mrr;
    @XmlElement(name = "Mtt", required = true)
    protected RealQuantity mtt;
    @XmlElement(name = "Mpp", required = true)
    protected RealQuantity mpp;
    @XmlElement(name = "Mrt", required = true)
    protected RealQuantity mrt;
    @XmlElement(name = "Mrp", required = true)
    protected RealQuantity mrp;
    @XmlElement(name = "Mtp", required = true)
    protected RealQuantity mtp;
    @XmlAnyElement(lax = true)
    protected List<Object> anies;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mrr property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getMrr() {
        return mrr;
    }

    /**
     * Sets the value of the mrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setMrr(RealQuantity value) {
        this.mrr = value;
    }

    /**
     * Gets the value of the mtt property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getMtt() {
        return mtt;
    }

    /**
     * Sets the value of the mtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setMtt(RealQuantity value) {
        this.mtt = value;
    }

    /**
     * Gets the value of the mpp property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getMpp() {
        return mpp;
    }

    /**
     * Sets the value of the mpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setMpp(RealQuantity value) {
        this.mpp = value;
    }

    /**
     * Gets the value of the mrt property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getMrt() {
        return mrt;
    }

    /**
     * Sets the value of the mrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setMrt(RealQuantity value) {
        this.mrt = value;
    }

    /**
     * Gets the value of the mrp property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getMrp() {
        return mrp;
    }

    /**
     * Sets the value of the mrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setMrp(RealQuantity value) {
        this.mrp = value;
    }

    /**
     * Gets the value of the mtp property.
     * 
     * @return
     *     possible object is
     *     {@link RealQuantity }
     *     
     */
    public RealQuantity getMtp() {
        return mtp;
    }

    /**
     * Sets the value of the mtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealQuantity }
     *     
     */
    public void setMtp(RealQuantity value) {
        this.mtp = value;
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