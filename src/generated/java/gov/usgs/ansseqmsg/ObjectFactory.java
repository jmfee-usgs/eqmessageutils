//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 11:56:09 AM MST 
//


package gov.usgs.ansseqmsg;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.usgs.ansseqmsg package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.usgs.ansseqmsg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EQMessage }
     * 
     */
    public EQMessage createEQMessage() {
        return new EQMessage();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Origin }
     * 
     */
    public Origin createOrigin() {
        return new Origin();
    }

    /**
     * Create an instance of {@link ProductLink }
     * 
     */
    public ProductLink createProductLink() {
        return new ProductLink();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link LocalTime }
     * 
     */
    public LocalTime createLocalTime() {
        return new LocalTime();
    }

    /**
     * Create an instance of {@link ErrorAxes }
     * 
     */
    public ErrorAxes createErrorAxes() {
        return new ErrorAxes();
    }

    /**
     * Create an instance of {@link Magnitude }
     * 
     */
    public Magnitude createMagnitude() {
        return new Magnitude();
    }

    /**
     * Create an instance of {@link MomentTensor }
     * 
     */
    public MomentTensor createMomentTensor() {
        return new MomentTensor();
    }

    /**
     * Create an instance of {@link FocalMech }
     * 
     */
    public FocalMech createFocalMech() {
        return new FocalMech();
    }

    /**
     * Create an instance of {@link Phase }
     * 
     */
    public Phase createPhase() {
        return new Phase();
    }

    /**
     * Create an instance of {@link Pick }
     * 
     */
    public Pick createPick() {
        return new Pick();
    }

    /**
     * Create an instance of {@link Amplitude }
     * 
     */
    public Amplitude createAmplitude() {
        return new Amplitude();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link Axis }
     * 
     */
    public Axis createAxis() {
        return new Axis();
    }

    /**
     * Create an instance of {@link Tensor }
     * 
     */
    public Tensor createTensor() {
        return new Tensor();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link SrcTimeFn }
     * 
     */
    public SrcTimeFn createSrcTimeFn() {
        return new SrcTimeFn();
    }

    /**
     * Create an instance of {@link Method }
     * 
     */
    public Method createMethod() {
        return new Method();
    }

    /**
     * Create an instance of {@link PrincAxes }
     * 
     */
    public PrincAxes createPrincAxes() {
        return new PrincAxes();
    }

    /**
     * Create an instance of {@link NodalPlanes }
     * 
     */
    public NodalPlanes createNodalPlanes() {
        return new NodalPlanes();
    }

    /**
     * Create an instance of {@link ErrorTensor }
     * 
     */
    public ErrorTensor createErrorTensor() {
        return new ErrorTensor();
    }

    /**
     * Create an instance of {@link ErrorFaults }
     * 
     */
    public ErrorFaults createErrorFaults() {
        return new ErrorFaults();
    }

    /**
     * Create an instance of {@link DataUsed }
     * 
     */
    public DataUsed createDataUsed() {
        return new DataUsed();
    }

}
