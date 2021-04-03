package gestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "gestionnaire.ServiceGestionnaire", serviceName = "ServiceGestionnaire", portName = "GestionnairePort")
public class ServiceGestionnaireImpl implements ServiceGestionnaire, ServiceGestionnaireClient {

    private ArrayList<Commande> commandes;
    private ArrayList<Utilisateur> utilisateurs;
    private ArrayList<String> carte;

    @Override
    public boolean notifierCommande(Commande commande) {
        if(idInCommandes(commande.getId()))
            return false;
        commandes.add(commande);
        return true;
    }

    @Override
    public boolean theEnPreparation(int id) {
        Commande commande = getCommande(id);
        if (commande == null)
            return false;
        commande.setEtat("En preparation");
        return true;
    }

    @Override
    public boolean thePrepare(int id) {
        Commande commande = getCommande(id);
        if (commande == null)
            return false;
        commande.setEtat("The prepare");
        return true;
    }

    @Override
    public boolean colisAuLivreur(int id) {
        Commande commande = getCommande(id);
        if (commande == null)
            return false;
        commande.setEtat("Colis avec le livreur");
        return true;
    }

    @Override
    public boolean theLivre(int id) {
        Commande commande = getCommande(id);
        if (commande == null)
            return false;
        commande.setEtat("The livre");
        return true;
    }

    @Override
    public String etatCommande(int id) {
        Commande commande = getCommande(id);
        if (commande == null)
            return "La commande n'existe pas";
        return commande.getEtat();
    }

    @Override
    public int creerUtilisateur(String nom, String adresse, String mdp) {
        int id = 0;
        if (utilisateurs.size() > 0)
            id = utilisateurs.get(utilisateurs.indexOf(utilisateurs.size()-1)).getId()+1;
        Utilisateur utilisateur = new Utilisateur(id, nom, adresse, mdp);
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
        utilisateurs.remove(utilisateur);
        return true;
    }

    @Override
    public boolean paiement(int idutilisateur, int montant, String numeroCarte) {
        Utilisateur utilisateur = getUtilisateur(idutilisateur);
        return  !(utilisateur == null || numeroCarte.isEmpty());
    }

    @Override
    public int Connexion(String nom, String mdp) {
        return getIdUtilisateur(nom, mdp);
    }

    @Override
    public boolean majCarte(ArrayList<String> carte) {
        this.carte = carte;
        return true;
    }

    @Override
    public ArrayList<String> catalogue() {
        return carte;
    }

    @Override
    public ArrayList<Integer> commandesUtilisateur(int idutilisateur) {
        return getcommandesUtilisateur(idutilisateur);
    }

    @Override
    public ArrayList<Integer> commandesPretesLivraison() {
        return getcommandesPretes();
    }

    private Commande getCommande(int id) {
        for (Commande commande : commandes) {
            if (commande.getId() == id)
                return  commande;
        }
        return  null;
    }

    private Utilisateur getUtilisateur(int idutilisateur) {
        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getId() == idutilisateur)
                return  utilisateur;
        }
        return  null;
    }

    private int getIdUtilisateur(String nom, String mdp) {
        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getNom().equals(nom) && utilisateur.getMdp().equals(mdp))
                return utilisateur.getId();
        }
        return -1;
    }

    private boolean idInCommandes(int id) {
        for (Commande commande : commandes) {
            if (commande.getId() == id)
                return true;
        }
        return false;
    }

    private ArrayList<Integer> getcommandesUtilisateur(int idUtilisateur) {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        for (Commande commande : commandes) {
            if (commande.getIdUtilisateur() == idUtilisateur)
                liste.add(commande.getId());
        }
        return liste;
    }

    private ArrayList<Integer> getcommandesPretes() {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        for (Commande commande : commandes) {
            if (commande.getEtat().equals("The prepare"))
                liste.add(commande.getId());
        }
        return liste;
    }

}
