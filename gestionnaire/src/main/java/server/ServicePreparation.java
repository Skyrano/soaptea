package server;

import javax.jws.WebService;

@WebService(name = "preparation", targetNamespace = "http://ensibs.projet.fr/")
public interface ServicePreparation {
    boolean theEnPreparation(int id);

    boolean thePrepare(int id);
}
