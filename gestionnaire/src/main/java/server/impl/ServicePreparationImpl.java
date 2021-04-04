package server.impl;

import server.ServiceGestionnaire;
import server.ServicePreparation;

import javax.jws.WebService;

@WebService(endpointInterface = "server.ServicePreparation", serviceName = "ServicePreparation", portName = "PreparationPort")
public class ServicePreparationImpl implements ServicePreparation {

    private ServiceGestionnaire gestionnaire;

    public void setGestionnaire(ServiceGestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
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

    private Commande getCommande(int id) {
        for (Commande commande : gestionnaire.getCommandes()) {
            if (commande.getId() == id)
                return  commande;
        }
        return null;
    }
}
