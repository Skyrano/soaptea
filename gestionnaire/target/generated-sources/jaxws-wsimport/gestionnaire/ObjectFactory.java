
package gestionnaire;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gestionnaire package. 
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

    private final static QName _DebutPreparation_QNAME = new QName("http://ensibs.projet.fr/", "debutPreparation");
    private final static QName _DebutPreparationResponse_QNAME = new QName("http://ensibs.projet.fr/", "debutPreparationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gestionnaire
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DebutPreparation }
     * 
     */
    public DebutPreparation createDebutPreparation() {
        return new DebutPreparation();
    }

    /**
     * Create an instance of {@link DebutPreparation.Arg2 }
     * 
     */
    public DebutPreparation.Arg2 createDebutPreparationArg2() {
        return new DebutPreparation.Arg2();
    }

    /**
     * Create an instance of {@link DebutPreparationResponse }
     * 
     */
    public DebutPreparationResponse createDebutPreparationResponse() {
        return new DebutPreparationResponse();
    }

    /**
     * Create an instance of {@link DebutPreparation.Arg2 .Entry }
     * 
     */
    public DebutPreparation.Arg2 .Entry createDebutPreparationArg2Entry() {
        return new DebutPreparation.Arg2 .Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebutPreparation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebutPreparation }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "debutPreparation")
    public JAXBElement<DebutPreparation> createDebutPreparation(DebutPreparation value) {
        return new JAXBElement<DebutPreparation>(_DebutPreparation_QNAME, DebutPreparation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebutPreparationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebutPreparationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "debutPreparationResponse")
    public JAXBElement<DebutPreparationResponse> createDebutPreparationResponse(DebutPreparationResponse value) {
        return new JAXBElement<DebutPreparationResponse>(_DebutPreparationResponse_QNAME, DebutPreparationResponse.class, null, value);
    }

}
