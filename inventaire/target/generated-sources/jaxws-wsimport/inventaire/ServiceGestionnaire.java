
package inventaire;

import java.util.List;
import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceGestionnaire", targetNamespace = "http://ensibs.projet.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceGestionnaire {


    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<inventaire.CommandesPretesLivraisonResponse>
     */
    @WebMethod(operationName = "commandesPretesLivraison")
    @RequestWrapper(localName = "commandesPretesLivraison", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.CommandesPretesLivraison")
    @ResponseWrapper(localName = "commandesPretesLivraisonResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.CommandesPretesLivraisonResponse")
    public Response<CommandesPretesLivraisonResponse> commandesPretesLivraisonAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "commandesPretesLivraison")
    @RequestWrapper(localName = "commandesPretesLivraison", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.CommandesPretesLivraison")
    @ResponseWrapper(localName = "commandesPretesLivraisonResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.CommandesPretesLivraisonResponse")
    public Future<?> commandesPretesLivraisonAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<CommandesPretesLivraisonResponse> asyncHandler);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "commandesPretesLivraison", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.CommandesPretesLivraison")
    @ResponseWrapper(localName = "commandesPretesLivraisonResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.CommandesPretesLivraisonResponse")
    @Action(input = "http://ensibs.projet.fr/ServiceGestionnaire/commandesPretesLivraisonRequest", output = "http://ensibs.projet.fr/ServiceGestionnaire/commandesPretesLivraisonResponse")
    public List<Integer> commandesPretesLivraison();

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<inventaire.ThePrepareResponse>
     */
    @WebMethod(operationName = "thePrepare")
    @RequestWrapper(localName = "thePrepare", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ThePrepare")
    @ResponseWrapper(localName = "thePrepareResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ThePrepareResponse")
    public Response<ThePrepareResponse> thePrepareAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "thePrepare")
    @RequestWrapper(localName = "thePrepare", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ThePrepare")
    @ResponseWrapper(localName = "thePrepareResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ThePrepareResponse")
    public Future<?> thePrepareAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<ThePrepareResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "thePrepare", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ThePrepare")
    @ResponseWrapper(localName = "thePrepareResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ThePrepareResponse")
    @Action(input = "http://ensibs.projet.fr/ServiceGestionnaire/thePrepareRequest", output = "http://ensibs.projet.fr/ServiceGestionnaire/thePrepareResponse")
    public boolean thePrepare(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<inventaire.TheEnPreparationResponse>
     */
    @WebMethod(operationName = "theEnPreparation")
    @RequestWrapper(localName = "theEnPreparation", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheEnPreparation")
    @ResponseWrapper(localName = "theEnPreparationResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheEnPreparationResponse")
    public Response<TheEnPreparationResponse> theEnPreparationAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "theEnPreparation")
    @RequestWrapper(localName = "theEnPreparation", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheEnPreparation")
    @ResponseWrapper(localName = "theEnPreparationResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheEnPreparationResponse")
    public Future<?> theEnPreparationAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<TheEnPreparationResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "theEnPreparation", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheEnPreparation")
    @ResponseWrapper(localName = "theEnPreparationResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheEnPreparationResponse")
    @Action(input = "http://ensibs.projet.fr/ServiceGestionnaire/theEnPreparationRequest", output = "http://ensibs.projet.fr/ServiceGestionnaire/theEnPreparationResponse")
    public boolean theEnPreparation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<inventaire.TheLivreResponse>
     */
    @WebMethod(operationName = "theLivre")
    @RequestWrapper(localName = "theLivre", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheLivre")
    @ResponseWrapper(localName = "theLivreResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheLivreResponse")
    public Response<TheLivreResponse> theLivreAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "theLivre")
    @RequestWrapper(localName = "theLivre", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheLivre")
    @ResponseWrapper(localName = "theLivreResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheLivreResponse")
    public Future<?> theLivreAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<TheLivreResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "theLivre", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheLivre")
    @ResponseWrapper(localName = "theLivreResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.TheLivreResponse")
    @Action(input = "http://ensibs.projet.fr/ServiceGestionnaire/theLivreRequest", output = "http://ensibs.projet.fr/ServiceGestionnaire/theLivreResponse")
    public boolean theLivre(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<inventaire.ColisAuLivreurResponse>
     */
    @WebMethod(operationName = "colisAuLivreur")
    @RequestWrapper(localName = "colisAuLivreur", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ColisAuLivreur")
    @ResponseWrapper(localName = "colisAuLivreurResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ColisAuLivreurResponse")
    public Response<ColisAuLivreurResponse> colisAuLivreurAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "colisAuLivreur")
    @RequestWrapper(localName = "colisAuLivreur", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ColisAuLivreur")
    @ResponseWrapper(localName = "colisAuLivreurResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ColisAuLivreurResponse")
    public Future<?> colisAuLivreurAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<ColisAuLivreurResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "colisAuLivreur", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ColisAuLivreur")
    @ResponseWrapper(localName = "colisAuLivreurResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.ColisAuLivreurResponse")
    @Action(input = "http://ensibs.projet.fr/ServiceGestionnaire/colisAuLivreurRequest", output = "http://ensibs.projet.fr/ServiceGestionnaire/colisAuLivreurResponse")
    public boolean colisAuLivreur(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<inventaire.MajCarteResponse>
     */
    @WebMethod(operationName = "majCarte")
    @RequestWrapper(localName = "majCarte", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.MajCarte")
    @ResponseWrapper(localName = "majCarteResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.MajCarteResponse")
    public Response<MajCarteResponse> majCarteAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "majCarte")
    @RequestWrapper(localName = "majCarte", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.MajCarte")
    @ResponseWrapper(localName = "majCarteResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.MajCarteResponse")
    public Future<?> majCarteAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<MajCarteResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "majCarte", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.MajCarte")
    @ResponseWrapper(localName = "majCarteResponse", targetNamespace = "http://ensibs.projet.fr/", className = "inventaire.MajCarteResponse")
    @Action(input = "http://ensibs.projet.fr/ServiceGestionnaire/majCarteRequest", output = "http://ensibs.projet.fr/ServiceGestionnaire/majCarteResponse")
    public boolean majCarte(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0);

}
