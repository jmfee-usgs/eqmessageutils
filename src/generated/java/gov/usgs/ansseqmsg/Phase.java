//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 11:56:09 AM MST 
//


package gov.usgs.ansseqmsg;

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
 * <p>Java class for PhaseCpxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhaseCpxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Net" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Delta" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Azim" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Pick" type="{http://www.usgs.gov/ansseqmsg}PickCpxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Amplitude" type="{http://www.usgs.gov/ansseqmsg}AmplitudeCpxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.usgs.gov/ansseqmsg}DurationCpxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.usgs.gov/ansseqmsg}CommentCpxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhaseCpxType", propOrder = {
    "net",
    "sta",
    "loc",
    "delta",
    "azim",
    "pick",
    "amplitude",
    "duration",
    "comment"
})
public class Phase {

    @XmlElement(name = "Net")
    protected String net;
    @XmlElement(name = "Sta", required = true)
    protected String sta;
    @XmlElement(name = "Loc")
    protected String loc;
    @XmlElement(name = "Delta", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "float")
    protected BigDecimal delta;
    @XmlElement(name = "Azim", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "float")
    protected BigDecimal azim;
    @XmlElement(name = "Pick")
    protected List<Pick> pick;
    @XmlElement(name = "Amplitude")
    protected List<Amplitude> amplitude;
    @XmlElement(name = "Duration")
    protected List<Duration> duration;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNet(String value) {
        this.net = value;
    }

    /**
     * Gets the value of the sta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSta() {
        return sta;
    }

    /**
     * Sets the value of the sta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSta(String value) {
        this.sta = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoc() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoc(String value) {
        this.loc = value;
    }

    /**
     * Gets the value of the delta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getDelta() {
        return delta;
    }

    /**
     * Sets the value of the delta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelta(BigDecimal value) {
        this.delta = value;
    }

    /**
     * Gets the value of the azim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAzim() {
        return azim;
    }

    /**
     * Sets the value of the azim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzim(BigDecimal value) {
        this.azim = value;
    }

    /**
     * Gets the value of the pick property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pick property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPick().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pick }
     * 
     * 
     */
    public List<Pick> getPick() {
        if (pick == null) {
            pick = new ArrayList<Pick>();
        }
        return this.pick;
    }

    /**
     * Gets the value of the amplitude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amplitude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmplitude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amplitude }
     * 
     * 
     */
    public List<Amplitude> getAmplitude() {
        if (amplitude == null) {
            amplitude = new ArrayList<Amplitude>();
        }
        return this.amplitude;
    }

    /**
     * Gets the value of the duration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Duration }
     * 
     * 
     */
    public List<Duration> getDuration() {
        if (duration == null) {
            duration = new ArrayList<Duration>();
        }
        return this.duration;
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
