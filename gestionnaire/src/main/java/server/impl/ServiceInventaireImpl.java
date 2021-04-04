package server.impl;

import server.ServiceGestionnaire;
import server.ServiceInventaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "server.ServiceInventaire", serviceName = "ServiceInventaire", portName = "InventairePort")
public class ServiceInventaireImpl implements ServiceInventaire {

    private ServiceGestionnaire gestionnaire;

    public void setGestionnaire(ServiceGestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    @Override
    public boolean majCarte(ArrayList<String> carte) {
        ArrayList<String> ancienneCarte = gestionnaire.getCarte();
        ancienneCarte.clear();
        ancienneCarte.addAll(carte);
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
