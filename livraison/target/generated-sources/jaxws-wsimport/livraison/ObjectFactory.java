
package livraison;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the livraison package. 
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

    private final static QName _ColisAuLivreur_QNAME = new QName("http://ensibs.projet.fr/", "colisAuLivreur");
    private final static QName _ColisAuLivreurResponse_QNAME = new QName("http://ensibs.projet.fr/", "colisAuLivreurResponse");
    private final static QName _CommandesPretesLivraison_QNAME = new QName("http://ensibs.projet.fr/", "commandesPretesLivraison");
    private final static QName _CommandesPretesLivraisonResponse_QNAME = new QName("http://ensibs.projet.fr/", "commandesPretesLivraisonResponse");
    private final static QName _TheLivre_QNAME = new QName("http://ensibs.projet.fr/", "theLivre");
    private final static QName _TheLivreResponse_QNAME = new QName("http://ensibs.projet.fr/", "theLivreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: livraison
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ColisAuLivreur }
     * 
     */
    public ColisAuLivreur createColisAuLivreur() {
        return new ColisAuLivreur();
    }

    /**
     * Create an instance of {@link ColisAuLivreurResponse }
     * 
     */
    public ColisAuLivreurResponse createColisAuLivreurResponse() {
        return new ColisAuLivreurResponse();
    }

    /**
     * Create an instance of {@link CommandesPretesLivraison }
     * 
     */
    public CommandesPretesLivraison createCommandesPretesLivraison() {
        return new CommandesPretesLivraison();
    }

    /**
     * Create an instance of {@link CommandesPretesLivraisonResponse }
     * 
     */
    public CommandesPretesLivraisonResponse createCommandesPretesLivraisonResponse() {
        return new CommandesPretesLivraisonResponse();
    }

    /**
     * Create an instance of {@link TheLivre }
     * 
     */
    public TheLivre createTheLivre() {
        return new TheLivre();
    }

    /**
     * Create an instance of {@link TheLivreResponse }
     * 
     */
    public TheLivreResponse createTheLivreResponse() {
        return new TheLivreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColisAuLivreur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColisAuLivreur }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "colisAuLivreur")
    public JAXBElement<ColisAuLivreur> createColisAuLivreur(ColisAuLivreur value) {
        return new JAXBElement<ColisAuLivreur>(_ColisAuLivreur_QNAME, ColisAuLivreur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColisAuLivreurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColisAuLivreurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "colisAuLivreurResponse")
    public JAXBElement<ColisAuLivreurResponse> createColisAuLivreurResponse(ColisAuLivreurResponse value) {
        return new JAXBElement<ColisAuLivreurResponse>(_ColisAuLivreurResponse_QNAME, ColisAuLivreurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommandesPretesLivraison }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommandesPretesLivraison }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "commandesPretesLivraison")
    public JAXBElement<CommandesPretesLivraison> createCommandesPretesLivraison(CommandesPretesLivraison value) {
        return new JAXBElement<CommandesPretesLivraison>(_CommandesPretesLivraison_QNAME, CommandesPretesLivraison.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommandesPretesLivraisonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommandesPretesLivraisonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "commandesPretesLivraisonResponse")
    public JAXBElement<CommandesPretesLivraisonResponse> createCommandesPretesLivraisonResponse(CommandesPretesLivraisonResponse value) {
        return new JAXBElement<CommandesPretesLivraisonResponse>(_CommandesPretesLivraisonResponse_QNAME, CommandesPretesLivraisonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheLivre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TheLivre }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "theLivre")
    public JAXBElement<TheLivre> createTheLivre(TheLivre value) {
        return new JAXBElement<TheLivre>(_TheLivre_QNAME, TheLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheLivreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TheLivreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "theLivreResponse")
    public JAXBElement<TheLivreResponse> createTheLivreResponse(TheLivreResponse value) {
        return new JAXBElement<TheLivreResponse>(_TheLivreResponse_QNAME, TheLivreResponse.class, null, value);
    }

}
