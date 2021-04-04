package server.impl;

import server.ServiceLivraison;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "server.ServiceLivraison", serviceName = "livraison", portName = "livraisonPort")
public class ServiceLivraisonImpl implements ServiceLivraison {

    @Override
    public ArrayList<Integer> commandesPretesLivraison() {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        for (Commande commande : Gestionnaire.getCommandes()) {
            if (commande.getEtat().equals("The prepare"))
                liste.add(commande.getId());
        }
        return liste;
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

    private Commande getCommande(int id) {
        for (Commande commande : Gestionnaire.getCommandes()) {
            if (commande.getId() == id)
                return  commande;
        }
        return null;
    }
}
