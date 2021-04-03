
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

    private final static QName _Connexion_QNAME = new QName("http://ensibs.projet.fr/", "Connexion");
    private final static QName _ConnexionResponse_QNAME = new QName("http://ensibs.projet.fr/", "ConnexionResponse");
    private final static QName _Catalogue_QNAME = new QName("http://ensibs.projet.fr/", "catalogue");
    private final static QName _CatalogueResponse_QNAME = new QName("http://ensibs.projet.fr/", "catalogueResponse");
    private final static QName _ColisAuLivreur_QNAME = new QName("http://ensibs.projet.fr/", "colisAuLivreur");
    private final static QName _ColisAuLivreurResponse_QNAME = new QName("http://ensibs.projet.fr/", "colisAuLivreurResponse");
    private final static QName _CommandeUtilisateur_QNAME = new QName("http://ensibs.projet.fr/", "commandeUtilisateur");
    private final static QName _CommandeUtilisateurResponse_QNAME = new QName("http://ensibs.projet.fr/", "commandeUtilisateurResponse");
    private final static QName _CreerUtilisateur_QNAME = new QName("http://ensibs.projet.fr/", "creerUtilisateur");
    private final static QName _CreerUtilisateurResponse_QNAME = new QName("http://ensibs.projet.fr/", "creerUtilisateurResponse");
    private final static QName _EtatCommande_QNAME = new QName("http://ensibs.projet.fr/", "etatCommande");
    private final static QName _EtatCommandeResponse_QNAME = new QName("http://ensibs.projet.fr/", "etatCommandeResponse");
    private final static QName _MajCarte_QNAME = new QName("http://ensibs.projet.fr/", "majCarte");
    private final static QName _MajCarteResponse_QNAME = new QName("http://ensibs.projet.fr/", "majCarteResponse");
    private final static QName _ModifierUtilisateur_QNAME = new QName("http://ensibs.projet.fr/", "modifierUtilisateur");
    private final static QName _ModifierUtilisateurResponse_QNAME = new QName("http://ensibs.projet.fr/", "modifierUtilisateurResponse");
    private final static QName _NotifierCommande_QNAME = new QName("http://ensibs.projet.fr/", "notifierCommande");
    private final static QName _NotifierCommandeResponse_QNAME = new QName("http://ensibs.projet.fr/", "notifierCommandeResponse");
    private final static QName _Paiement_QNAME = new QName("http://ensibs.projet.fr/", "paiement");
    private final static QName _PaiementResponse_QNAME = new QName("http://ensibs.projet.fr/", "paiementResponse");
    private final static QName _SupprimerUtilisateur_QNAME = new QName("http://ensibs.projet.fr/", "supprimerUtilisateur");
    private final static QName _SupprimerUtilisateurResponse_QNAME = new QName("http://ensibs.projet.fr/", "supprimerUtilisateurResponse");
    private final static QName _TheEnPreparation_QNAME = new QName("http://ensibs.projet.fr/", "theEnPreparation");
    private final static QName _TheEnPreparationResponse_QNAME = new QName("http://ensibs.projet.fr/", "theEnPreparationResponse");
    private final static QName _TheLivre_QNAME = new QName("http://ensibs.projet.fr/", "theLivre");
    private final static QName _TheLivreResponse_QNAME = new QName("http://ensibs.projet.fr/", "theLivreResponse");
    private final static QName _ThePrepare_QNAME = new QName("http://ensibs.projet.fr/", "thePrepare");
    private final static QName _ThePrepareResponse_QNAME = new QName("http://ensibs.projet.fr/", "thePrepareResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: preparation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Connexion }
     * 
     */
    public Connexion createConnexion() {
        return new Connexion();
    }

    /**
     * Create an instance of {@link ConnexionResponse }
     * 
     */
    public ConnexionResponse createConnexionResponse() {
        return new ConnexionResponse();
    }

    /**
     * Create an instance of {@link Catalogue }
     * 
     */
    public Catalogue createCatalogue() {
        return new Catalogue();
    }

    /**
     * Create an instance of {@link CatalogueResponse }
     * 
     */
    public CatalogueResponse createCatalogueResponse() {
        return new CatalogueResponse();
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
     * Create an instance of {@link CommandeUtilisateur }
     * 
     */
    public CommandeUtilisateur createCommandeUtilisateur() {
        return new CommandeUtilisateur();
    }

    /**
     * Create an instance of {@link CommandeUtilisateurResponse }
     * 
     */
    public CommandeUtilisateurResponse createCommandeUtilisateurResponse() {
        return new CommandeUtilisateurResponse();
    }

    /**
     * Create an instance of {@link CreerUtilisateur }
     * 
     */
    public CreerUtilisateur createCreerUtilisateur() {
        return new CreerUtilisateur();
    }

    /**
     * Create an instance of {@link CreerUtilisateurResponse }
     * 
     */
    public CreerUtilisateurResponse createCreerUtilisateurResponse() {
        return new CreerUtilisateurResponse();
    }

    /**
     * Create an instance of {@link EtatCommande }
     * 
     */
    public EtatCommande createEtatCommande() {
        return new EtatCommande();
    }

    /**
     * Create an instance of {@link EtatCommandeResponse }
     * 
     */
    public EtatCommandeResponse createEtatCommandeResponse() {
        return new EtatCommandeResponse();
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
     * Create an instance of {@link ModifierUtilisateur }
     * 
     */
    public ModifierUtilisateur createModifierUtilisateur() {
        return new ModifierUtilisateur();
    }

    /**
     * Create an instance of {@link ModifierUtilisateurResponse }
     * 
     */
    public ModifierUtilisateurResponse createModifierUtilisateurResponse() {
        return new ModifierUtilisateurResponse();
    }

    /**
     * Create an instance of {@link NotifierCommande }
     * 
     */
    public NotifierCommande createNotifierCommande() {
        return new NotifierCommande();
    }

    /**
     * Create an instance of {@link NotifierCommandeResponse }
     * 
     */
    public NotifierCommandeResponse createNotifierCommandeResponse() {
        return new NotifierCommandeResponse();
    }

    /**
     * Create an instance of {@link Paiement }
     * 
     */
    public Paiement createPaiement() {
        return new Paiement();
    }

    /**
     * Create an instance of {@link PaiementResponse }
     * 
     */
    public PaiementResponse createPaiementResponse() {
        return new PaiementResponse();
    }

    /**
     * Create an instance of {@link SupprimerUtilisateur }
     * 
     */
    public SupprimerUtilisateur createSupprimerUtilisateur() {
        return new SupprimerUtilisateur();
    }

    /**
     * Create an instance of {@link SupprimerUtilisateurResponse }
     * 
     */
    public SupprimerUtilisateurResponse createSupprimerUtilisateurResponse() {
        return new SupprimerUtilisateurResponse();
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
     * Create an instance of {@link Commande }
     * 
     */
    public Commande createCommande() {
        return new Commande();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Connexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "Connexion")
    public JAXBElement<Connexion> createConnexion(Connexion value) {
        return new JAXBElement<Connexion>(_Connexion_QNAME, Connexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConnexionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "ConnexionResponse")
    public JAXBElement<ConnexionResponse> createConnexionResponse(ConnexionResponse value) {
        return new JAXBElement<ConnexionResponse>(_ConnexionResponse_QNAME, ConnexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Catalogue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Catalogue }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "catalogue")
    public JAXBElement<Catalogue> createCatalogue(Catalogue value) {
        return new JAXBElement<Catalogue>(_Catalogue_QNAME, Catalogue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "catalogueResponse")
    public JAXBElement<CatalogueResponse> createCatalogueResponse(CatalogueResponse value) {
        return new JAXBElement<CatalogueResponse>(_CatalogueResponse_QNAME, CatalogueResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CommandeUtilisateur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommandeUtilisateur }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "commandeUtilisateur")
    public JAXBElement<CommandeUtilisateur> createCommandeUtilisateur(CommandeUtilisateur value) {
        return new JAXBElement<CommandeUtilisateur>(_CommandeUtilisateur_QNAME, CommandeUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommandeUtilisateurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommandeUtilisateurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "commandeUtilisateurResponse")
    public JAXBElement<CommandeUtilisateurResponse> createCommandeUtilisateurResponse(CommandeUtilisateurResponse value) {
        return new JAXBElement<CommandeUtilisateurResponse>(_CommandeUtilisateurResponse_QNAME, CommandeUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerUtilisateur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreerUtilisateur }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "creerUtilisateur")
    public JAXBElement<CreerUtilisateur> createCreerUtilisateur(CreerUtilisateur value) {
        return new JAXBElement<CreerUtilisateur>(_CreerUtilisateur_QNAME, CreerUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerUtilisateurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreerUtilisateurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "creerUtilisateurResponse")
    public JAXBElement<CreerUtilisateurResponse> createCreerUtilisateurResponse(CreerUtilisateurResponse value) {
        return new JAXBElement<CreerUtilisateurResponse>(_CreerUtilisateurResponse_QNAME, CreerUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtatCommande }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EtatCommande }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "etatCommande")
    public JAXBElement<EtatCommande> createEtatCommande(EtatCommande value) {
        return new JAXBElement<EtatCommande>(_EtatCommande_QNAME, EtatCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtatCommandeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EtatCommandeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "etatCommandeResponse")
    public JAXBElement<EtatCommandeResponse> createEtatCommandeResponse(EtatCommandeResponse value) {
        return new JAXBElement<EtatCommandeResponse>(_EtatCommandeResponse_QNAME, EtatCommandeResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierUtilisateur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifierUtilisateur }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "modifierUtilisateur")
    public JAXBElement<ModifierUtilisateur> createModifierUtilisateur(ModifierUtilisateur value) {
        return new JAXBElement<ModifierUtilisateur>(_ModifierUtilisateur_QNAME, ModifierUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierUtilisateurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifierUtilisateurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "modifierUtilisateurResponse")
    public JAXBElement<ModifierUtilisateurResponse> createModifierUtilisateurResponse(ModifierUtilisateurResponse value) {
        return new JAXBElement<ModifierUtilisateurResponse>(_ModifierUtilisateurResponse_QNAME, ModifierUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifierCommande }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotifierCommande }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "notifierCommande")
    public JAXBElement<NotifierCommande> createNotifierCommande(NotifierCommande value) {
        return new JAXBElement<NotifierCommande>(_NotifierCommande_QNAME, NotifierCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifierCommandeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotifierCommandeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "notifierCommandeResponse")
    public JAXBElement<NotifierCommandeResponse> createNotifierCommandeResponse(NotifierCommandeResponse value) {
        return new JAXBElement<NotifierCommandeResponse>(_NotifierCommandeResponse_QNAME, NotifierCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paiement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Paiement }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "paiement")
    public JAXBElement<Paiement> createPaiement(Paiement value) {
        return new JAXBElement<Paiement>(_Paiement_QNAME, Paiement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaiementResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaiementResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "paiementResponse")
    public JAXBElement<PaiementResponse> createPaiementResponse(PaiementResponse value) {
        return new JAXBElement<PaiementResponse>(_PaiementResponse_QNAME, PaiementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerUtilisateur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupprimerUtilisateur }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "supprimerUtilisateur")
    public JAXBElement<SupprimerUtilisateur> createSupprimerUtilisateur(SupprimerUtilisateur value) {
        return new JAXBElement<SupprimerUtilisateur>(_SupprimerUtilisateur_QNAME, SupprimerUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerUtilisateurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SupprimerUtilisateurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ensibs.projet.fr/", name = "supprimerUtilisateurResponse")
    public JAXBElement<SupprimerUtilisateurResponse> createSupprimerUtilisateurResponse(SupprimerUtilisateurResponse value) {
        return new JAXBElement<SupprimerUtilisateurResponse>(_SupprimerUtilisateurResponse_QNAME, SupprimerUtilisateurResponse.class, null, value);
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
