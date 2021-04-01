package gestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "gestionnaire.ServiceGestionnaire", serviceName = "ServiceGestionnaire", portName = "GestionnairePort")
public class ServiceGestionnaireImpl implements ServiceGestionnaire {

    private ArrayList<Commande> commandes;
    private ArrayList<>

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

    private Commande getCommande(int id) {
        for (Commande commande : commandes) {
            if (commande.getId() == id)
                return  commande;
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
