package server.impl;

import server.ServiceClient;
import server.ServiceGestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;

@WebService(endpointInterface = "server.ServiceClient", serviceName = "ServiceClient", portName = "ClientPort")
public class ServiceClientImpl implements ServiceClient {

    private ServiceGestionnaire gestionnaire;

    public void setGestionnaire(ServiceGestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    @Override
    public ArrayList<String> catalogue() {
        return gestionnaire.getCarte();
    }

    @Override
    public int Connexion(String nom, String mdp) {
        for (Utilisateur utilisateur : gestionnaire.getUtilisateurs()) {
            if (utilisateur.getNom().equals(nom) && utilisateur.getMdp().equals(mdp))
                return utilisateur.getId();
        }
        return -1;
    }

    @Override
    public boolean paiement(int idutilisateur, int montant, String numeroCarte) {
        Utilisateur utilisateur = getUtilisateur(idutilisateur);
        return  !(utilisateur == null || numeroCarte.isEmpty());
    }

    @Override
    public boolean notifierCommande(int idUtilisateur, HashMap<String, Integer> listeThe) {
        int id = 0;
        ArrayList<Commande> commandes = gestionnaire.getCommandes();
        if (commandes.size() > 0)
            id = commandes.get(commandes.size()-1).getId()+1;
        Commande commande = new Commande(id,idUtilisateur, listeThe, "Commande creee");
        commandes.add(commande);
        return true;
    }

    @Override
    public int creerUtilisateur(String nom, String adresse, String mdp) {
        int id = 0;
        ArrayList<Utilisateur> utilisateurs = gestionnaire.getUtilisateurs();
        if (utilisateurs.size() > 0)
            id = utilisateurs.get(utilisateurs.size()-1).getId()+1;
        Utilisateur utilisateur = new Utilisateur(id, nom, adresse, mdp);
        utilisateurs.add(utilisateur);
        return id;
    }

    @Override
    public boolean modifierUtilisateur(int idutilisateur, String nom, String adresse, String mdp) {
        Utilisateur utilisateur = getUtilisateur(idutilisateur);
        if (utilisateur == null)
            return false;
        if (!nom.isEmpty())
            utilisateur.setNom(nom);
        if (!adresse.isEmpty())
            utilisateur.setAddress(adresse);
        if (!mdp.isEmpty())
            utilisateur.setMdp(mdp);
        return true;
    }

    @Override
    public boolean supprimerUtilisateur(int idutilisateur) {
        Utilisateur utilisateur = getUtilisateur(idutilisateur);
        if (utilisateur == null)
            return false;
        gestionnaire.getUtilisateurs().remove(utilisateur);
        return true;
    }

    @Override
    public ArrayList<Integer> commandesUtilisateur(int idutilisateur) {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        for (Commande commande : gestionnaire.getCommandes()) {
            if (commande.getIdUtilisateur() == idutilisateur)
                liste.add(commande.getId());
        }
        return liste;
    }

    @Override
    public String etatCommande(int id) {
        Commande commande = getCommande(id);
        if (commande == null)
            return "La commande n'existe pas";
        return commande.getEtat();
    }

    private Utilisateur getUtilisateur(int idutilisateur) {
        for (Utilisateur utilisateur : gestionnaire.getUtilisateurs()) {
            if (utilisateur.getId() == idutilisateur)
                return  utilisateur;
        }
        return null;
    }

    private Commande getCommande(int id) {
        for (Commande commande : gestionnaire.getCommandes()) {
            if (commande.getId() == id)
                return  commande;
        }
        return null;
    }
}
