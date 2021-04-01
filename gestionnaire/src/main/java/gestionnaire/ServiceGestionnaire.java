package gestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(name = "ServiceGestionnaire", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceGestionnaire {

    boolean notifierCommande(Commande commande);

    boolean theEnPreparation(int id);

    boolean thePrepare(int id);

    boolean colisAuLivreur(int id);

    boolean theLivre(int id);

    String etatCommande(int id);

    int creerUtilisateur(String nom, String adresse);

    boolean modifierUtilisateur(int id, String nom, String adresse);

    boolean supprimerUtilisateur(int id);

    boolean majCarte(ArrayList<String> carte);
}
