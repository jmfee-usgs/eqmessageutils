package gov.usgs.earthquake.quakeml;

import gov.usgs.earthquake.util.IOUtil;

import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import org.quakeml_rt_1_2.Quakeml;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 * Parse Quakeml-RT 1.2 messages.
 * 
 * @see org.quakeml_rt_1_2.Quakeml
 */
public class Quakeml_RT_1_2_Parser extends NamespacePrefixMapper {

	/**
	 * Use "q" namespace prefix for quakeml.
	 * 
	 * @see #getPreferredPrefix(String, String, boolean)
	 */
	private static final NamespacePrefixMapper NAMESPACE_MAPPER = new Quakeml_RT_1_2_Parser();

	public static final String QUAKEML_RT_1_2_BED_NAMESPACE = "http://quakeml.org/xmlns/bed-rt/1.2";
	public static final String QUAKEML_RT_1_2_BED_PREFIX = "";
	public static final String QUAKEML_RT_1_2_NAMESPACE = "http://quakeml.org/xmlns/quakeml-rt/1.2";
	public static final String QUAKEML_RT_1_2_PREFIX = "q";

	public static final JAXBContext CONTEXT;
	static {
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance("org.quakeml_rt_1_2");
		} catch (Exception e) {
			System.err.println("Unable to create org.quakeml JAXBContext");
			e.printStackTrace();
			context = null;
		}
		CONTEXT = context;
	}

	/**
	 * Parse an EQMessage from an InputStream-able object.
	 * 
	 * @param source
	 *            InputStream-able object, as defined by Utility.getInputStream.
	 * @return an EQMessage object, or null if an error occurred.
	 */
	public static synchronized Quakeml parse(final Object source) {
		Quakeml message = null;
		InputStream in = null;

		try {
			in = IOUtil.getInputStream(source);
			// to be thread safe, must create unmarshaller per call
			Unmarshaller unmarshaller = CONTEXT.createUnmarshaller();
			if (unmarshaller != null) {
				message = (Quakeml) unmarshaller.unmarshal(in);
			}
		} catch (Exception e) {
			System.err.println("Error processing source " + e.toString());
			System.err.println(source);
			System.err.println();
		} finally {
			IOUtil.close(in);
		}

		return message;
	}

	/**
	 * Convert an EQMessage to XML.
	 * 
	 * @param message
	 *            the message to serialize.
	 * @param out
	 *            the outputstream where xml is written.
	 * @throws JAXBException
	 */
	public static synchronized void serialize(final Quakeml message,
			final OutputStream out) throws JAXBException {
		// to be thread safe, must create marshaller per call
		Marshaller marshaller = CONTEXT.createMarshaller();

		// use #getPreferredPrefix to override default JAXB namespaces
		marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper",
				NAMESPACE_MAPPER);

		// don't include <?xml?>
		marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", false);

		// because of how the quakeml schema is written, we have to do this bs
		// to convince JAXB marshall that quakeml can be used as a root element
		XmlType quakemlXmlType = Quakeml.class.getAnnotation(XmlType.class);
		JAXBElement<Quakeml> element = new JAXBElement<Quakeml>(new QName(
				quakemlXmlType.namespace(), "quakeml"), Quakeml.class, message);

		marshaller.marshal(element, out);
	}

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion,
			boolean requirePrefix) {
		if (QUAKEML_RT_1_2_NAMESPACE.equals(namespaceUri)) {
			return QUAKEML_RT_1_2_PREFIX;
		} else if (QUAKEML_RT_1_2_BED_NAMESPACE.equals(namespaceUri)) {
			return QUAKEML_RT_1_2_BED_PREFIX;
		} else {
			return suggestion;
		}
	}
}
