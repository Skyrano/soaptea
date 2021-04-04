package server;

import server.impl.Commande;
import server.impl.Utilisateur;

import javax.jws.WebService;
import java.util.ArrayList;

public interface ServiceGestionnaire {

    ArrayList<Commande> getCommandes();

    ArrayList<Utilisateur> getUtilisateurs();

    ArrayList<String> getCarte();
}
