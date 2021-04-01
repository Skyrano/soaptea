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

    int creerUtilisateur(String nom, String adresse, String mdp);

    boolean modifierUtilisateur(int idutilisateur, String nom, String adresse, String mdp);

    boolean supprimerUtilisateur(int idutilisateur);

    boolean paiement(int idutilisateur, int montant, String numeroCarte);

    int Connexion(String nom, String mdp);

    boolean majCarte(ArrayList<String> carte);

    ArrayList<String> catalogue();

    ArrayList<Integer> commandeUtilisateur(int idutilisateur);
}
