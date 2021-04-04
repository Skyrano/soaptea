package server;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Interface du service qui est fourni au client, i.e. l'application permettant de commander des thés
 */
@WebService(name = "client", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceClient {

    /**
     * Permet de consulter la liste des thés disponibles
     * @return le catalogue des thés actuellement vendus
     */
    ArrayList<String> catalogue();

    /**
     * Connexion au service client pour pouvoir commander
     * @param nom le nom du compte avec lequel on veut se connecter
     * @param mdp le mot de passe du compte
     * @return l'id du compte connecté, -1 si la connexion échoue
     */
    int Connexion(String nom, String mdp);


    /**
     * Procède au paiement pour commander
     * @param idutilisateur l'id de l'utilisateur prenant la commande
     * @param montant le montant de la commande
     * @param numeroCarte le numéro de la carte bleue utilisée pour payer
     * @return true si le paiement réussi, false sinon
     */
    boolean paiement(int idutilisateur, int montant, String numeroCarte);

    /**
     * Notifie le service qu'une commande a été prise
     * @param idUtilisateur l'id de l'utilisateur ayant pris la commande
     * @param listeThe la liste des thés commandés, avec pour chaque type de thé la quantité
     * @return true si la commande réussie, false sinon
     */
    boolean notifierCommande(int idUtilisateur, HashMap<String, Integer> listeThe);

    /**
     * Ajoute un nouvel utilisateur
     * @param nom le nom du nouvel utilisateur
     * @param adresse l'adresse du nouvel utilisateur
     * @param mdp le mot de passe du nouvel utilisateur
     * @return l'id de l'utilisateur créé
     */
    int creerUtilisateur(String nom, String adresse, String mdp);

    /**
     * Modifie un utilisateur existant
     * @param idutilisateur l'id de l'utilisateur à modifier
     * @param nom le nouveau nom de l'utilisateur (laisser vide pour ne pas changer)
     * @param adresse la nouvelle adresse de l'utilisateur (laisser vide pour ne pas changer)
     * @param mdp le nouveau mot de passe de l'utilisateur (laisser vide pour ne pas changer)
     * @return true si la modification est effective, false sinon
     */
    boolean modifierUtilisateur(int idutilisateur, String nom, String adresse, String mdp);

    /**
     * Supprime un utilisateur
     * @param idutilisateur l'id de l'utilisateur à supprimer
     * @return true si la suppression est faite, false sinon
     */
    boolean supprimerUtilisateur(int idutilisateur);

    /**
     * Liste les commandes d'un utilisateur donné
     * @param idutilisateur l'id de l'utilisateur dont on veut les commandes
     * @return la liste des commandes de l'utilisateur
     */
    ArrayList<Integer> commandesUtilisateur(int idutilisateur);

    /**
     * Donne l'état actuel de la commande demandée
     * @param id l'id de la commande
     * @return l'état de la commande, i.e. à quelle étape du processus en est la commande
     */
    String etatCommande(int id);
}
