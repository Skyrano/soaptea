package gestionnaire;

import javax.jws.WebService;

@WebService(name = "ServiceGestionnaire", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceGestionnaire {

    void notifierCommande();

}
