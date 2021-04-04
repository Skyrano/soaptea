package server.impl;

import java.util.ArrayList;

public class Gestionnaire {

    private final static ArrayList<Commande> commandes = new ArrayList<Commande>();
    private final static ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
    private final static ArrayList<String> carte = new ArrayList<String>();

    public static ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public static ArrayList<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public static ArrayList<String> getCarte() {
        return carte;
    }
}
