package server;

import javax.jws.WebService;

@WebService(name = "ServicePreparation", targetNamespace = "http://ensibs.projet.fr/")
public interface ServicePreparation {
    boolean theEnPreparation(int id);

    boolean thePrepare(int id);
}
