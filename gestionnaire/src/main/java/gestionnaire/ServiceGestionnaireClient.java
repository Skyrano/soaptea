package gestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(name = "ServiceGestionnaireClient", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceGestionnaireClient {

    ArrayList<String> catalogue();

    int Connexion(String nom, String mdp);

    boolean paiement(int idutilisateur, int montant, String numeroCarte);

    boolean notifierCommande(Commande commande);

    int creerUtilisateur(String nom, String adresse, String mdp);

    boolean modifierUtilisateur(int idutilisateur, String nom, String adresse, String mdp);

    boolean supprimerUtilisateur(int idutilisateur);

    ArrayList<Integer> commandesUtilisateur(int idutilisateur);

    String etatCommande(int id);

}
