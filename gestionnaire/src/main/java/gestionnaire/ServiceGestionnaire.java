package gestionnaire;

import javax.jws.WebService;

@WebService(name = "ServiceGestionnaire", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceGestionnaire {

    boolean notifierCommande(Commande commande);

    boolean theEnPreparation(int id);

    boolean thePrepare(int id);

    boolean colisAuLivreur(int id);

    boolean theLivre(int id);

}
