package server.impl;

import server.ServiceGestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "server.ServiceGestionnaire", serviceName = "ServiceGestionnaire", portName = "GestionnairePort")
public class ServiceGestionnaireImpl implements ServiceGestionnaire {

    private ArrayList<Commande> commandes;
    private ArrayList<Utilisateur> utilisateurs;
    private ArrayList<String> carte;

    public ServiceGestionnaireImpl() {
        this.commandes = new ArrayList<Commande>();
        this.utilisateurs = new ArrayList<Utilisateur>();
        this.carte = new ArrayList<String>();
    }

    @Override
    public ArrayList<Commande> getCommandes() {
        return this.commandes;
    }

    @Override
    public ArrayList<Utilisateur> getUtilisateurs() {
        return this.utilisateurs;
    }

    @Override
    public ArrayList<String> getCarte() {
        return this.carte;
    }

    private Commande getCommande(int id) {
        for (Commande commande : commandes) {
            if (commande.getId() == id)
                return  commande;
        }
        return null;
    }
}
