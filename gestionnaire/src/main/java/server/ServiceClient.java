package server;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;

@WebService(name = "ServiceClient", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceClient {

    ArrayList<String> catalogue();

    int Connexion(String nom, String mdp);

    boolean paiement(int idutilisateur, int montant, String numeroCarte);

    boolean notifierCommande(int idUtilisateur, HashMap<String, Integer> listeThe);

    int creerUtilisateur(String nom, String adresse, String mdp);

    boolean modifierUtilisateur(int idutilisateur, String nom, String adresse, String mdp);

    boolean supprimerUtilisateur(int idutilisateur);

    ArrayList<Integer> commandesUtilisateur(int idutilisateur);

    String etatCommande(int id);
}
