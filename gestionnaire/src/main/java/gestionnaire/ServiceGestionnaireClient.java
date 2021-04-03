package gestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(name = "ServiceGestionnaireClient", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceGestionnaireClient {

    boolean notifierCommande(Commande commande);

    String etatCommande(int id);

    int creerUtilisateur(String nom, String adresse, String mdp);

    boolean modifierUtilisateur(int idutilisateur, String nom, String adresse, String mdp);

    boolean supprimerUtilisateur(int idutilisateur);

    ArrayList<String> catalogue();

    ArrayList<Integer> commandesUtilisateur(int idutilisateur);

    boolean paiement(int idutilisateur, int montant, String numeroCarte);

    int Connexion(String nom, String mdp);

}
