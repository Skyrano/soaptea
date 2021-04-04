package server;

import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Interface du service gérant la livraison des commandes
 */
@WebService(name = "livraison", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceLivraison {

    /**
     * Donne la liste des commandes prêtes à être livrées, i.e. les commandes dont l'état est "The prepare"
     * @return la liste des commandes
     */
    ArrayList<Integer> commandesPretesLivraison();

    /**
     * Indique que le colis est pris par le livreur
     * @param id l'id de la commande prise par le livreur
     * @return true si le nouvel état est pris en compte, false sinon
     */
    boolean colisAuLivreur(int id);

    /**
     * Indique que le colis est livré au client
     * @param id l'id de la commande livrée par le livreur
     * @return true si le nouvel état est pris en compte, false sinon
     */
    boolean theLivre(int id);
}
