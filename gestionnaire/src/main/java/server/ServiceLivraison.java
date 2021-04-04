package server;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(name = "livraison", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceLivraison {

    ArrayList<Integer> commandesPretesLivraison();

    boolean colisAuLivreur(int id);

    boolean theLivre(int id);
}
