package server.impl;

import server.ServicePreparation;

import javax.jws.WebService;

@WebService(endpointInterface = "server.ServicePreparation", serviceName = "preparation", portName = "preparationPort")
public class ServicePreparationImpl implements ServicePreparation {

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

    private Commande getCommande(int id) {
        for (Commande commande : Gestionnaire.getCommandes()) {
            if (commande.getId() == id)
                return  commande;
        }
        return null;
    }
}
