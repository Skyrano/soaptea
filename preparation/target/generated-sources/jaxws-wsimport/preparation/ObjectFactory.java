
package preparation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the preparation package. 
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

    private final static QName _TheEnPreparation_QNAME = new QName("http://ensibs.projet.fr/", "theEnPreparation");
    private final static QName _TheEnPreparationResponse_QNAME = new QName("http://ensibs.projet.fr/", "theEnPreparationResponse");
    private final static QName _ThePrepare_QNAME = new QName("http://ensibs.projet.fr/", "thePrepare");
    private final static QName _ThePrepareResponse_QNAME = new QName("http://ensibs.projet.fr/", "thePrepareResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: preparation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TheEnPreparation }
     * 
     */
    public TheEnPreparation createTheEnPreparation() {
        return new TheEnPreparation();
    }

    /**
     * Create an instance of {@link TheEnPreparationResponse }
     * 
     */
    public TheEnPreparationResponse createTheEnPreparationResponse() {
        return new TheEnPreparationResponse();
    }

    /**
     * Create an instance of {@link ThePrepare }
     * 
     */
    public ThePrepare createThePrepare() {
        return new ThePrepare();
    }

    /**
     * Create an instance of {@link ThePrepareResponse }
     * 
     */
    public ThePrepareResponse createThePrepareResponse() {
        return new ThePrepareResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheEnPreparation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TheEnPreparation }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "theEnPreparation")
    public JAXBElement<TheEnPreparation> createTheEnPreparation(TheEnPreparation value) {
        return new JAXBElement<TheEnPreparation>(_TheEnPreparation_QNAME, TheEnPreparation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheEnPreparationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TheEnPreparationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "theEnPreparationResponse")
    public JAXBElement<TheEnPreparationResponse> createTheEnPreparationResponse(TheEnPreparationResponse value) {
        return new JAXBElement<TheEnPreparationResponse>(_TheEnPreparationResponse_QNAME, TheEnPreparationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThePrepare }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThePrepare }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "thePrepare")
    public JAXBElement<ThePrepare> createThePrepare(ThePrepare value) {
        return new JAXBElement<ThePrepare>(_ThePrepare_QNAME, ThePrepare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThePrepareResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThePrepareResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "thePrepareResponse")
    public JAXBElement<ThePrepareResponse> createThePrepareResponse(ThePrepareResponse value) {
        return new JAXBElement<ThePrepareResponse>(_ThePrepareResponse_QNAME, ThePrepareResponse.class, null, value);
    }

}
