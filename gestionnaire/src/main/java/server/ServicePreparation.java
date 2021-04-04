package server;

import javax.jws.WebService;

/**
 * Interface du service gérant la préparation des commandes
 */
@WebService(name = "preparation", targetNamespace = "http://ensibs.projet.fr/")
public interface ServicePreparation {

    /**
     * Indique que la commande est en préparation
     * @param id l'id de la commande mise en préparation
     * @return true si le nouvel état est pris en compte, false sinon
     */
    boolean theEnPreparation(int id);

    /**
     * Indique que la commande est préparée
     * @param id l'id de la commande prête à être livrée
     * @return true si le nouvel état est pris en compte, false sinon
     */
    boolean thePrepare(int id);
}
