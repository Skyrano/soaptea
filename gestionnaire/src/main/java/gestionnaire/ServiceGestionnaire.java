package gestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(name = "ServiceGestionnaire", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceGestionnaire {

    boolean theEnPreparation(int id);

    boolean thePrepare(int id);

    boolean colisAuLivreur(int id);

    ArrayList<Integer> commandesPretesLivraison();

    boolean theLivre(int id);

    boolean majCarte(ArrayList<String> carte);

}
