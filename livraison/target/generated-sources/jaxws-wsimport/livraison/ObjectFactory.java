
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
    private final static QName _MajCarte_QNAME = new QName("http://ensibs.projet.fr/", "majCarte");
    private final static QName _MajCarteResponse_QNAME = new QName("http://ensibs.projet.fr/", "majCarteResponse");
    private final static QName _TheEnPreparation_QNAME = new QName("http://ensibs.projet.fr/", "theEnPreparation");
    private final static QName _TheEnPreparationResponse_QNAME = new QName("http://ensibs.projet.fr/", "theEnPreparationResponse");
    private final static QName _TheLivre_QNAME = new QName("http://ensibs.projet.fr/", "theLivre");
    private final static QName _TheLivreResponse_QNAME = new QName("http://ensibs.projet.fr/", "theLivreResponse");
    private final static QName _ThePrepare_QNAME = new QName("http://ensibs.projet.fr/", "thePrepare");
    private final static QName _ThePrepareResponse_QNAME = new QName("http://ensibs.projet.fr/", "thePrepareResponse");

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
