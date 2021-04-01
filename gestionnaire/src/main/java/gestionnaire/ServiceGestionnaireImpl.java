package gestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "gestionnaire.ServiceGestionnaire", serviceName = "ServiceGestionnaire", portName = "GestionnairePort")
public class ServiceGestionnaireImpl implements ServiceGestionnaire {

    private ArrayList<Commande> commandes;
    private ArrayList<Utilisateur> utilisateurs;

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
    public int creerUtilisateur(String nom, String adresse) {
        int id = utilisateurs.get(utilisateurs.indexOf(utilisateurs.size()-1)).getId()+1;
        Utilisateur utilisateur = new Utilisateur(id, nom, adresse);
        return id;
    }

    @Override
    public boolean modifierUtilisateur(int id, String nom, String adresse) {
        Utilisateur utilisateur = getUtilisateur(id);
        if (utilisateur == null)
            return false;
        if (!nom.isEmpty())
            utilisateur.setNom(nom);
        if (!adresse.isEmpty())
            utilisateur.setAddress(adresse);
        return true;
    }

    @Override
    public boolean supprimerUtilisateur(int id) {
        Utilisateur utilisateur = getUtilisateur(id);
        if (utilisateur == null)
            return false;
        utilisateurs.remove(utilisateur);
        return true;
    }

    private Commande getCommande(int id) {
        for (Commande commande : commandes) {
            if (commande.getId() == id)
                return  commande;
        }
        return  null;
    }

    private Utilisateur getUtilisateur(int id) {
        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getId() == id)
                return  utilisateur;
        }
        return  null;
    }

    private boolean idInCommandes(int id) {
        for (Commande commande : commandes) {
            if (commande.getId() == id)
                return true;
        }
        return false;
    }

}
