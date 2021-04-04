
package inventaire;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the inventaire package. 
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

    private final static QName _MajCarte_QNAME = new QName("http://ensibs.projet.fr/", "majCarte");
    private final static QName _MajCarteResponse_QNAME = new QName("http://ensibs.projet.fr/", "majCarteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: inventaire
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MajCarte }
     * 
     */
    public MajCarte createMajCarte() {
        return new MajCarte();
    }

    /**
     * Create an instance of {@link MajCarteResponse }
     * 
     */
    public MajCarteResponse createMajCarteResponse() {
        return new MajCarteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajCarte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MajCarte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "majCarte")
    public JAXBElement<MajCarte> createMajCarte(MajCarte value) {
        return new JAXBElement<MajCarte>(_MajCarte_QNAME, MajCarte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajCarteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MajCarteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "majCarteResponse")
    public JAXBElement<MajCarteResponse> createMajCarteResponse(MajCarteResponse value) {
        return new JAXBElement<MajCarteResponse>(_MajCarteResponse_QNAME, MajCarteResponse.class, null, value);
    }

}
