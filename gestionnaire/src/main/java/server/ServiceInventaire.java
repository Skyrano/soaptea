package server;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(name = "inventaire", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceInventaire {
    boolean majCarte(ArrayList<String> carte);
}
